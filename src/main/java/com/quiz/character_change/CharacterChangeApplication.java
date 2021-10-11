package com.quiz.character_change;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharacterChangeApplication {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        String string2 = scan.next();  //scan input user
        scan.close();
        int howMany = string1.length(); //determine the length of input
        int count = 0;

        for (int i = 0; i < howMany ; i++ ){
            if (string1.charAt(i)!=string2.charAt(i)) {  //using charAt() to determined the value of string char.
                count += 1;
            } 
        }
        System.out.println(count);

	}
}
