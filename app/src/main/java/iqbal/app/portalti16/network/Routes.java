package iqbal.app.portalti16.network;

import iqbal.app.portalti16.entity.DaftarMahasiswa;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Routes {

    @GET("list.php")
    Call<DaftarMahasiswa> getMahasiswa();
}
