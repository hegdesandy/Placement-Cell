package com.project.placementcell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class StudentInfo extends AppCompatActivity {
    Button stuContinue,stuContinue1;
    String category;
    private RelativeLayout first_layout, second_layout, third_layout, fourth_Layout, fifth_Layout, sixth_Layout, seventh_Layout;

    private ImageButton nextOne;
    private ImageButton nextTwo;
    private ImageButton nextThree;
    private ImageButton nextFour;
    private ImageButton nextFive;
    private Button Request;
    private EditText name,email,dob,dept;
    FirebaseAuth auth;
    DatabaseReference reference;
    String Ques1Str,Ques2Str,Ques3Str,Ques4Str,Ques5Str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        stuContinue = findViewById(R.id.stuContinue);
        stuContinue1= findViewById(R.id.stuContinue1);

        category = getIntent().getStringExtra("forumCategory");
        Toast.makeText(StudentInfo.this, "Category: " + category, Toast.LENGTH_LONG).show();

        // add data in firebase under category.. placed or interview
        // in single java page you can differentiate category -> placed or interview

        // code will be
        // firebase database.child("forumData").child(category). --- add data
        first_layout =  findViewById(R.id.first_layout);
        second_layout = findViewById(R.id.second_layout);
        third_layout=findViewById(R.id.third_layout);

      /*  stuContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentInfo.this, addForumData.class));
            }
        });
     */   first_layout.setVisibility(View.VISIBLE);
        final ViewGroup transitionsContainerfirst = (ViewGroup) first_layout;
        TransitionManager.beginDelayedTransition(transitionsContainerfirst);

        nextOne = transitionsContainerfirst.findViewById(R.id.nextOne);
        stuContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
            }
        });
        stuContinue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_layout.setVisibility(View.GONE);
                third_layout.setVisibility(View.VISIBLE);
            }
        });
/*
        final ViewGroup transitionsContainersecond = (ViewGroup) second_layout;
        TransitionManager.beginDelayedTransition(transitionsContainersecond);

        nextTwo = (ImageButton) transitionsContainersecond.findViewById(R.id.nextTwo);

        nextTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_layout.setVisibility(View.GONE);
                third_layout.setVisibility(View.VISIBLE);
            }
        });

        final ViewGroup transitionsContainerthree = (ViewGroup) third_layout;
        TransitionManager.beginDelayedTransition(transitionsContainerfirst);

        nextThree = (ImageButton) transitionsContainerthree.findViewById(R.id.nextThree);
        nextThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third_layout.setVisibility(View.GONE);
                fourth_Layout.setVisibility(View.VISIBLE);
            }
        });
        final ViewGroup transitionsContainerforth = (ViewGroup) fourth_Layout;
        TransitionManager.beginDelayedTransition(transitionsContainerfirst);

        nextFour = (ImageButton) transitionsContainerforth.findViewById(R.id.nextFour);
        nextFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourth_Layout.setVisibility(View.GONE);
                fifth_Layout.setVisibility(View.VISIBLE);
            }
        });

        final ViewGroup transitionsContainerfifth = (ViewGroup) fifth_Layout;
        TransitionManager.beginDelayedTransition(transitionsContainerfifth);

        nextFive = (ImageButton) transitionsContainerfifth.findViewById(R.id.nextFive);
        nextFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifth_Layout.setVisibility(View.GONE);
                sixth_Layout.setVisibility(View.VISIBLE);
            }
        });*/
    }
}
