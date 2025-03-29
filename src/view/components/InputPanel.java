package view.components;

import view.GlobalConfig;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class InputPanel extends JPanel {
    private final JTextArea _inputField;
    private final JButton _sendButton;

    public InputPanel() {
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Improved input field
        _inputField = new JTextArea();
        _inputField.setPreferredSize(new Dimension(GlobalConfig.FRAME_WIDTH, 40));
        _inputField.setLineWrap(true);
        _inputField.setWrapStyleWord(true);
        _inputField.setFont(GlobalConfig.DEFAULT_FONT);

        _inputField.setBorder(new EmptyBorder(5, 5, 5, 5));

        // button setup
        _sendButton = new JButton("Senden");
        _sendButton.setFont(GlobalConfig.DEFAULT_FONT);
        _sendButton.setPreferredSize(new Dimension(130, 40));

        // Panel setup with BorderLayout
        this.setLayout(new BorderLayout(10, 0));
        this.add(new JScrollPane(_inputField), BorderLayout.CENTER);
        this.add(_sendButton, BorderLayout.EAST);
    }

    public JTextArea getInputField() {
        return _inputField;
    }

    public JButton getSendButton() {
        return _sendButton;
    }
}