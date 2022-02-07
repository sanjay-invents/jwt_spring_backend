package com.shoryukane.supportportal.service;

import com.shoryukane.supportportal.domain.User;
import com.shoryukane.supportportal.exception.domain.EmailExistException;
import com.shoryukane.supportportal.exception.domain.UserNotFoundException;
import com.shoryukane.supportportal.exception.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.util.List;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, EmailExistException, UsernameExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
