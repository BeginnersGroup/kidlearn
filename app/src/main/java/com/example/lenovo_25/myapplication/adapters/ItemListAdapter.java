package com.example.lenovo_25.myapplication.adapters;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo_25.myapplication.CapitalAlphabetActivity;
import com.example.lenovo_25.myapplication.DrawableActivity;
import com.example.lenovo_25.myapplication.ImageResource;
import com.example.lenovo_25.myapplication.R;

import java.util.ArrayList;

import static com.example.lenovo_25.myapplication.SecondActivity.menuNo;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.StudentHolder> {

    Context c;
    ArrayList<String> obj;
    ArrayList<Integer> checked;
    //int i=0;

    public ItemListAdapter(Context c,ArrayList<String> data) {

        this.c=c;
        this.obj= data;;

        Log.d("itemlisttest",data+"");
    }


    @Override

    public StudentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ///  setting model layout to current layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item,parent, false);
        return new StudentHolder(view);
    }

    @Override
    public void onBindViewHolder(final StudentHolder holder, final int position) {
        /// actual logic to be refected
      holder.textView.setText(obj.get(position));
      holder.textView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(c, "textview clicked pos="+position, Toast.LENGTH_SHORT).show();
              Intent var=new Intent(c , DrawableActivity.class);
//              int tag=Integer.parseInt(view.getTag().toString());
              var.putExtra("imagetag",position+1);
              var.putExtra("menuname",menuNo);
              c.startActivity(var);
          }
      });

    }

    @Override
    public int getItemCount() {
        return obj.size();

        ///return 1;
    }//// change it total counts


    //////////////////////////////  Model /////////////////////
    public  class StudentHolder extends  RecyclerView.ViewHolder {
//    {  ImageView imageView;
        TextView textView ;
        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            textView =(TextView) itemView.findViewById(R.id.item_text);

        }
    }

}

