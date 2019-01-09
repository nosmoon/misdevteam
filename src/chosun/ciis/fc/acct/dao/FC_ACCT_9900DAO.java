/***************************************************************************************************
* 파일명 : FC_ACCT_9900DAO.java
* 기능 :  재무회계 - 자금관리 - 일일업무보고
 * 작성일자 : 2014.02.14
 * 작성자 :   김상훈
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.fc.acct.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB; 
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

import chosun.ciis.fc.acct.dm.FC_ACCT_9900_MDM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9910_LDM; 
import chosun.ciis.fc.acct.dm.FC_ACCT_9920_ADM; 
import chosun.ciis.fc.acct.dm.FC_ACCT_9930_LDM; 
import chosun.ciis.fc.acct.dm.FC_ACCT_9940_LDM; 
import chosun.ciis.fc.acct.dm.FC_ACCT_9931_SDM; 
import chosun.ciis.fc.acct.ds.FC_ACCT_9900_MDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9910_LDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9920_ADataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9930_LDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9940_LDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9931_SDataSet;
/**
 * 
 */
public class FC_ACCT_9900DAO {
	
	public FC_ACCT_9900_MDataSet fc_acct_9900_m(FC_ACCT_9900_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISFNC");
        FC_ACCT_9900_MDataSet ds 	= (FC_ACCT_9900_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	public FC_ACCT_9910_LDataSet fc_acct_9910_l(FC_ACCT_9910_LDM dm) throws AppException, SQLException {

        
        DBManager manager 			= new DBManager("MISFNC");
        FC_ACCT_9910_LDataSet ds 	= (FC_ACCT_9910_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
    public FC_ACCT_9920_ADataSet fc_acct_9920_a(FC_ACCT_9920_ADM dm) throws AppException, SQLException {
    	FC_ACCT_9920_ADataSet ds = null;
    	 // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	
    	
    	if((dm.add_file1 != null && dm.getFile_delyn1().equals("N") ||
	      		dm.add_file2 != null && dm.getFile_delyn2().equals("N") ||
	       		dm.add_file3 != null && dm.getFile_delyn3().equals("N") ||
	       		dm.add_file4 != null && dm.getFile_delyn4().equals("N") ||
	       		dm.add_file5 != null && dm.getFile_delyn5().equals("N") ||
	       		dm.add_file6 != null && dm.getFile_delyn6().equals("N") ||
	       		dm.add_file7 != null && dm.getFile_delyn7().equals("N") ||
	       		dm.add_file8 != null && dm.getFile_delyn8().equals("N") ||
	       		dm.add_file9 != null && dm.getFile_delyn9().equals("N") ||
	       		dm.add_file10 != null && dm.getFile_delyn10().equals("N")) &&
	      	   !dm.getFlag().equals("D") &&
	      	   !dm.getFlag().equals("F")){
    	       	  
//    	if((dm.add_file1 != null && dm.getFile_delyn1().equals("N") ) &&
//	      	   !dm.getFlag().equals("D")){
    		String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		String a_tempSeq6 = "";    // 첨부파일번호(임시)
    		String a_tempSeq7 = "";    // 첨부파일번호(임시)
    		String a_tempSeq8 = "";    // 첨부파일번호(임시)
    		String a_tempSeq9 = "";    // 첨부파일번호(임시)
    		String a_tempSeq10 = "";    // 첨부파일번호(임시)
    		
    		byte[] tempCont1;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont2;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont3;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont4;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont5;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont6;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont7;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont8;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont9;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont10;   	   // 첨부파일 내용(임시 )
		   
    		tempCont1 = dm.add_file1;
    		tempCont2 = dm.add_file2;
    		tempCont3 = dm.add_file3;
    		tempCont4 = dm.add_file4;
    		tempCont5 = dm.add_file5;
    		tempCont6 = dm.add_file6;
    		tempCont7 = dm.add_file7;
    		tempCont8 = dm.add_file8;
    		tempCont9 = dm.add_file9;
    		tempCont10 = dm.add_file10;
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISFNC");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
            
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.occr_dt);
        		cstmt.setString(5, dm.seq);
        		cstmt.setString(6, dm.dept_cd);
        		cstmt.setString(7, dm.dlco_clsf);
        		cstmt.setString(8, dm.dlco_no);
        		cstmt.setString(9, dm.chrg_pers);
        		cstmt.setString(10, dm.patr_chrg_pers);
        		cstmt.setString(11, dm.titl);
        		cstmt.setString(12, dm.cont);
        		cstmt.setString(13, dm.tag);
        		cstmt.setString(14, dm.team_chf_yn);
        		cstmt.setString(15, dm.incmg_pers);
        		cstmt.setString(16, dm.incmg_pers_ip);
        		cstmt.setString(17, dm.flag);
        		cstmt.setString(18, dm.add_file_no1);
        		cstmt.setString(19, dm.add_file_nm1);
        		cstmt.setBytes(20, "0101".getBytes());
        		cstmt.setString(21, dm.add_file_no2);
        		cstmt.setString(22, dm.add_file_nm2);
        		cstmt.setBytes(23, "0101".getBytes());
        		cstmt.setString(24, dm.add_file_no3);
        		cstmt.setString(25, dm.add_file_nm3);
        		cstmt.setBytes(26, "0101".getBytes());
        		cstmt.setString(27, dm.add_file_no4);
        		cstmt.setString(28, dm.add_file_nm4);
        		cstmt.setBytes(29, "0101".getBytes());
        		cstmt.setString(30, dm.add_file_no5);
        		cstmt.setString(31, dm.add_file_nm5);
        		cstmt.setBytes(32, "0101".getBytes());
        		cstmt.setString(33, dm.add_file_no6);
        		cstmt.setString(34, dm.add_file_nm6);
        		cstmt.setBytes(35, "0101".getBytes());
        		cstmt.setString(36, dm.add_file_no7);
        		cstmt.setString(37, dm.add_file_nm7);
        		cstmt.setBytes(38, "0101".getBytes());
        		cstmt.setString(39, dm.add_file_no8);
        		cstmt.setString(40, dm.add_file_nm8);
        		cstmt.setBytes(41, "0101".getBytes());
        		cstmt.setString(42, dm.add_file_no9);
        		cstmt.setString(43, dm.add_file_nm9);
        		cstmt.setBytes(44, "0101".getBytes());
        		cstmt.setString(45, dm.add_file_no10);
        		cstmt.setString(46, dm.add_file_nm10);
        		cstmt.setBytes(47, "0101".getBytes());
        		cstmt.setString(48, dm.file_delyn1);
        		cstmt.setString(49, dm.file_delyn2);
        		cstmt.setString(50, dm.file_delyn3);
        		cstmt.setString(51, dm.file_delyn4);
        		cstmt.setString(52, dm.file_delyn5);
        		cstmt.setString(53, dm.file_delyn6);
        		cstmt.setString(54, dm.file_delyn7);
        		cstmt.setString(55, dm.file_delyn8);
        		cstmt.setString(56, dm.file_delyn9);
        		cstmt.setString(57, dm.file_delyn10);
        		cstmt.registerOutParameter(58, Types.VARCHAR);
        		cstmt.registerOutParameter(59, Types.VARCHAR);
        		cstmt.registerOutParameter(60, Types.VARCHAR);
        		cstmt.registerOutParameter(61, Types.VARCHAR);
        		cstmt.registerOutParameter(62, Types.VARCHAR);
        		cstmt.registerOutParameter(63, Types.VARCHAR);
        		cstmt.registerOutParameter(64, Types.VARCHAR);
        		cstmt.registerOutParameter(65, Types.VARCHAR);
        		cstmt.registerOutParameter(66, Types.VARCHAR);
        		cstmt.registerOutParameter(67, Types.VARCHAR);
        		cstmt.registerOutParameter(68, Types.VARCHAR);
        		
        		// 실행
	    		cstmt.execute();
	    		
               // 결과
	    		ds = (FC_ACCT_9920_ADataSet)dm.createDataSetObject();               
	    		ds.getValues(cstmt);
	    		System.out.println( ds.errmsg);
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

               // 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
               //입력일 때
	    		if(dm.getFlag().equals("I")){
	    			c_temp = dm.getCmpy_cd();     	// 회사코드(임시)
	    			m_temp = dm.getOccr_dt();     	// 작성일자(임시)
	    			r_tempSeq = ds.getSeq();     // 보고번호(임시)
	    			a_tempSeq1= ds.getAdd_file_no1(); // 첨부파일번호(임시)
	    			a_tempSeq2= ds.getAdd_file_no2(); // 첨부파일번호(임시)
	    			a_tempSeq3= ds.getAdd_file_no3(); // 첨부파일번호(임시)
	    			a_tempSeq4= ds.getAdd_file_no4(); // 첨부파일번호(임시)
	    			a_tempSeq5= ds.getAdd_file_no5(); // 첨부파일번호(임시)
	    			a_tempSeq6= ds.getAdd_file_no6(); // 첨부파일번호(임시)
	    			a_tempSeq7= ds.getAdd_file_no7(); // 첨부파일번호(임시)
	    			a_tempSeq8= ds.getAdd_file_no8(); // 첨부파일번호(임시)
	    			a_tempSeq9= ds.getAdd_file_no9(); // 첨부파일번호(임시)
	    			a_tempSeq10= ds.getAdd_file_no10(); // 첨부파일번호(임시)
	    		}
	    		 //수정일 때
	    		else if(dm.getFlag().equals("U")){
	    			c_temp = dm.getCmpy_cd();     	// 회사코드(임시)
	    			m_temp = dm.getOccr_dt();     	// 보고구분(임시)
	    			r_tempSeq = dm.getSeq();     	// 작성일자(임시)
	    			if("".equals(dm.add_file_no1)){
	    				a_tempSeq1 = dm.getAdd_file_no1(); // 첨부파일번호(임시)
	    			}else{
	    				a_tempSeq1 = ds.getAdd_file_no1(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no2)){
	    				a_tempSeq2 = dm.getAdd_file_no2(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq2 = ds.getAdd_file_no2(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no3)){
	    				a_tempSeq3 = dm.getAdd_file_no3(); // 첨부파일번호(임시)	   
	    			}else{
                	  	a_tempSeq3 = ds.getAdd_file_no3(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no4)){
	    				a_tempSeq4 = dm.getAdd_file_no4(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq4 = ds.getAdd_file_no4(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no5)){
	    				a_tempSeq5 = dm.getAdd_file_no5(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq5 = ds.getAdd_file_no5(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no6)){
	    				a_tempSeq6 = dm.getAdd_file_no6(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq6 = ds.getAdd_file_no6(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no7)){
	    				a_tempSeq7 = dm.getAdd_file_no7(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq7 = ds.getAdd_file_no7(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no8)){
	    				a_tempSeq8 = dm.getAdd_file_no8(); // 첨부파일번호(임시)	   
	    			}else{
                	  	a_tempSeq8 = ds.getAdd_file_no8(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no9)){
	    				a_tempSeq9 = dm.getAdd_file_no9(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq9 = ds.getAdd_file_no9(); // 첨부파일번호(임시)
	    			}
	    			if("".equals(dm.add_file_no10)){
	    				a_tempSeq10 = dm.getAdd_file_no10(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq10 = ds.getAdd_file_no10(); // 첨부파일번호(임시)
	    			}
	    		}
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
            	
               	//첫번째 첨부파일
               	if(dm.add_file1 != null && dm.add_file1.length != 0){
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'W' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq1+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	
	               	System.out.println(blobQuery1);
	               	if (rset1.next()) {System.out.println("rset1.next");    
//	               	웹로직용
	                    //weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                    //BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	               	    
	          	   		//레진용(ep1)
	          	   		oracle.sql.BLOB oracle_blob1 = (BLOB)rset1.getBlob(1);		                   
	                    OutputStream os1 = oracle_blob1.getBinaryOutputStream();
	                    
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont1.length; i++){
	                       os1.write(tempCont1[i]);
	                   }
	                   os1.close();
	               	}
               	}
//              첫번째 첨부파일
               	if(dm.add_file2 != null && dm.add_file2.length != 0){
	               	String blobQuery2 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'W' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq2+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset2 = (OracleResultSet)stmt.executeQuery(blobQuery2);	
	               	System.out.println(blobQuery2);
	               	if (rset2.next()) { 
	               	   //웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob2 = (weblogic.jdbc.wrapper.Blob)rset2.getBlob(1);
	                   //BLOB oracle_blob2 = (BLOB)weblogic_blob2.getVendorObj();
	                   //레진용(ep1)
	          	  	   oracle.sql.BLOB oracle_blob2 = (BLOB)rset2.getBlob(1);	
	                   OutputStream os2 = oracle_blob2.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont2.length; i++){
	                       os2.write(tempCont2[i]);
	                   }
	                   os2.close();
	               	}
               	}
//              첫번째 첨부파일
               	if(dm.add_file3 != null && dm.add_file3.length != 0){
	               	String blobQuery3 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'W' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq3+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset3 = (OracleResultSet)stmt.executeQuery(blobQuery3);	
	               	System.out.println(blobQuery3);
	               	if (rset3.next()) {
//	               	웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob3 = (weblogic.jdbc.wrapper.Blob)rset3.getBlob(1);
	                   //BLOB oracle_blob3 = (BLOB)weblogic_blob3.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob3 = (BLOB)rset3.getBlob(1);	
	                   OutputStream os3 = oracle_blob3.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont3.length; i++){
	                       os3.write(tempCont3[i]);
	                   }
	                   os3.close();
	               	}
               	}//첫번째 첨부파일
               	if(dm.add_file4 != null && dm.add_file4.length != 0){
	               	String blobQuery4 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'W' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq4+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset4 = (OracleResultSet)stmt.executeQuery(blobQuery4);	
	               	System.out.println(blobQuery4);
	               	if (rset4.next()) {    
	               	  // 	웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob4 = (weblogic.jdbc.wrapper.Blob)rset4.getBlob(1);
	                   //BLOB oracle_blob4 = (BLOB)weblogic_blob4.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob4 = (BLOB)rset4.getBlob(1);	
	                   OutputStream os4 = oracle_blob4.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont4.length; i++){
	                       os4.write(tempCont4[i]);
	                   }
	                   os4.close();
	               	}
               	}//첫번째 첨부파일
               	if(dm.add_file5 != null && dm.add_file5.length != 0){
	               	String blobQuery5 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'W' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq5+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset5 = (OracleResultSet)stmt.executeQuery(blobQuery5);	
	               	System.out.println(blobQuery5);
	               	if (rset5.next()) {    
	                   //웹로직용
	               	   //weblogic.jdbc.wrapper.Blob weblogic_blob5 = (weblogic.jdbc.wrapper.Blob)rset5.getBlob(1);
	                   //BLOB oracle_blob5 = (BLOB)weblogic_blob5.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob5 = (BLOB)rset5.getBlob(1);	
	                   OutputStream os5 = oracle_blob5.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont5.length; i++){
	                       os5.write(tempCont5[i]);
	                   }
	                   os5.close();
	               	}
               	}
               	
//              첫번째 첨부파일
               	if(dm.add_file6 != null && dm.add_file6.length != 0){
	               	String blobQuery6 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'P' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq6+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset6 = (OracleResultSet)stmt.executeQuery(blobQuery6);	
	               	System.out.println(blobQuery6);
	               	if (rset6.next()) {    
//	               	웹로직용
	               	   //weblogic.jdbc.wrapper.Blob weblogic_blob6 = (weblogic.jdbc.wrapper.Blob)rset6.getBlob(1);
	                   //BLOB oracle_blob6 = (BLOB)weblogic_blob6.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob6 = (BLOB)rset6.getBlob(1);	
	                   OutputStream os6 = oracle_blob6.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont6.length; i++){
	                       os6.write(tempCont6[i]);
	                   }
	                   os6.close();
	               	}
               	}
               	
//              첫번째 첨부파일
               	if(dm.add_file7 != null && dm.add_file7.length != 0){
	               	String blobQuery7 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'P' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq7+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset7 = (OracleResultSet)stmt.executeQuery(blobQuery7);	
	               	System.out.println(blobQuery7);
	               	if (rset7.next()) { 
	               		//웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob7 = (weblogic.jdbc.wrapper.Blob)rset7.getBlob(1);
	                   //BLOB oracle_blob7 = (BLOB)weblogic_blob7.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob7 = (BLOB)rset7.getBlob(1);	
	                   OutputStream os7 = oracle_blob7.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont7.length; i++){
	                       os7.write(tempCont7[i]);
	                   }
	                   os7.close();
	               	}
               	}
               	
//              첫번째 첨부파일
               	if(dm.add_file8 != null && dm.add_file8.length != 0){
	               	String blobQuery8 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'P' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq8+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset8 = (OracleResultSet)stmt.executeQuery(blobQuery8);	
	               	System.out.println(blobQuery8);
	               	if (rset8.next()) {    
	               	   //웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob8 = (weblogic.jdbc.wrapper.Blob)rset8.getBlob(1);
	                   //BLOB oracle_blob8 = (BLOB)weblogic_blob8.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob8 = (BLOB)rset8.getBlob(1);	
	                   OutputStream os8 = oracle_blob8.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont8.length; i++){
	                       os8.write(tempCont8[i]);
	                   }
	                   os8.close();
	               	}
               	}
               	
//              첫번째 첨부파일
               	if(dm.add_file9 != null && dm.add_file9.length != 0){
	               	String blobQuery9 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'P' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq9+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset9 = (OracleResultSet)stmt.executeQuery(blobQuery9);	
	               	System.out.println(blobQuery9);
	               	if (rset9.next()) {    
	               	   //웹로직용	
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob9 = (weblogic.jdbc.wrapper.Blob)rset9.getBlob(1);
	                   //BLOB oracle_blob9 = (BLOB)weblogic_blob9.getVendorObj();
	               	   oracle.sql.BLOB oracle_blob9 = (BLOB)rset9.getBlob(1);
	                   OutputStream os9 = oracle_blob9.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont9.length; i++){
	                       os9.write(tempCont9[i]);
	                   }
	                   os9.close();
	               	}
               	}
               	
//              첫번째 첨부파일
               	if(dm.add_file10 != null && dm.add_file10.length != 0){
	               	String blobQuery10 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAFCM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	OCCR_DT 	= '"+m_temp+"' " +
		               					"   AND 	SEQ         = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_GB = 'P' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq10+"' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset10 = (OracleResultSet)stmt.executeQuery(blobQuery10);	
	               	System.out.println(blobQuery10);
	               	if (rset10.next()) {
	               		//웹로직용
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob10 = (weblogic.jdbc.wrapper.Blob)rset10.getBlob(1);
	                   //BLOB oracle_blob10 = (BLOB)weblogic_blob10.getVendorObj();
	               		oracle.sql.BLOB oracle_blob10 = (BLOB)rset10.getBlob(1);
	               		OutputStream os10 = oracle_blob10.getBinaryOutputStream();
	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   for(int i=0; i<tempCont10.length; i++){
	                       os10.write(tempCont10[i]);
	                   }
	                   os10.close();
	               	}
               	}
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);    
               stmt.close();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            throw new SysException(e);
           }
        }
    	else{        	
	    	DBManager manager = new DBManager("MISFNC");
	    	ds = (FC_ACCT_9920_ADataSet) manager.executeCall(dm);
	    	if(!"".equals(ds.errcode)){
	    		throw new AppException(ds.errcode, ds.errmsg);
	    	}
	    }
	    return ds;

    }

	public FC_ACCT_9930_LDataSet fc_acct_9930_l(FC_ACCT_9930_LDM dm) throws AppException, SQLException {

        
        DBManager manager 			= new DBManager("MISFNC");
        FC_ACCT_9930_LDataSet ds 	= (FC_ACCT_9930_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
	public FC_ACCT_9940_LDataSet fc_acct_9940_l(FC_ACCT_9940_LDM dm) throws AppException, SQLException {

        
        DBManager manager 			= new DBManager("MISFNC");
        FC_ACCT_9940_LDataSet ds 	= (FC_ACCT_9940_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
	public FC_ACCT_9931_SDataSet fc_acct_9931_s(FC_ACCT_9931_SDM dm) throws AppException, SQLException {

        
        DBManager manager 			= new DBManager("MISFNC");
        FC_ACCT_9931_SDataSet ds 	= (FC_ACCT_9931_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
