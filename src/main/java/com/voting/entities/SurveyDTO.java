package com.voting.entities;

import lombok.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class SurveyDTO {
    private String surveyId;
    private String hostUsername;
    private String title;
    private String status;
    private String accessCode;
    private List<QuestionDTO> questions;
    private Map<String, Map<String, Long>> results;
    private String createdAt;
    private String updatedAt;
    private String closedAt;
}
