package com.example.mywallet

import androidx.room.Database
import androidx.room.RoomDatabase
import java.lang.NullPointerException

@Database(entities = arrayOf(InOutLog::class),version = 1)
abstract class InOutLogDatabase : RoomDatabase(){
    //ensure only one instance of adatabase is created
    abstract fun inOutLogDao() :inOutLogDao

    companion object{
        @Volatile
        private var INSTANCE : InOutLogDatabase? = null

    val getDatabase(context:Context): InOutLogDatabase{
        val tempDB = INSTANCE
            if(tempDB != null(
                    tempDB = INSTANCE
     )
                synchronized(this){
                    context.applicationContext,
                    InOutLogDatabase::class.java
                    "inoutlog_db"
                }.build()
                INSTANCE = instance


    }
}
}