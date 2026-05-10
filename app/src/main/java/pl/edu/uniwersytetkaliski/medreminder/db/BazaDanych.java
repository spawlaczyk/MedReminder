package pl.edu.uniwersytetkaliski.medreminder.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import pl.edu.uniwersytetkaliski.medreminder.db.DAO.HarmonogramDAO;
import pl.edu.uniwersytetkaliski.medreminder.db.DAO.LekDAO;
import pl.edu.uniwersytetkaliski.medreminder.db.DAO.RejestrDAO;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Harmonogram;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Lek;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Rejestr;

@Database(entities = {Lek.class, Harmonogram.class, Rejestr.class}, version = 1)
public abstract class BazaDanych extends RoomDatabase {
    private static BazaDanych instance;

    public static BazaDanych getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    BazaDanych.class,
                    "Baza_Danych"
            ).build();
        }

        return instance;
    }

    public abstract LekDAO lekDAO();
    public abstract HarmonogramDAO harmonogramDAO();
    public abstract RejestrDAO rejestrDAO();
}
