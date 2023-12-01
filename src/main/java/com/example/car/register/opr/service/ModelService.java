package com.example.car.register.opr.service;

import com.example.car.register.opr.entities.Model;
import com.example.car.register.opr.request.CreateModelRequest;
import com.example.car.register.opr.response.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}
