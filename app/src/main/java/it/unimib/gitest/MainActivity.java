package it.unimib.gitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * MainActivity
 * A comment for anotther developer
 * Comment from Master Branch
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // A comment from test branch
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // A second comment from test branch
    }
}
