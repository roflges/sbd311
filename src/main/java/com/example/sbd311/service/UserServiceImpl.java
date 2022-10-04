package com.example.sbd311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sbd311.entity.User;
import com.example.sbd311.repository.UserRepository;


import java.util.List;

@Service
public class UserServiceImpl implements UserSevice  {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }


    public User findById(long id) {
        return userRepository.getOne(id);
    }


    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

}