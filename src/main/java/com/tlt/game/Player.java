package com.tlt.game;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {

    private Long id;
    private String name;

}
