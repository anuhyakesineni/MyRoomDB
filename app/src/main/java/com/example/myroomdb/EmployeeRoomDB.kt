import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myroomdb.EmployeeData

@Database(entities = arrayOf(EmployeeData::class),version = 1)
abstract class EmployeeRoomDB : RoomDatabase(){

    @Volatile
    private var INSTANCE :EmployeeRoomDB?= null

    fun getInstance(context: Context): EmployeeRoomDB? {
        synchronized(this) {
            if (INSTANCE == null) {
                var instance = Room.databaseBuilder(
                    context.applicationContext,
                    EmployeeRoomDB::class.java,
                    "Employee_DataBase"
                ).build()
                INSTANCE = instance
                return instance
            }
            else{
                var a=INSTANCE
                return  a
            }
        }

    }


}