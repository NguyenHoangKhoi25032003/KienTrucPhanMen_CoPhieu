package fit.iuh;

public class Main {
    public static void main(String[] args) {

        TaskManager task = new TaskManager("Phát triển API", "Chưa bắt đầu");

        TeamMember dev = new ConcreteTeamMember("Lập trình viên A");
        TeamMember tester = new ConcreteTeamMember("Tester B");
        TeamMember pm = new ConcreteTeamMember("Quản lý dự án");

        task.addMember(dev);
        task.addMember(tester);
        task.addMember(pm);

        System.out.println("Cập nhật trạng thái công việc...");
        task.setStatus("Đang thực hiện");

        System.out.println("Cập nhật trạng thái lần nữa...");
        task.setStatus("Hoàn thành");
    }
}