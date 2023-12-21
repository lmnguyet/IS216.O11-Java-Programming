/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import java.sql.*;
import Objects.HoaDon;
import java.util.List;
import Objects.HoaDon;
import java.util.ArrayList;


public class HoaDonDAO {

    public static Connection conn = Connect.getConnect();
    public static List<Integer> getlistmADOCGIA(){
        List<Integer> list=new ArrayList<>();
        String sql="select MADOCGIA from DOCGIA";
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 list.add(rs.getInt("MADOCGIA"));
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        return list;
    }

    public static void ThemHoaDon(HoaDon hd) {
        String sql="{call THEMHOADON(?, ?)}";
        try (CallableStatement stmt = conn.prepareCall(sql);) {
                stmt.setInt(1,hd.getmADOCGIA());
                stmt.setInt(2, hd.gettIENTHU());
                stmt.execute();
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
    }
   
    public static boolean KIEMTRA(HoaDon hd){
        String sql ="SELECT TIENNO FROM DOCGIA WHERE MADOCGIA=?";
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
                
                stm.setInt(1,hd.getmADOCGIA());
                ResultSet rs = stm.executeQuery();
                if(rs.next()){
                    int tIENNO = rs.getInt("TIENNO");
                    if(tIENNO>0&&tIENNO>=hd.gettIENTHU()) return true;
                }
                return false;
                    
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }

    }
    public static List<HoaDon> getlistHOADON(){
        String sql="select* from HOADON";
        List<HoaDon> list=new ArrayList<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 HoaDon A=new HoaDon();
                 A.setmAHOADON(rs.getInt("MAHD"));
                 A.setmADOCGIA(rs.getInt("MADOCGIA"));
                 A.settIENTHU(rs.getInt("TIENTHU"));
                 list.add(A);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        return list;
        
    }
}
