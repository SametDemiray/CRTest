package com.example.car.register.opr.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateBrandsRequest {

    private int id;
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 20)
    private String name;
    private int stock;


}
