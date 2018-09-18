package com.winiciussturm.postmanager.domain;

public class Album 
{

	public String albumName;
	public String albumYear;
	
	public Band band;

	public Album()
	{
		
	}
	
	public Album(String albumName, String albumYear, Band band) 
	{
		this.albumName = albumName;
		this.albumYear = albumYear;
		this.band = band;
	}

	public String getAlbumName() 
	{
		return albumName;
	}

	public void setAlbumName(String albumName) 
	{
		this.albumName = albumName;
	}

	public String getAlbumYear() 
	{
		return albumYear;
	}

	public void setAlbumYear(String albumYear) 
	{
		this.albumYear = albumYear;
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
