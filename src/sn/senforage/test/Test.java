package sn.senforage.test;

import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Village;

public class Test {
    public static void main(String[] args) {
        IVillage villagedao = new VillageImpl();
        Village village = new Village();

        village.setNomVillage("Fouta");

        int ok = villagedao.add(village);
    }
}
