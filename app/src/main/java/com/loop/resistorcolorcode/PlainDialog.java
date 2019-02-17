package com.loop.resistorcolorcode;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;


public class PlainDialog {
    GridView gridView;
    int id;
    Dialog dialog;
    Context context;
    int []colorId;
    double []multiplier={-2,-1,0,1,2,3,4,5,6,7};
    double []tolarance={0.05,0.1,0.25,0.5,1,2,5,10,20};
    double []tempcoef={15,25,50,100};
    public PlainDialog(Context context,int id) {
        this.id=id;
        this.context=context;
        switch (id){
            case 1:
                colorId=context.getResources().getIntArray(R.array.COLOR_Digit);
                break;
            case 2:
                colorId=context.getResources().getIntArray(R.array.COLOR_Multiplier);
                break;
            case 3:
                colorId=context.getResources().getIntArray(R.array.COLOR_Tolerance);
                break;
            case 4:
                colorId=context.getResources().getIntArray(R.array.COLOR_TempCoeff);
                break;
        }


    }
    public void DialogBox(final View v, final ValueHolder holder){
        dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.colorpicker);
        gridView=dialog.findViewById(R.id.gridview);
        CustomGrid customGrid=new CustomGrid(context,colorId);
        dialog.show();
        gridView.setAdapter(customGrid);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                v.setBackgroundColor(colorId[position]);
                idHandler(v,holder,position);
                dialog.dismiss();

            }
        });



    }


    void idHandler(View id,ValueHolder holder,int p){
        switch (id.getId()){
            case R.id.D41:
                holder.setDigit1(p);
                break;
            case R.id.D42:
                holder.setDigit2(p);
                break;
            case R.id.D51:
                holder.setDigit1(p);
                break;
            case R.id.D52:
                holder.setDigit2(p);
                break;
            case R.id.D53:
                holder.setDigit3(p);
                break;
            case R.id.D61:
                holder.setDigit1(p);
                break;
            case R.id.D62:
                holder.setDigit2(p);
                break;
            case R.id.D63:
                holder.setDigit3(p);
                break;
            case R.id.M4:
                holder.setMultiplier(Math.pow(10,multiplier[p]));
               break;
            case R.id.M5:
                holder.setMultiplier(Math.pow(10,multiplier[p]));
                break;
            case R.id.M6:
                holder.setMultiplier(Math.pow(10,multiplier[p]));
                break;
            case R.id.T4:
                holder.setTolerance(tolarance[p]);
                break;
            case R.id.T5:
                holder.setTolerance(tolarance[p]);
                break;
            case R.id.T6:
                holder.setTolerance(tolarance[p]);
                break;
            case R.id.TC:
                holder.setTemcoefficient(tempcoef[p]);
                break;



        }


    }




}
