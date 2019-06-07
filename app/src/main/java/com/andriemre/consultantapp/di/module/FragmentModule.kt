package com.mentormate.nightbgnew.di.module

import com.andriemre.consultantapp.ui.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindLoginFragment(): LoginFragment



}