package com.question.services;

import java.util.List;

import com.question.entities.Question;

public interface QuestionServices {
	
	
	Question createQuestion(Question question );
	
	List<Question> get();
	
	Question get(Long Id);
	
	List<Question> getQuestionsOfQuiz(Long quizId);

}
