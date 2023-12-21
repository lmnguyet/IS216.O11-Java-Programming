/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Admin
 */
public class ThongKeSach {
     private int mADS;
    private String tENDS;
    private int sOLUOTMUON;

    public ThongKeSach() {
    }

    public ThongKeSach(int mADS,String tENDS,int sOLUOTMUON) {
        this.mADS=mADS;
        this.tENDS=tENDS;
        this.sOLUOTMUON=sOLUOTMUON;
    }

    public int getmADS() {
        return mADS;
    }
    public void setmADS(int mADS){
        this.mADS=mADS;
    }
    public String gettENDS(){
        return tENDS;
    }
    public void settENDS(String tENDS){
        this.tENDS=tENDS;
    }
    public int getsOLUOTMUON(){
        return sOLUOTMUON;
    }
    public void setsOLUOTMUON(int sOLUOTMUON){
        this.sOLUOTMUON=sOLUOTMUON;
    }
    
}
