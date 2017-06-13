package com.example.patyalves.logger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by logonrm on 12/06/2017.
 */

public class Logger extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Log.i("ServicoMensagem ", "*******---Serviço iniciado......");
    }
    public void onDestroy(){
        Log.i("ServicoMensagem ", "*******---Serviço encerrado......");
    }
}
