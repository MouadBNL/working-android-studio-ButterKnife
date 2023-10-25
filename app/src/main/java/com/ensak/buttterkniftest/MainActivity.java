package com.ensak.buttterkniftest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lblText)
    TextView lblText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        lblText.setText("Well, Hello again!");
    }

    @OnClick(R.id.btnClickMe)
    void onClickMe() {
        lblText.setText("Well, Hello again 2!");
    }
}