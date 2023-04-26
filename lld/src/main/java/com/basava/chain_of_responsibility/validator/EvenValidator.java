package com.basava.chain_of_responsibility.validator;

public class EvenValidator extends AbstractValidator {

    public EvenValidator(AbstractValidator nextValidator) {
        super(nextValidator);
    }

    @Override
    public String validate(double input) {
        if(input%2 != 0) return "Failed Even validation";
        return super.chainValidation(input);
    }
}
