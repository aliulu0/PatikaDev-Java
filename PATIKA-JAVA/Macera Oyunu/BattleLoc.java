package com.company;

import java.util.Locale;
import java.util.Random;

public abstract class BattleLoc extends Location {
    private Monster monster;
    private Awards award;
    private int maxMonster;
    private String description;

    public BattleLoc(Player player,int id, String name, Monster monster, Awards award, int maxMonster,String description) {
        super(player,id,name,description);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
        this.description = description;
    }

    @Override
    public boolean onLocation() {

        int monsterNum = this.randomMonsterNum();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol ! Burada " + monsterNum + " adet " + this.getMonster().getName() + " var !");
        System.out.print("Savaşmak istiyor musun? y/n? : ");
        String selectCase = input.nextLine().toLowerCase();
        if(selectCase.equals("y")){
            boolean combat =combat(monsterNum);
            if(combat == false && this.getPlayer().getHealth()>0) {
                return true;
            }
            if(combat == false && this.getPlayer().getHealth()<=0) {
                return false;
            }
            System.out.println(this.getName() +  " -> buradaki tüm düşmanları öldürdünüz !!");
            System.out.println(this.getAward().getName() + " ödülünü kazandınız");
            if(this.getMonster().getAward().getName() == "Para") {
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getCoin());
                System.out.println("Para miktarınız : " + this.getPlayer().getCoin());

            }
            if(this.getAward().getName() != "Para") {
                this.getPlayer().getInventory().inventoryBag(this.getAward().getName());
            }else {
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getCoin());
                System.out.println("Para miktarınız : " + this.getPlayer().getCoin());
            }

            System.out.println("Envanteriler : ");
            for(int j = 0 ; j <Inventory.inventoryBag.length ; j++) {
                System.out.print(Inventory.inventoryBag[j] + " ");
            }

            return true;

        }else if(!(selectCase.equals("y") || selectCase.equals("n"))){
            return true;
        }else if(selectCase.equals("n")) {
            return true;
        }


        if(this.getPlayer().getHealth()<=0) {

            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber) {
        int start = randomStart();
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats(i);
            System.out.println("------------------------------------------------------------------ \n");

            if (start == 0) {
                while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                    System.out.println();
                    System.out.println("\n" + this.getMonster().getName() + " vurdu\n");

                    int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmor().getBlock();
                    if (monsterDamage < 0) {
                        monsterDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                    afterHit(i);
                    if (this.getPlayer().getHealth() > 0) {
                        if (this.getMonster().getHealth() > 0) {
                            System.out.println("\n 1 - Vur \n 2 - Kaç  \n!! GİRİLEN DEĞER YANLIŞ OLURSA KAÇMIŞ SAYILACAKSIN !! ");
                            int selectCase = input.nextInt();
                            if (selectCase == 1) {
                                System.out.println("Siz Vurdunuz\n");
                                this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                                afterHit(i);
                            } else if (selectCase != 1 && selectCase != 2) {
                                return false;
                            } else if (selectCase == 2) {
                                return false;
                            }
                        } else {
                            System.out.println("Düşmanı yendiniz !");
                            System.out.println(this.getMonster().getCoin() + " " + this.getMonster().getAward().getName() + " kazandınız");
                            if (this.getMonster().getAward().getName() == "Para") {
                                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getCoin());
                                System.out.println("Para miktarınız : " + this.getPlayer().getCoin());
                            }

                        }
                    } else {
                        System.out.print("Öldünüz.");
                        return false;
                    }

                }

            } else if (start == 1) {
                while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                    System.out.println();

                    if (this.getPlayer().getHealth() > 0) {
                        System.out.println("\n 1 - Vur \n 2 - Kaç  \n!! GİRİLEN DEĞER YANLIŞ OLURSA KAÇMIŞ SAYILACAKSIN !! ");
                        int selectCase = input.nextInt();

                        if (selectCase == 1) {
                            System.out.println("Siz Vurdunuz\n");
                            this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit(i);
                            if (this.getMonster().getHealth() > 0) {
                                System.out.println("\n" + this.getMonster().getName() + " vurdu\n");
                                int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmor().getBlock();
                                if (monsterDamage < 0) {
                                    monsterDamage = 0;
                                }
                                this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                                afterHit(i);
                                if (this.getPlayer().getHealth() <= 0) {
                                    System.out.print("Öldünüz");
                                    return false;
                                }
                            } else {
                                System.out.println("Düşmanı yendiniz !");
                                System.out.println(this.getMonster().getCoin() + " " + this.getMonster().getAward().getName() + " kazandınız");
                                if (this.getMonster().getAward().getName() == "Para") {
                                    this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getCoin());
                                    System.out.println("Para miktarınız : " + this.getPlayer().getCoin());
                                }

                            }
                        } else if (selectCase != 1 && selectCase != 2) {
                            return false;
                        } else if (selectCase == 2) {
                            return false;
                        }
                    } else {
                        System.out.print("Öldünüz.");
                        return false;
                    }

                }

            }
        }

        if (this.getPlayer().getHealth() > 0) {
            return true;
        }

        System.out.println("------------------------------------------------------------------ \n");
        return false;
    }

    public boolean escape() {
        return true;
    }

    public void afterHit(int i) {
        System.out.println("------Oyuncu Değerleri-------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getCoin());
        System.out.println("Zırh : " + this.getPlayer().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getArmor().getBlock());
        System.out.println("Envanteriler : ");
        for (int j = 0; j < Inventory.inventoryBag.length; j++) {
            System.out.print(Inventory.inventoryBag[j] + " ");
        }
        System.out.println();
        System.out.println("------" + i + ". " + this.getMonster().getName() + " Değerleri-------");
        System.out.println("Sağlık : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Ödül : " + this.getMonster().getAward().getName());
    }

    public void playerStats() {
        System.out.println("------Oyuncu Değerleri-------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getCoin());
        System.out.println("Zırh : " + this.getPlayer().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getArmor().getBlock());
        System.out.println("Envanteriler : ");
        for (int j = 0; j < Inventory.inventoryBag.length; j++) {
            System.out.print(Inventory.inventoryBag[j] + " ");
        }
        System.out.println();
    }

    public void monsterStats(int i) {
        System.out.println("------" + i + ". " + this.getMonster().getName() + " Değerleri-------");
        System.out.println("Sağlık : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Ödül : " + this.getMonster().getAward().getName());

    }


    public int randomStart(){
        Random rnd = new Random();
        return rnd.nextInt(2);
    }

    private void afterHit() {
        System.out.println("Canınız : "+this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName()+" Canı : "+this.getMonster().getHealth());
        System.out.println();
    }


    public int randomMonsterNum(){
        Random random = new Random();
        return random.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Awards getAward() {
        return award;
    }

    public void setAward(Awards award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
