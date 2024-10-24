package com.dmkj.peiliaojsq.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ingredients")
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int quantity;
    private String unit;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonIgnore // 防止循环引用
    private Recipe recipe;
}
