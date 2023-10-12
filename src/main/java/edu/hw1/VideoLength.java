package edu.hw1;

import java.util.Arrays;

public class VideoLength {
    public int minutesToSeconds(String time){
        int[] result = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
        if (result[1] >= 60){
            return -1;
        }
        if (result[0] == 0){ return result[1]; }
        else {return result[0] * 60 + result[1]; }

    }
}
