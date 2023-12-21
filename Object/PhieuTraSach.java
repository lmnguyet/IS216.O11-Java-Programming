/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Admin
 */
import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author minh
 */
public class PhieuTraSach {
    private int  mAPHIEUTRA,mAPHIEUMUON,sONGAYTRATRE, tIENPHATKINAY;
    private Date nGAYTRA;

    
    public PhieuTraSach() {
    }

    public PhieuTraSach(int mAPHIEUMUON, Date nGAYTRA, int mAPHIEUTRA,int sONGAYTRATRE,int tIENPHATKINAY ) {
        this.mAPHIEUTRA=mAPHIEUTRA;
        this.mAPHIEUMUON=mAPHIEUMUON;
        this.nGAYTRA = nGAYTRA;
        this.sONGAYTRATRE=sONGAYTRATRE;
        this.tIENPHATKINAY=tIENPHATKINAY;
    }
    
    public int getmAPHIEUMUON(){
        return mAPHIEUMUON;
    }
    public void setmAPHIEUMUON(int maPHIEUMUON){
        this.mAPHIEUMUON=maPHIEUMUON;
    }
    public int getmAPHIEUTRA(){
        return mAPHIEUTRA;
    }
    public void setmAPHIEUTRA(int mAPHIEUTRA){
        this.mAPHIEUTRA=mAPHIEUTRA;
    }
    public int getsONGAYTRATRE(){
        return sONGAYTRATRE;
    }
    public void setsONGAYTRATRE(int sONGAYTRATRE){
        this.sONGAYTRATRE=sONGAYTRATRE;
    }
    public int gettIENPHATKINAY(){
        return tIENPHATKINAY;
    }
    public void settIENPHATKINAY(int tIENPHATKINAY){
        this.tIENPHATKINAY=tIENPHATKINAY;
    }
    public Date getnGAYTRA() {
        return nGAYTRA;
    }

    public void setnGAYTRA(Date nGAYTRA) {
        this.nGAYTRA = nGAYTRA;
    }
}


