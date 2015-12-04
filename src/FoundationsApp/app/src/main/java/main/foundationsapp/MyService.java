package main.foundationsapp;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyService extends Service {

    private Executor executor = Executors.newSingleThreadExecutor();


    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        executor.execute(new Runnable() {
            @Override
            public void run() {
                //DO whatever the intent said to do!!!!!!!
            }
        });
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
