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
public class Fragment_phone extends Fragment implements DialogFragment_Add.OnAddListener{
    RecyclerView recyclerView;
    ArrayList<ItemData> arrayData;
    ItemData[] itemsData;
    MyAdapter mAdapter;
    FloatingActionButton fab;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_phone, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        arrayData = new ArrayList<>();

        itemsData = new ItemData[]{};

        for(int i=0; i<itemsData.length;i++){
            arrayData.add(itemsData[i]);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new MyAdapter(arrayData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                DialogFragment_Add dialog = new DialogFragment_Add();
                dialog.setTargetFragment(Fragment_phone.this, 0);
                dialog.show(fm, "add_dialog");
            }
        });

        return view;
    }
    @Override
    public void onAddSubmit(String name, String naesun, String number) {
        arrayData.add(new ItemData(name, naesun, number));
        mAdapter.notifyDataSetChanged();
    }
}
