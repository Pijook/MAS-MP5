package com.tlt.game;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {

    private Long id;
    private String name;

}
