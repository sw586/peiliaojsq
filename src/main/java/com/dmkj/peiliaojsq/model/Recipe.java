package com.dmkj.peiliaojsq.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name = "recipes")
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // parentId 字段
    @Column(name = "parent_id")
    private Long parentId;

    // 用于反向查找 parentRecipe
    @ManyToOne
    @JoinColumn(name = "parent_id", insertable = false, updatable = false)
    @JsonIgnore // 防止循环引用
    private Recipe parentRecipe;

    // childRecipes 用于查找所有子食谱
    @OneToMany(mappedBy = "parentRecipe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Recipe> childRecipes;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ingredient> ingredients;
}
