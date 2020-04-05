package com.example.notes.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)

    @Query("DELETE FROM notes_table")
    fun deleAllNotes()

    @Query("SELECT * FROM notes_table")
    fun getAllNotes():LiveData<List<Note>>
}