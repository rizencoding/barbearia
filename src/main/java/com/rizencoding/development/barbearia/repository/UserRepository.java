package com.rizencoding.development.barbearia.repository;

import com.rizencoding.development.barbearia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
