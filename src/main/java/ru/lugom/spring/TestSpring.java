package ru.lugom.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        System.out.println(musicPlayer.playSong());
        System.out.println(musicPlayer.playSong());
        System.out.println(musicPlayer.playSong());

        context.close();
    }
}
