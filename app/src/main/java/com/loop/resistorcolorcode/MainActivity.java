package com.loop.resistorcolorcode;
import android.app.Dialog;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


import Fragments.Bfragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Button Information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Information=findViewById(R.id.information);
        Bfragment fragment=new Bfragment();
         fragmentManager= getSupportFragmentManager();
         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.root, fragment);
         fragmentTransaction.commit();

        Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inf();
            }
        });


    }




    @Override
    public void onBackPressed() {

        if (getFragmentManager().getBackStackEntryCount() >0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    public void Inf(){
        Dialog dialog=new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.requestWindowFeature(Window.FEATURE_SWIPE_TO_DISMISS);
        dialog.setContentView(R.layout.myinfo);
        dialog.show();


    }
}
