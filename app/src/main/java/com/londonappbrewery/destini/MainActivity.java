package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button mAns1;
    Button mAns2;
    int storyCounter=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mAns1 = (Button) findViewById(R.id.buttonTop);
        mAns2 = (Button) findViewById(R.id.buttonBottom);
        story = (TextView) findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyCounter == 1)
                    storyCounter = 3;
                else if(storyCounter == 3)
                    storyCounter = 6;
                else if(storyCounter == 2)
                    storyCounter = 3;
                nextStory(storyCounter);

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyCounter == 1)
                    storyCounter = 2;
                else if(storyCounter == 2)
                    storyCounter = 4;
                else if(storyCounter == 3)
                    storyCounter = 5;
                nextStory(storyCounter);

            }
        });


    }
    public void nextStory(int n){
        if(n==2){
            story.setText(R.string.T2_Story);
            mAns1.setText(R.string.T2_Ans1);
            mAns2.setText(R.string.T2_Ans2);
        }
        else if(n==3){
            story.setText(R.string.T3_Story);
            mAns1.setText(R.string.T3_Ans1);
            mAns2.setText(R.string.T3_Ans2);
        }
        else if(n==4) {
            story.setText(R.string.T4_End);
            mAns2.setVisibility(View.GONE);
            mAns1.setVisibility(View.GONE);
        }
        else if(n==5) {
            story.setText(R.string.T5_End);
            mAns2.setVisibility(View.GONE);
            mAns1.setVisibility(View.GONE);
        }
        else if(n==6) {
            story.setText(R.string.T6_End);
            mAns2.setVisibility(View.GONE);
            mAns1.setVisibility(View.GONE);
        }
    }
}
