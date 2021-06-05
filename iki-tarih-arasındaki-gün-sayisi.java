public static void Tarih() {
		int gun = 0;
		int artik = 0 ;
		int[] ay = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		for(int i = 1900; i <= 2000 ; i++) {
			if(i%4==0) {
				if(i==1900)
					artik = artik;
				else artik ++;
			}
			for(int j=1; j<=12; j++) {					
				gun = (i-1900)*365 + ay[j-1] + artik;
				if(gun%7==6) {
					System.out.println("01." + j + "." + i);
					gun = 0;
					}
				}	
			
			}
	}
