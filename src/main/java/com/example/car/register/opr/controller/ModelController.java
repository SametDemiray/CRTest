package com.example.car.register.opr.controller;

import com.example.car.register.opr.request.CreateModelRequest;
import com.example.car.register.opr.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/api")
public class ModelController {

    ModelService modelService;
    @PostMapping("/addModel")
    public void add(@RequestBody CreateModelRequest createModelRequest){
      modelService.add(createModelRequest);

    }
}
