package com.mentormate.nightbgnew.di.module

import android.content.Context
import com.andriemre.consultantapp.data.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RoomModule {

    @Provides
    @Singleton
    fun provideAppDatabase(context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }




}