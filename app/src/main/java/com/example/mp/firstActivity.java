package com.example.mp;

import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;

public class firstActivity extends Activity {
    Button btn_submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        Button btn_submit=findViewById(R.id.Button_Submit);
        btn_submit=findViewById(R.id.Button_Submit);

        TextView user_login_text=findViewById(R.id.textview);
        EditText user_name=findViewById(R.id.edt_username);
        EditText user_phone=findViewById(R.id.edt_phone_number);
        EditText user_password=findViewById(R.id.edt_password);

        CheckBox faculty_checkbox_BCA=findViewById(R.id.BCA);
        CheckBox faculty_checkbox_BE=findViewById(R.id.BE);

//        RadioGroup gender_radio=findViewById(R.id.gender_radio);
        RadioButton male_radio=findViewById(R.id.male_radio);
        RadioButton female_radio=findViewById(R.id.female_radio);
        RadioButton other_radio=findViewById(R.id.other_radio);

        Spinner select_checkbox=findViewById(R.id.Semester_Selection);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked button",Toast.LENGTH_LONG).show();
                Intent i=new Intent(firstActivity.this,secondActivity.class);
                startActivity(i);
            }
        });
    }
}
