package com.basava.behavioral.chain_of_responsibility.validator;

public class DivisibleBySixValidator extends AbstractValidator {
    public DivisibleBySixValidator(AbstractValidator nextValidator) {
        super(nextValidator);
    }

    @Override
    public String validate(double input) {
        if(input%2 != 0 || input%3 != 0 || input%6 != 0) return "Failed Divisible by 6 validation";
        return super.chainValidation(input);
    }
}
