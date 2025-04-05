package com.voting.utils;

import com.voting.entities.ChoiceDTO;
import com.voting.mongoData.Choice;
import com.voting.mongoData.Question;
import com.voting.mongoData.Survey;
import com.voting.entities.QuestionDTO;
import com.voting.entities.SurveyDTO;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class SurveyMapper {

    public static List<SurveyDTO> mapSurveyListToDTO(List<Survey> surveyList) {
        return surveyList.stream()
                .map(SurveyMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public static Survey mapToMongo(SurveyDTO surveyDTO) {
        Survey survey = new Survey();
        survey.setTitle(surveyDTO.getTitle());
        survey.setHostUsername(surveyDTO.getHostUsername());
        survey.setSurveyId(surveyDTO.getSurveyId());
        survey.setStatus(surveyDTO.getStatus());
        survey.setAccessCode(surveyDTO.getAccessCode());
        survey.setCreatedAt(surveyDTO.getCreatedAt());
        survey.setUpdatedAt(surveyDTO.getUpdatedAt());
        survey.setClosedAt(surveyDTO.getClosedAt());
        if(!isNull(surveyDTO.getQuestions()))
            survey.setQuestions(toEntityQuestionList(surveyDTO.getQuestions()));
        return survey;
    }

    public static SurveyDTO mapToDTO(Survey survey) {
        SurveyDTO surveyDTO = new SurveyDTO();
        surveyDTO.setSurveyId(survey.getSurveyId());
        surveyDTO.setTitle(survey.getTitle());
        surveyDTO.setHostUsername(survey.getHostUsername());
        surveyDTO.setStatus(survey.getStatus());
        surveyDTO.setAccessCode(survey.getAccessCode());
        surveyDTO.setCreatedAt(survey.getCreatedAt());
        surveyDTO.setUpdatedAt(survey.getUpdatedAt());
        surveyDTO.setClosedAt(survey.getClosedAt());
        if(!isNull(survey.getQuestions()))
            surveyDTO.setQuestions(toDTOQuestionList(survey.getQuestions()));
        return surveyDTO;
    }

    public static Question mapQuestionToMongo(QuestionDTO questionDTO) {
        Question question = new Question();
        question.setQuestionText(questionDTO.getQuestionText());
        question.setQuestionId(questionDTO.getQuestionId() != null
                ? questionDTO.getQuestionId()
                : UUID.randomUUID().toString());
        if(!isNull(questionDTO.getChoices()))
            question.setChoices(toEntityChoiceList(questionDTO.getChoices()));
        return question;
    }

    public static QuestionDTO mapQuestionToDTO(Question question) {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionText(question.getQuestionText());
        questionDTO.setQuestionId(question.getQuestionId());
        if(!isNull(question.getChoices()))
            questionDTO.setChoices(toDTOChoiceList(question.getChoices()));
        return questionDTO;
    }

    public static Choice mapChoiceToMongo(ChoiceDTO choiceDTO) {
        Choice choice = new Choice();
        choice.setChoiceText(choiceDTO.getChoiceText());
        choice.setChoiceId(choiceDTO.getChoiceId() != null
                ? choiceDTO.getChoiceId()
                : UUID.randomUUID().toString());
        return choice;
    }

    public static ChoiceDTO mapChoiceToDTO(Choice choice) {
        ChoiceDTO choiceDTO = new ChoiceDTO();
        choiceDTO.setChoiceText(choice.getChoiceText());
        choiceDTO.setChoiceId(choice.getChoiceId());
        return choiceDTO;
    }

    private static List<Question> toEntityQuestionList(List<QuestionDTO> questionDTOList) {
        return questionDTOList.stream()
                .map(SurveyMapper::mapQuestionToMongo)
                .collect(Collectors.toList());
    }

    private static List<QuestionDTO> toDTOQuestionList(List<Question> questionList) {
        return questionList.stream()
                .map(SurveyMapper::mapQuestionToDTO)
                .collect(Collectors.toList());
    }

    private static List<Choice> toEntityChoiceList(List<ChoiceDTO> choiceDTOList) {
        return choiceDTOList.stream()
                .map(SurveyMapper::mapChoiceToMongo)
                .collect(Collectors.toList());
    }

    private static List<ChoiceDTO> toDTOChoiceList(List<Choice> choiceList) {
        return choiceList.stream()
                .map(SurveyMapper::mapChoiceToDTO)
                .collect(Collectors.toList());
    }
}
