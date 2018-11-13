package com.example.android.codelabs.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

@Entity(tableName = "word_table")
class Word(
        @PrimaryKey
        @ColumnInfo(name = "word") val word: String
)
