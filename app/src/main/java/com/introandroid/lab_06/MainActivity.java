package com.introandroid.lab_06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.introandroid.lab_06.data.LabDatabase;

public class MainActivity extends AppCompatActivity {

    Button displayButton;
    Button submitButton;
    EditText submitName;
    Database labDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.display);
        submitButton = (Button) findViewById(R.id.submit);
        submitName = (EditText) findViewById(R.id.myEditText);

        labDB = Room.databaseBuilder(this, LabDatabase.class,DATABASE_NAME).build();

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myToast = "You pressed Display";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), myToast,duration);
                toast.show();
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myToast = "You submitted " + submitName.getText();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), myToast,duration);
                toast.show();
            }
        });
    }


}
