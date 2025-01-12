package com.voting.mongoData;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Choice {
    private String choiceId;
    private String choiceText;
}
