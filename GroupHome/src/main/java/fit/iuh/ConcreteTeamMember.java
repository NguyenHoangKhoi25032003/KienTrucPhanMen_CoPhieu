package fit.iuh;

public class ConcreteTeamMember implements TeamMember {
    private String name;

    public ConcreteTeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String newStatus) {
        System.out.println(name + " nhận thông báo: Công việc '" + taskName + "' đã cập nhật trạng thái: " + newStatus);
    }
}
