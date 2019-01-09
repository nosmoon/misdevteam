/***************************************************************************************************
 * 파일명 : CO_DECID_1000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.co.decid.dao;

import java.sql.*;

import oracle.sql.*;
import oracle.jdbc.*;

import java.io.*;


import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.co.decid.dm.*;
import chosun.ciis.co.decid.ds.*;

/**
 * 
 */
public class CO_DECID_1000DAO {
	
	public CO_DECID_1000_IDataSet getCo_decid_1000(CO_DECID_1000_IDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_DECID_1000_IDataSet ds = (CO_DECID_1000_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.getErrcode())) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        return ds;
    }
	
    public BaseDataSet getCo_decid_1001(CO_DECID_1001_UDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        BaseDataSet ds = (BaseDataSet) manager.executeCall(dm);
        if (!"".equals(ds.getErrcode())) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        return ds;
    }
    
    public CO_DECID_2000_IDataSet getCo_decid_2000(CO_DECID_2000_IDM dm) throws AppException, SQLException {

    	DBManager manager 	= null;
        String tempSeq		= "";
        String stroccr_dt	= "";
        String strseq		= "";
        String[] tmpArr		= null;
        byte[] tempCont;
        CO_DECID_2000_IDataSet ds	= null;
        
        System.out.println("DAO.getCo_decid_2000.1");

        try {
        	tmpArr 		= dm.decid_key.split("-");
        	System.out.println("DAO.tmpArr.length=" + tmpArr.length);
        	stroccr_dt 	= tmpArr[2];
        	strseq		= tmpArr[3];
        	//System.out.println("DAO.getCo_decid_2000.2");
        	manager 	= new DBManager("MISCOM");
        	
        	System.out.println("DAO.getCo_decid_2000.2");
        	
            manager.getConnection();
            manager.m_conn.setAutoCommit(false);
         
            CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
         
            // 파라미터 설정
            cstmt.registerOutParameter(1, 	Types.VARCHAR);
    		cstmt.registerOutParameter(2, 	Types.VARCHAR);
    		cstmt.setString(3,				dm.cmpy_cd);
    		cstmt.setString(4, 				dm.decid_key);
            cstmt.setBytes(5, 				"1010".getBytes());
            cstmt.setString(6, 				dm.add_file_nm);
            cstmt.setString(7, 				dm.incmg_pers_ipaddr);
            cstmt.setString(8, 				dm.incmg_pers);
            cstmt.registerOutParameter(9, 	Types.VARCHAR);
            
            // 실행
            cstmt.execute();

            // 결과
            ds = (CO_DECID_2000_IDataSet)dm.createDataSetObject();               
            
            ds.getValues(cstmt);
            
            if(!"".equals(ds.errcode)){
                throw new AppException(ds.errcode, ds.errmsg);
            }
        	
         // BLOB 구하기
           	Statement stmt = manager.m_conn.createStatement();
           
           	//첫번째 첨부파일
           	if(dm.add_file != null && dm.add_file.length != 0){
               	String blobQuery1 =	"SELECT ADD_FILE " +
	               					"  FROM TACOM_DECIDJOINFILE " +
	               					" WHERE CMPY_CD     = '" + dm.cmpy_cd + "' " +
	               					"   AND OCCR_DT  	= '" + stroccr_dt + "' " +
	               					"   AND SEQ 	   	= '" + strseq + "' " +
	               					"   AND SUBSEQ     	= '" + ds.subseq + "' " +
	               					"FOR UPDATE";
               	
               	System.out.println("blobQuery1=" + blobQuery1);
               	
               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	               	
               	if (rset1.next()) {    
//                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
//                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
          	   		//레진용(ep1)
          	   		oracle.sql.BLOB oracle_blob1 = (BLOB)rset1.getBlob(1);	 
                   
                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();
                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                   for(int i=0; i<dm.add_file.length; i++){
                       os1.write(dm.add_file[i]);
                   }
                   os1.close();
               	}
           	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	/*
        	tempCont	= dm.add_file;
        	stroccr_dt	= dm.decid_key.substring(0,8);
        	strseq		= dm.decid_key.substring(9,dm.decid_key.length());
        	
        	System.out.println("1...1....0");
        	ds = (CO_DECID_2000_IDataSet) manager.executeCall(dm);
        	
        	System.out.println("1...1....0...0");
        	
            System.out.println("1...3");
            if(!"".equals(ds.getErrcode())){
            	System.out.println(ds.getErrcode());
            	System.out.println(ds.getErrmsg());
                throw new AppException(ds.getErrcode(), ds.getErrmsg());
            }
          
            System.out.println("1...4");
         // 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
            tempSeq = ds.getSubseq();
            // BLOB 구하기
            System.out.println("tempSeq=" + tempSeq);
            Statement stmt = manager.m_conn.createStatement();
            String blobQuery = "SELECT ADD_FILE FROM TACOM_DECIDJOINFILE WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND OCCR_DT = '" +  stroccr_dt + "' AND SEQ = '" + strseq + "' AND SUBSEQ = '" + tempSeq + "' FOR UPDATE ";

            System.out.println("blobQuery=" + blobQuery);
            System.out.println("1...5");
            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
            if(rset.next()) {
                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
                OutputStream os  = oracle_blob.getBinaryOutputStream();
               // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                for(int i=0; i<tempCont.length; i++){
                    os.write(tempCont[i]);
                }
                os.close();
            }
            stmt.close();
*/
			manager.m_conn.commit();
			manager.m_conn.setAutoCommit(true);               	
           	stmt.close();
            manager.disConnection();
            return ds;
            
        } catch (Exception e) {
        	try{
     		   	manager.m_conn.rollback();
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   	manager.disConnection();
     	   	throw new SysException(e);
        }
        	
        	
        	
        	
        	
        	
        	
 
        /*
        BaseDataSet ds = (BaseDataSet) manager.executeCall(dm);
        if (!"".equals(ds.getErrcode())) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        */
    }
    
    public CO_DECID_2001_LDataSet getCo_decid_2001(CO_DECID_2001_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_DECID_2001_LDataSet ds = (CO_DECID_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.getErrcode())) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        return ds;
    }
}
