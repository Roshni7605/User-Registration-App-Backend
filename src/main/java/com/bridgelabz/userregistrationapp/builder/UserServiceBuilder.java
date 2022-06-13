package com.bridgelabz.userregistrationapp.builder;

import com.bridgelabz.userregistrationapp.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserServiceBuilder {

    public User builderDTO(User user){
        User user1 = new User();
        BeanUtils.copyProperties(user, user1);
        return user1;
    }

}
