package assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Students> ls=new ArrayList<>(17);
        ls.add(new Students(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        ls.add(new Students(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        ls.add(new Students(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        ls.add(new Students(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        ls.add(new Students(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        ls.add(new Students(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        ls.add(new Students(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        ls.add(new Students(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        ls.add(new Students(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        ls.add(new Students(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        ls.add(new Students(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        ls.add(new Students(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        ls.add(new Students(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        ls.add(new Students(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        ls.add(new Students(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        ls.add(new Students(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        ls.add(new Students(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        List<String> dept=ls.stream().map(d->d.engDepartment).collect(Collectors.toList());
        System.out.println("task 1");
        System.out.println(dept);


        List<String> taskTwo=ls.stream().filter(q->q.yearOfEnrollment>2018).map(m->m.name).collect(Collectors.toList());
        System.out.println("task 2");
        System.out.println(taskTwo);


        System.out.println("task 3");
        ls.stream().filter(f->f.engDepartment.equals("Computer Science") && f.gender.equals("Male")).forEach(e->e.printDetails());


        System.out.println("task 4");
        Map<String, Long> noOfMaleAndFemale
                = ls.stream().collect(Collectors.groupingBy(p -> p.gender,Collectors.counting()));
        System.out.println(noOfMaleAndFemale);


        System.out.println("task 5");
        Map<String, Double> average
                = ls.stream().collect(Collectors.groupingBy(Students::getGender,Collectors.averagingInt(Students::getAge)));
        System.out.println(average);


        System.out.println("task 6");
        Optional<Students> result3 = ls.stream().collect(Collectors.maxBy(Comparator.comparing(Students::getPerTillDate)));
        result3.get().printDetails();


        System.out.println("task 7");
        Map<String, Long> count
                = ls.stream().collect(Collectors.groupingBy(Students::getEngDepartment,Collectors.counting()));
        System.out.println(count);


        System.out.println("task 8");
        Map<String, Double> averageOfEachDepartment
                = ls.stream().collect(Collectors.groupingBy(Students::getEngDepartment,Collectors.averagingDouble(Students::getPerTillDate)));
        System.out.println(averageOfEachDepartment);


        System.out.println("task 9");
        Optional<Students> electronicStudent =
                ls.stream().filter(p -> p.engDepartment.equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Students::getAge)));
        electronicStudent.get().printDetails();


        System.out.println("task 10");
        Map<String, Long> totalCseStudents
                = ls.stream().filter(p->p.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(p->p.gender,Collectors.counting()));
        System.out.println(totalCseStudents);
    }
}
