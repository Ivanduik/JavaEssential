package JavaEssential.hw3.t2;

public class Main {
    public static Pupil[] pupil = new Pupil[4];


    static public void main(String[] arg) {

        pupil[0] = new ExcelentPupil();
        pupil[1] = new GoodPupil();
        pupil[2] = new BadPupil();
        pupil[3] = new ExcelentPupil();

        ClassRoom classA1 = new ClassRoom(pupil);
        ClassRoom classA2 = new ClassRoom(pupil, pupil);
        ClassRoom classA3 = new ClassRoom(pupil, pupil, pupil);
        classA1.printClassPupil();
        classA2.printClassPupil();
        classA3.printClassPupil();

    }
}
