package org.syk.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void clickRs(View view) {
        //jika gambar RS di klik
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
}