package com.debuggeando_ideas.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {

    private String comment;
    private Integer score;

}
