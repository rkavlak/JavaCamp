package campHomework4.entities;

import campHomework4.abstracts.IEntity;

public class Game implements IEntity{
	private int id;
	private String name;
	private String gameType;
	private String detail;
	private double price;
	private double afterDiscount;
	
	public Game(int id, String name, String gameType, String detail, double price, double afterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.gameType = gameType;
		this.detail = detail;
		this.price = price;
		this.afterDiscount = afterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAfterDiscount() {
		return afterDiscount;
	}

	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	

	
}
