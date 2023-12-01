package com.example.car.register.opr.service;

import com.example.car.register.opr.core.utilities.ModelMapperService;
import com.example.car.register.opr.entities.Model;
import com.example.car.register.opr.repository.ModelRepository;
import com.example.car.register.opr.request.CreateModelRequest;
import com.example.car.register.opr.response.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ModelServiceImpl implements ModelService{

    ModelRepository modelRepository;
    ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(model);
    }
}
