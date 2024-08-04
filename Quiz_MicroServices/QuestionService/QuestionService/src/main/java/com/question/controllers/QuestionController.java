package com.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionServices;



@RestController
@RequestMapping("/question")
public class QuestionController {
	
	 private QuestionServices questionService;

	    public QuestionController(QuestionServices questionService) {
	        this.questionService = questionService;
	    }

	    //    create
	    @PostMapping
	    public Question create(@RequestBody Question question) {
	        return questionService.createQuestion(question);
	    }

	    //    get all
	    @GetMapping
	    public List<Question> getAll() {
	        return questionService.get();
	    }

	    @GetMapping("/{questionId}")
	    public Question getAll(@PathVariable Long questionId) {
	        return questionService.get(questionId);
	    }
	    
	    //get all question of the quiz
	    
	    @GetMapping("/quiz/{quizId}")
	    public List<Question> getQuestionsOFQuestion(@PathVariable Long quizId)
	    {
			return questionService.getQuestionsOfQuiz(quizId);
	    	
	    }
}
