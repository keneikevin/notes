package com.example.notes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.notes.data.Note
import com.example.notes.data.NoteRepository

class NoteViewModel(application:Application) :AndroidViewModel(application){
    private var repository:NoteRepository= NoteRepository(application)
    private var allNotes:LiveData<List<Note>> = repository.getAllNotes()
    fun insert(note:Note){
        repository.insert(note)
    }
    fun deleteAllNotes(){
        repository.deleteAllNotes()
    }
    fun getAllNotes():LiveData<List<Note>>{return allNotes}
}