package ru.anuarbek.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        /*1*/
       // Music music = context.getBean("musicBean", Music.class);
        /*1*/
       // MusicPlayer musicPlayer = new MusicPlayer(music); // внедрили зависимость в конструктор

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
