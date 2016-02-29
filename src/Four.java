import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Four extends Place{
    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.IncrementDecrementCheck(buttons,placeValue,1);
        boolean match2 = this.IncrementDecrementCheck(buttons,placeValue,2);
        boolean match3 = this.IncrementDecrementCheck(buttons,placeValue,3);
        boolean match4 = this.IncrementDecrementCheck(buttons,placeValue,4);

        return match1 || match2 || match3 || match4;
    }
}
