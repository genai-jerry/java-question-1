package org.genaipeople;

import com.theokanning.openai.completion.CompletionChoice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AIClient aiClient = new AIClient();
        aiClient.complete("Somebody once told me the world is gonna roll me", null).forEach(CompletionChoice::toString);
    }
}