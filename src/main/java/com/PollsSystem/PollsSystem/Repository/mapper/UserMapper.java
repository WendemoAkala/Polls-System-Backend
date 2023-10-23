package com.PollsSystem.PollsSystem.Repository.mapper;

import com.PollsSystem.PollsSystem.Model.User;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class UserMapper{
    private Map<Integer, User> userStore = new HashMap<>();
    private int nextUserId = 1;
    public User createUser(String firstName,String lastName, String email, int age, String address, LocalDate joiingDate){
        int id = nextUserId++;
        User newUser = new User((long) id, firstName, lastName, email, age, address, joiingDate);
        userStore.put(id, newUser);
        return newUser;
    }

    public Optional<User> getUserById() {
        return null;
    }

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                rs.getDate("joining_date").toLocalDate()
        );
    }
}
