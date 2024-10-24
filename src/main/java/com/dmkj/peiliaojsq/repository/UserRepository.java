package com.dmkj.peiliaojsq.repository;
//JPA Repository 接口，这将用于与数据库进行交互。
import com.dmkj.peiliaojsq.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
