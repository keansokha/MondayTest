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

public class PhotosFragment extends MainListFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private int mParam1;

    public PhotosFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static PhotosFragment newInstance(int param1) {
        PhotosFragment fragment = new PhotosFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected List<Item> getData() {
        List <Item> data = new ArrayList<>();
        for (int i = 0 ; i< 100 ;i++){
            data.add(new Item(1, "image " + i));
        }
        return data ;
    }
}
