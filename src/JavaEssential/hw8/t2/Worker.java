package JavaEssential.hw8.t2;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;


public class Worker {

    private String nameInitials;
    private String jobPosition;
    private String employment;


    public String getNameInitials() {
        return nameInitials;
    }

    public void setNameInitials(String nameInitials) {
        this.nameInitials = nameInitials;

    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String inDate, String valid) throws Exception {

        try {
            SimpleDateFormat format = new SimpleDateFormat(valid);
            format.setLenient(false);
            format.parse(inDate);
            employment = inDate;
        } catch (Exception e) {
            throw new Exception("Не правильный формат даты, попробуйте еще раз");
        }
    }


}
