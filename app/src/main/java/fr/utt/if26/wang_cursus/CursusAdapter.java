package fr.utt.if26.wang_cursus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxw on 2017/12/19.
 */

class CursusAdapter extends ArrayAdapter{
    ArrayList<Module> moduleArrayList = new ArrayList<Module>();

    public CursusAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull ArrayList modules) {
        super(context, 0, modules);
        this.moduleArrayList = modules;
    }

    public int getCount(){
        return super.getCount();
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = layoutInflater.inflate(R.layout.list_view_modules, null);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        TextView textView1 = (TextView)v.findViewById(R.id.textView2);
        textView.setText(moduleArrayList.get(position).getSigle());
        textView1.setText(Integer.toString(moduleArrayList.get(position).getCredit()));
        return v;
    }
}
