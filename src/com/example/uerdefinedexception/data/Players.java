package com.example.uerdefinedexception.data;

import com.example.userdefinedexception.PlayerNotFoundException;

public class Players {

    int playerAge = 0;

    public static void main(String[] args) {

        Players p1 = new Players();
        try {
            p1.getPlayerAge(10);
        } catch (PlayerNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void getPlayerAge(int age) throws PlayerNotFoundException {
        if (playerAge < age) {
            throw new PlayerNotFoundException("invalid age");
        }
    }
}
