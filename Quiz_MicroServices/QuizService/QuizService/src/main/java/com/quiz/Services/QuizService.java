package com.quiz.Services;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();

    Quiz get(Long id);

}
