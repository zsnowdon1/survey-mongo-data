package com.voting.mongoData;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "surveys")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Survey {
    @Id
    private String surveyId;
    private String title;
    private String hostUsername;
    private String status;
    private List<Question> questions;
}
