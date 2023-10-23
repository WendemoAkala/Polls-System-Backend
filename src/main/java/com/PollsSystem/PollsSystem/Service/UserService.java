package com.PollsSystem.PollsSystem.Service;

import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User updatedUser);
    boolean deleteUser(Long id);

    User getUser(Long id);
}