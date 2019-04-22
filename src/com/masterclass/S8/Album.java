package com.masterclass.S8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title){
        for(Song chekedSong: this.songs){
            if(chekedSong.getTitle().equals(title)){
                return chekedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if((index>=0) && (index<=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkeSong = findSong(title);
        if(checkeSong != null){
            playList.add(checkeSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}

