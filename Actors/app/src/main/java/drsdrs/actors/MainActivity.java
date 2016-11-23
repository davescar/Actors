package drsdrs.actors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Actor> actors = new ArrayList<>();

        actors.add(new Actor("Joe", "November", "12"));
        actors.add(new Actor("Jim", "July", "12"));
        actors.add(new Actor("Jack", "March", "12"));




    }
}

        ArrayList<Actor> actorsList = new ArrayList<>();
        actorsList.add(new Actor("Jeff","10/02/1989","12"));
        actorsList.add(new Actor("Roger","10/20/1988","1"));
        actorsList.add(new Actor("Jefferina","10/02/1987","13"));


    }
}
