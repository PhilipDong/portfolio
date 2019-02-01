package com.example.drawerportfolio01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.net.URI;

public class MessageFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message, container, false);
    }

}



public class MessageFragment1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_message);

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);


        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button2:
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Phil_D_BS"));
                startActivity(browserIntent);
                break;
            case R.id.button3:
                Intent browserInten2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tdphilipdong/"));
                startActivity(browserInten2);
                break;

  }
}}
