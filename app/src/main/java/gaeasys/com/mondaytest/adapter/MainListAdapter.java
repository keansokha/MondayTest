package gaeasys.com.mondaytest.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import gaeasys.com.mondaytest.model.Item;

/**
 * Created by User on 7/23/2017.
 */

public class MainListAdapter extends ArrayAdapter<Item> {

    public MainListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView txt = new TextView(getContext());
        txt.setPadding(20, 20, 20, 20);
        txt.setTextSize(18);
        Item item = getItem(position);

        if (item != null) {
            txt.setText(item.getText());
        }

        return txt ;
    }
}
