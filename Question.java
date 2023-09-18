package com.application.Questionnarie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Question_Table")
@Data
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int questionId;
	
	String question;
	String answer;

}
