package com.example.kmpdemo.book.data.database

import androidx.room.RoomDatabase

actual class DatabaseFactory {
    actual fun create(): RoomDatabase.Builder<FavoriteBookDatabase> {
        throw UnsupportedOperationException("Room database is not yet supported on Web (Wasm) in this demo.")
    }
}
