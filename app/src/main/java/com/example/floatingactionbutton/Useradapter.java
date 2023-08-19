package com.example.floatingactionbutton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Useradapter extends RecyclerView.Adapter<Useradapter.UserViewHolder> {

    private List<User> mUserList;

    public void setdata(List<User> list){
        this.mUserList=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user=mUserList.get(position);
        if(user==null){
            return;
        }
        holder.imganh.setImageResource(user.getAnh());
        holder.txtname.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if(mUserList!=null){
            return mUserList.size();
        }
        return 0;
    }

    public class UserViewHolder  extends RecyclerView.ViewHolder{

        TextView txtname;
        ImageView imganh;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname=(TextView) itemView.findViewById(R.id.txtname);
            imganh=(ImageView) itemView.findViewById(R.id.imganh);
        }
    }
}
