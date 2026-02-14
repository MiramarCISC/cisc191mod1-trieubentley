package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Module 1 - Part C
 * Utility methods for working with Student[].
 *
 * IMPORTANT:
 * - Methods that return Student[] must return NEW arrays (defensive copy).
 * - For sorting, use a Comparator created with a lambda or method references.
 */
public class StudentArrayToolkit {

    /**
     * Returns a NEW array sorted by:
     * 1) GPA descending
     * 2) name ascending (tie-breaker)
     *
     * Must not modify the original array.
     */
    public static Student[] copySortedByGpaDesc(Student[] students) {
        if (students == null) {
            throw new IllegalArgumentException("Students array cannot be null");
        }

        Student[] copy = Arrays.copyOf(students, students.length);

        Comparator<Student> comparator =
                Comparator.comparing(Student::getGpa).reversed()
                        .thenComparing(Student::getName);

        Arrays.sort(copy, comparator);
        return copy;
    }

    /**
     * Linear search for a student by id.
     * Returns the Student if found, otherwise null.
     */
    public static Student findByIdLinear(Student[] students, int id) {
        if (students == null) {
            throw new IllegalArgumentException("Students array cannot be null");
        }

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    /**
     * Returns a NEW array containing the top N students by GPA desc (ties: name asc).
     * If n > students.length, return all students (sorted).
     * If n == 0, return an empty array.
     * @throws IllegalArgumentException if n < 0
     */
    public static Student[] topNByGpa(Student[] students, int n) {
        if (students == null) {
            throw new IllegalArgumentException("Students array cannot be null");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        Student[] sorted = copySortedByGpaDesc(students);

        int size = Math.min(n, sorted.length);
        return Arrays.copyOf(sorted, size);
    }
}
