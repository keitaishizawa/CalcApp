package jp.techacademy.keita.ishizawa.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        ans = intent.getDoubleExtra("ANS", ans);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(ans));

    }
}
