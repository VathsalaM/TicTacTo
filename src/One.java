import java.awt.*;

/**
 * Created by vathsala on 29/02/16.
 */
public class One extends Place implements Locate{

    public boolean isMatch(Button[] buttons, int placeValue) {
        boolean match1 = this.DoubleIncrementCheck(buttons,placeValue,3);
        boolean match2 = this.IncrementDecrementCheck(buttons,placeValue,1);
        return match1 || match2;
    }
}
