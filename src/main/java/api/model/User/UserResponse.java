package api.model.User;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class UserResponse{
    public String id;
    public String email;
    public String name;
    public ArrayList<Object> memberships;
    public String profilePicture;
    public String activeWorkspace;
    public String defaultWorkspace;
    public Settings settings;
    public String status;
    public ArrayList<Object> customFields;
}