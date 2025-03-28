package model;

import java.util.ArrayList;
import java.util.List;

public class ChatbotModel {

    private final List<String> _conversationHistory;

    public ChatbotModel() {
        _conversationHistory = new ArrayList<>();
    }

    public void addMessage(String message) {
        _conversationHistory.add(message);
    }

    public String generateResponse(String userInput) {
        return "Antwort vom Bot: ......";
    }

    public List<String> getConversationHistory() {
        return _conversationHistory;
    }

}
