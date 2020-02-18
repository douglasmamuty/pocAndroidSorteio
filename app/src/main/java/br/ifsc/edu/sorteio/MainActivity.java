package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifeCycleActiv", "onCreate");
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
