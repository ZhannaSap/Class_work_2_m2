package com.example.saparaleva_zhanna_hw6_m2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_one);
        CardView cardView = findViewById(R.id.card_view);
        ImageView imageView = findViewById(R.id.img_doctor);
        LinearLayout container = findViewById(R.id.container);
        Button buttonCircle = findViewById(R.id.btn_circle);
        EditText editText = findViewById(R.id.edit_text);

        button.setOnClickListener(view -> {
            if (cardView.getAlpha() == 1){
            cardView.animate().alpha(0);
            imageView.animate().alpha(0);
            }else{
                cardView.animate().alpha(0);
                imageView.animate().alpha(0);
            }

        });
        cardView.setOnClickListener(view -> {
            if (container.getVisibility() == View.VISIBLE){
                container.setVisibility(View.GONE);
            }else {
                container.setVisibility(View.VISIBLE);
            }
        });

        buttonCircle.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}