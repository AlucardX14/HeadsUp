package com.ItlaApp.dev.headsup;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ItlaApp.dev.headsup.Models.Topic;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TopicSelectorActivity extends AppCompatActivity {

    RadioGroup topicsRadioGroup;
    Button btnStart;
    JSONArray topics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_selector);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        initView();

        try {
            topics = Topic.getTopics();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < topics.length(); i++) {
            JSONObject topic;
            try {
                topic             = topics.getJSONObject(i);
                String topicTitle = topic.getString("title");

                RadioButton rbTopicOptions = new RadioButton(this);
                rbTopicOptions.setTextAppearance(this, android.R.style.TextAppearance_Large);
                rbTopicOptions.setId(i);
                rbTopicOptions.setText(topicTitle);
                topicsRadioGroup.addView(rbTopicOptions);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private void initView(){
        btnStart         = findViewById(R.id.btnStart);
        topicsRadioGroup = findViewById(R.id.topicsRadioGroup);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int selectedOptionId = topicsRadioGroup.getCheckedRadioButtonId();

            if(!(selectedOptionId >= 0)) {
                Toast.makeText(TopicSelectorActivity.this, "Selecciona una categoría para continuar.", Toast.LENGTH_LONG).show();
                return;
            }

            RadioButton radioButton = (RadioButton) findViewById(selectedOptionId);
            String selectedOption = radioButton.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtra("topics", topics.toString());
            intent.putExtra("selectedTopic", selectedOption);
            intent.putExtra("selectedTopicId", selectedOptionId);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
            }

        });

    }
}
