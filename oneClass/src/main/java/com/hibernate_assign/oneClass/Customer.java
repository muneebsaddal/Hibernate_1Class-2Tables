package com.hibernate_assign.oneClass;

import javax.persistence.*;

@Entity
@SecondaryTable(name="CustomerDetail")
public class Customer {
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", creditScore=" + creditScore + ", rewardPoints=" + rewardPoints + "]";
	}
	@Id
    private int customerId;
	private String customerName;
    @Column(table="CustomerDetail")
    private String customerAddress;
    @Column(table="CustomerDetail")
    private int creditScore;
    @Column(table="CustomerDetail")
    private int rewardPoints;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
}
