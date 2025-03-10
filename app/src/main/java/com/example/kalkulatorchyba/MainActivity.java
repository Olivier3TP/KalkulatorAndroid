package com.example.kalkulatorchyba;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText dodawanie_1 = findViewById(R.id.dodawanie_1);
        EditText dodawanie_2 = findViewById(R.id.dodawanie_2);
        EditText dodawanie_wynik = findViewById(R.id.dodawanie_wynik);

        EditText odejmowanie_1 = findViewById(R.id.odejmowanie_1);
        EditText odejmowanie_2 = findViewById(R.id.odejmowanie_2);
        EditText odejmowanie_wynik = findViewById(R.id.odejmowanie_wynik);

        EditText mnozenie_1 = findViewById(R.id.mnozenie_1);
        EditText mnozenie_2 = findViewById(R.id.mnozenie_2);
        EditText mnozenie_wynik = findViewById(R.id.mnozenie_wynik);

        EditText dzielenie_1 = findViewById(R.id.dzielenie_1);
        EditText dzielenie_2 = findViewById(R.id.dzielenie_2);
        EditText dzielenie_wynik = findViewById(R.id.dzielenie_wynik);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            int liczbaDodawanie_1 = Integer.parseInt(dodawanie_1.getText().toString());
            int liczbaDodawanie_2 = Integer.parseInt(dodawanie_2.getText().toString());
            int suma = liczbaDodawanie_1 + liczbaDodawanie_2;
            dodawanie_wynik.setText(String.valueOf(suma));

            int licznaOdejmowanie_1 = Integer.parseInt(odejmowanie_1.getText().toString());
            int liczbaOdejmowanie_2 = Integer.parseInt(odejmowanie_2.getText().toString());
            int roznica = licznaOdejmowanie_1 - liczbaOdejmowanie_2;
            odejmowanie_wynik.setText(String.valueOf(roznica));

            int liczbaMnozenie_1 = Integer.parseInt(mnozenie_1.getText().toString());
            int liczbaMnozenie_2 = Integer.parseInt(mnozenie_2.getText().toString());
            int iloczyn = liczbaMnozenie_1 * liczbaMnozenie_2;
            mnozenie_wynik.setText(String.valueOf(iloczyn));

            int liczbaDzielenie_1 = Integer.parseInt(dzielenie_1.getText().toString());
            int liczbaDzielenie_2 = Integer.parseInt(dzielenie_2.getText().toString());
            int iloraz = liczbaDzielenie_1 / liczbaDzielenie_2;
            dzielenie_wynik.setText(String.valueOf(iloraz));
        });
//        Komunikat podczas błedu wyjątek
//        Toast.makeText(getBaseContext(), "błąd!", Toast.LENGTH_SHORT).show();
    }
}