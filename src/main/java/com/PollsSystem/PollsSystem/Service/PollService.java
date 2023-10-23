package com.PollsSystem.PollsSystem.Service;
import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Model.User;

import java.util.List;

public interface PollService {
    User createPoll(User user);
    User updatePoll(Long id, User updatedUser);
    boolean deletePoll(Long id);
}
