package model;

import java.util.ArrayList;
import java.util.List;

public class ChatbotModel {

    private final ArrayList<String> _currentConversation;

    public ChatbotModel() {
        _currentConversation = new ArrayList<>();
    }

    public void addMessage(String message) {
        _currentConversation.add(message);
    }

    public String generateResponse(String userInput) {
        return "API Call für den output: " + userInput;
    }

    public List<String> getCurrentConversation() {
        return _currentConversation;
    }
}
