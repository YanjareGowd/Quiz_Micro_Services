package com.question.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionServices;

@Service
public class QuestionServiceImpl implements QuestionServices{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Question createQuestion(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		
		return questionRepository.findAll();
	}

	@Override
	public Question get(Long Id) {
		
		Question question= questionRepository.findById(Id).orElseThrow(() -> new RuntimeException("Question not found !!"));
		return question;
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		
		return questionRepository.findByQuizId(quizId);
	}

}
