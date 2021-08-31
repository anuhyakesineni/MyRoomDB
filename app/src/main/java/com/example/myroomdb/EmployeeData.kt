package com.example.myroomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "EmployeeTable")
data class EmployeeData(
    @PrimaryKey(autoGenerate=true) var id:Int,
    var name:String,
    var age:String)