import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Zero extends Place{

    public boolean isMatch(Button[] buttons,int placeValue) {
        boolean match1 = this.DoubleIncrementCheck(buttons,placeValue,1);
        boolean match2 = this.DoubleIncrementCheck(buttons,placeValue,3);
        boolean match3 = this.DoubleIncrementCheck(buttons,placeValue,4);
        return match1 || match2 || match3;
    }
}
