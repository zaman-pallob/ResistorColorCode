package com.loop.resistorcolorcode;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Four extends Fragment implements View.OnClickListener {
    TextView digit,tolerance,totalresistance;
    Button B1,B2,B3,B4;
    PlainDialog dialog;
    ValueHolder holder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v=inflater.inflate(R.layout.fourband,container,false);
        holder=new ValueHolder();
        digit=v.findViewById(R.id.digitfour);
        tolerance=v.findViewById(R.id.tolerancefourband);
        totalresistance=v.findViewById(R.id.totalfour);
        B1=v.findViewById(R.id.D41);
        B2=v.findViewById(R.id.D42);
        B3=v.findViewById(R.id.M4);
        B4=v.findViewById(R.id.T4);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);

        return v;

    }


    @Override
    public void onClick(View v) {



            switch (v.getId()){

                case R.id.D41:
                    dialog=new PlainDialog(getContext(),1);
                    dialog.DialogBox(v,holder);
                    break;
                case R.id.D42:
                     dialog=new PlainDialog(getContext(),1);
                    dialog.DialogBox(v,holder);
                    break;
                case R.id.M4:
                     dialog=new PlainDialog(getContext(),2);
                    dialog.DialogBox(v,holder);
                    break;
                case R.id.T4:
                    dialog=new PlainDialog(getContext(),3);
                    dialog.DialogBox(v,holder);
                    break;

            }

    }
}
