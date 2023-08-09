package com.example.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
    }
    public void sum(View v){
        Intent intent=new Intent("second");
        int a,b,sum;
        a=new Integer(e1.getText().toString());
        b=new Integer(e2.getText().toString());
        Intent obj = new Intent("act.rp");
        obj.putExtra("no1", e1.getText().toString());
        obj.putExtra("no2", e2.getText().toString());
        startActivityForResult(obj,1);
    }
    @Override
    protected void onActivityResult(int rq,int rc,Intent data){
        super.onActivityResult(rq,rc, data);
        EditText e;
        e = (EditText)findViewById(R.id.e);
        e.setText(data.getData().toString());
    }

}