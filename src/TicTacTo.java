import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vathsala on 29/02/16.
 */

public class TicTacTo extends JFrame implements ActionListener {
    private Panel controlPanel;
    private JFrame mainFrame;
    private String[] values = {"O", "X"};
    private Button[] buttons = new Button[9];
    private int finalI = 0;
    private boolean gameOver;

    public TicTacTo() {
        prepareGraphics();
    }

    private void prepareGraphics() {
        mainFrame = new JFrame();
        mainFrame.setSize(300, 300);

        controlPanel = new Panel();
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    private void renderTabel() {
        for (int i = 0; i < 9; i++) {
            Button cell = new Button();
            cell.setName("" + i);
            buttons[i] = cell;
            controlPanel.add(cell);
            cell.addActionListener(this);
        }
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        TicTacTo ticTacTo = new TicTacTo();
        ticTacTo.renderTabel();
    }

    private void disableDisplay(String player) {
        gameOver = true;
        mainFrame.setBackground(Color.blue);
        JOptionPane.showMessageDialog(mainFrame,"Player "+player+" wins......!!!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        finalI++;
        if(this.gameOver || finalI == 9){
            this.GameOver();
            return;
        }
        String Class = e.toString().substring(90, 91);
        int placeValue = Integer.parseInt(Class);
        boolean match = false;
        String player = values[finalI % 2];
        Button button = buttons[placeValue];
        if (placeValue == 0) {
            Zero zero = new Zero();
            zero.place(button,player);
            match = zero.isMatch(buttons, placeValue);
        }
        if (placeValue == 1) {
            One one = new One();
            one.place(button,player);
            match = one.isMatch(buttons, placeValue);

        }
        if (placeValue == 2) {
            Two two = new Two();
            two.place(button,player);
            match = two.isMatch(buttons, placeValue);
        }

        if (placeValue == 3) {
            Three three = new Three();
            three.place(button,player);
            match = three.isMatch(buttons, placeValue);
        }

        if (placeValue == 4) {
            Four four = new Four();
            four.place(button,player);
            match = four.isMatch(buttons, placeValue);
        }

        if (placeValue == 5) {
            Five five = new Five();
            five.place(button,player);
            match = five.isMatch(buttons, placeValue);
        }

        if (placeValue == 6) {
            Six six = new Six();
            six.place(button,player);
            match = six.isMatch(buttons, placeValue);
        }

        if (placeValue == 7) {
            Seven seven = new Seven();
            seven.place(button,player);
            match = seven.isMatch(buttons, placeValue);
        }

        if (placeValue == 8) {
            Eight eight = new Eight();
            eight.place(button,player);
            match = eight.isMatch(buttons, placeValue);
        }
        if (match) {
            this.disableDisplay(values[finalI%2]);
        }

    }

    private void GameOver() {
        gameOver = true;
        mainFrame.setBackground(Color.red);
        JOptionPane.showMessageDialog(mainFrame,"Game Over .......!");
    }
}
