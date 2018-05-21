package com.company.app.service;

import com.company.app.entity.Property;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(PropertyService.NAME)
public class PropertyServiceBean implements PropertyService {


    @Override
    public Integer calculatePrice(Property property) {
        Integer price = new Integer(0);
        return price;

    }

}
