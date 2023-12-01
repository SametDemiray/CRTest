package com.example.car.register.opr.core.utilities;

import org.modelmapper.ModelMapper;

public interface BrandMapperService {

    ModelMapper forResponse();
    ModelMapper forRequest();

}
