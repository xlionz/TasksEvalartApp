package co.com.qvision.certificacion.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class Count {

    public static String resultOfEmojisCount(Actor actor, Target allEmojis, String emoji){

        int counterEmojis = 0;
        String emojisTransform = allEmojis.resolveFor(actor).getText().replaceAll(emoji, "a");

        for (int i = 0; emojisTransform.length() > i; i++){

            if (emojisTransform.charAt(i) == 'a'){
                counterEmojis++;
            }
        }

        return Integer.toString(counterEmojis);
    }

    public static String letter(int quantity, String letter){
        String allLetters = letter;

        for (int i = 0; i < quantity - 1; i++){
            allLetters = allLetters + letter;
        }

        return allLetters;
    }

}
