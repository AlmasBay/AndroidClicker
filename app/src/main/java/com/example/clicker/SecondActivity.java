package com.example.clicker;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClick(View v){
        TextView textView = findViewById(R.id.textView);
        click++;
        textView.setText("CLIKS: "+ click);
    }
    public void change(View v){
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Country:UK");
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.uk);
    }
}