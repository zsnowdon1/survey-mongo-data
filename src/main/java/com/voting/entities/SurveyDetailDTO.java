package com.voting.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("survey")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class SurveyDetailDTO {
    @Id
    private String surveyId;
    private String title;
    private int questionCount;
}
