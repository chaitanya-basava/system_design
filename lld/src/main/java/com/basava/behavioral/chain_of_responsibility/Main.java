package com.basava.behavioral.chain_of_responsibility;

import com.basava.behavioral.chain_of_responsibility.logger.AbstractLogger;
import com.basava.behavioral.chain_of_responsibility.logger.DebugLogger;
import com.basava.behavioral.chain_of_responsibility.logger.ErrorLogger;
import com.basava.behavioral.chain_of_responsibility.logger.InfoLogger;
import com.basava.behavioral.chain_of_responsibility.validator.AbstractValidator;
import com.basava.behavioral.chain_of_responsibility.validator.DivisibleBySixValidator;
import com.basava.behavioral.chain_of_responsibility.validator.EvenValidator;
import com.basava.behavioral.chain_of_responsibility.validator.UnitIsZeroValidator;

public class Main {
    private static AbstractLogger getLogger() {
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = Main.getLogger();

        logger.write(AbstractLogger.INFO, "Validating all conditions");
        AbstractValidator allValidator = new EvenValidator(new DivisibleBySixValidator( new UnitIsZeroValidator(null)));

        logger.write(AbstractLogger.ERROR, allValidator.validate(6));
        logger.write(AbstractLogger.DEBUG, allValidator.validate(30));
        logger.write(AbstractLogger.ERROR, allValidator.validate(20));

        logger.write(AbstractLogger.INFO, "Validating only even and divisible by six");
        AbstractValidator doubleValidator = new EvenValidator(new DivisibleBySixValidator(null));

        logger.write(AbstractLogger.DEBUG, doubleValidator.validate(6));
        logger.write(AbstractLogger.DEBUG, doubleValidator.validate(30));
        logger.write(AbstractLogger.ERROR, doubleValidator.validate(20));
    }
}
