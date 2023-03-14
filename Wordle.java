/*
 * File: Wordle.java
 * -----------------
 * This module is the starter file for the Wordle assignment.
 * BE SURE TO UPDATE THIS COMMENT WHEN YOU COMPLETE THE CODE.
 */

import edu.willamette.cs1.wordle.WordleDictionary;
import edu.willamette.cs1.wordle.WordleGWindow;
import java.util.*;

public class Wordle {

  public void run() {
    gw = new WordleGWindow();
    gw.addEnterListener((s) -> enterAction(s));
  }

/*
 * Called when the user hits the RETURN key or clicks the ENTER button,
 * passing in the string of characters on the current row.
 */

  public void enterAction(String s) {
    gw.showMessage("You have to implement this method.");
  }

/* Startup code */

  public static void main(String[] args) {
    Random rand = new Random();
    int wordNumber = rand.nextInt(WordleDictionary.FIVE_LETTER_WORDS.length);
    
    String word = WordleDictionary.FIVE_LETTER_WORDS[wordNumber];
    char[] wordAsChars = word.toCharArray();
    new Wordle().run();
    gw.setSquareLetter(0, 0, String.valueOf(wordAsChars[0]).toUpperCase());
    gw.setSquareLetter(0, 1, String.valueOf(wordAsChars[1]).toUpperCase());
    gw.setSquareLetter(0, 2, String.valueOf(wordAsChars[2]).toUpperCase());
    gw.setSquareLetter(0, 3, String.valueOf(wordAsChars[3]).toUpperCase());
    gw.setSquareLetter(0, 4, String.valueOf(wordAsChars[4]).toUpperCase());
  }

/* Private instance variables */

  private static WordleGWindow gw;

}
