package com.example.tipcalculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener {

    private EditText billAmountEditText;
    private TextView tipTextView;
    private TextView totalTextView;

    private TextView percentTextView;

    private Button percentUpButton;
    private Button percentDownButton;

    private SharedPreferences savedValues;
    private String billAmountString = "";
    private float tipPercent = .15f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billAmountEditText = (EditText)findViewById(R.id.billAmountEditText);
        percentTextView = (TextView)findViewById(R.id.percentTextView);
        tipTextView = (TextView)findViewById(R.id.tipTextView);
        totalTextView = (TextView)findViewById(R.id.totalTextView);

        billAmountEditText.setOnEditorActionListener(this);

        percentUpButton = (Button) findViewById(R.id.percentUpButton);
        percentDownButton = (Button) findViewById(R.id.percentDownButton);



    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_UNSPECIFIED)
        {
            tipTextView.setText("$10.00");
            totalTextView.setText("$110.00");
        }
        return false;
    }
}
