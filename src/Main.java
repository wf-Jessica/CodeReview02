public class Main {
    public static void main(String[] args) {
        //array with exercises
        Exercises ex1 = new Exercises("Push-ups", "Place your hands on the floor. Raise up onto your toes so\nthat all of your body weight is on your hands and your feet. Bend your\nelbows and lower your chest down toward the floor. Then, push off the\nfloor and extend them so that you return to starting position.",
                30, "floor");
        Exercises ex2 = new Exercises("Planks", "Start on the floor on your hands and knees. Lower your\nforearms to the floor with elbows positioned under your shoulders and\nyour hands shoulder-width apart. Maintain a straight line from heels\nthrough the top of your head, looking down at the floor. Now, tighten\nyour abs and hold.",
                90, "floor");
        Exercises ex3 = new Exercises("Squats", "Stand with feet a little wider than shoulder-width apart,\nhips stacked over knees, and knees over ankles. Extend arms out\nstraight so they are parallel with the ground, palms facing down. Goto\na squat and exhale, then explode back up to standing, driving through\nheels.",
                45, "Stand_up");
        Exercises ex4 = new Exercises("Backward Kick", "Get in an all-fours position with your knees and hands on\nthe floor. Your back is straight. Lift your leg up, and straighten it.\nForm constantly forming a 90 degree angle in between the legs. Return\nto the starting position and repeat",
                60, "floor");
        Exercises ex5 = new Exercises("Leg Curl", "Stand up on, shift your weight to one feet and pull\nanother heel toward your buttocks. Stay 15 seconds, then repeat\nwith your other leg.",
                90, "Stand_up");
        Exercises ex6 = new Exercises("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and\nthen stretch with one hand over your head to the opposite side. Repeat\n with other hand.",
                60, "floor");
        Exercises [] arr={ex1,ex2,ex3,ex4,ex5,ex6};
//loop through the array
    for(int i=0; i<arr.length;i++){
        arr[i].showExercises();
    }
        System.out.println("\n");
    //over a Minute and on the floor
    for( int i=0; i<arr.length;i++){
        if(arr[i].getDuration()>60 && arr[i].getPosition()=="floor")
        {
            arr[i].showExercises();
        }}
    //only exercises on the floor
        for( int i=0; i<arr.length;i++){
            if(arr[i].getPosition()=="floor")
            {
                arr[i].showExercises();
            }
    }
        String [] severalExercise ={"Push-ups","Squats","Planks"};
        IntervalWorkout myplan=new IntervalWorkout(severalExercise,6,30);
       /* for(int i=0;i<severalExercise.length;i++){
            */myplan.showPlan();
        }
}

