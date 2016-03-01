import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by vathsala on 29/02/16.
 */

public class TicTacTo extends JFrame implements ActionListener{
    private Panel controlPanel;
    private JFrame mainFrame;
    private String[] values = {"O", "X"};
    private Button[] buttons = new Button[9];
    private int finalI = 0;
    private boolean gameOver;
    private Locate[] cells = null;

    public TicTacTo() {
        this.cells = this.classCreater();
        this.prepareGraphics();
    }

    private void prepareGraphics() {
        mainFrame = new JFrame();
        mainFrame.setSize(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);

        controlPanel = new Panel();
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }
    private void renderTabel() {
        for (int i = 0; i < 9; i++) {
            Button cell = new Button();
            cell.setName("" + i);
            this.buttons[i] = cell;
            controlPanel.add(cell);
            cell.addActionListener(this);
        }
        mainFrame.setVisible(true);
    }
    private Locate[] classCreater(){
        Locate[] newClassObjects = new Locate[9];
        String[] classNames = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight"};
        for (int i = 0; i < classNames.length; i++) {
            Locate newObject = null;
            try {
                newObject = (Locate) Class.forName(classNames[i]).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            newClassObjects[i] = newObject;
        }
        return newClassObjects;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        finalI++;
        String Class = e.toString().substring(90, 91);
        Integer placeValue = null;
        String player = values[finalI % 2];
        try{
            placeValue = Integer.parseInt(Class);
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(mainFrame,"Cell is already filled with value :"+player);
            return;
        }
        System.out.println("buttons "+Arrays.toString(this.buttons)+"\t"+buttons[placeValue]);
        Button button = this.buttons[placeValue];
        if(this.gameOver || finalI > 9){
            this.GameOver();
            return;
        }
        System.out.println(button+"\t"+player+"\t"+cells[placeValue]);
        cells[placeValue].place(button,player);
        boolean match = cells[placeValue].isMatch(buttons,placeValue);
        if (match) {
            this.disableDisplay(player);
        }
    }

    private void disableDisplay(String player) {
        gameOver = true;
        mainFrame.setBackground(Color.blue);
        JOptionPane.showMessageDialog(mainFrame,"Player "+player+" wins......!!!");
    }

    private void GameOver() {
        gameOver = true;
        mainFrame.setBackground(Color.red);
        JOptionPane.showMessageDialog(mainFrame,"Game Over .......!");
    }

    public static void main(String[] args) {
        TicTacTo ticTacTo = new TicTacTo();
        ticTacTo.renderTabel();
    }
}
