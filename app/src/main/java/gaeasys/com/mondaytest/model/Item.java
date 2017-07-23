package gaeasys.com.mondaytest.model;

/**
 * Created by User on 7/23/2017.
 */

public class Item {

    private int tabPosition ;
    private String text ;

    public Item(int tabPosition, String text) {
        this.tabPosition = tabPosition;
        this.text = text;
    }

    public int getTabPosition() {
        return tabPosition;
    }

    public void setTabPosition(int tabPosition) {
        this.tabPosition = tabPosition;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
