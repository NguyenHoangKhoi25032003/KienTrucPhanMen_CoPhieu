package fit.iuh;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements Task{

    private List<TeamMember> members = new ArrayList<>();
    private String taskName;
    private String status;

    public TaskManager(String taskName, String initialStatus) {
        this.taskName = taskName;
        this.status = initialStatus;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyMembers();
    }

    @Override
    public void addMember(TeamMember member) {
        members.add(member);
    }

    @Override
    public void removeMember(TeamMember member) {
        members.remove(member);
    }

    @Override
    public void notifyMembers() {
        for (TeamMember member : members) {
            member.update(taskName, status);
        }
    }
}
