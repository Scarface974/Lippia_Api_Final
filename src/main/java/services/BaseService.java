package services;

import com.crowdar.api.rest.MethodsService;
import io.cucumber.java8.Th;


public class BaseService extends MethodsService{
    public static ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACE_ID_0 = new ThreadLocal<>();

    public static ThreadLocal<String> NAME_CLIENT = new ThreadLocal<>();
    public static ThreadLocal<String> USER_ID = new ThreadLocal<>();
    public static ThreadLocal<String> DESCRIPTION_HOUR = new ThreadLocal<>();
    public static ThreadLocal<String> ID_PROJECT = new ThreadLocal<>();
    public static ThreadLocal<String> ID_TIME = new ThreadLocal<>();



}
