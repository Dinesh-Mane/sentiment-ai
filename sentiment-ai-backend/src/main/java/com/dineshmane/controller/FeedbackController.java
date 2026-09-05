package com.dineshmane.controller;

import com.dineshmane.entity.Feedback;
import com.dineshmane.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedbacks(){
        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        return ResponseEntity.status(HttpStatus.OK).body(feedbacks);
    }

    @PostMapping
    public ResponseEntity<Feedback> saveFeedback(@RequestBody String content){
        Feedback feedback = null;
        return ResponseEntity.status(HttpStatus.CREATED).body(feedback);
    }
}
