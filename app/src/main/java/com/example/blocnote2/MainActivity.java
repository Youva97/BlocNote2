package com.example.blocnote2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    protected Button btn1, btn2, btn3;
    protected EditText editTxt1, editTxt2;
    protected  TextView txtView;

    protected LinearLayout layoutH1, layoutH2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        editTxt1 = findViewById(R.id.editTxt1);
        editTxt2 = findViewById(R.id.editTxt2);
        txtView = findViewById(R.id.txtView);
        btn3 = findViewById(R.id.btn3);
        layoutH1 = findViewById(R.id.layoutH1);
        layoutH2 = findViewById(R.id.layoutH2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn1", "btn1 cliqué");
                String txtColor = editTxt1.getText().toString().trim();
                if (txtColor.equals("")){
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_LONG;

                    Toast toasterColor = Toast.makeText(context, "Vous n'avez pas entrez de couleur de fond", duration);
                    toasterColor.show();
                } else  {
                    txtView.setBackgroundColor(Color.parseColor(txtColor));
                    layoutH1.setVisibility(View.GONE);

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn2" ,"btn2 cliqué");
                String txtColor2 = editTxt2.getText().toString().trim();

                if (txtColor2.equals("")){
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_LONG;

                    Toast toasterColor2 = Toast.makeText(context, "Vous n'avez pas entrez de couleur de texte", duration);
                    toasterColor2.show();
                } else {
                    txtView.setTextColor(Color.parseColor(txtColor2));
                    layoutH2.setVisibility(View.GONE);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn3", "btn3 cliqué");

                layoutH1.setVisibility(View.VISIBLE);
                editTxt1.setText("");
                layoutH2.setVisibility(View.VISIBLE);
                editTxt2.setText("");
                txtView.setBackgroundColor(Color.parseColor("GREY"));
                txtView.setTextColor(Color.parseColor("BLACK"));

            }
        });



    }
}