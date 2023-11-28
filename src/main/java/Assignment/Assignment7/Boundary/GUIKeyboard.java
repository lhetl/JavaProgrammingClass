package Assignment.Assignment7.Boundary;

public class GUIKeyboard extends Keyboard{
    private GUI gui;

    public GUIKeyboard(GUI gui) {
        this.gui = gui;
    }

    public int getInt(){
        return gui.getFieldTextInt();
    }

}
