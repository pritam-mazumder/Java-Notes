package com.Chapter_5_LOOP_CONTROL_INSTRUCTION;

public class Ch5_2_Break_and_Continue {
    public static void main(String[] args) {

        System.out.println("\t\tBreak statement\n\n");
//        The break statement is used to terminate the loop immediately.
//        The break statement terminates the whole loop early.
//        It stops the execution of the loop.

        System.out.println("\t\tBreak statement in For Loop\n");

        for (int a = 0; a <= 10; a++) {
            System.out.print(a);
            System.out.println(": Fr1sk");
            if (a == 3) {
                System.out.println("End of For Loop!\n\n");
                break;
            }
        }

        System.out.println("\t\tBreak statement in While Loop 1\n");

        int b = 0;
        while (b <= 10) {
            System.out.print(b);
            System.out.println(": Frisk");
            b++;
            if (b == 3) {
                System.out.println("End of While Loop 1!\n\n");
                break;
            }
        }

        System.out.println("\t\tBreak statement in While Loop 2\n");

        int c = 0;
        while (c <= 10) {
            System.out.print(c);
            System.out.println(": Frisk");
            if (c == 3) {
                System.out.println("End of While Loop 2!\n\n");
                break;
            }
            c++;
        }

        System.out.println("\t\tBreak statement in Do While Loop 1\n");

        int d = 0;
        do {
            System.out.print(d);
            System.out.println(": FR1SK");
            d++;
            if (d == 3) {
                System.out.println("End of Do While Loop 1!\n\n");
                break;
            }
        } while (d <= 10);

        System.out.println("\t\tBreak statement in Do While Loop 2\n");

        int e = 0;
        do {
            System.out.print(e);
            System.out.println(": FR1SK");
            if (e == 3) {
                System.out.println("End of Do While Loop 2!\n\n");
                break;
            }
            e++;
        } while (e <= 10);


        System.out.println("\t\tContinue statement\n\n");
//        The 'continue' statement is used to skip the current iteration of the loop.
//        The continue statement brings the next iteration early.
//        It does not stop the execution of the loop.

        System.out.println("\t\tContinue statement in For Loop\n");

        for (int f = 0; f <= 10; f++) {
            if (f == 3) {
                System.out.println("Skipping 3 and continuing!");
                continue;
            }
            System.out.print(f);
            System.out.println(": Fr1sk");
        }

        System.out.println("\t\tContinue statement in While Loop\n");

        int g = 0;
        while (g <= 10) {
            if (g == 3) {
                g++;
                continue;
            }
            System.out.print(g);
            System.out.println(": Fr1sk");
            g++;
        }

        System.out.println("\t\tContinue statement in Do While Loop\n");

        int h = 0;
        do {
            if (h == 3) {
                h++;
                continue;
            }
            System.out.print(h);
            System.out.println(": Fr1sk");
            h++;
        } while (h <= 10);


    }
}
