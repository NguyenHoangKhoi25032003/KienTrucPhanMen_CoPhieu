package fit.iuh;

public interface Task {
    void addMember(TeamMember member);
    void removeMember(TeamMember member);
    void notifyMembers();
}
