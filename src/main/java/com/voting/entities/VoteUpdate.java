package com.voting.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class VoteUpdate {
    private String correlationId;
    private String questionId;
    private String choiceId;
    private long votes;
}