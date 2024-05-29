public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point2 == point1);
    }

    public static void show(UIControl control){
        var textBox = (TextBox)control;
        textBox.setText("Hello Dude");
        System.out.println(control);
    }
}