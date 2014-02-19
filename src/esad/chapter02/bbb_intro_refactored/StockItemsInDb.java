package esad.chapter02.bbb_intro_refactored;

public class StockItemsInDb {
	public StockItem[] findStockItemsWithCriteria(StockProvenance fromWhere, InventoryRange inventoryRange) { 
		// ...
		return new StockItem[100];
	}
	
	public StockItem[] findStockItemsToRestock() { 
		return findStockItemsWithCriteria(StockProvenance.OVERSEAS, new InventoryRange(0, 10));
	}
	
	
}
