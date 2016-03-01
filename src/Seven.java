import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public class Seven extends Place implements Locate{

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.DoubleDecrementCheck(buttons,placeValue,3);
        boolean match2 = this.IncrementDecrementCheck(buttons,placeValue,1);
        return match1 || match2;
    }
}
