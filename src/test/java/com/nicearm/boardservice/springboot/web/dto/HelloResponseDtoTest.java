package com.nicearm.boardservice.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //assertEquals
        assertEquals(name, dto.getName());
        assertEquals(amount, dto.getAmount());

        //assertj의 assertThat
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
