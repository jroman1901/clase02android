package com.example.recicleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<UserModel> userModelList;

    public UserAdapter(List<UserModel> userModelList) {
        this.userModelList = userModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        String name = userModelList.get(position).getNombre();
        holder.name.setText(name);

    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        public ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.txtusername);
        }
    }

}


