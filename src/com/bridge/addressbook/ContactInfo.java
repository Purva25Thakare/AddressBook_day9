package com.bridge.addressbook;

public class ContactInfo {
	String firstname;
	String lastname;
	String address;
	int zip;
	int mobileNo;
	
	public ContactInfo(String fname,String lname,String add,int zip,int mbNo) {
		this.firstname=fname;
		this.lastname=lname;
		this.address=add;
		this.zip=zip;
		this.mobileNo=mbNo;
	}
		public String getfirstname() {
			return firstname;
			}
		public void setfirstname(String fname) {
			this.firstname=fname;
		}
		public String getlastname() {
			return lastname;
			}
		public void setlastname(String lname) {
			this.lastname=lname;
		}
		public String getaddress() {
			return address;
			}
		public void setaddress(String add) {
			this.address=add;
		}
		public int getzip() {
			return zip;
			}
		public void setzip(int zip) {
			this.zip = zip ;
		}
		public int getmobileNo() {
			return mobileNo;
			}
		public void setmobileNo(int mbNo) {
			this.mobileNo=mbNo;
		}

		@Override
			public String toString() {
	
		return ("firstname is" +firstname+ ", lastname is" +lastname+ ", address is" +address+ ", zip is" +zip+ ",Mobileno is" +mobileNo);
			}
				
}
