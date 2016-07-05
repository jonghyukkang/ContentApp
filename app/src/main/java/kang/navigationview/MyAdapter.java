package kang.navigationview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kangjonghyuk on 2016. 7. 5..
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ItemData[] itemsData;

    public MyAdapter(ItemData[] itemsData){
        this.itemsData = itemsData;
    }
    
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.reName.setText(itemsData[position].getName());
        holder.reNaesun.setText(itemsData[position].getNaesun());
        holder.reNumber.setText(itemsData[position].getNumber());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView reName, reNaesun, reNumber;

        public ViewHolder(View itemLayoutView){
            super(itemLayoutView);
            reName = (TextView) itemLayoutView.findViewById(R.id.reName);
            reNaesun = (TextView) itemLayoutView.findViewById(R.id.reNaesun);
            reNumber = (TextView) itemLayoutView.findViewById(R.id.reNumber);
        }
    }

    @Override
    public int getItemCount() {
        return itemsData.length ;
    }
}
