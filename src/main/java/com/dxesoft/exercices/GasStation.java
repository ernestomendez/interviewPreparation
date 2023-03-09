package com.dxesoft.exercices;

import com.dxesoft.exercices.gasStation.GasPump;

import java.util.ArrayList;
import java.util.List;

public class GasStation {
    public GasPump x, y, z;
    private final int FUELLING = 1;
    private final int OCCUPIED = 0;
    private final int NOT_ENOUGH = -1;

    private List<GasPump> gasStation = new ArrayList<>(3);

    public List<List<Integer>> moments;

    public int xxxx(int[] A, int X, int Y, int Z) {
        List<List<Integer>> moments = new ArrayList<>();
        List<Integer> moment = new ArrayList<>();
        int carMoves = 0;
        int totalTime = 0;
        while (carMoves < A.length ) {
            carMoves ++;

        }
        return 0;
    }

    private void configureGasPumps(int x, int y, int z) {
        this.gasStation.add(new GasPump(x));
        this.gasStation.add(new GasPump(y));
        this.gasStation.add(new GasPump(z));
    }

    private int assignCar(int car, GasPump gasPump) {
        if (!gasPump.isServing()) {
            if (gasPump.getFuel() >= car) {
                gasPump.setServing(true);
                gasPump.setTimeElapsed(car);
                return FUELLING;
            } else {
                gasPump.setServing(false);
                return NOT_ENOUGH;
            }
        } else {
            return OCCUPIED;
        }

    }

    private int moment(int carIndex, int[] A) {
        List<Integer> moment = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int assignX = assignCar(A[carIndex], this.x);
            int assignY;
            int assignZ;

            if (assignX == FUELLING) {
                moment.add(A[carIndex]);
            } else if (assignX == OCCUPIED){
                assignCar(A[carIndex], this.y);
            }
        }
        return 0;
    }


}
