package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editTextFirst;
    EditText editTextLast;
    Button btnRandom;


    public void copy(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifeCycleActiv", "onCreate");

        editTextFirst = findViewById(R.id.textInputLeft);
        editTextLast = findViewById(R.id.textInputRight);
        textView = findViewById(R.id.textViewResultado);
//
        btnRandom = findViewById(R.id.btnRandom);
        //bind function onclick by java
        btnRandom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(editTextFirst.getText().toString());
                int max = Integer.parseInt(editTextLast.getText().toString());
                int random = (int) (Math.random() *  (max - min  + 1)) + min;
                textView.setText(Integer.toString(random));
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycleActiv", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycleActiv", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycleActiv", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycleActiv", "onStop");
    }
}
