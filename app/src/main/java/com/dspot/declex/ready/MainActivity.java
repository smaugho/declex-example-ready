package com.dspot.declex.ready;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Click
    void declexLink() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/smaugho/declex"));
        startActivity(intent);
    }

}
