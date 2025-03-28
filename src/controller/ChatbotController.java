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

        this._chatbotView.getInputPanel().getSendButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleUserInput();
            }
        });
    }

    private void handleUserInput() {
        String userInput = _chatbotView.getInputPanel().getInputField().getText();
        _chatbotModel.addMessage("User: " + userInput);
        String response = _chatbotModel.generateResponse(userInput);
        _chatbotModel.addMessage("Bot: " + response);
        _chatbotView.getConversationPanel().updateConversation(_chatbotModel.getConversationHistory());
        _chatbotView.getInputPanel().getInputField().setText("");
    }
}