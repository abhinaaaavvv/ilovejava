package org.physics;

import java.util.Scanner;

public class EquationOfMotion {

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    int choice = 0;

    while (choice <= 0 || choice > 5) {
      System.out.println("1. distance (s/x in m)");
      System.out.println("2. initial velocity (u in m/s)");
      System.out.println("3. final velocity (v in m/s)");
      System.out.println("4. time period (t in s)");
      System.out.println("5. acceleration (a in m/s^2)");

      System.out.println();

      System.out.print("enter the value to be searched for (1 - 5): ");

      try {
        choice = in.nextInt();
      } catch (final java.util.InputMismatchException e) {
        System.out.println(
          "Invalid input. Please enter an integer between 1 and 5."
        );

        in.next(); // Consume the invalid input
        choice = 0; // Set choice to an invalid value to keep the loop running
      }

      System.out.println();
    }

    Double u = null,
      v = null,
      t = null,
      s = null,
      a = null;

    switch (choice) {
      case 1:
        while (u == null) {
          System.out.print("Enter the initial velocity (u in m/s): ");

          try {
            u = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            u = null;
          }
          System.out.println();
        }

        while (v == null) {
          System.out.print("Enter the final velocity (v in m/s): ");

          try {
            v = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            v = null;
          }
          System.out.println();
        }

        while (t == null) {
          System.out.print("Enter the time period (t in s): ");

          try {
            t = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            t = null;
          }
          System.out.println();
        }

        s = ((u + v) / 2) * t;
        System.out.println("Distance (s/x in m): " + s);
        break;
      case 2:
        while (v == null) {
          System.out.print("Enter the final velocity (v in m/s): ");

          try {
            v = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            v = null;
          }
          System.out.println();
        }

        while (t == null) {
          System.out.print("Enter the time period (t in s): ");

          try {
            t = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            t = null;
          }
          System.out.println();
        }

        while (a == null) {
          System.out.print("Enter the acceleration (a in m/s^2): ");

          try {
            a = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            a = null;
          }
          System.out.println();
        }

        u = v - a * t;
        System.out.println("Initial velocity (u in m/s): " + u);
        break;
      case 3:
        while (u == null) {
          System.out.print("Enter the initial velocity (u in m/s): ");

          try {
            u = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            u = null;
          }
          System.out.println();
        }

        while (t == null) {
          System.out.print("Enter the time period (t in s): ");

          try {
            t = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            t = null;
          }
          System.out.println();
        }

        while (a == null) {
          System.out.print("Enter the acceleration (a in m/s^2): ");

          try {
            a = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            a = null;
          }
          System.out.println();
        }

        v = u + a * t;
        System.out.println("Final velocity (v in m/s): " + v);
        break;
      case 4:
        while (s == null) {
          System.out.print("Enter the distance (s/x in m): ");

          try {
            s = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            s = null;
          }
          System.out.println();
        }

        while (u == null) {
          System.out.print("Enter the initial velocity (u in m/s): ");

          try {
            u = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            u = null;
          }
          System.out.println();
        }

        while (v == null) {
          System.out.print("Enter the final velocity (v in m/s): ");

          try {
            v = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            v = null;
          }
          System.out.println();
        }

        t = (2 * s) / (u + v);
        System.out.println("Time period (t in s): " + t);
        break;
      case 5:
        while (s == null) {
          System.out.print("Enter the distance (s/x in m): ");

          try {
            s = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            s = null;
          }
          System.out.println();
        }

        while (u == null) {
          System.out.print("Enter the initial velocity (u in m/s): ");

          try {
            u = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            u = null;
          }
          System.out.println();
        }

        while (t == null) {
          System.out.print("Enter the time period (t in s): ");

          try {
            t = in.nextDouble();
          } catch (final java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            in.next();
            t = null;
          }
          System.out.println();
        }

        a = (2 * s) / (t * t) - (2 * u) / t;
        System.out.println("Acceleration (a in m/s^2): " + a);
        break;
    }
    in.close();
  }
}
