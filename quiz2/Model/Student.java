package com.example.quiz2.Model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {



    @NotNull(message = "ID should be not empty")
    private Integer ID ;

    @NotEmpty(message = "name should be not empty")
    private String name ;

    @NotNull(message = "age should be not empty")
    private Integer age ;

    @NotEmpty(message = "major should be not empty")
    private String major ;


}
