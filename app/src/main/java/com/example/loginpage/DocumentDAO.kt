package com.example.loginpage

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable

@Dao
interface DocumentDAO {
    @Query("SELECT * FROM Document")
    fun getAll(): List<Document>

    @Query("SELECT * FROM Document WHERE id = :id")
    fun loadAllByIds(id : Int): List<Document>

    @Insert
    fun insert(document: Document) : Completable

    @Delete
    fun delete(document: Document) : Completable
}