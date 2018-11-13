package com.example.android.codelabs.database.repository

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.example.android.codelabs.database.dao.WordDao
import com.example.android.codelabs.database.entity.Word


/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

class WordRepository(private val wordDao: WordDao) {

    val addWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
