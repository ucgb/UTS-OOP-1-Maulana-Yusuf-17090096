package service;


import java.util.*;
import entity.*;

public class Service {

    private static List<HP> data = new LinkedList<HP>();

    public void addData(HP ph) {
        data.add(ph);
        System.out.println("data telah tersimpan");
    }

    public void updateData(HP ph) {
        int index = data.indexOf(ph);
        if(index >= 0) {
            data.set(index, ph);
            System.out.println("data telah terubah");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new HP(id, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(HP hp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID PELANGGAN : " + hp.getId());
            System.out.println("  NAMA PELANGGAN : " + hp.getPelanggan());
            System.out.println("  MERK HP : " + hp.getMerk());
        }
    }

}