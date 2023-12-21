/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Objects.ThongKeSach;
import Objects.ThongKeDG;
import DAO.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author Admin
 */
public class DuLieuThongKe {
    public static Connection conn = Connect.getConnect();
    public static List<ThongKeSach> getListThongKeSach(int month,int year){
        
        String sql ="""
                    SELECT DAUSACH.MADAUSACH,DAUSACH.TENDAUSACH,COUNT(PHIEUMUONSACH.MAPHIEUMUONSACH) AS SOLUOTMUON
                    FROM   DAUSACH
                    LEFT JOIN CTMS ON DAUSACH.MADAUSACH = CTMS.MADAUSACH
                    LEFT JOIN PHIEUMUONSACH ON CTMS.MAPHIEUMUONSACH = PHIEUMUONSACH.MAPHIEUMUONSACH
                    WHERE  MONTH(PHIEUMUONSACH.NGAYMUON) = ? AND YEAR(PHIEUMUONSACH.NGAYMUON) = ?
                    GROUP BY    DAUSACH.MADAUSACH, DAUSACH.TENDAUSACH
                    ORDER BY    SOLUOTMUON DESC""";
        List<ThongKeSach> list = new ArrayList<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, month);
            stm.setInt(2, year);
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 ThongKeSach A=new ThongKeSach();
                 A.setmADS(rs.getInt("MADAUSACH"));
                 A.settENDS(rs.getString("TENDAUSACH"));
                 A.setsOLUOTMUON(rs.getInt("SOLUOTMUON"));
                 list.add(A);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        return list;
    }
    public static List<ThongKeDG> getListThongKeDG(int month,int year){
        List<ThongKeDG> list=new ArrayList<>();
        String sql="""
                   SELECT  DOCGIA.MADOCGIA, DOCGIA.HOTEN, SUM(ISNULL(PHIEUMUONSACH.TONGSL, 0)) AS TONGSLSACHMUON,
                       SUM(ISNULL(PHIEUTRASACH.TIENPHATKINAY, 0)) AS TONGTIENPHAT
                   FROM  DOCGIA
                   LEFT JOIN PHIEUMUONSACH ON DOCGIA.MADOCGIA = PHIEUMUONSACH.MADOCGIA
                   LEFT JOIN PHIEUTRASACH ON PHIEUMUONSACH.MAPHIEUMUONSACH = PHIEUTRASACH.MAPHIEUMUONSACH
                   WHERE MONTH(PHIEUMUONSACH.NGAYMUON) = ? AND YEAR(PHIEUMUONSACH.NGAYMUON) = ?
                   GROUP BY  DOCGIA.MADOCGIA, DOCGIA.HOTEN
                   ORDER BY  TONGSLSACHMUON DESC""";
        
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, month);
            stm.setInt(2, year);
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 ThongKeDG A=new ThongKeDG();
                 A.setmADOCGIA(rs.getInt("MADOCGIA"));
                 A.settENDOCGIA(rs.getString("HOTEN"));
                 A.settONGSLSACHMUON(rs.getInt("TONGSLSACHMUON"));
                 A.settONGTIENPHAT(rs.getInt("TONGTIENPHAT"));
                 list.add(A);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return list;
        
    }
    
        
    
}
