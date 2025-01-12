package com.voting.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ChoiceDTO {
    private String choiceId;
    private String choiceText;
}