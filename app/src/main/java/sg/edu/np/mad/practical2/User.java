package sg.edu.np.mad.practical2;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    public User() {
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setFollowed(boolean f) {
        followed = f;
    }

    public boolean getFollowed() {
        return followed;
    }
}