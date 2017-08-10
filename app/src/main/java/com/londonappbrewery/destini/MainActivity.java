package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button path1;
    Button path2;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = (TextView)findViewById((R.id.storyTextView));
        path1 = (Button)findViewById((R.id.buttonTop));
        path2 = (Button)findViewById((R.id.buttonBottom));


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        path1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateActivity(story.getText(),true);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        path2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateActivity(story.getText(),false);
            }
        });

    }

    public void updateActivity(CharSequence text,boolean answer)
    {
        if(text == getString(R.string.T1_Story))
        {
            if(answer == true)
            {
                story.setText(R.string.T3_Story);
                path1.setText(R.string.T3_Ans1);
                path2.setText(R.string.T3_Ans2);
            }
            else
            {
                story.setText(R.string.T2_Story);
                path1.setText(R.string.T2_Ans1);
                path2.setText(R.string.T2_Ans2);
            }
        }
        else if(text == getString(R.string.T2_Story))
        {
            if(answer == true)
            {
                story.setText(R.string.T3_Story);
                path1.setText(R.string.T3_Ans1);
                path2.setText(R.string.T3_Ans2);
            }
            else
            {
                story.setText(R.string.T4_End);
                path1.setVisibility(View.GONE);
                path2.setVisibility(View.GONE);
            }
        }
        else //if(text == R.string.T3_Story)
        {
            if(answer == true)
            {
                story.setText(R.string.T6_End);
                path1.setVisibility(View.GONE);
                path2.setVisibility(View.GONE);
            }
            else
            {
                story.setText(R.string.T5_End);
                path1.setVisibility(View.GONE);
                path2.setVisibility(View.GONE);
            }
        }
    }

}