package Assignment.Assignment6.AccountGuiExample.Boundary;

public class GUIScreen extends Screen{
    private GUI gui;

    public GUIScreen(GUI gui) {
        this.gui = gui;
    }
    public void displayPrompt(String msg){
        gui.setText(msg);
    }
    public void displayMessage(String msg){
        gui.setText(msg);

    }
}
