 /*
        ATM programı
        bakiye 1000
        işlemler
            1 bakiye öğrenme
            2 para çekme
            3 para yatırma
    
     */
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. işlem: Bakiye öğrenme" + 
                          "2. işlem: Para çekme" +
                          "3. işlem: Para yatırma";
        System.out.println("İşlem seçiniz: ");
        String islem = scanner.nextLine();
        
        if(islem.equals("q")){
            System.out.println("programdan çıkılıyor...");
        }
        else if (islem.equals("1")){
              System.out.println("Bakiyeniz : " + bakiye);
        }
        else if (islem.equals("2")){
            System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0) {
                    
                    System.out.println("Yeterli Bakiye Yok . Bakiyeniz : " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }
        }                   
        else if (islem.equals("3")){
            System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz  : " + bakiye);
                
        }
        else 
            System.out.println("Geçersiz işlem. Lütfen tekrar deneyin...");
    }
    
}
