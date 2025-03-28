package controller;

import model.ChatbotModel;
import view.ChatbotView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotController {

    private final ChatbotView _chatbotView;
    private final ChatbotModel _chatbotModel;

    public ChatbotController(ChatbotView chatbotView, ChatbotModel chatbotModel) {
        this._chatbotView = chatbotView;
        this._chatbotModel = chatbotModel;

        //adding the action listener to the send button
        this._chatbotView.getInputPanel().getSendButton().addActionListener(e -> handleUserInput());
    }

    private void handleUserInput() {
        String userInput = _chatbotView.getInputPanel().getInputField().getText();
        if (userInput.trim().isEmpty()) {
            return;
        }
        _chatbotModel.addMessage("User: " + userInput);
        String response = _chatbotModel.generateResponse(userInput);
        _chatbotModel.addMessage("Bot: " + response);
        _chatbotView.getConversationPanel().updateConversation(_chatbotModel.getConversationHistory());
        _chatbotView.getInputPanel().getInputField().setText("");
    }
}