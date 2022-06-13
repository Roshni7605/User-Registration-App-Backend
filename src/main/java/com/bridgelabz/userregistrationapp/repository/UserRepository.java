package com.bridgelabz.userregistrationapp.repository;

import com.bridgelabz.userregistrationapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
