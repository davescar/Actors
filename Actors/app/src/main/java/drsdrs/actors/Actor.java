package drsdrs.actors;

/**
 * Created by KorbBookProReturns on 11/23/16.
 */

public class Actor {
    private String mName;
    private String mDob;
    private String mOscars;

    public Actor(String name, String dob, String oscars) {
        mName = name;
        mDob = dob;
        mOscars = oscars;
    }

    public String getName() {
        return mName;
    }

    public String getDob() {
        return mDob;
    }

    public String getOscars() {
        return mOscars;
    }
}
