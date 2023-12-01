package com.example.car.register.opr.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {

    private int id;
    private String name;
    private String brandName;

}


//Diğer sınıflardan List<GetAllModelsResponse> çağırdığımızda yani bu sınıfın içeririsinde liste olarak ne verirsen onu göstermiş oluyoruz.
// yani id'si adı ve marka adı gelecek
// ve bunu yukarıda ki data anatasyonu ile getter ile ve altındaki parametreli ve parametresiz anatasyonlar ile sağlamış oluyoruz.
