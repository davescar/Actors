package drsdrs.actors;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by KorbBookProReturns on 11/23/16.
 */

public class ActorRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Actor> mActorList;

    public ActorRecyclerViewAdapter(List<Actor> actorList) {
        mActorList = actorList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.       ,parent,false);
        ActorViewHolder viewHolder = new ActorViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder. .setText()
    }

    @Override
    public int getItemCount() {
        return mActorList.size();
    }
}
