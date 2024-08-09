package com.basava.behavioral.chain_of_responsibility.validator;

public abstract class AbstractValidator {
    private final AbstractValidator nextValidator;

    public abstract String validate(double input);

    // 1st type of setting next handler, alternatively we can use setNextValidator() method
    AbstractValidator(AbstractValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    protected String chainValidation(double input) {
        if (nextValidator != null) return nextValidator.validate(input);
        return "All validations Passed";
    }
}
