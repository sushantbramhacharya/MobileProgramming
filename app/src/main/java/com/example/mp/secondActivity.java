package com.example.mp;

import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class secondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Button btn=findViewById(R.id.Button_Submit2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Second Context",Toast.LENGTH_SHORT).show();;
                Intent intent=new Intent(secondActivity.this,firstActivity.class);
                startActivity(intent);
            }
        });


    }
}

