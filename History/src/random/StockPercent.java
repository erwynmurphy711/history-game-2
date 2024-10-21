package random;

public class StockPercent {

	private double stockPercent;
	private boolean negative;
	
	
	public StockPercent(double stockPercent, boolean negative) {
		
		this.stockPercent = stockPercent;
		this.negative = negative;
		
	}
	
	public double getStockPercent() {
		
		return stockPercent;
	}
	
	public boolean getNegative() {
		
		return negative;
	}
	
	public void setStockPercent(double stockPercent) {
		
		this.stockPercent = stockPercent;
	}
	
	public void setNegative(boolean negative) {
		this.negative = negative;
	}
}
