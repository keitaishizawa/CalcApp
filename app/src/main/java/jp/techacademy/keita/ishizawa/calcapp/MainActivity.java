package jp.techacademy.keita.ishizawa.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Double.parseDouble;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //メンバ変数の宣言
    EditText editText1;
    EditText editText2;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //テキストボックスを取得
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        //各算術演算子ボタンを取得し、onClickイベントを設定
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //インテントクラスを生成
        Intent intent = new Intent(this, SecondActivity.class);

        //テキストボックスに入力された値を取得

        Editable getText1 = editText1.getText();
        double val1 = parseDouble(getText1.toString());
        Editable getText2 = editText2.getText();
        double val2 = parseDouble(getText2.toString());

        //四則演算
        if(v.getId() == R.id.button1){
            ans = val1 + val2;
        }else if (v.getId() == R.id.button2){
            ans = val1 - val2;
        }else if (v.getId() == R.id.button3){
            ans = val1 * val2;
        } else if (v.getId() == R.id.button4){
            ans = val1 / val2;
        }

        //次の画面に計算後の値を渡す
        intent.putExtra("ANS",ans);

        //画面遷移
        startActivity(intent);
    }
}