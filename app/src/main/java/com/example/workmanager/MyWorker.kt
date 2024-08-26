package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.impl.WorkerWrapper

class MyWorker(appContext: Context, workerParameters: WorkerParameters):Worker(appContext,workerParameters){
    override fun doWork(): Result {
        val toplam=19+15
        Log.e("Arkaplan İşlemi Sonucu",toplam.toString())
        return Result.success()
    }
}