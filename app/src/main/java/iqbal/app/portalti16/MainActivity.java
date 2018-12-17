package iqbal.app.portalti16;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import iqbal.app.portalti16.adapter.MahasiswaAdapter;
import iqbal.app.portalti16.entity.DaftarMahasiswa;
import iqbal.app.portalti16.network.Network;
import iqbal.app.portalti16.network.Routes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Ini punya Iqbal Ajie Wahyudin
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void requestDaftarMahasiswa() {
        Routes services = Network.request().create(Routes.class);
        services.getMahasiswa().enqueue(new Callback<DaftarMahasiswa>() {
            @Override
            public void onResponse(Call<DaftarMahasiswa> call, Response<DaftarMahasiswa> response) {
                if (response.isSuccessful()) {
                    DaftarMahasiswa mahasiswas = response.body();
                    Log.d("iqbalawe", mahasiswas.getTitle());
                    MahasiswaAdapter adapter = new MahasiswaAdapter(mahasiswas.getData());
                }
            }

            @Override
            public void onFailure(Call<DaftarMahasiswa> call, Throwable t) {

            }
        });
    }
}
