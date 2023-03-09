package com.dxesoft.exercices;

public class Spiral {

    public void spiral(int size) {
        char [][] spiral = new char[size - 1][size];

        int x = 0;
        int y = 0;
        int limit = size;

        while (limit > 2) {
            x = traverseXForward(spiral, x, y, limit);
            limit = limit - 1;

            if (limit < 2 ) {
                break;
            }

            y = traverseYDown(spiral, x, y, limit);
            limit = limit -1;
            if (limit < 2) {
                break;
            }

            x = traverseXBackward(spiral, x, y, limit);
            limit = limit -1;

            if (limit < 2) {
                break;
            }

            y = traverseYUp(spiral, x, y, limit);
            limit = limit -1;

        }

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size; j++) {
                if (spiral[i][j] == '#') {
                    System.out.print(spiral[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private int traverseXForward(char [][] spiral, int x, int y, int limit) {
        for (int i = 0; i < limit; i++) {
            spiral[y][x] = '#';
            x++;
        }
        return --x;
    }

    private int traverseYDown(char [][] spiral, int x, int y, int limit) {
        for (int i = 0; i < limit; i++) {
            spiral[y][x] = '#';
            y++;
        }
        return --y;
    }

    private int traverseXBackward(char [][] spiral, int x, int y, int limit) {
        for (int i = 0; i < limit; i++) {
            spiral[y][x] = '#';
            x--;
        }
        return x + 1;
    }

    private int traverseYUp(char [][] spiral, int x, int y, int limit) {
        for (int i = 0; i < limit; i++) {
            spiral[y][x] = '#';
            y--;
        }
        return y + 1;
    }
}
