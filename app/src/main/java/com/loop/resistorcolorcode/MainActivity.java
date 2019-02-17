package com.loop.resistorcolorcode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bfragment fragment=new Bfragment();
         fragmentManager= getSupportFragmentManager();
         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.root, fragment);
         fragmentTransaction.commit();



    }


    @Override
    public void onBackPressed() {

        if (getFragmentManager().getBackStackEntryCount() >0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
