package com.example.dz1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {
    ImageView Картина;
    EditText Имя;
    EditText Пароль;
    Button Кнопка;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {
        Картина = findViewById(R.id.Картина);
        Имя = findViewById(R.id.Имя);
        Пароль = findViewById(R.id.Пароль);
        Кнопка = findViewById(R.id.Кнопка);

        Кнопка.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Имя != null && Пароль.length()>5)
                {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Не правильный логин или пароль", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}


