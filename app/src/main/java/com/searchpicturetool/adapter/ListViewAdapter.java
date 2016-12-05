package com.searchpicturetool.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.searchpicturetool.R;

import java.util.List;

/**
 * Created by liqinghai on 2016/12/5.
 */
public class ListViewAdapter extends BaseAdapter {
    private List list;
    private Context context;
    public ListViewAdapter(Context context,List list){
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1=View.inflate(context, R.layout.list_item,null);
        TextView textView = (TextView) view1.findViewById(R.id.textView);
        textView.setText((String) list.get(i));
        return view1;
    }
}
