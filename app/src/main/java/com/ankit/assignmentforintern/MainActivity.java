package com.ankit.assignmentforintern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PostsAdapter itemsAdapter;
    ArrayList<Posts> posts = new ArrayList<>();
    FloatingActionButton fab_msg, fab_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        posts.add(new Posts(R.drawable.first,"STRATEGIC PUSH OF INDIAN GOVT.: TRAIN TO TAWANG NEAR CHINA BORDER CLOSER TO REALITY.", "The most aspiring among these is connecting the Tawang with the Bhalukpong which is the gateway to Tawang 330 km uphill by road and also the last station of Indian railway in the border of Assam and Arunachal Pradesh."));
        posts.add(new Posts(R.drawable.second,"MOTO G5 LAUNCHED IN INDIA AT RS 11,999", "Motorola, the handset maker company on Tuesday launched its best selling Moto G series fifth generation mobile Moto G5 in Indian market for Rs. 11,999"));
        posts.add(new Posts(R.drawable.third,"BENEFITS OF EATING DIFFERENT FRUITS", "There are some rules and restriction that we all have to follow for proper diet plan. Like,  always eat food with happy mood in a relax posture, because if someone take a food when he/she is in tension, tired and in an angry mood then it is better to remain hungry at that time because it is very harmful for body. The person who does lots of physical work needs more nutritious food as compared to those who does less physical work."));
        posts.add(new Posts(R.drawable.fourth,"BENEFITS OF EATING Fruits", "There are some rules and restriction that we all have to follow for proper diet plan. Like,  always eat food with happy mood in a relax posture, because if someone take a food when he/she is in tension, tired and in an angry mood then it is better to remain hungry at that time because it is very harmful for body. The person who does lots of physical work needs more nutritious food as compared to those who does less physical work."));

        fab_msg = findViewById(R.id.fab_messages);
        fab_news = findViewById(R.id.fab_news);

        fab_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MessagesActivity.class);
                startActivity(intent);
            }
        });

        fab_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                startActivity(intent);
            }
        });

        itemsAdapter = new PostsAdapter(posts);
        recyclerView = findViewById(R.id.rview);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemsAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_notifications) {
            Intent intent = new Intent(this, NotificationsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
