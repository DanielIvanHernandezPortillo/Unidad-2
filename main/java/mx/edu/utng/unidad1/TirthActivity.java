package mx.edu.utng.unidad1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by DANIEL ARGUELLO on 19/01/2017.
 */
public class TirthActivity extends AppCompatActivity {

    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;
    private TextView txvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirth);
        edtNumber1 =(EditText) findViewById(R.id.edt_number_1);
        edtNumber2 =(EditText) findViewById(R.id.edt_number_2);
        btnCalculate= (Button) findViewById(R.id.btn_calculate);

        txvResult = (TextView) findViewById(R.id.txv_result);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(edtNumber1.getText().toString());
                float number2 = Float.parseFloat(edtNumber2.getText().toString());
                float result = 0;


                result =((2*(number1*number2))-(number1/number2))*(((number1*number2)*number1*number2)+((2*number2)/number1));



                txvResult.setText(""+result);
            }
        });
    }
}
