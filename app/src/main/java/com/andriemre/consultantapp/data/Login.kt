package com.andriemre.consultantapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "login")
data class Login(
    @PrimaryKey
    val id:Int,
    val userName:String
)
