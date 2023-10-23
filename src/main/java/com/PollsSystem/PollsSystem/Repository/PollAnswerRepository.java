package com.PollsSystem.PollsSystem.Repository;

import com.PollsSystem.PollsSystem.Model.PollAnswer;
import com.PollsSystem.PollsSystem.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;



public interface PollAnswerRepository{
    void createUser(User user);
    void updateUser(User user);
    void deleteUserByUserId(Long id);

    List<PollAnswer> findAll();

    List<PollAnswer> findAll(Sort sort);

    Page<PollAnswer> findAll(Pageable pageable);

    List<PollAnswer> findAllById(Iterable<Long> longs);

}
