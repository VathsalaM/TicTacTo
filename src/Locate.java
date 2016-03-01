import java.awt.*;

/**
 * Created by vathsala on 01/03/16.
 */
public interface Locate {
    public boolean isMatch(Button[] buttons, int placeValue);

    void place(Button button, String player);
}
