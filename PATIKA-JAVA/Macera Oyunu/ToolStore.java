package com.company;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player,2,"Eşya Dükkkanı","Silah ve zırh satın alabilirsiniz ");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Eşya Dükkkanına Hoşgeldiniz !");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3){
                System.out.print("Geçersiz değer girdiniz. Lütfen tekrar giriniz : ");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Güle Güle ! ");
                    showMenu = false;
                    return true;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("----- Silahlar -----");
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId()+" - "+w.getName()+"\t < Para : "+w.getCoin()+", Hasar: "+w.getDamage()+" >");
        }
        System.out.println("0 - Çıkış");
    }
    public void buyWeapon(){
        System.out.print("Silah seçiniz : ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Geçersiz değer girdiniz. Lütfen tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null){
                if (selectedWeapon.getCoin() > this.getPlayer().getCoin()){
                    System.out.println("Yeterli bakiye bulunmamaktadır.");
                }
                else{
                    System.out.println(selectedWeapon.getName()+" silahını satın aldınız !");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getCoin();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Kalan paranız : "+this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }

    }
    public void printArmor(){
        System.out.println("----- Zırhlar -----");
        for (Armor a: Armor.armors()){
            System.out.println(a.getId()+" - "+a.getName()+"\t < Para : "+a.getCoin()+", Engelleme : "+a.getBlock()+" >");
        }
        System.out.println("0 - Çıkış");
    }
    public void buyArmor(){
        System.out.print("Zırh seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("Geçersiz değer girdiniz. Lütfen tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
            if (selectedArmor != null){
                if (selectedArmor.getCoin() > this.getPlayer().getCoin()){
                    System.out.println("Yeterli bakiye bulunmamaktadır.");
                }
                else{
                    System.out.println(selectedArmor.getName()+" Zırhı satın aldınız !");
                    int balance = this.getPlayer().getCoin() - selectedArmor.getCoin();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Kalan paranız : "+this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }

}
