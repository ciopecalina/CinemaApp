package com.example.bob.cinemaapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class LogInActivity extends AppCompatActivity {
    private TextView tvInscriere;
    private Button btnFacebook;
    private Button btnConectare;
    private Button btnGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tvInscriere=findViewById(R.id.tvInscriere);
        btnFacebook=findViewById(R.id.btnConectareFacebook);
        btnGoogle=findViewById(R.id.btnConectareGoogle);
        btnConectare=findViewById(R.id.btnConectare);

//        tvInscriere.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
//                startActivity(intent);
//            }
//        });
//        btnConectare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
