package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> firstGraders = new ArrayList<>();

        // Add 3 Strings to the list
        firstGraders.add(new Student("America", "Blakeney", 1, 1));
        firstGraders.add(new Student("Bobby", "Smith", 2, 1));
        firstGraders.add(new Student("Caden", "O'Reilly", 3, 1));
        firstGraders.add(new Student("Donald", "Murray", 4, 1));
        firstGraders.add(new Student("Eisley", "Strange", 5, 1));
        firstGraders.add(new Student("Frank", "Blachian", 6, 1));
        firstGraders.add(new Student("Geraldine", "Brooks", 7, 1));
        firstGraders.add(new Student("Houdini", "White",8, 1));
        firstGraders.add(new Student("Irene", "Speckles", 9, 1));
        firstGraders.add(new Student("Julian", "Watercress", 10, 1));
        firstGraders.add(new Student("Katia", "Jones", 11, 1));
        firstGraders.add(new Student("Lemony", "Snicket", 12, 1));
        firstGraders.add(new Student("Moony", "Lunario", 13, 1));
        firstGraders.add(new Student("Nickelodian", "Acme", 14, 1));
        firstGraders.add(new Student("Elon", "Musk", 15, 1));


        List<Teacher> threeTeachers = new ArrayList<>();

        threeTeachers.add(new Teacher("Mrs.", "Java", 1, 1));
        threeTeachers.add(new Teacher("Mr.", "Ruby", 2, 2));
        threeTeachers.add(new Teacher("Ms.", "Python", 3, 3));

        Map<Teacher, Set<Student>> classRooms = new HashMap<>();


        // way # 1
        classRooms.put(threeTeachers.get(0), new HashSet<>());
       classRooms.get(threeTeachers.get(0)).add(firstGraders.get(0));

        Set<Student> studentSet1= new HashSet<>();
        studentSet1.add(firstGraders.get(0));
        studentSet1.add(firstGraders.get(1));
        studentSet1.add(firstGraders.get(2));
        studentSet1.add(firstGraders.get(3));
        studentSet1.add(firstGraders.get(4));
        // add four more students into the HashSet
        classRooms.put(threeTeachers.get(0), studentSet1);

        Set<Student> studentSet2= new HashSet<>();
        studentSet2.add(firstGraders.get(5));
        studentSet2.add(firstGraders.get(6));
        studentSet2.add(firstGraders.get(7));
        studentSet2.add(firstGraders.get(8));
        studentSet2.add(firstGraders.get(9));

        classRooms.put(threeTeachers.get(1), studentSet2);

        Set<Student> studentSet3= new HashSet<>();
        studentSet3.add(firstGraders.get(10));
        studentSet3.add(firstGraders.get(11));
        studentSet3.add(firstGraders.get(12));
        studentSet3.add(firstGraders.get(13));
        studentSet3.add(firstGraders.get(14));

        classRooms.put(threeTeachers.get(2), studentSet3);

        // repeat the process 2 more time for teacher 1 and teacher 2


        System.out.println(classRooms);


	// write your code here
    }
}











    //In the main() method of Main create an ArrayList of 15 students which represents all the 1st grade students at an elementary school. Make sure the ids are unique and set the grade to 1.

     //   Generate equals(), hashCode() and toString() using IntelliJ. Re-write equals() and hashCode() to use the id variable.





//for today’s assignment, ignore:

       // *Re-write equals() and hashCode() to use the id variable.*