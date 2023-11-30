package api.model.TimeEntry;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TimeInterval {
    public Date start;
    public Date end;
    public String duration;
}
