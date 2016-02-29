import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Eight extends Place{
    public void match(Button[] buttons, int placeValue) {
        
    }

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.DoubleDecrementCheck(buttons,placeValue,3);
        boolean match2 = this.DoubleDecrementCheck(buttons,placeValue,4);
        return match1 || match2;
    }
}
