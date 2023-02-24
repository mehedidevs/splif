package com.arif.spliff.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.arif.spliff.entity.Product


@Dao
interface ProductDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProduct(product: Product)

    @Query("SELECT * FROM product")
    fun getAll(): LiveData<List<Product>>

    @Query("SELECT * FROM product WHERE id=:id ")
    fun loadSingle(id: String): Product


}