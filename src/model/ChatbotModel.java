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
        return "Es tut mir leid, aber "+ userInput + " kann ich noch nicht beantworten.";
    }

    public List<String> getCurrentConversation() {
        return _currentConversation;
    }

}
