package com.PollsSystem.PollsSystem.Repository;

import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User createUser(User user);

    void updateUser(User user);

    void deleteUserByUserId(Long id);

    PollQuestion getUserChooseByQuestionId(Long id);

    List<PollQuestion> getAllUsersAnswerByQuestionId(Long id);

    List<Long> getAllQuestionsByUserId(Long id);

    List<Long> getAllQuestionsAnsweredByUserId(Long id);

    Optional<User> findById(Long id);

    void deleteById(Long id);
    // custom queries if needed
}