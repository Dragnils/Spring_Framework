package ru.anuar.sprincourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.anuar.sprincourse.Music;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusick rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusick rockMusick) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusick;
    }

    public void playMusic(MusicJanr janr) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if(janr == MusicJanr.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }



}
