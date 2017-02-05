/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdrachtbi6a;

/**
 *
 * @author Daan
 */
public class Interacties {
    private String naam;
    private int ID1;
    private int ID2;
    private String pubMed;
    
    public Interacties(String str, int id1, int id2, String pm){
        naam = str;
        ID1 = id1;
        ID2 = id2;
        pubMed = pm;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the ID1
     */
    public int getID1() {
        return ID1;
    }

    /**
     * @param ID1 the ID1 to set
     */
    public void setID1(int ID1) {
        this.ID1 = ID1;
    }

    /**
     * @return the ID2
     */
    public int getID2() {
        return ID2;
    }

    /**
     * @param ID2 the ID2 to set
     */
    public void setID2(int ID2) {
        this.ID2 = ID2;
    }

    /**
     * @return the pubMed
     */
    public String getPubMed() {
        return pubMed;
    }

    /**
     * @param pubMed the pubMed to set
     */
    public void setPubMed(String pubMed) {
        this.pubMed = pubMed;
    }
}
