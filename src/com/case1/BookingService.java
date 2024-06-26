package com.case1;


//開發一個服務來預訂酒店與航班
//我們希望這兩個任務可以並行	（同時處理）
//當任務都完成後給用戶一個確認消息
public class BookingService {
	
	//模擬預訂酒店操作
	public String bookHotel() throws InterruptedException {
		
		Thread.sleep(2000); //模擬耗時操作
		return "Hotel 預訂成功";
		
	}
	
	//模擬預訂航班操作
	public String bookFilgth() throws InterruptedException {
			
		Thread.sleep(3000); //模擬耗時操作
		return "Filgth 預訂成功";
			
	}
	
	//依序預訂酒店與航班（單工模式）
	public void bookTrip() throws InterruptedException {
		long start = System.currentTimeMillis();
		
		//預定酒店
		String hotelBooking = bookHotel();
		System.out.println(hotelBooking);
		
		//預定航班
		String flightBooking = bookFilgth();
		System.out.println(flightBooking);
		
		
		long end = System.currentTimeMillis();
		System.out.printf("Total time: %d ms", (end - start));
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		new BookingService().bookTrip();
	}

}
