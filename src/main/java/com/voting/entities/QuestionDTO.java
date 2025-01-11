package com.voting.entities;

import java.util.List;

public class QuestionDTO {

    private Long questionId;

    private String questionText;

    private List<ChoiceDTO> choices;

    public QuestionDTO(Long questionId, String questionText, List<ChoiceDTO> choices) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.choices = choices;
    }

    public QuestionDTO() { }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String question) {
        this.questionText = question;
    }

    public List<ChoiceDTO> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceDTO> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questionId=" + questionId +
                ", questionText='" + questionText + '\'' +
                ", choices=" + choices +
                '}';
    }
}
