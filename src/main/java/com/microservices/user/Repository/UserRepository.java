package com.microservices.user.Repository;

import com.microservices.user.Entity.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
@Entity
public interface UserRepository extends JpaRepository<User,String> {

}
