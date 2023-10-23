package com.PollsSystem.PollsSystem.Model;


import  javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
@Entity
public class PollAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
//    @JoinColumn(name = "id")
    private  User user;
    @ManyToOne
//    @JoinColumn(name = "id")
    private PollQuestion question;
    private String selectedOption;

}
