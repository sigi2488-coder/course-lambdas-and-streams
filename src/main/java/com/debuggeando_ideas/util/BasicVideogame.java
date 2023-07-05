package com.debuggeando_ideas.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicVideogame {

    private String name;
    private Double price;
    private Console console;
}
