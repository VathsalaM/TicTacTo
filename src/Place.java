import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Place {
    public void place(Button button, String value){
        button.setLabel(value);
    }

    public Boolean DoubleIncrementCheck(Button[] buttons,int placeValue,int incrementWith){
        String value_b1 = buttons[placeValue].getLabel();
        String value_b2 = buttons[placeValue+incrementWith].getLabel();
        String value_b3 = buttons[placeValue+incrementWith+incrementWith].getLabel();
        return this.compareStrings(value_b1,value_b2,value_b3);
    }

    public boolean IncrementDecrementCheck(Button[] buttons, int placeValue, int incrementWith) {
        String value_b1 = buttons[placeValue].getLabel();
        String value_b2 = buttons[placeValue+incrementWith].getLabel();
        String value_b3 = buttons[placeValue-incrementWith].getLabel();
        return this.compareStrings(value_b1,value_b2,value_b3);
    }

    private boolean compareStrings(String value_b1, String value_b2, String value_b3) {
        return value_b1.equals(value_b2) && value_b2.equals(value_b3);
    }

    public boolean DoubleDecrementCheck(Button[] buttons, int placeValue, int decrementWith) {
        String value_b1 = buttons[placeValue].getLabel();
        String value_b2 = buttons[placeValue-decrementWith].getLabel();
        String value_b3 = buttons[placeValue-decrementWith-decrementWith].getLabel();
        return this.compareStrings(value_b1,value_b2,value_b3);
    }
}
