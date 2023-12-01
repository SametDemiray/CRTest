package com.example.car.register.opr.controller;

import com.example.car.register.opr.entities.Brand;
import com.example.car.register.opr.repository.BrandRepository;
import com.example.car.register.opr.request.CreateBrandsRequest;
import com.example.car.register.opr.response.GetAllBrandsResponse;
import com.example.car.register.opr.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class BrandController {


    BrandService brandService;
    BrandRepository brandRepository;

   @PostMapping("/addBrand")
   // @PostMapping()
   // @ResponseStatus(code = HttpStatus.CREATED)
    public void addBrand(@RequestBody CreateBrandsRequest createBrandsRequest){
        this.brandService.add(createBrandsRequest);
    }

    @GetMapping("/getBrands")
  //  @GetMapping()
  //  @ResponseStatus(code = HttpStatus.CREATED)
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }


    @GetMapping("/getBrand/{name}")
    public List<Brand> findBrandsContainingByName(@PathVariable String name){
       return brandRepository.findByNameContaining(name);
    }
 }
