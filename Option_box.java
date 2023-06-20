import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Option_box {

    public static void main(String[] args) {
        ImageIcon Icon = new ImageIcon("download.jpg");
        String []responses = {"No, you are","Thanx","You are blushing"};
    int answer = JOptionPane.showOptionDialog(null,
            "You are best",
            "Query",
            JOptionPane.DEFAULT_OPTION,
            0,
            Icon,
            responses,
            responses[0]);
        System.out.println(answer);
        int res = JOptionPane.showConfirmDialog(null,"Do you want to continue?" , "File",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE, Icon);
    }
}
