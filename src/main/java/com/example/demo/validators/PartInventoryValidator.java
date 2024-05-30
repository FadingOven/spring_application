package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator<ValidPartInventory, Part> {
    @Autowired
    private ApplicationContext context;

    public static  ApplicationContext myContext;

    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (context==null) return true;
        if (context!=null) myContext = context;
        if (part.getInv() >= part.getMin() && part.getInv() <= part.getMax()) {
            return true;
        }
        else {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory must be between minimum and maximum values")
                    .addPropertyNode("inv") // specify the field for which the error is reported
                    .addConstraintViolation();
            return false;
        }
    }
}

