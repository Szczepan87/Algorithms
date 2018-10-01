package AlgorytmyCwiczenia.ArraysExc;

public class Rounding {

    static int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38 || grades[i] % 5 == 0)
                continue;
            if (grades[i] % 5 >= 3) {
                if (grades[i] % 5 == 3) grades[i] += 2;
                else grades[i]+= 1;
            }
        }
        return grades;
    }
}
