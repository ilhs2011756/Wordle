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
    Random rand = new Random();
    int wordNumber = rand.nextInt(WordleDictionary.FIVE_LETTER_WORDS.length);
    
    String word = WordleDictionary.FIVE_LETTER_WORDS[wordNumber];
    char[] wordAsChars = word.toCharArray();
  }

/*
 * Called when the user hits the RETURN key or clicks the ENTER button,
 * passing in the string of characters on the current row.
 */

  public void enterAction(String s) {
    for (String word : WordleDictionary.FIVE_LETTER_WORDS) {
      if (s.equalsIgnoreCase(word)) {
        gw.showMessage("Wow thats a word");
        return;
      }
    }
    gw.showMessage("Not in word list");
  }

/* Startup code */

  public static void main(String[] args) {
    new Wordle().run();
  }

/* Private instance variables */

  private WordleGWindow gw;

}
