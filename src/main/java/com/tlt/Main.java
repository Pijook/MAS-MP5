package com.tlt;

import java.util.TreeMap;
import java.util.TreeSet;

import com.tlt.employee.Employee;
import com.tlt.game.Game;
import com.tlt.game.GamePlayer;
import com.tlt.game.Player;
import com.tlt.person.Parcel;
import com.tlt.playlist.Movie;
import com.tlt.playlist.PlayList;
import com.tlt.trooper.Trooper;

public class Main {
    public static void main(String[] args) {
        //Atrybut
        final Employee employee = new Employee("Jacek", 20, 1000.0);
        employee.setWorkingDays(0);
        employee.setWorkingDays(5);
        //employee.setWorkingDays(-1);
        employee.setSalary(employee.getSalary() * 1.1);
        //employee.setSalary(employee.getSalary() * 2);

        //Ordered
        final PlayList playList = PlayList.builder().id(1L).build();
        playList.addMovie(Movie.builder().id(2L).name("Movie2").build());
        playList.addMovie(Movie.builder().id(3L).name("Movie3").build());
        playList.addMovie(Movie.builder().id(1L).name("Movie1").build());

        //Bag
        final GamePlayer gamePlayer = new GamePlayer();
        final Player player = Player.builder().id(1L).name("Jacek").build();
        final Game game = Game.builder().id(1L).name("Game1").build();
        gamePlayer.addConnection(player, game);

        //Unique
        final Parcel parcel = new Parcel(1L, "Warszawa");
        //final Parcel parcel1 = new Parcel(1L, "Warszawa");
        parcel.setParcelNumber(2L);
        parcel.setParcelNumber(1L);
        //parcel.setParcelNumber(1L);

        //Own
        final Trooper trooper = new Trooper("Jacek", 100.0);
        final Trooper trooper2 = new Trooper("Jacek", 100.0);
        //final Trooper trooper3 = new Trooper("Jacek", 102.0);
    }
}