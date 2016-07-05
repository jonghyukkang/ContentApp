package kang.navigationview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by kangjonghyuk on 2016. 7. 4..
 */
public class Fragment_phone extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_phone, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        ItemData itemsData[] = { new ItemData("강종혁","511","010-5503-3471"),
                new ItemData("강종혁","511","010-5503-3471"),
                new ItemData("강종혁","511","010-5503-3471"),
                new ItemData("강종혁","511","010-5503-3471"),
                new ItemData("강종혁","511","010-5503-3471"),
                new ItemData("강종혁","511","010-5503-3471")};

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }
}
