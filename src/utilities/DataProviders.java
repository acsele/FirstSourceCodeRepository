package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	
	public static final String DP_RestaurantData = "dpforRestaurant";
	
	@DataProvider(name=DP_RestaurantData)
	public Object[][] dataforrestaurant() throws Exception{
		
		Object[][] params = ReadExcelData.ReadExcelData("E:\\DataProvider002.xlsx", 7);
		
		return params;
	}
	

}
