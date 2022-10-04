package com.example.sbd311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sbd311.entity.User;
// JpaRepository генерирует запросы
public interface UserRepository extends JpaRepository<User,Long> {

}
