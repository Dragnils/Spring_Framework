package ru.anuarbek.springcourse;

public class MusicPlayer {
    private Music music;
    //IoC -- инверсия управления - сущность не сама создает заваисимости, а в сущность эти зависимости добавляются из вне
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }


}
