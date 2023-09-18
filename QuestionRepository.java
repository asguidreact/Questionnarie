package com.application.Questionnarie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.Questionnarie.model.User;

public interface QuestionRepository extends JpaRepository<User, Integer>{

}
