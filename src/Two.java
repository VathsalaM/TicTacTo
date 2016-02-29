import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Two extends Place{

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.DoubleIncrementCheck(buttons,placeValue,2);
        boolean match2 = this.DoubleIncrementCheck(buttons,placeValue,3);
        boolean match3 = this.DoubleDecrementCheck(buttons,placeValue,1);
        return match1 || match2 || match3;
    }
}
