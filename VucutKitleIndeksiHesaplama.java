   public static void main(String[] args) {
        System.out.println("***** Beden Kitle İndeksinizi Ölçmeye Hoş Geldiniz *****");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz... : ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu giriniz (ornek: 1.67)...: ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / ( boy * boy );
        
        System.out.println("Beden kitle indeksiniz: " + bki + "dir...");
        if (bki < 18)
            System.out.println("Zayıfsınız... ");
        else if (bki < 25)
            System.out.println("Nomal kilolusunuz...");
        else if (bki < 40)
            System.out.println("Üzgünüz fazla kilolusunuz...");
        else if (bki > 40)
            System.out.println("Aşırı kilolusunuz...");
        else 
            System.out.println("sonucun 12 ile 40+  arası bir değer olması gerekiyor. Yanlış tuşlama yaptınız... ");
         
        System.out.println("..... Sağlıklı günler dileriz .....");
        
    }
