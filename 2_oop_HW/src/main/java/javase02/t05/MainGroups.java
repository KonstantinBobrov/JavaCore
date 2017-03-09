package javase02.t05;

import java.util.*;

/**
 * Разработайте приложение, позволяющее формировать группы студентов по разным дисциплинам.
 * Состав групп может быть разным. Каждая дисциплина в отдельности определяет,
 * целыми или вещественными будут оценки по ней.
 * Необходимо найти группы, в которые входит студент X, и сравнить его оценки.
 * Для огранизации перечня дисциплин можно использовать перечисление.
 */

public class MainGroups {
    static Set<Group> allGroup = new HashSet();

    public static void main(String[] args) {
        Student student1 = new Student("Иванов");
        Student student2 = new Student("Петров");
        Student student3 = new Student("Сидоров");

        Group group1 = new Group("Химия", AcademicSubject.CHEMISTRY);
        allGroup.add(group1);

        group1.addStudent(student1);
        group1.addStudentRating(student1, 5);
        group1.addStudentRating(student1, 3);
        group1.addStudentRating(student1, 4);

        group1.addStudent(student2);
        group1.addStudentRating(student2, 3);
        group1.addStudentRating(student2, 2);
        group1.addStudentRating(student2, 3);

        group1.addStudent(student3);
        group1.addStudentRating(student3, 5);
        group1.addStudentRating(student3, 5);
        group1.addStudentRating(student3, 5);
    }


    // Доделать поиск студента в группах и вывод его отценок!
    public static boolean foundStudent() {
        return false;
    }
}

class Group {
    String groupName;
    AcademicSubject subj;
    Map<Student, ArrayList<Number>> studentsMap = new HashMap<>();

    Group(String name, AcademicSubject subj) {
        groupName = name;
        this.subj = subj;
    }

    String getRatingType() {
        if (subj.rating instanceof Double) return "Вещественные";
        return "Целые";
    }

    void addStudent(Student st) {
        studentsMap.put(st, new ArrayList<>());
    }

    void removeStudent(Student st) {
        studentsMap.remove(st);
    }

    void addStudentRating(Student st, Number rating) {
        List<Number> ratingList = studentsMap.get(st);
        ratingList.add(rating);
    }
}
