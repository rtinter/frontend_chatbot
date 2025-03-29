package view;

import view.components.ConversationPanel;
import view.components.InputPanel;

import javax.swing.*;
import java.awt.*;

public class ChatbotView extends JFrame {
    private final ConversationPanel _conversationPanel;
    private final InputPanel _inputPanel;

    public ChatbotView() {
        setTitle(GlobalConfig.TITLE);
        setSize(GlobalConfig.FRAME_WIDTH, GlobalConfig.FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        _inputPanel = new InputPanel();
        _conversationPanel = new ConversationPanel();

        this.add(_conversationPanel, BorderLayout.CENTER);
        this.add(_inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public ConversationPanel getConversationPanel() {
        return _conversationPanel;
    }

    public InputPanel getInputPanel() {
        return _inputPanel;
    }

}
