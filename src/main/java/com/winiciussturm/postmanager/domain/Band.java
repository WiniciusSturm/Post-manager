package com.winiciussturm.postmanager.domain;

public class Band {

	public String bandName;
	public String bandStyle;
	public String bandCountry;
	
	public Band()
	{
		
	}

	public Band(String bandName, String bandStyle, String bandCountry)
	{
		this.bandName = bandName;
		this.bandStyle = bandStyle;
		this.bandCountry = bandCountry;
	}

	public String getBandName()
	{
		return bandName;
	}

	public void setBandName(String bandName) 
	{
		this.bandName = bandName;
	}

	public String getBandStyle() 
	{
		return bandStyle;
	}

	public void setBandStyle(String bandStyle)
	{
		this.bandStyle = bandStyle;
	}

	public String getBandCountry() 
	{
		return bandCountry;
	}

	public void setBandCountry(String bandCountry) 
	{
		this.bandCountry = bandCountry;
	}
	
}
