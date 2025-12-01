// 确保类名与文件名完全一致（Appointment.java）
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor; // 引用父类，支持多态

    // 默认构造函数
    public Appointment() {}

    // 全参构造函数
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor; // 接收子类对象（多态）
    }

    // 打印预约详情
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Appointment Time Slot: " + timeSlot);
        System.out.println("Assigned Doctor Details:");
        doctor.printDetails(); // 调用医生的打印方法（多态体现）
    }

    // 必须有getter，否则取消预约时无法获取手机号
    public String getPatientPhone() { return patientPhone; }
}
