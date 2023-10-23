package com.PollsSystem.PollsSystem.controller;

import com.PollsSystem.PollsSystem.Model.PollQuestion;
import com.PollsSystem.PollsSystem.Service.PollQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class PollQuestionController {
    @Autowired
    private PollQuestionService pollQuestionService;

    @PostMapping("/create")
    public ResponseEntity<PollQuestion> createQuestion(@RequestBody PollQuestion question) {
        System.out.println("ssssssssssssssssssssssssss");
        PollQuestion createdQuestion = pollQuestionService.createQuestion(question);
        return new ResponseEntity<>(createdQuestion, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PollQuestion> getQuestion(@PathVariable Long id) {
        PollQuestion question = pollQuestionService.getQuestion(id);
        if (question != null) {
            return new ResponseEntity<>(question, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PollQuestion> updateQuestion(@PathVariable Long id, @RequestBody PollQuestion question) {
        PollQuestion updatedQuestion = pollQuestionService.updateQuestion(id, question);
        if (updatedQuestion != null) {
            return new ResponseEntity<>(updatedQuestion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        boolean deleted = pollQuestionService.deleteQuestion(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
