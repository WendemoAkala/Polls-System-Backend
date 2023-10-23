package com.PollsSystem.PollsSystem.Repository;

import com.PollsSystem.PollsSystem.Model.PollAnswer;
import com.PollsSystem.PollsSystem.Model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class PollAnswerRepositoryImpl implements PollAnswerRepository{

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserByUserId(Long id) {

    }

    @Override
    public List<PollAnswer> findAll() {
        return null;
    }

    @Override
    public List<PollAnswer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PollAnswer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PollAnswer> findAllById(Iterable<Long> longs) {
        return null;
    }
}
