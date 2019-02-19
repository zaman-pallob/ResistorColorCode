package Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.loop.resistorcolorcode.R;


public class Bfragment extends Fragment {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    CardView cv1,cv2,cv3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v=inflater.inflate(R.layout.bfragment,container,false);
        fragmentManager= getFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();
        cv1=v.findViewById(R.id.fourband);
        cv2=v.findViewById(R.id.fiveband);
        cv3=v.findViewById(R.id.sixband);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Four fragment=new Four();
                fragmentTransaction.replace(R.id.root, fragment);
                fragmentTransaction.addToBackStack("fragment1");
                fragmentTransaction.commit();
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Five fragment=new Five();
                fragmentTransaction.replace(R.id.root, fragment);
                fragmentTransaction.addToBackStack("fragment2");
                fragmentTransaction.commit();

            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Six fragment=new Six();
                fragmentTransaction.replace(R.id.root, fragment);
                fragmentTransaction.addToBackStack("fragment3");
                fragmentTransaction.commit();
            }
        });

        return v;

    }

}
