package api.model.TimeEntry;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class HourResponse {
    public String id;
    public String description;
    public ArrayList<String> tagIds;
    public String userId;
    public boolean billable;
    public String taskId;
    public String projectId;
    public TimeInterval timeInterval;
    public String workspaceId;
    public boolean isLocked;
    public ArrayList<Object> customFieldValues;
    public String type;
    public Object kioskId;
}
