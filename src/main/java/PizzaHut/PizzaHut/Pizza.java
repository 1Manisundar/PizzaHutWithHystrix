package PizzaHut.PizzaHut;

public class Pizza {
	private String pizzaType;
	private String pizzaName;
	
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaType=" + pizzaType + ", pizzaName=" + pizzaName + "]";
	}
	public Pizza(String pizzaType, String pizzaName) {
		super();
		this.pizzaType = pizzaType;
		this.pizzaName = pizzaName;
	}
	
}
