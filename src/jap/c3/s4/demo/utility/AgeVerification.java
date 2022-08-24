package jap.c3.s4.demo.utility;

import jap.c3.s4.demo.data.User;
import jap.c3.s4.demo.exception.InvalidAgeException;

public class AgeVerification {


    public boolean isValidAge(User user, int age) throws InvalidAgeException {
        if (user.getAge() < user.MINIMUM_AGE) {
            throw new InvalidAgeException("you are not allowed to use social media");
        } else {
            return true;
        }

    }
}
