package br.com.up.ruok.network;

import br.com.up.ruok.models.Dica;
import br.com.up.ruok.models.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("bem-estar")
    public Call <Dica>  enviarUsuarioBemEstar(@Body Usuario usuario);
}
