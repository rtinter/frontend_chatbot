import controller.ChatbotController;
import model.ChatbotModel;
import view.ChatbotView;

public class Main {
    public static void main(String[] args) {
        ChatbotView view = new ChatbotView();
        ChatbotModel model = new ChatbotModel();
        ChatbotController controller = new ChatbotController(view, model);
    }
}
