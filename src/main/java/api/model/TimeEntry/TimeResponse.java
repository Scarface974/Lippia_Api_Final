package api.model.TimeEntry;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TimeResponse {
    public String id;
    public String description;
    public ArrayList<String> tagIds;
    public String userId;
    public boolean billable;
    public String taskId;
    public String projectId;
    public String workspaceId;
    public TimeInterval timeInterval;
    public ArrayList<Object> customFieldValues;
    public String type;
    public Object kioskId;
    public HourlyRate hourlyRate;
    public CostRate costRate;
    public boolean isLocked;
}
