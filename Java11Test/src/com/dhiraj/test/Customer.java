package com.dhiraj.test;
// Customer details 
public class Customer {
    private int cid;
    private String cname;
    protected String email;
    public String city;
    private long name;
    private int pincode;
    private String state;
    private String country;
    public int getCid() {
		return cid;
	}
     public void setCid(int cid) {
		this.cid = cid;
	}
     public void setEmail(String email) {
		this.email = email;
	}
     public int getPincode() {
		return pincode;
	}
     public void setPincode(int pincode) {
		this.pincode = pincode;
	}
     
     public void setCity(String city) {
		this.city = city;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getName() {
		return name;
	}
	public void setName(long name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}

	public Customer getAllCustomer() {
        int[] array= new int[10];
		for (int i = 0; i < 12; i++) {
			System.out.println(array[i]);
		}
		Customer cust= new Customer();
        System.out.println(cust.getCid());
        System.out.println(cust.getEmail());
        System.out.println(cust.getCname());
		return cust;
	}
}




