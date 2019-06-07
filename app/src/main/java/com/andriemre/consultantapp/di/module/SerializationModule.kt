package com.mentormate.nightbgnew.di.module

import com.andriemre.consultantapp.ui.LoginFragment
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides


@Module
class SerializationModule {

    @Provides
    fun provideGson(): Gson {
        return GsonBuilder()
            .serializeNulls()
            .create()
    }


    @Provides
    fun provideLoginFragment(): LoginFragment {
        return LoginFragment()
    }




}

