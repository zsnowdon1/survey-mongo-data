package com.voting.mongoData;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Question {
    private String questionId;
    private String questionText;
    private List<Choice> choices;
}
