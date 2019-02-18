package Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.loop.resistorcolorcode.R;

import PoJo.CheckerClass;
import PoJo.PlainDialog;
import PoJo.ValueHolder;

public class Four extends Fragment implements View.OnClickListener {
    TextView digit,tolerance,totalresistance;
    Button B1,B2,B3,B4,Click;
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
        Click=v.findViewById(R.id.clickfour);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        Click.setOnClickListener(this);

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
                case R.id.clickfour:
                    CheckerClass checkerClass=new CheckerClass(1,holder);
                    digit.setText(checkerClass.getTextView1());
                    tolerance.setText(checkerClass.getTextView2());
                    totalresistance.setText(checkerClass.getTextView3());
                    break;

            }

    }

}
