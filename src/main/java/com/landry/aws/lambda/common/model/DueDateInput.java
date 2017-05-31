package com.landry.aws.lambda.common.model;

import java.util.List;

public class DueDateInput
{
	private List<Integer> vendorShipTimeIds;
	private String store;
	private Boolean reload;
	private Boolean ping;

	public List<Integer> getVendorShipTimeIds()
	{
		return vendorShipTimeIds;
	}
	public void setVendorShipTimeIds( List<Integer> vendorShipTimeIds )
	{
		this.vendorShipTimeIds = vendorShipTimeIds;
	}
	public String getStore()
	{
		return store;
	}
	public void setStore( String store )
	{
		this.store = store;
	}
	public Boolean getReload()
	{
		return reload;
	}
	public void setReload( Boolean reload )
	{
		this.reload = reload;
	}
	@Override
	public String toString()
	{
		return "DueDateInput [vendorShipTimeIds=" + vendorShipTimeIds + ", store=" + store + ", reload=" + reload
				+ ", ping=" + ping + "]";
	}
	public Boolean getPing()
	{
		return ping;
	}
	public void setPing( Boolean ping )
	{
		this.ping = ping;
	}

}
