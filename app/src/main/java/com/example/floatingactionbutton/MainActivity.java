package com.example.floatingactionbutton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvanh;
    private FloatingActionButton btn_float;
    private Useradapter mUseradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvanh=findViewById(R.id.rcv_user);
        btn_float=findViewById(R.id.btn_float);

        mUseradapter=new Useradapter();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        rcvanh.setLayoutManager(linearLayoutManager);

        mUseradapter.setdata(getdata());
        rcvanh.setAdapter(mUseradapter);

        rcvanh.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if(dy>0){
                    btn_float.hide();
                }else {
                    btn_float.show();
                }


                super.onScrolled(recyclerView, dx, dy);
            }
        });


    }

    private List<User> getdata() {

        List<User> list=new ArrayList<>();
        list.add(new User(R.drawable.anh,"user name 1"));
        list.add(new User(R.drawable.anh3d,"user name 2"));
        list.add(new User(R.drawable.aaa,"user name 3"));
        list.add(new User(R.drawable.vo,"user name 4"));

        list.add(new User(R.drawable.anh,"user name 1"));
        list.add(new User(R.drawable.anh3d,"user name 2"));
        list.add(new User(R.drawable.aaa,"user name 3"));
        list.add(new User(R.drawable.vo,"user name 4"));

        list.add(new User(R.drawable.anh,"user name 1"));
        list.add(new User(R.drawable.anh3d,"user name 2"));
        list.add(new User(R.drawable.aaa,"user name 3"));
        list.add(new User(R.drawable.vo,"user name 4"));
        return list;
    }
}