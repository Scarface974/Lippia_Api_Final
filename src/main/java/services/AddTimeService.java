package services;

import api.model.TimeEntry.HourResponse;
import api.model.TimeEntry.TimeResponse;
import api.model.User.UserResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class AddTimeService extends BaseService{

    public static Response post(String jsonName) {return post(jsonName, HourResponse.class ,setParamss());

    }

    private static Map<String, String> setParamss() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("id-workspace",WORKSPACE_ID_0.get());
        params.put("description_hour",DESCRIPTION_HOUR.get());
        params.put("project_id",ID_PROJECT.get());
        return params;
    }









}
