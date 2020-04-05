package com.example.notes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var title:String,
    var description:String
)