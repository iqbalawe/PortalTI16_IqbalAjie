package iqbal.app.portalti16.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {

    public static Retrofit request() {
        return new Retrofit.Builder()
                //main url dari web service yang tersedia
                .baseUrl("https://ti16.herokuapp.com/")
                //melakukan konversi dari json string ke java object
                .addConverterFactory(GsonConverterFactory.create())
                //build
                .build();

    }
}
