package com.basava.chain_of_responsibility.validator;

public class UnitIsZeroValidator extends AbstractValidator {
    public UnitIsZeroValidator(AbstractValidator nextValidator) {
        super(nextValidator);
    }

    @Override
    public String validate(double input) {
        if(input%10 != 0) return "Failed Unit is zero validation";
        return super.chainValidation(input);
    }
}
