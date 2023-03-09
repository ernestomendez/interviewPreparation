package com.dxesoft.exercices;

public class Shipping {

    public int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        final int large = 5;
        final int small = 1;

        final int largeCapacity = availableLargePackages * large;
        final int smallCapacity = availableSmallPackages * small;
        final int totalCapacity = largeCapacity + smallCapacity;

        if(items > totalCapacity) {
            return -1;
        }

        int maxlb = items/large;
        int totalLarge;
        int remainingItems = 0;

        if (maxlb <= availableLargePackages) {
            totalLarge = maxlb;
            remainingItems = items - totalLarge * large;
        } else {
            totalLarge = availableLargePackages;
            remainingItems = items - largeCapacity;
        }

        if (remainingItems == 0) {
            return totalLarge;
        } else {
            int maxsb = remainingItems / small;

            if (maxsb <= availableSmallPackages) {
                return totalLarge + maxsb;
            } else {
                return -1;
            }
        }



    }
}

