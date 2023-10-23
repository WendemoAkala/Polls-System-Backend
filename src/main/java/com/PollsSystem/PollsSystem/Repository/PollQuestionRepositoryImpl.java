package com.PollsSystem.PollsSystem.Repository;
import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Repository.mapper.PollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PollQuestionRepositoryImpl implements PollQuestionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PollMapper pollMapper;

    @Override
    public PollQuestion createPoll(PollQuestion pollQuestion) {
        System.out.println("fixed");
        return pollQuestion;
    }

    @Override
    public PollQuestion updatePoll(PollQuestion pollQuestion) {

        return pollQuestion;
    }

    @Override
    public void deletePollByQuestionId(Long id) {

    }

    @Override
    public PollQuestion getUserChooseByQuestionId(Long id) {
        return null;
    }

    @Override
    public List<PollQuestion> getAllUsersAnswerByQuestionId(Long id) {
        return null;
    }

    @Override
    public List<Long> getAllQuestionsByUserId(Long id) {
        return null;
    }

    @Override
    public List<Long> getAllQuestionsAnsweredByUserId(Long userId) {
        return null;
    }

    public List<PollQuestion> findAll() {
        return null;
    }

    public List<PollQuestion> findAll(Sort sort) {
        return null;
    }

    public Page<PollQuestion> findAll(Pageable pageable) {
        return null;
    }

    public List<PollQuestion> findAllById(Iterable<Long> longs) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long aLong) {

    }

    public void delete(PollQuestion entity) {

    }

    public void deleteAll(Iterable<? extends PollQuestion> entities) {

    }

    public void deleteAll() {

    }

    @Override
    public <S extends PollQuestion> S save(S entity) {
        return null;
    }

    public <S extends PollQuestion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<PollQuestion> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }

    public void flush() {

    }

    public <S extends PollQuestion> S saveAndFlush(S entity) {
        return null;
    }

    public void deleteInBatch(Iterable<PollQuestion> entities) {

    }

    public void deleteAllInBatch() {

    }

    public PollQuestion getOne(Long aLong) {
        return null;
    }

    public <S extends PollQuestion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    public <S extends PollQuestion> List<S> findAll(Example<S> example) {
        return null;
    }

    public <S extends PollQuestion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    public <S extends PollQuestion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    public <S extends PollQuestion> long count(Example<S> example) {
        return 0;
    }

    public <S extends PollQuestion> boolean exists(Example<S> example) {
        return false;
    }

}
