package com.bridgelabz.userregistrationapp.service;

import com.bridgelabz.userregistrationapp.builder.UserServiceBuilder;
import com.bridgelabz.userregistrationapp.entity.User;
import com.bridgelabz.userregistrationapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceBuilder userServiceBuilder;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User addUser(User user) {
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        User user1 = userServiceBuilder.builderDTO(user);
        return userRepository.save(user1);
    }
}
