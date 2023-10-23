package com.PollsSystem.PollsSystem.Service;

import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Model.User;
import com.PollsSystem.PollsSystem.Repository.PollQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollQuestionService implements PollService{
    @Autowired
    private PollQuestionRepository pollQuestionRepository;

    public PollQuestion createQuestion(PollQuestion question) {
        return pollQuestionRepository.save(question);
    }

    public PollQuestion getQuestion(Long id) {
        return pollQuestionRepository.findById(id).orElse(null);
    }

    public PollQuestion updateQuestion(Long id, PollQuestion updatedQuestion) {
        if (pollQuestionRepository.existsById(id)) {
            updatedQuestion.setId(id);
            return pollQuestionRepository.save(updatedQuestion);
        }
        return null;
    }

    public boolean deleteQuestion(Long questionId) {
        if (pollQuestionRepository.existsById(questionId)) {
            pollQuestionRepository.deleteById(questionId);
            return true;
        }
        return false;
    }

    @Override
    public User createPoll(User user) {
        return null;
    }

    @Override
    public User updatePoll(Long id, User updatedUser) {
        return null;
    }

    @Override
    public boolean deletePoll(Long id) {
        return false;
    }
}
