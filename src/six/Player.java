package six;

public class Player implements Comparable<Player>{
    private int id;
    private String name;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        int result = name.compareTo(o.getName());
        if(result == 0){
            if(score<o.getScore()){
                result = -1;
            }
            if(score>o.getScore()){
                result = 1;
            }
        }
        return result;//0
    }

    @Override
    public String toString() {
        return name;
    }
}
