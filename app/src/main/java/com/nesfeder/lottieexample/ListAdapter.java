package com.nesfeder.lottieexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.List;

class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private List<String> listItems;

    ListAdapter(List<String> listItems) {
        this.listItems = listItems;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RelativeLayout viewHolderLayout = (RelativeLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_holder, parent, false);

        return new ListViewHolder(viewHolderLayout);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.listText.setText(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
}
