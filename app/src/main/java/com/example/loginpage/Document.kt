package com.example.loginpage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Document (
    @ColumnInfo(name = "mail")
    var mail : String,

    @ColumnInfo(name = "phone")
    var phone : Int,

    @ColumnInfo(name = "password")
    var password : Int
){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}