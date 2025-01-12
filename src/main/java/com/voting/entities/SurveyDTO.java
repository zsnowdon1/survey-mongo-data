package com.voting.entities;

import lombok.*;

import java.util.List;

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
    private List<QuestionDTO> questions;
}
