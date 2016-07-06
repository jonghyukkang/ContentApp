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

    private ArrayList<ItemData> arrayData;

    public MyAdapter(ArrayList<ItemData> itemsData){
        this.arrayData = itemsData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.reName.setText(arrayData.get(position).getName());
        holder.reNaesun.setText(arrayData.get(position).getNaesun());
        holder.reNumber.setText(arrayData.get(position).getNumber().substring(0,3)+"-"+
                                arrayData.get(position).getNumber().substring(3,7)+"-"+
                                arrayData.get(position).getNumber().substring(7,11));
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
        return arrayData.size() ;
    }
}
