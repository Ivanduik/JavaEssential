package JavaEssential.hw3.t2;

public class ClassRoom {
    private final Pupil[] pupils;

    public ClassRoom(Pupil[] pupils) {
        this.pupils = new Pupil[pupils.length];
        System.arraycopy(pupils, 0, this.pupils, 0, pupils.length);
    }

    public ClassRoom(Pupil[] pupils, Pupil[] pupils1) {
        this.pupils = new Pupil[pupils.length + pupils1.length];
        System.arraycopy(pupils, 0, this.pupils, 0, pupils.length);
        System.arraycopy(pupils1, 0, this.pupils, pupils.length, pupils1.length);
    }

    public ClassRoom(Pupil[] pupils, Pupil[] pupils1, Pupil[] pupils2) {
        this.pupils = new Pupil[pupils.length + pupils1.length + pupils2.length];
        System.arraycopy(pupils, 0, this.pupils, 0, pupils.length);
        System.arraycopy(pupils1, 0, this.pupils, pupils.length, pupils1.length);
        System.arraycopy(pupils2, 0, this.pupils, pupils.length + pupils1.length, pupils2.length);
    }

    public void printClassPupil() {
        for (int i = 0; i < pupils.length; i++) {
            System.out.println("Pupil - " + i);
            pupils[i].study();
            pupils[i].read();
            pupils[i].write();
            pupils[i].relax();
        }
    }
}


