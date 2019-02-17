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

public class Six extends Fragment implements View.OnClickListener {
    TextView digit,tolerance,tempcoefficient,totalresistance;
    Button B1,B2,B3,B4,B5,B6;
    PlainDialog dialog;
    ValueHolder holder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v=inflater.inflate(R.layout.sixband,container,false);
        holder=new ValueHolder();
        digit=v.findViewById(R.id.digitsix);
        tolerance=v.findViewById(R.id.tolerancesixband);
        tempcoefficient=v.findViewById(R.id.tempcoefficeint);
        totalresistance=v.findViewById(R.id.totalsix);
        B1=v.findViewById(R.id.D61);
        B2=v.findViewById(R.id.D62);
        B3=v.findViewById(R.id.D63);
        B4=v.findViewById(R.id.M6);
        B5=v.findViewById(R.id.T6);
        B6=v.findViewById(R.id.TC);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.D61:
                dialog=new PlainDialog(getContext(),1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.D62:
                dialog=new PlainDialog(getContext(),1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.D63:
                dialog=new PlainDialog(getContext(),1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.M6:
                dialog=new PlainDialog(getContext(),2);
                dialog.DialogBox(v,holder);
                break;
            case R.id.T6:
                dialog=new PlainDialog(getContext(),3);
                dialog.DialogBox(v,holder);
                break;
            case R.id.TC:
                dialog=new PlainDialog(getContext(),4);
                dialog.DialogBox(v,holder);
                break;

        }

    }
}
