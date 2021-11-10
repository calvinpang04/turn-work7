package com.example.turn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private Button b1;
    Bundle bundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button) findViewById(R.id.button2);
        Bundle bundle2=this.getIntent().getExtras();
        String nt = bundle2.getString("Name");
        TextView t9 =(TextView)findViewById(R.id.textView2);
        t9.setText(nt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1=(EditText)findViewById(R.id.editTextTextPersonName2);
                Editable StrName;
                StrName = t1.getText();
                String N2 = StrName.toString();
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                bundle.putString("Name",N2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}