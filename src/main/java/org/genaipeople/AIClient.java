package org.genaipeople;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

public class AIClient {

    private OpenAiService aiService = null;
    private static final String DEFAULT_MODEL = "text-davinci-003";
    public AIClient(String token){
        aiService = new OpenAiService(token);
    }

    public List<CompletionChoice> complete(String prompt, String model){
        if(model==null){
            model = DEFAULT_MODEL;
        }
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model(model)
                .temperature(0.1)
                .build();
        return aiService.createCompletion(completionRequest).getChoices();
    }
}
