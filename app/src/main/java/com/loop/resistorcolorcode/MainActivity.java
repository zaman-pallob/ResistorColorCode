package com.loop.resistorcolorcode;
import android.app.Dialog;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import Fragments.Bfragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Button Information;
    AdView adView;
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

        MobileAds.initialize(this,"ca-app-pub-8289383626530980/5621578681");
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);

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
