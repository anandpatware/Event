package com.event.Event.Repository;

import com.event.Event.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    User checkLogin(@Param("email") String email, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.isAdmin = false")
    List<User> getAllNonAdminUser();


}
