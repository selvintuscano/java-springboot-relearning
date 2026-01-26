package com.RestAPIs.RestAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Studentdto {
    private Long id;
    private String name;
    private String email;


    public Studentdto(long id, String selvin, String mail) {
    }
}
