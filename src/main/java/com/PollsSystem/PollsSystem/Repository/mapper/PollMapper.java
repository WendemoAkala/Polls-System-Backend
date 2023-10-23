package com.PollsSystem.PollsSystem.Repository.mapper;

import com.PollsSystem.PollsSystem.Model.PollQuestion;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class PollMapper implements RowMapper<PollQuestion> {
    public PollQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        try{
            long id = rs.getLong("id");
            String title = rs.getString("title");
            String option1 = rs.getString("option1");
            String option2 = rs.getString("option2");
            String option3 = rs.getString("option3");
            String option4 = rs.getString("option4");

            return new PollQuestion(id, title, option1, option2, option3, option4);
        } catch (SQLException e) {
            throw new SQLException("Error mapping ResultSet to PollQuestion", e);
        }

        }
}
