package com.voting.mongoData;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

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
    private String accessCode;
    private List<Question> questions;
    private Map<String, Map<String, Long>> results;
    private String createdAt;
    private String updatedAt;
    private String closedAt;
}
