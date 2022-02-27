package com.company.service;

import com.company.service.impl.TestServiceImpl;

import java.util.List;
import java.util.Map;

public interface TestService {
    TestService INSTANCE = new TestServiceImpl();

    boolean addQuestions(String question);

    boolean addAnswers(String question, String answer, Boolean isRight);

    List<Map.Entry<String, Map<String, Boolean>>> getQuestions(int countQuestions);

}
