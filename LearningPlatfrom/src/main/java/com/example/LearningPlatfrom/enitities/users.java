package com.example.LearningPlatfrom.enitities;

import java.util.ArrayList;
import java.util.List;

public class users {

    private List<user> userList;


    public List<user> getUserList()
    {

        if (userList == null) {

            userList
                    = new ArrayList<>();


        }

        return userList;


    }

    public void
    userList(
            List<user> userList)
    {
        this.userList
                = userList;
    }

}
