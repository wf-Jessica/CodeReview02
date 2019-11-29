
//Bonus Exercise
public class IntervalWorkout {
    private String[] severalExercises;
    private int numberOfRepetitions;
    private int breakTime;

    public IntervalWorkout(String[] severalExercises, int numberOfRepetitions, int breakTime) {
        this.severalExercises = severalExercises;
        this.numberOfRepetitions = numberOfRepetitions;
        this.breakTime = breakTime;
    }


    public int getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }
    //Workout Start
    public void showPlan() {
        System.out.println("***************************\nInterval Workout STARTS!!\n***************************");
        //loop through rounds
        for (int i = 1; i <= this.numberOfRepetitions; i++) {
            System.out.println("ROUND" + i+ ":");
            //loop through the array
            for (int j = 0; j < severalExercises.length;j++) {
                System.out.println( this.severalExercises[j]);
            }
            //break
            if (i < this.numberOfRepetitions) {
                System.out.println("==========================\nDO THE BREAK (" + getBreakTime() + " SECONDS)\n==========================");
            }
        }
            System.out.println("***************************\nCONGRATS - YOU ARE DONE !!\n***************************");



    }
}
