package com.poulstar.kabir_ussd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);
        Button btn01 = findViewById(R.id.id_btn01);
        EditText en01 = findViewById(R.id.id_en01);


        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();




        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                arrayList.add(new SubjectData(String.valueOf(en01.getText()), "https://www.tutorialspoint.com/java/",  "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"));

                CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,arrayList);
                list.setAdapter(customAdapter);
            }
        });


    }
}
class SubjectData {
    String SubjectName;
    String Link;
    String Image;
    public SubjectData(String subjectName, String link, String image) {
        this.SubjectName = subjectName;
        this.Link = link;
        this.Image = image;
    }
}