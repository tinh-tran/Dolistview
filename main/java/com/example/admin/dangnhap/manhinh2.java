package com.example.admin.dangnhap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class manhinh2 extends AppCompatActivity {
     ListView lv;
     String [] arrayTinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);

            lv=(ListView)findViewById(R.id.lvMain);
            arrayTinh=getResources().getStringArray(R.array.arrayTinhThanh);
            ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayTinh);
            lv.setAdapter(arrayAdapter);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(manhinh2.this,"Bạn đang chọn " +arrayTinh[i],Toast.LENGTH_SHORT).show();
                }
            });
        }

}
