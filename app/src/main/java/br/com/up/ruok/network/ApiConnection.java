package br.com.up.ruok.network;

import com.google.gson.Gson;

import br.com.up.ruok.models.Dica;
import br.com.up.ruok.models.Usuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConnection {

    private Retrofit retrofit;
    private  ApiService as;

    public  ApiConnection() {
        retrofit =  new Retrofit
                .Builder()
                .baseUrl("https://b4e9-2804-7f4-348e-c97-87d1-5736-2f94-9c49.sa.ngrok.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        as = retrofit.create(ApiService.class);
    }

    public void SendUserData(Usuario user) {
        as.enviarUsuarioBemEstar(user).enqueue(new Callback<Dica>() {
            @Override
            public void onResponse(Call<Dica> call, Response<Dica> response) {
                response.body();
            }

            @Override
            public void onFailure(Call<Dica> call, Throwable t) {

            }
        });
    }
}
