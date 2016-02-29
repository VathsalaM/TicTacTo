import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Three extends Place{

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.DoubleIncrementCheck(buttons,placeValue,1);
        boolean match2 = this.IncrementDecrementCheck(buttons,placeValue,3);
        return match1 || match2;
    }
}
