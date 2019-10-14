package com.example.baseapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Chronometer cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // activity_main.xml로부터 버튼속성정의한 것 불러와 button1으로 저장
        cr=(Chronometer) findViewById(R.id.cr);

        // 버튼 클릭했을 때 작동하기 원하는 코드를 onclick메소드 안에 넣기
        cr.start();

        //버튼누르면 스탑하게하고싶으면 버튼생성해주고 그안에서 cr.stop()메서드 적용하기

    }
}
