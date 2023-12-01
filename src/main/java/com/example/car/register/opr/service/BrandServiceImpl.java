package com.example.car.register.opr.service;

import com.example.car.register.opr.core.utilities.BrandMapperService;
import com.example.car.register.opr.core.utilities.ModelMapperService;
import com.example.car.register.opr.entities.Brand;
import com.example.car.register.opr.repository.BrandRepository;
import com.example.car.register.opr.request.CreateBrandsRequest;
import com.example.car.register.opr.response.GetAllBrandsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService{


    BrandRepository brandRepository;
    BrandMapperService brandMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();

    /*    List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

            for (Brand brand : brands){
                GetAllBrandsResponse response = new GetAllBrandsResponse();
                response.setId(brand.getId());
                response.setName(brand.getName());
                brandsResponse.add(response);
                yazmak yerine  aşağıdaki gibi yazıyoruz.
            }*/

        List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.brandMapperService.forResponse()
                                                     .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandsRequest createBrandsRequest) {
        //Brand brand = new Brand();
        //brand.setId(createBrandsRequest.getId());
        //brand.setName(createBrandsRequest.getName());
        //brand.setstock vs vs. yazmak yerine aşağıdaki gibi map leme yapıyoruz.
        //
       Brand brand = this.brandMapperService.forRequest().map(createBrandsRequest, Brand.class);
        this.brandRepository.save(brand);

    }
}
