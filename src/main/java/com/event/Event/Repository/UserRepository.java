package com.event.Event.Repository;

import com.event.Event.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.email = :email AND u.password = :password")
    boolean checkLogin(@Param("email") String email, @Param("password") String password);

}
