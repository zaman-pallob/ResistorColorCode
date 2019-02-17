package com.loop.resistorcolorcode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomGrid extends BaseAdapter {
    private Context mContext;
    private final int[] colorId;

    public CustomGrid(Context c,int[] colorId ) {
        mContext = c;
        this.colorId = colorId;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return colorId.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    class ViewHolder{

        TextView textView;
        public ViewHolder(View v){

            textView=v.findViewById(R.id.colorgrid);
        }


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View row=convertView;
        ViewHolder holder=null;


        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.singlegrid, null);
            holder=new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder)row.getTag();
        }


        holder.textView.setBackgroundColor(colorId[position]);
        return row;
    }
}
