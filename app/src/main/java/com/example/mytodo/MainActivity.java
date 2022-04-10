package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TaskModel> taskModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpTaskModels();

        ToDoAdapter adapter = new ToDoAdapter(this, taskModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpTaskModels(){
        String[] taskHeader = getResources().getStringArray(R.array.header);
        String[] taskText = getResources().getStringArray(R.array.text);

        for (int i = 0; i < taskHeader.length; i++ ){
            taskModels.add(new TaskModel(taskHeader[i],taskText[i]));
        }
    }
}