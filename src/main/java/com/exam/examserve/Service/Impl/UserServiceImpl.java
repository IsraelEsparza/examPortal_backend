package com.exam.examserve.Service.Impl;

import com.exam.examserve.Model.User;
import com.exam.examserve.Model.UserRole;
import com.exam.examserve.Repo.RoleRepository;
import com.exam.examserve.Repo.UserRepository;
import com.exam.examserve.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());

        if (local != null) {
            System.out.println("User is alredy there !!");
            throw new Exception("User alredy preset");
        }else {
            //user create
            for (UserRole ur:userRoles){
                this.roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }

        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    //deleting user by id
    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
