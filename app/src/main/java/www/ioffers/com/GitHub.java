package www.ioffers.com;

import java.util.List;

import nate.hello.Contributor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHub {
      @GET("/repos/{owner}/{repo}/contributors")
      Call<List<Contributor>> contributors(
              @Path("owner") String owner,
              @Path("repo") String repo);
}