package services;

import api.model.ClientResponse;
import api.model.TimeEntry.HourResponse;
import api.model.TimeEntry.TimeResponse;
import api.model.User.UserResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class TimeService extends BaseService{

    public static Response get(String jsonName){return get(jsonName, TimeResponse[].class, setParams());}

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("id-workspace",WORKSPACE_ID_0.get());
        params.put("user-id",USER_ID.get());
        return params;
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

    private static Map<String, String> setParamsss() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("id-workspace",WORKSPACE_ID_0.get());
        params.put("time_id",ID_TIME.get());
        return params;
    }





    /*---------------------------------------Nuevo-----------------------------------------------*/
    public static void defineUserId(){
        UserResponse[] userspacesResponses = (UserResponse[]) APIManager.getLastResponse().getResponse();
        USER_ID.set(userspacesResponses[0].getId());
    }

    public static void defineTimeId(){
        HourResponse[] timespacesResponses = (HourResponse[]) APIManager.getLastResponse().getResponse();
        ID_TIME.set(timespacesResponses[0].getId());
    }

    /*-------------------------------------------------------------------------------------------*/
    public static Response post(String jsonName) {return post(jsonName, HourResponse.class ,setParamss());

    }

    public static Response put(String jsonName) {return put(jsonName, HourResponse.class ,setParamsss());

    }




}
