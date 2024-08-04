package com.quiz.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Question {
	
	private Long questionID;
	
	private String question;
	
	private Long quizId;	

}
