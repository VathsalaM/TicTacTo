import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Five extends Place{

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.IncrementDecrementCheck(buttons,placeValue,3);
        boolean match2 = this.DoubleDecrementCheck(buttons,placeValue,1);
        return match1 || match2;

    }
}
