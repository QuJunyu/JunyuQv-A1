// 确保类名与文件名完全一致（Pediatrician.java）
public class Pediatrician extends HealthProfessional {
    private String ageRange; // 独特属性：接诊年龄范围

    // 默认构造函数
    public Pediatrician() {}

    // 全参构造函数
    public Pediatrician(String id, String name, int workExperience, String ageRange) {
        super(id, name, workExperience); // 调用父类构造
        this.ageRange = ageRange;
    }

    // 重写打印方法
    @Override
    public void printDetails() {
        System.out.println("\n=== Health Professional Type: Pediatrician ===");
        super.printDetails();
        System.out.println("Target Age Range: " + ageRange);
    }

    public String getAgeRange() { return ageRange; }
}
