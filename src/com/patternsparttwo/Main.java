package com.patternsparttwo;

public class Main {
    public static void main(String[] args) {
//        printHollowRectanglePattern(4, 5);
//        invertedAndRotatedHalfPyramidPattern(4);
//        invertedHalfPyramidWithNumberPattern(5);
//        floydTrianglePattern(5);
//        zeroOneTrianglePattern(5);
//        butterflyPattern(4);
//        solidRhombusPattern(5);
//        hollowRhombusPattern(5);
//        diamondPattern(4);
//        numberPyramidPattern(5);
        numPy(5);
    }

    // numPyr
    public static void numPy(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print numbers with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("&");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }

    // Number pyramid pattern
    public static void numberPyramidPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces (represented by '#')
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers and '&' symbols
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("&");
                }
            }
            num++;
            System.out.println();
        }
    }

    // diamond pattern
    public static void diamondPattern(int n) {
        //1st half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow rhombus pattern
    public static void hollowRhombusPattern(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //starts
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Solid Rhombus Pattern
    public static void solidRhombusPattern(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void butterflyPattern(int n) {
        //1st half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 0-1 triangle pattern
    public static void zeroOneTrianglePattern(int n) {
        // outer loop
        for (int i = 1; i < n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }

    // FloydTrianglePattern
    public static void floydTrianglePattern(int n) {
        int r = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(r);
                r++;
            }
            System.out.println();
        }
    }

    // Inverted half pyramid with numbers pattern
    public static void invertedHalfPyramidWithNumberPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Inverted and rotated half-pyramid pattern
    public static void invertedAndRotatedHalfPyramidPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // print hollow rectangle pattern
    public static void printHollowRectanglePattern(int row, int col) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            //inner loop
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || i == row || j == 1 || j == col)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
