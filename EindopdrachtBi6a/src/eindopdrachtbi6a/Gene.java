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
public class Gene implements Comparable<Gene>{
    private int geneID;
    private int taxID;
    private String productAccessionVersion;
    private String productName;
    
    public Gene(int gID, int tID, String pav, String pn){
        geneID = gID;
        taxID = tID;
        productAccessionVersion = pav;
        productName = pn;
    }
    
    @Override
    public int compareTo(Gene g) {
        if (this.geneID < g.geneID){
            return 1;
        }else {
            return -1;
        }
         
    }

    /**
     * @return the geneID
     */
    public int getGeneID() {
        return geneID;
    }

    /**
     * @param geneID the geneID to set
     */
    public void setGeneID(int geneID) {
        this.geneID = geneID;
    }

    /**
     * @return the taxID
     */
    public int getTaxID() {
        return taxID;
    }

    /**
     * @param taxID the taxID to set
     */
    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

    /**
     * @return the productAccessionVersion
     */
    public String getProductAccessionVersion() {
        return productAccessionVersion;
    }

    /**
     * @param productAccessionVersion the productAccessionVersion to set
     */
    public void setProductAccessionVersion(String productAccessionVersion) {
        this.productAccessionVersion = productAccessionVersion;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    
}
