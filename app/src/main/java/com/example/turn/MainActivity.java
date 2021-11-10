package com.example.turn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    Intent intent = new Intent();
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle2=this.getIntent().getExtras();
        String nt = bundle2.getString("Name");
        TextView t9 =(TextView)findViewById(R.id.textView2);
        t9.setText(nt);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1=(EditText)findViewById(R.id.editTextTextPersonName);
                Editable StrName;
                StrName = t1.getText();
                String N1 = StrName.toString();
                intent.setClass(MainActivity.this, MainActivity2.class);
                bundle.putString("Name",N1);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}