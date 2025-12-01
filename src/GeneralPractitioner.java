// 确保类名与文件名完全一致（GeneralPractitioner.java）
public class GeneralPractitioner extends HealthProfessional {
    private String practiceScope; // 独特属性：接诊范围

    // 默认构造函数
    public GeneralPractitioner() {}

    // 全参构造函数（必须调用父类构造）
    public GeneralPractitioner(String id, String name, int workExperience, String practiceScope) {
        super(id, name, workExperience); // 调用父类3个参数的构造函数
        this.practiceScope = practiceScope;
    }

    // 重写打印方法（必须加@Override，确保覆盖正确）
    @Override
    public void printDetails() {
        System.out.println("\n=== Health Professional Type: General Practitioner ===");
        super.printDetails(); // 调用父类的打印方法
        System.out.println("Practice Scope: " + practiceScope);
    }

    public String getPracticeScope() { return practiceScope; }
}
