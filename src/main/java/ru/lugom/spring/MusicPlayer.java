package ru.lugom.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    /*public String playSong(){
        StringBuilder sb = new StringBuilder();
        sb.append("1. " + music1.getSong());
        sb.append("\n2. " + music2.getSong());
        sb.append("\n3. " + music3.getSong());
        return sb.toString();
    }
     */

    public String playSong(){
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }
}
