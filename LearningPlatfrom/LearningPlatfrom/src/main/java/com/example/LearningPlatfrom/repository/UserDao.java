package com.example.LearningPlatfrom.repository;

import com.example.LearningPlatfrom.enitities.user;
import com.example.LearningPlatfrom.enitities.users;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private static users list = new users();

    static {

        list.getUserList().add(
                new user(1,"Ayush","K","1234567890")
        );

        list.getUserList().add(
                new user(2,"Aman","K","2134567890")
        );
    }

    public users getAllUsers()
    {
        return list;
    }

    public void adduser(user user){

        list.getUserList().add(user);
    }


}
