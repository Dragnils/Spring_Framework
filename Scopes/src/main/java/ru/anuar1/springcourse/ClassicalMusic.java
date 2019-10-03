package ru.anuar1.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initialization ClassicalMusic");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction ClassicalMusic");
    }

        // приватный конструктор, чтобы не могли пользоватиели создавать объекты, только через фабричный метод
    private ClassicalMusic(){}

    //фабричный метод
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
