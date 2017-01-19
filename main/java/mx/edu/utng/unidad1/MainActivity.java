package mx.edu.utng.unidad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button btnOption1;
    private Button btnOption2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOption1 = (Button) findViewById(R.id.btn_option1);
        btnOption2 = (Button) findViewById(R.id.btn_option2);

        btnOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        getApplicationContext(),SecondActivity.class);
                startActivity(intent);

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        getApplicationContext(),TirthActivity.class);
                startActivity(intent);

            }
        });
    }
}


