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

public class Five extends Fragment implements View.OnClickListener {
    TextView digit,tolerance,totalresistance;
    Button B1,B2,B3,B4,B5,Click;
    PlainDialog dialog;
    ValueHolder holder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v=inflater.inflate(R.layout.fiveband,container,false);
        holder=new ValueHolder();
        digit=v.findViewById(R.id.digitfive);
        tolerance=v.findViewById(R.id.tolerancefiveband);
        totalresistance=v.findViewById(R.id.totalfive);
        B1=v.findViewById(R.id.D51);
        B2=v.findViewById(R.id.D52);
        B3=v.findViewById(R.id.D53);
        B4=v.findViewById(R.id.M5);
        B5=v.findViewById(R.id.T5);
        Click=v.findViewById(R.id.clickfive);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        Click.setOnClickListener(this);

        return v;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.D51:
                dialog = new PlainDialog(getContext(), 1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.D52:
                dialog = new PlainDialog(getContext(), 1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.D53:
                dialog = new PlainDialog(getContext(), 1);
                dialog.DialogBox(v,holder);
                break;
            case R.id.M5:
                dialog = new PlainDialog(getContext(), 2);
                dialog.DialogBox(v,holder);
                break;
            case R.id.T5:
                dialog = new PlainDialog(getContext(), 3);
                dialog.DialogBox(v,holder);
                break;
            case R.id.clickfive:
                CheckerClass checkerClass=new CheckerClass(2,holder);
                digit.setText(checkerClass.getTextView1());
                tolerance.setText(checkerClass.getTextView2());
                totalresistance.setText(checkerClass.getTextView4());
                break;
        }
    }
}
