/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Admin
 */
public class ChiTietTraSach {
    private int mADAUSACH;
    private int mAPHIEUTRA;
    private int tIENPHAT;
    
    public ChiTietTraSach(){
        
    }
    public ChiTietTraSach(int mADAUSACH,int mAPHIEUTRA, int tIENPHAT){
        this.mADAUSACH=mADAUSACH;
        this.mAPHIEUTRA=mAPHIEUTRA;
        this.tIENPHAT=tIENPHAT;
    }
    
    public int getmADAUSACH(){
        return mADAUSACH;
       
    }
    public void setmADAUSACH(int mADAUSACH){
        this.mADAUSACH=mADAUSACH;
    }
    public int getmAPHIEUTRA(){
        return mAPHIEUTRA;
    }
    public void setmAPHIEUTRA(int mAPHIEUTRA){
        this.mAPHIEUTRA=mAPHIEUTRA;
    }
    public int gettIENPHAT(){
        return tIENPHAT;
    }
    public void settIENPHAT(int tIENPHAT){
        this.tIENPHAT=tIENPHAT;
    }
}
