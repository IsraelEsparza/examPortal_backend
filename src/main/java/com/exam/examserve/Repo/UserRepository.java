package com.exam.examserve.Repo;

import com.exam.examserve.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String usernane);
}
