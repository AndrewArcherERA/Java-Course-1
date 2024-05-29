public class UIControl {
    private boolean isEnabled = false;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disabled(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
