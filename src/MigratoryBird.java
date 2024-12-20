import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBird {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> sighting = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int counter = 1;
            int current = arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                if(current == arr.get(j)) {
                    counter++;
                    sighting.put(current, sighting.getOrDefault(current, 0)+counter);
                }
            }
        }

        int mostFrequencyBird = -1;
        int maxFrequency =0;

        for(Map.Entry<Integer, Integer> entry: sighting.entrySet()) {
            int birdId = entry.getKey();
            int frequency = entry.getValue();

            if(frequency > maxFrequency || (frequency == maxFrequency) && birdId < mostFrequencyBird) {
                maxFrequency = frequency;
                mostFrequencyBird = birdId;
            }
        }
        return mostFrequencyBird;

    }


    public static int migratoryBirdOptimised(List<Integer> arr) {

        int[] frequency = new int[6]; // Assuming bird IDs range from 1 to 5

        // Populate the frequency array
        for (int bird : arr) {
            frequency[bird]++;
        }

        // Find the bird with the highest frequency
        int mostFrequentBird = 1;
        int maxFrequency = frequency[1];

        for (int i = 2; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentBird = i;
            } else if (frequency[i] == maxFrequency && i < mostFrequentBird) {
                mostFrequentBird = i; // Tie-breaking: choose the smallest ID
            }
        }

        return mostFrequentBird;
    }

    public static void main (String[] args){
        List<Integer> birds = new ArrayList<>();
        birds.add(3);
        birds.add(4);
        birds.add(2);
        birds.add(5);
        birds.add(2);
        birds.add(3);
        birds.add(3);
        birds.add(4);
        birds.add(4);
        System.out.println(migratoryBirdOptimised(birds));
    }

}
