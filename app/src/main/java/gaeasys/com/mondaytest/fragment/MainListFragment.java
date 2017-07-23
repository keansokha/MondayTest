package gaeasys.com.mondaytest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import gaeasys.com.mondaytest.adapter.MainListAdapter;
import gaeasys.com.mondaytest.model.Item;

/**
 * Created by User on 7/23/2017.
 */

public abstract class MainListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ListView listView = new ListView(getActivity());
        listView.setAdapter(new MainListAdapter(getContext(), android.R.layout.simple_list_item_1, getData()));


        return listView ;
    }

    protected abstract List <Item> getData();
}
