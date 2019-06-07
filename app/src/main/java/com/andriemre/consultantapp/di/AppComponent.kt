package com.mentormate.nightbgnew.di.component


import com.andriemre.consultantapp.ConsultantApp
import com.mentormate.nightbgnew.di.module.*
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component
    (
    modules = [
        (AndroidSupportInjectionModule::class),
        (AppModule::class),
        (RoomModule::class),
        (FragmentModule::class),
        (ActivityModule::class),
        (AdapterModule::class),
        (SerializationModule::class)

    ]
)
interface AppComponent : AndroidInjector<ConsultantApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ConsultantApp>()
}
