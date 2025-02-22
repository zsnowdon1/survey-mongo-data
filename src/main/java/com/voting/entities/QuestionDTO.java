package com.voting.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class QuestionDTO {
    private String questionId;
    private String questionText;
    private List<ChoiceDTO> choices;
}
