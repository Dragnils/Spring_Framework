package ru.anuarbek.sprincourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC -- инверсия управления - сущность не сама создает заваисимости, а в сущность эти зависимости добавляются из вне
    public MusicPlayer(Music music) {
        this.music = music;
    }


    public MusicPlayer(){

    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList(){
        for (Music music: musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
