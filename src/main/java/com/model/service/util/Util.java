package com.model.service.util;

import com.model.entities.Stone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public List<Stone> sortByCost(ArrayList<Stone> stones) {
        List<Stone> sortedStones = stones.stream()
                .sorted(Comparator.comparing(Stone::getCost))
                .collect(Collectors.toList());


        return sortedStones;
    }

    public List<Stone> findStonesTransparencyInRange(int minRange, int maxRange, ArrayList<Stone> stones) {
        List<Stone> stonesInTransparencyRange = new ArrayList<>();
        for (Stone s : stones) {
            if (s.getTransparency() > minRange && s.getTransparency() < maxRange) {
                stonesInTransparencyRange.add(s);
            }
        }
        return stonesInTransparencyRange;
    }

    public int sumOfCost(ArrayList<Stone> stones) {
        Integer sum = 0;
        for (Stone s : stones) {
            sum += s.getCost();
        }
        return sum;
    }

    public int sumOfWeight(ArrayList<Stone> stones) {
        Integer sum = 0;
        for (Stone s : stones) {
            sum += s.getWeight();
        }
        return sum;
    }
}
