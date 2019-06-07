package com.mentormate.nightbgnew.di.module

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.andriemre.consultantapp.AppExecutors
import com.andriemre.consultantapp.ConsultantApp
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(app: ConsultantApp): Context = app.applicationContext

    @Provides
    fun provideAppExecutors(): AppExecutors {
        return AppExecutors()
    }


    @Provides
    fun provideIsOnline(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnected == true
        return isConnected
    }


}