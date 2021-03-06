package com.example.boncelius.eadresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Toast.makeText(this, "Mohamad Ikhsan Zulfadly_1202154138", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClicked(View view) {

     RadioButton DineIn = (RadioButton) findViewById(R.id.dinein);
        RadioButton TakeAway = (RadioButton) findViewById(R.id.takeaway);

        if(DineIn.isChecked()){
            dineIn();
        }
        else if (TakeAway.isChecked()){
            takeAway();
        }

    }
    public void dineIn(){
        intent = new Intent(this, DineIn.class);
        startActivity(intent);
    }
    public void takeAway(){
        intent = new Intent(this, TakeAway.class);
        startActivity(intent);
    }
}
