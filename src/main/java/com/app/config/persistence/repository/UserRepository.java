package com.app.config.persistence.repository;

import com.app.config.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findUsersByUsername(String username);
//    @Query("SELECT u FROM UserEntity u WHERE u.username = ?")
//    Optional<UserEntity> findUser(String username);
}
