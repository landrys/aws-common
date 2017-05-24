package com.landry.aws.lambda.common.model;

public class BusinessDayInput
{
    private String date;
    private Integer businessDays;

	public String getDate()
	{
		return date;
	}
	public void setDate( String date )
	{
		this.date = date;
	}
	public Integer getBusinessDays()
	{
		return businessDays;
	}
	public void setBusinessDays( Integer businessDays )
	{
		this.businessDays = businessDays;
	}

}