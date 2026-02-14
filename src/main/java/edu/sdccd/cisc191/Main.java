package edu.sdccd.cisc191;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.9, 101),
                new Student("Bob", 3.5, 102),
                new Student("Charlie", 3.9, 103),
                new Student("Diana", 2.8, 104),
                new Student("Ethan", 3.2, 105),
                new Student("Fiona", 3.7, 106)
        };

// ----- Original order -----
        System.out.println("Original order:");
        for (Student s : students) {
            System.out.println(s);
        }

// ----- Sorted by GPA (descending, name ascending if tie) -----
        Student[] sorted = StudentArrayToolkit.copySortedByGpaDesc(students);
        System.out.println("\nSorted by GPA:");
        for (Student s : sorted) {
            System.out.println(s);
        }

// ----- Top 3 by GPA -----
        Student[] top3 = StudentArrayToolkit.topNByGpa(students, 3);
        System.out.println("\nTop 3 students:");
        for (Student s : top3) {
            System.out.println(s);
        }

// ----- findByIdLinear (existing ID) -----
        Student foundExisting = StudentArrayToolkit.findByIdLinear(students, 103);
        System.out.println("\nFind ID 103:");
        System.out.println(foundExisting);

// ----- findByIdLinear (non-existing ID) -----
        Student foundMissing = StudentArrayToolkit.findByIdLinear(students, 999);
        System.out.println("\nFind ID 999:");
        System.out.println(foundMissing);  // should print null
    }
}
