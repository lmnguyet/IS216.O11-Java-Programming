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

/**
 *
 * @author minh
 */
public class HoaDon  {
   private int mAHOADON;
   private int mADOCGIA;
   private int tIENTHU;
   private Date nGAYTHU;
   
   public HoaDon(){
       
   }
   public HoaDon(int mAHOADON,int mADOCGIA,int tIENTHU, Date nGAYTHU ){
       this.mAHOADON=mAHOADON;
       this.mADOCGIA=mADOCGIA;
       this.tIENTHU=tIENTHU;
       this.nGAYTHU=nGAYTHU;
   }
   public int getmAHOADON(){
       return mAHOADON;
   }
   public void setmAHOADON(int mAHOADON){
       this.mAHOADON=mAHOADON;
   }
   public int getmADOCGIA(){
       return mADOCGIA;
   }
   public void setmADOCGIA(int mADOCGIA){
       this.mADOCGIA=mADOCGIA;
   }
   public int gettIENTHU(){
       return tIENTHU;
   }
   public void settIENTHU(int tIENTHU){
       this.tIENTHU=tIENTHU;
   }
   public Date getnGAYTHU(){
       return nGAYTHU;
   }
   public void setnGAYTHU(Date nGAYTHU){
       this.nGAYTHU=nGAYTHU;
   }
}

