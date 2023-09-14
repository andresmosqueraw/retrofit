package co.edu.uniempresarial.retrofit.model.api;

import co.edu.uniempresarial.retrofit.model.Results;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("pokemon")
    Call<Results> getPokemons();
}
