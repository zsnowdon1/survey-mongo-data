package com.voting.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class LiveSurveyDTO {
    private String surveyId;
    private String title;
    private List<LiveQuestionDTO> questions;
}
