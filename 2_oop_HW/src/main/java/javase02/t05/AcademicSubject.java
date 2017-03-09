package javase02.t05;

public enum AcademicSubject {
    MATH(5.0),
    CHEMISTRY(5),
    MUSIC(10.0),
    HISTORY(4);

    Number rating;

    Number getTypeAndMaxRating() {
        return rating;
    }

    AcademicSubject(Double r) {
        rating = r;
    }

    AcademicSubject(int r) {
        rating = r;
    }
}
