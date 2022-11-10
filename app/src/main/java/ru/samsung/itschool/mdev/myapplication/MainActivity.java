package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            // вызов браузера
            // неявное намерение
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String str = "https://mirea.ru";
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } else {
            // явное намерение
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }

    }
}