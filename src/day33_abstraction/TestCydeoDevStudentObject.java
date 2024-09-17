package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {
    public static void main(String[] args) {
        CydeoDewStudent student = new CydeoDewStudent("Alexa", 'F', LocalDate.of(2001, 10, 28), "A69", "Tiger", 38);
        // İlk batchName seti
        student.setBatchName("Zero to Hero");
        System.out.println(student);

        // BatchName değerini güncelleme
        //student.updateBatchName("Alumni Dev");
        System.out.println(student);

        // Geçersiz batchName değeri
        //student.updateBatchName("Invalid Batch");
        System.out.println(student);
    }
}
