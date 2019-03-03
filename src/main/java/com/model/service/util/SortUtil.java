package com.model.service.util;

import com.model.entities.Stone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUtil {

    /*** Use stream  that would not for implements Comparator */
    public  static List<Stone> sortByCost(List<Stone> stones) {
        List<Stone> sortedStones = stones.stream()
                .sorted(Comparator.comparing(Stone::getCost))
                .collect(Collectors.toList());


        return sortedStones;
    }

    public static List<Stone> findStonesTransparencyInRange(int minRange, int maxRange, List<Stone> stones) {
        List<Stone> stonesInTransparencyRange = new ArrayList<>();
        for (Stone s : stones) {
            if (s.getTransparency() > minRange && s.getTransparency() < maxRange) {
                stonesInTransparencyRange.add(s);
            }
        }
        return stonesInTransparencyRange;
    }

    public static int sumOfCost(List<Stone> stones) {
        Integer sum = 0;
        for (Stone s : stones) {
            sum += s.getCost();
        }
        return sum;
    }

    public static int sumOfWeight(List<Stone> stones) {
        Integer sum = 0;
        for (Stone s : stones) {
            sum += s.getWeight();
        }
        return sum;
    }
}
