package gaeasys.com.mondaytest.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import gaeasys.com.mondaytest.R;
import gaeasys.com.mondaytest.model.Item;


public class HomeFragment extends MainListFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private int param ;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(int param) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            param = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    protected List<Item> getData() {
        List <Item> items = new ArrayList<>();
        for (int i = 0 ; i< 100 ; i++) {
            items.add(new Item(0, "Item " + i));
        }
        return items;
    }


}
