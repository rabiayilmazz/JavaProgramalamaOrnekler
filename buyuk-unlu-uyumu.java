public String BuyukUnluUyumu(String kelime) {
	        String[] Kalin = new String[]{"A", "I", "O", "U", "a", "ı", "o", "u"};
	        String[] Ince = new String[]{"E", "İ", "Ö", "Ü", "e", "i", "ö", "ü"};
	        String[] Harfler = new String[kelime.length()];
	        String sonuc = null;

	        int kalin = 0;
	        int ince = 0;

	        for (int i = 0; i < kelime.length(); i++) {
	            Harfler[i] = kelime.substring(i, i + 1);
	        }

	        for (String harf1 : Harfler) {
	            for (String harf2 : Kalin) {
	                if (harf1.equals(harf2)) {
	                    kalin++;
	                }
	            }
	            for (String harf3 : Ince) {
	                if (harf1.equals(harf3)) {
	                    ince++;
	                }
	            }
	        }
	        if(kalin+ince == 0) 
	        	sonuc = "Sesli harf içeren bir kelime giriniz.";
	        
	        else if (kalin+ince == 1) 
	        	sonuc = "Girilen sözcük tek hecelidir. büyük ünlü uyumu aranmaz.";
	        
	        else {
	        	if (kalin > 0 && ince > 0) 
	        		sonuc = "Girilen kelime büyük ünlü uyumuna uymaz.";
	        	
	        	else if (kalin > 0 && ince == 0)
	        		sonuc = "girilen kelime üyük ünlü uyumuna uyar.";
	        	
	        	else if (ince > 0 && kalin == 0) 
	        		sonuc = "Girilen kelime büyük ünlü uyumuna uyar.";
	        }
			return sonuc;
	    }

}
