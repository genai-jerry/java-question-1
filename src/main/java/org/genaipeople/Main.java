package org.genaipeople;

import com.theokanning.openai.completion.CompletionChoice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String token = args[0];
        AIClient aiClient = new AIClient(token);
        aiClient.complete("Java is a great programming language. It was created by ", null).forEach(
                choice -> System.out.println(choice.getText())
        );
    }
}