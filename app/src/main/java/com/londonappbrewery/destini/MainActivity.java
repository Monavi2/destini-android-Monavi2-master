package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mUpBtn;
    Button mDownBtn;
    TextView mStoryTextView;
    int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mUpBtn = (Button) findViewById(R.id.ans1);
        mDownBtn = (Button) findViewById(R.id.ans2);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        mStoryTextView.setText(R.string.T1_Story);
        mUpBtn.setText(R.string.T1_Ans1);
        mDownBtn.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destiny", "first Ans clicked");
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mUpBtn.setText(R.string.T3_Ans1);
                    mDownBtn.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if(mStoryIndex == 3){
                    mStoryTextView.setText(R.string.T6_End);
                    mUpBtn.setVisibility(View.GONE);
                    mDownBtn.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mDownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destiny", "second Ans clicked");
                if(mStoryIndex == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mUpBtn.setText(R.string.T2_Ans1);
                    mDownBtn.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mUpBtn.setVisibility(View.GONE);
                    mDownBtn.setVisibility(View.GONE);
                }else if(mStoryIndex == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    mUpBtn.setVisibility(View.GONE);
                    mDownBtn.setVisibility(View.GONE);
                }
            }
        });


    }

}
