/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Admin
 */
public class ThongKeDG {
    private int mADOCGIA;
    private String tENDOCGIA;
    private int tONGSLSACHMUON;
    private int tONGTIENPHAT;
    public ThongKeDG(){
        
    }
    public ThongKeDG(int mADOCGIA,String tENDOCGIA,int tONGSLSACHMUON,int tONGTIENPHAT){
        this.mADOCGIA=mADOCGIA;
        this.tENDOCGIA=tENDOCGIA;
        this.tONGSLSACHMUON=tONGSLSACHMUON;
        this.tONGTIENPHAT=tONGTIENPHAT;
    }
    public int getmADOCGIA(){
        return mADOCGIA;
    }
    public void setmADOCGIA(int mADOCGIA){
        this.mADOCGIA=mADOCGIA;
    }
    public String gettENDOCGIA(){
        return tENDOCGIA;
    }
    public void settENDOCGIA(String tENDOCGIA){
        this.tENDOCGIA=tENDOCGIA;
    }
    public int gettONGSLSACHMUON(){
        return tONGSLSACHMUON;
    }
    public void settONGSLSACHMUON(int tONGSLSACHMUON){
        this.tONGSLSACHMUON=tONGSLSACHMUON;
    }
    public int gettONGTIENPHAT(){
        return tONGTIENPHAT;
    }
    public void settONGTIENPHAT(int tONGTIENPHAT){
        this.tONGTIENPHAT=tONGTIENPHAT;
    }
    
}
