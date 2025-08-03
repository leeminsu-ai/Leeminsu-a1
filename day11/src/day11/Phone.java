package day11;

public abstract class Phone {
	int number;
	char data;
	char color;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public Phone(int number,char data,char color){
		setColor(color);
		setNumber(number);
		setData(data);
	}
	
	abstract void show(int number,char color);
	
	abstract void sms();
	
}
