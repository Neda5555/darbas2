package com.example.darbas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Spinner spinner;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.count_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gauti pasirinkimą iš Spinner
                String option = spinner.getSelectedItem().toString();

                // Gauti įvestį iš EditText
                String inputText = editText.getText().toString();

                if (!inputText.isEmpty()) {
                    int result = 0;

                    if (option.equals(getString(R.string.word_count))) {
                        result = WordCharacterCounter.countWords(inputText);
                    } else if (option.equals(getString(R.string.char_count))) {
                        result = WordCharacterCounter.countCharacters(inputText);
                    }

                    // Rodyti rezultatą TextView
                    textView.setText(getString(R.string.result, result));
                } else {
                    // Rodyti pranešimą Toast, jei įvesties laukas tuščias
                    Toast.makeText(MainActivity.this, R.string.empty_input_message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}