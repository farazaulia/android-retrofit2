package retrofit;

public class ApiUtil {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static RetrofitInterface getServiceClass() {
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }

}
