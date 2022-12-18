//-Maximum Population Year
public class maximumPopulations {
    public int maximumPopulation(int[][] logs) {
        int[] persons = new int[101];
        // take start and end year from logs
        for (int i = 0; i < logs.length; i++) {
            int start = logs[i][0];
            int end = logs[i][1];

            // increase count of persons array in this range
            for (int j = start - 1950; j < end - 1950; j++) {
                persons[j]++;
            }
        }

        // find maximum population
        int result = -1;
        int year = -1;
        System.out.println(persons[58]);
        for (int i = 0; i < 101; i++) {
            if (persons[i] > result) {
                result = persons[i];
                year = i;
            }
        }

        return year + 1950;
    }
}