package sg.edu.rp.c346.id20017476.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.textView);
        Intent intent =getIntent();
        String code = intent.getStringExtra("moduleCode");
        String name = intent.getStringExtra("moduleName");
        int year = intent.getIntExtra("academicYear", 0);
        int semester =intent.getIntExtra("semester",0);
        int credit = intent.getIntExtra("moduleCredit",0);
        String venue = intent.getStringExtra("venue");

        tv.setText("Module Code: "+code+"\nModule Name: "+name+"\nAcademic Year: "+year+"\nSemester: "+semester+"\nModule Credit: "+credit+"\nVenue: "+venue);

    }
}