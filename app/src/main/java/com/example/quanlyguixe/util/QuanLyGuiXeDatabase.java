package com.example.quanlyguixe.util;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.quanlyguixe.data.model.Employees;
import com.example.quanlyguixe.data.model.ParkingLot;
import com.example.quanlyguixe.data.model.typeconverter.DateConverter;
import com.example.quanlyguixe.data.repo.local.employee.EmployeeDao;
import com.example.quanlyguixe.data.repo.local.parkinglot.ParkingLotDao;

@Database(entities = {Employees.class, ParkingLot.class}, version = 1)
@TypeConverters({DateConverter.class})
public abstract class QuanLyGuiXeDatabase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
    public abstract ParkingLotDao parkingLotDao();
}
