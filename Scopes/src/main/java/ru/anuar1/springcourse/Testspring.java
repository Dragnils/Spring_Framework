package ru.anuar1.springcourse;

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

        // Проверка на Scope Singleton and Prototype
        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstmusicPlayer == secondmusicPlayer; // проверка ссылается ли на один объект
        System.out.println(comparison);

        System.out.println(firstmusicPlayer); // проверяем по hashcode
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);

        System.out.println("Громкость с первого плеера: " + firstmusicPlayer.getVolume());
        System.out.println("Громкость со второго плеера: " + secondmusicPlayer.getVolume());
        firstmusicPlayer.playMusic();



       // musicPlayer.playMusic();
        //System.out.println(musicPlayer.getName());
       // System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
