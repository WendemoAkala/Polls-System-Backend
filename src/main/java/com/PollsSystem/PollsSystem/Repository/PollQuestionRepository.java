
package com.PollsSystem.PollsSystem.Repository;
import com.PollsSystem.PollsSystem.Model.PollQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface PollQuestionRepository extends JpaRepository<PollQuestion, Long> {
        // custom queries if needed

    PollQuestion createPoll(PollQuestion pollQuestion);
    PollQuestion updatePoll(PollQuestion pollQuestion);
    void deletePollByQuestionId(Long id);
    PollQuestion getUserChooseByQuestionId(Long id);
    List<PollQuestion> getAllUsersAnswerByQuestionId(Long id);
    List<Long> getAllQuestionsByUserId(Long id);
    List<Long> getAllQuestionsAnsweredByUserId(Long id);
}
