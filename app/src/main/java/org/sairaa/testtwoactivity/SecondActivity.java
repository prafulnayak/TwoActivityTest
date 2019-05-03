package org.sairaa.testtwoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();
    TextView receivedText;
    EditText email;
    private EmailValidator emailValidator;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receivedText = findViewById(R.id.received_text);
        email = findViewById(R.id.email);
        check = findViewById(R.id.check);


        String rText =  getIntent().getStringExtra("senttext");
        receivedText.setText(rText);

        emailValidator = new EmailValidator();
        // Setup field validators.
        email.addTextChangedListener(emailValidator);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!emailValidator.isValid()) {
                    email.setError("Invalid email");
                    Log.w(TAG, "Not saving personal information: Invalid email");
                }
            }
        });


    }
}
