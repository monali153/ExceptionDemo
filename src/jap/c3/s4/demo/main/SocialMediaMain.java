package jap.c3.s4.demo.main;

import jap.c3.s4.demo.data.User;
import jap.c3.s4.demo.exception.InvalidAgeException;
import jap.c3.s4.demo.utility.AgeVerification;

public class SocialMediaMain {
    public static void main(String[] args) {

        User user = new User("Vaibhav", 38);
        User user1 = new User("Monali", 10);

        AgeVerification ageVerification = new AgeVerification();
        try {
            ageVerification.isValidAge(user, user.getAge());
            System.out.println("name = " + user.getName());
            System.out.println("Age = " + user.getAge());
            ageVerification.isValidAge(user1, user1.getAge());
            System.out.println("name = " + user1.getName());
            System.out.println("Age = " + user1.getAge());

        } catch (InvalidAgeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
