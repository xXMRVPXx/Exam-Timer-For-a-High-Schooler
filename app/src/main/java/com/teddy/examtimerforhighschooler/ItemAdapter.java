package com.teddy.examtimerforhighschooler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> mItemList;
    private Context mContext;

    public ItemAdapter(ArrayList<Item> itemList, Context context) {
        mItemList = itemList;
        mContext = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int position) {
        Item currentItem = mItemList.get(position);
        itemViewHolder.mTextView.setText(currentItem.getText());
        itemViewHolder.mTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(mContext, SatReading.class);
                intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder  {
        public TextView mTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.textView);

        }


    }


}
