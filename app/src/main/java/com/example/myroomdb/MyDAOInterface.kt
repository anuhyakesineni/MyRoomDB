package com.example.myroomdb

import androidx.room.*

@Dao
interface MyDAOInterface {
    @Insert
    fun insert(emp:EmployeeData)

    @Update
    fun update(emp:EmployeeData)

    @Delete
    fun delete(emp:EmployeeData)

    @Query("Select * from EmployeeTable")
    fun query(emp: EmployeeData)


}