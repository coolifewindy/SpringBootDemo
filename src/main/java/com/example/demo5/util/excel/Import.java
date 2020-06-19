package com.example.demo5.util.excel;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Import {
    public static void main(String[] args) {
        Workbook wb = null;
        //文件如果时xlsl格式则需保存为xls格式
        String path = "D:/file1.xls";

        File file = new File(path);
        if (!file.exists()) {
            return;
        }
        try {
            wb = Workbook.getWorkbook(file);
        } catch (BiffException | IOException e) {
            e.printStackTrace();
        }
        try {
            //数据库连接
            Connection conn= DbProperty.getConnection();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Sheet[] shArr = wb.getSheets();
            if (shArr != null && shArr.length > 0) {
                Sheet sh=shArr[5];
                int rows = sh.getRows();// 得到所有的行


                String no ="";
                String name="";
                String namepy="";
                String sex="";
                String birthday="";
                String idCard="";
                String proname="";
                String classname="";
                int rowNum = 674;
                //rowNum恰好是最后一条数据的行编号
                for (int i = 0; i < rowNum; i++) {
                    //getCell(x,y)x:列，y:行
                    //x从0开始则说明从excel的第1行开始
                    //y从0即上面的i从0开始则从excel的第一列A开始


                    no= sh.getCell(0,i).getContents();
                    name = sh.getCell(1,i).getContents();
                    namepy =sh.getCell(2,i).getContents();
                    sex = sh.getCell(3,i).getContents();
                    birthday = sh.getCell(4,i).getContents();
                    idCard = sh.getCell(5,i).getContents();
                    proname =  sh.getCell(6,i).getContents();
                    classname = sh.getCell(7,i).getContents();


                    // ryzh = Long.valueOf(sh.getCell(0,i).getContents());


                    saveStudentInfo(conn,no,name,namepy,sex,birthday,idCard,proname,classname);
                }

                System.out.println("Clone Success!");
            }


            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void saveStudentInfo(Connection conn,String no, String name, String namepy, String sex, String birthday, String idCard, String proname, String classname) {
    String sql="INSERT into t_studentinfo(stu_no,stu_name,stu_name_py,stu_sex,stu_birthday,stu_idcard,stu_proname,stu_classname)values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            ps.setString(1, no);
            ps.setString(2, name);
            ps.setString(3, namepy);
            ps.setString(4, sex);
            ps.setString(5, birthday);
            ps.setString(6, idCard);
            ps.setString(7, proname);
            ps.setString(8, classname);
           /* ps.setDate(1, new java.sql.Date(new Date().getTime()));
            ps.setLong(2, 0L);*/

            ps.execute();
            conn.commit();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
