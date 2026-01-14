package com.example.loginpage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Document::class], version = 1)
abstract class DocumentDataBase : RoomDatabase(){
    abstract fun documentDAO(): DocumentDAO
}