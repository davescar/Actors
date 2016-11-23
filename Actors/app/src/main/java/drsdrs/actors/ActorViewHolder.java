package drsdrs.actors;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ds on 11/23/16.
 */

public class ActorViewHolder extends RecyclerView.ViewHolder {

    private TextView mName;
    private TextView mDOB;
    private TextView mOscars;

    public ActorViewHolder(View itemView) {
        super(itemView);

        mName = (TextView) itemView.findViewById(R.id.name);
        mDOB = (TextView) itemView.findViewById(R.id.date_of_birth);
        mOscars = (TextView) itemView.findViewById(R.id.oscars);
    }
}
