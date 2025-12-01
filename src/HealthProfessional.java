public class HealthProfessional {
    private String id; // 纯数字ID
    private String name; // 姓名
    private int workExperience; // 工作年限（通用属性）

    // 默认构造函数
    public HealthProfessional() {}

    // 全参构造函数
    public HealthProfessional(String id, String name, int workExperience) {
        this.id = id;
        this.name = name;
        this.workExperience = workExperience;
    }

    // 打印详情方法
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Work Experience (Years): " + workExperience);
    }

    // Getter方法（必须有，否则子类/预约类无法访问私有属性）
    public String getId() { return id; }
    public String getName() { return name; }
    public int getWorkExperience() { return workExperience; }
}
