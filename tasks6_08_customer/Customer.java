package by.htp.tasks6_08_customer;

public class Customer {
	private int id;
	private String fio;
	private String address;
	private long cardNum;
	private long bankNum;
	
	public Customer(int id, String fio, String address, long cardNum, long bankNum) {
		this.id = id;
		this.fio = fio;
		this.address = address;
		this.cardNum = cardNum;
		this.bankNum = bankNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}

	public long getBankNum() {
		return bankNum;
	}

	public void setBankNum(long bankNum) {
		this.bankNum = bankNum;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fio=" + fio + ", address=" + address + ", cardNum=" + cardNum + ", bankNum="
				+ bankNum + "]";
	}
	
}
