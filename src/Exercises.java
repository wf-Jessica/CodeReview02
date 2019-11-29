public class Exercises {
    private String exerciseName;
    private String description;
    private int duration;
    private String Position;

    public Exercises(String exerciseName, String description, int duration, String position) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.duration = duration;
        Position = position;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void showExercises(){
        System.out.println(this.exerciseName+"                    DURATION: "+this.duration+" seconds");
        System.out.println("====================================================================");
        System.out.println("DESCRIPTION: "+this.description+"\n");
    }


}
