package view.components;

import view.GlobalConfig;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.List;

public class ConversationPanel extends JTextArea {

    public ConversationPanel(){
        this.setFont(GlobalConfig.DEFAULT_FONT);
        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setBorder(null);
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.setBorder(null);
    }

    public void updateConversation(List<String> conversationHistory) {
        this.setText(String.join("\n", conversationHistory));
    }
}