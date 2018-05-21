/*package com.company.bicycleapps1.service;

import com.company.bicycleapps1.entity.Oder;
import com.company.bicycleapps1.entity.SparePart;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(Oder1Service.NAME)
public class Oder1ServiceBean implements Oder1Service {

    @Override
    public BigDecimal calculateAmount(Oder oder) {
        BigDecimal amount = BigDecimal.ZERO;
        if (oder.getHoursSpent() != null) {
            amount = amount.add(new BigDecimal(oder.getHoursSpent())
                    .multiply(oder.getMechanics().getHourlyRate()));
        }
        if (oder.getParts() != null) {
            for (SparePart part : oder.getParts()) {
                amount = amount.add(part.getPrice());
            }
        }
        return amount;
    }
}*/