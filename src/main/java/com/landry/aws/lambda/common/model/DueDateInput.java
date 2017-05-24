package com.landry.aws.lambda.common.model;

import java.util.List;

public class DueDateInput
{
	private List<Integer> vendorShipTimeIds;
	private String store;
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
	@Override
	public String toString()
	{
		return "DueDateInput [vendorShipTimeIds=" + vendorShipTimeIds + ", store=" + store + "]";
	}

}
