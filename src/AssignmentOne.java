// 必须是public类，且文件名与类名一致（AssignmentOne.java）
import java.util.ArrayList; // 必须导入ArrayList，否则报错

public class AssignmentOne {
    public static void main(String[] args) { // 程序入口，必须正确声明
        // Part 3：创建医生对象
        System.out.println("===== Part 3: Health Professional Objects =====");

        // 3个全科医生
        GeneralPractitioner gp1 = new GeneralPractitioner(
                "GP001", "Dr. Zhang", 8, "Common diseases, health checkups"
        );
        GeneralPractitioner gp2 = new GeneralPractitioner(
                "GP002", "Dr. Li", 5, "Acute illness, preventive care"
        );
        GeneralPractitioner gp3 = new GeneralPractitioner(
                "GP003", "Dr. Wang", 12, "Chronic disease management"
        );

        // 2个儿科医生
        Pediatrician p1 = new Pediatrician(
                "PD001", "Dr. Chen", 6, "0-3 years old"
        );
        Pediatrician p2 = new Pediatrician(
                "PD002", "Dr. Zhao", 9, "4-12 years old"
        );

        // 打印医生信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        p1.printDetails();
        p2.printDetails();

        System.out.println("\n------------------------------");

        // Part 5：预约管理
        System.out.println("===== Part 5: Appointment Management =====");

        // 创建预约集合（必须初始化ArrayList）
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 创建4个预约
        createAppointment(appointmentList, "Zhang San", "13800138000", "09:00", gp1);
        createAppointment(appointmentList, "Li Si", "13900139000", "10:30", gp2);
        createAppointment(appointmentList, "Wang Wu", "13700137000", "14:00", p1);
        createAppointment(appointmentList, "Zhao Liu", "13600136000", "15:30", p2);

        // 打印初始预约
        System.out.println("\n--- All Existing Appointments ---");
        printExistingAppointments(appointmentList);

        // 取消预约
        String phoneToCancel = "13900139000";
        System.out.println("\n--- Canceling Appointment (Phone: " + phoneToCancel + ") ---");
        cancelBooking(appointmentList, phoneToCancel);

        // 打印取消后预约
        System.out.println("\n--- Updated Appointments After Cancellation ---");
        printExistingAppointments(appointmentList);

        System.out.println("\n------------------------------");
    }

    // 创建预约方法（参数类型必须正确）
    public static void createAppointment(ArrayList<Appointment> list,
                                         String patientName, String patientPhone,
                                         String timeSlot, HealthProfessional doctor) {
        // 验证必填信息
        if (patientName == null || patientName.trim().isEmpty() ||
                patientPhone == null || patientPhone.trim().isEmpty() ||
                timeSlot == null || timeSlot.trim().isEmpty() ||
                doctor == null) {
            System.out.println("Error: Missing required information.");
            return;
        }
        // 验证手机号格式（11位数字）
        if (!patientPhone.matches("\\d{11}")) {
            System.out.println("Error: Phone must be 11 digits.");
            return;
        }
        // 添加到集合
        list.add(new Appointment(patientName, patientPhone, timeSlot, doctor));
        System.out.println("Appointment created for: " + patientName);
    }

    // 打印所有预约
    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\n=== Appointment " + (i + 1) + " ===");
            list.get(i).printAppointmentDetails();
        }
    }

    // 取消预约方法
    public static void cancelBooking(ArrayList<Appointment> list, String targetPhone) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPatientPhone().equals(targetPhone)) {
                list.remove(i);
                System.out.println("Canceled appointment with phone: " + targetPhone);
                return;
            }
        }
        System.out.println("No appointment found for phone: " + targetPhone);
    }
}
