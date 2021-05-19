package sg.edu.rp.c346.id20017476.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName","Android Programming");
                intent.putExtra("academicYear", 2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName","Ipad Programming");
                intent.putExtra("academicYear", 2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66F");
                startActivity(intent);
            }
        });
    }
}