package com.example.admin.dangnhap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo các biếng Edit Text Button...
    EditText edId,edMK,edEmail;
    Button btDN;
    Intent in;// gọi hàm xử lý sang active.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ dữ liệu nhập vào
        edId =(EditText)findViewById(R.id.edTendangnhap);
        edMK =(EditText)findViewById(R.id.edMatkhau);
        edEmail=(EditText)findViewById(R.id.edEmail);

        btDN=(Button)findViewById(R.id.btDangNhap);


        //tạo sự kiện cho button bằng seton
        btDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=edId.getText().toString();
                String mk=edMK.getText().toString();
                if (id.equals("admin") && mk.equals("admin"))
                {
                    in = new Intent(MainActivity.this,manhinh2.class);
                    startActivity(in);
                }
                else Toast.makeText(getApplicationContext(),"Bạn đã nhập sai ",Toast.LENGTH_LONG).show();
            }
        });



    }
}
