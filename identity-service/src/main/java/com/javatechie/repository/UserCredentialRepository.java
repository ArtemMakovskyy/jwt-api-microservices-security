package com.javatechie.repository;

import com.javatechie.entity.UserCredential;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
