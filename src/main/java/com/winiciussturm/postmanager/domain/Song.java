package com.winiciussturm.postmanager.domain;

public class Song 
{

	public String songName;
	public Integer songLenght;
	
	public Album album;
	
	public Band band;
	
	public Song()
	{
		
	}

	public Song(String songName, Integer songLenght, Album album, Band band)
	{
		this.songName = songName;
		this.songLenght = songLenght;
		this.album = album;
		this.band = band;
	}

	public String getSongName() 
	{
		return songName;
	}

	public void setSongName(String songName) 
	{
		this.songName = songName;
	}

	public Integer getSongLenght()
	{
		return songLenght;
	}

	public void setSongLenght(Integer songLenght) 
	{
		this.songLenght = songLenght;
	}

	public Album getAlbum() 
	{
		return album;
	}

	public void setAlbum(Album album) 
	{
		this.album = album;
	}

	public Band getBand() 
	{
		return band;
	}

	public void setBand(Band band)
	{
		this.band = band;
	}
	
}
