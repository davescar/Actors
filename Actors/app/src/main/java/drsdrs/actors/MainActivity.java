package drsdrs.actors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Actor> actorsList = new ArrayList<>();
        actorsList.add(new Actor("Jeff","10/02/1989","12"));
        actorsList.add(new Actor("Roger","10/20/1988","1"));
        actorsList.add(new Actor("Jefferina","10/02/1987","13"));


    }
}
