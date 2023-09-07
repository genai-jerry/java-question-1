package org.genaipeople;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

public class AIClient {

    private OpenAiService aiService = null;
    private static final String DEFAULT_MODEL = "ada";
    public AIClient(){
        aiService = new OpenAiService("<Your Token>");
    }

    public List<CompletionChoice> complete(String prompt, String model){
        if(model==null){
            model = DEFAULT_MODEL;
        }
        CompletionRequest completionRequest = CompletionRequest.builder()
                .model(model)
                .echo(true)
                .build();
        return aiService.createCompletion(completionRequest).getChoices();
    }
}
