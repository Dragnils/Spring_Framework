package ru.anuar.sprincourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> song = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        song.add("Hungarian Rhapsody");
        song.add("Symphony Arkestr");
        song.add("The Four Seasons, Concerto No. 1 \"Spring\": I. Allegro");
    }


    @Override
    public List<String> getSong() {
        return song;
    }
}
