package retrofit;

import java.util.List;

import me.farazaulia.androidretrofit2.Post;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("posts")
    public Call<List<Post>> getAllPost();
}
