package com.example.relationone.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = student::class,
            parentColumns = ["student_id"],
            childColumns = ["id"]
        )
    ],

)

data class Application(
    val id:Int,
    @PrimaryKey val application_id:Long,
    val phone_no:Int


)
