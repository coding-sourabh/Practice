package SplitwiseDesign.Group;

import SplitwiseDesign.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    public void createGroup(String groupId, String groupName, User createdByUser) {
        // Create a group
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);

        group.addMember(createdByUser);

        groupList.add(group);
    }

    public Group getGroupById(String userId) {
        for(Group group: groupList) {
            if(group.getGroupId().equals(userId))
                return group;
        }
        return null;
    }

    public List<Group> getAllGroups() {
        return groupList;
    }
}
