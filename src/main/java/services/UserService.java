package services;


import api.model.User.UserResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class UserService extends BaseService {

    public static Response get(String jsonName) {
       return get(jsonName, UserResponse[].class,setParams());
    }


    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",X_API_KEY.get());
        params.put("id-workspace",WORKSPACE_ID_0.get());
        return params;
    }



}


