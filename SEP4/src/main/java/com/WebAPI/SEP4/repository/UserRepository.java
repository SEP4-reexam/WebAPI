
package com.WebAPI.SEP4.repository;

import com.WebAPI.SEP4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
