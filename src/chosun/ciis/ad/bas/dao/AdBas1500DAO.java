/***************************************************************************************************
 * 파일명 : AdBas1500DAO.java
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

package chosun.ciis.ad.bas.dao;

import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.*;
import java.sql.*;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.bas.dm.AD_BAS_1500_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1510_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1511_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1512_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1520_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1521_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1530_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1540_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1550_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1555_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1570_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1580_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1590_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1500_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1510_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1511_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1512_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1520_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1521_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1530_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1540_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1550_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1555_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1570_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1580_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1590_ADataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas1500DAO {
	
    /**
     * 일일보고, 일일보고등록 초기
     * @param  AD_BAS_1500_MDM
     * @return AD_BAS_1500_MDataSet
     */
    public AD_BAS_1500_MDataSet ad_bas_1500_m(AD_BAS_1500_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_1500_MDataSet ds = (AD_BAS_1500_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

    /**
     * 일일보고 거래처접촉자료  조회
     * @param  AD_BAS_1510_LDM
     * @return AD_BAS_1510_LDataSet
     */
    public AD_BAS_1510_LDataSet ad_bas_1510_l(AD_BAS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1510_LDataSet ds = (AD_BAS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

    /**
     * 일일보고 정보사항 조회
     * @param  AD_BAS_1510_LDM
     * @return AD_BAS_1510_LDataSet
     */
    public AD_BAS_1511_LDataSet ad_bas_1511_l(AD_BAS_1511_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1511_LDataSet ds = (AD_BAS_1511_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    /**
     * 일일보고 지사업무보고 조회
     * @param  AD_BAS_1510_LDM
     * @return AD_BAS_1510_LDataSet
     */
    public AD_BAS_1512_LDataSet ad_bas_1512_l(AD_BAS_1512_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1512_LDataSet ds = (AD_BAS_1512_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    } 
    /**
     * 일일보고 야근일지 조회
     * @param  AD_BAS_1520_LDM
     * @return AD_BAS_1520_LDataSet
     */
	public AD_BAS_1520_LDataSet ad_bas_1520_l(AD_BAS_1520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_BAS_1520_LDataSet ds = (AD_BAS_1520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 일일보고 관리정보 조회
     * @param  AD_BAS_1521_LDM
     * @return AD_BAS_1521_LDataSet
     */
	public AD_BAS_1521_LDataSet ad_bas_1521_l(AD_BAS_1521_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_BAS_1521_LDataSet ds = (AD_BAS_1521_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
    /**
     * 일일보고 의견 입력, 수정, 삭제
     * @param  AD_BAS_1530_ADM
     * @return AD_BAS_1530_ADataSet
     */
	public AD_BAS_1530_ADataSet ad_bas_1530_a(AD_BAS_1530_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1530_ADataSet ds = (AD_BAS_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 일일보고등록 상세조회
     * @param  AD_BAS_1540_SDM
     * @return AD_BAS_1540_SDataSet
     */
	public AD_BAS_1540_SDataSet ad_bas_1540_s(AD_BAS_1540_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1540_SDataSet ds = (AD_BAS_1540_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 일일보고등록 입력, 수정, 삭제
     * @param  AD_BAS_1550_ADM
     * @return 
     */
    public AD_BAS_1550_ADataSet ad_bas_1550_a(AD_BAS_1550_ADM dm) throws AppException {
    	AD_BAS_1550_ADataSet ds = null;
        
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if((dm.add_file1 != null && dm.getFile_delyn1().equals("N") ||
       		dm.add_file2 != null && dm.getFile_delyn2().equals("N") ||
       		dm.add_file3 != null && dm.getFile_delyn3().equals("N") ||
       		dm.add_file4 != null && dm.getFile_delyn4().equals("N") ||
       		dm.add_file5 != null && dm.getFile_delyn5().equals("N")) &&
      	   !dm.getFlag().equals("D")){
       		
    		String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] tempCont1;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont2;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont3;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont4;   	   // 첨부파일 내용(임시 )
    		byte[] tempCont5;   	   // 첨부파일 내용(임시 )
		   
    		tempCont1 = dm.add_file1;
    		tempCont2 = dm.add_file2;
    		tempCont3 = dm.add_file3;
    		tempCont4 = dm.add_file4;
    		tempCont5 = dm.add_file5;
		   
    		DBManager manager = null;
    		try {
    			System.out.println("java start!!!");
               	manager = new DBManager("MISADV");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("para setting!!!");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.rept_clsf);
        		cstmt.setString(5, dm.make_dt);
        		cstmt.setString(6, dm.rept_no);
        		cstmt.setString(7, dm.advcs_clsf);
        		cstmt.setString(8, dm.medi_clsf);
        		cstmt.setString(9, dm.chrg_pers);
        		cstmt.setString(10, dm.dlco_no);
        		cstmt.setString(11, dm.patr_chrg_pers);
        		cstmt.setString(12, dm.titl);
        		cstmt.setString(13, dm.cont);
        		cstmt.setString(14, dm.data_clsf);
        		cstmt.setString(15, dm.incmg_pers);
        		cstmt.setString(16, dm.incmg_pers_ip);
        		cstmt.setString(17, dm.add_file_no1);
        		cstmt.setString(18, dm.add_file_no2);
        		cstmt.setString(19, dm.add_file_no3);
        		cstmt.setString(20, dm.add_file_no4);
        		cstmt.setString(21, dm.add_file_no5);
        		cstmt.setString(22, dm.add_file_nm1);
        		cstmt.setString(23, dm.add_file_nm2);
        		cstmt.setString(24, dm.add_file_nm3);
        		cstmt.setString(25, dm.add_file_nm4);
        		cstmt.setString(26, dm.add_file_nm5);
        		cstmt.setBytes(27, "0101".getBytes());
        		cstmt.setBytes(28, "0101".getBytes());
        		cstmt.setBytes(29, "0101".getBytes());
        		cstmt.setBytes(30, "0101".getBytes());
        		cstmt.setBytes(31, "0101".getBytes());
        		cstmt.setString(32, dm.file_delyn1);
        		cstmt.setString(33, dm.file_delyn2);
        		cstmt.setString(34, dm.file_delyn3);
        		cstmt.setString(35, dm.file_delyn4);
        		cstmt.setString(36, dm.file_delyn5);
        		cstmt.setString(37, dm.flag);
        		cstmt.registerOutParameter(38, Types.VARCHAR);
        		cstmt.registerOutParameter(39, Types.VARCHAR);
        		cstmt.registerOutParameter(40, Types.VARCHAR);
        		cstmt.registerOutParameter(41, Types.VARCHAR);
        		cstmt.registerOutParameter(42, Types.VARCHAR);
        		cstmt.registerOutParameter(43, Types.VARCHAR);
       		   
               // 실행
	    		cstmt.execute();
	    		System.out.println("proc execute!!!");
               // 결과
	    		ds = (AD_BAS_1550_ADataSet)dm.createDataSetObject();               
	    		System.out.println("ds result::"+ds);
	    		ds.getValues(cstmt);
               
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

               // 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
               //입력일 때
	    		if(dm.getFlag().equals("I")){
	    			c_temp = dm.getCmpy_cd();     	// 회사코드(임시)
	    			r_temp = dm.getRept_clsf();     	// 보고구분(임시)
	    			m_temp = dm.getMake_dt();     	// 작성일자(임시)
	    			r_tempSeq = ds.getRept_no();     // 보고번호(임시)
	    			a_tempSeq1= ds.getAdd_file_no1(); // 첨부파일번호(임시)
	    			a_tempSeq2= ds.getAdd_file_no2(); // 첨부파일번호(임시)
                   	a_tempSeq3= ds.getAdd_file_no3(); // 첨부파일번호(임시)
                   	a_tempSeq4= ds.getAdd_file_no4(); // 첨부파일번호(임시)
                   	a_tempSeq5= ds.getAdd_file_no5(); // 첨부파일번호(임시)
	    		}
               //수정일 때
	    		else if(dm.getFlag().equals("U")){
	    			c_temp = dm.getCmpy_cd();     	// 회사코드(임시)
	    			r_temp = dm.getRept_clsf();     	// 보고구분(임시)
	    			m_temp = dm.getMake_dt();     	// 작성일자(임시)
	    			r_tempSeq = dm.getRept_no();     // 보고번호(임시)
	    			if(!"".equals(dm.add_file_no1)){
	    				a_tempSeq1 = dm.getAdd_file_no1(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq1 = ds.getAdd_file_no1(); // 첨부파일번호(임시)
	    			}
	    			if(!"".equals(dm.add_file_no2)){
	    				a_tempSeq2 = dm.getAdd_file_no2(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq2 = ds.getAdd_file_no2(); // 첨부파일번호(임시)
	    			}
	    			if(!"".equals(dm.add_file_no3)){
	    				a_tempSeq3 = dm.getAdd_file_no3(); // 첨부파일번호(임시)	   
	    			}else{
                	  	a_tempSeq3 = ds.getAdd_file_no3(); // 첨부파일번호(임시)
	    			}
	    			if(!"".equals(dm.add_file_no4)){
	    				a_tempSeq4 = dm.getAdd_file_no4(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq4 = ds.getAdd_file_no4(); // 첨부파일번호(임시)
	    			}
	    			if(!"".equals(dm.add_file_no5)){
	    				a_tempSeq5 = dm.getAdd_file_no5(); // 첨부파일번호(임시)	   
	    			}else{
	    				a_tempSeq5 = ds.getAdd_file_no5(); // 첨부파일번호(임시)
	    			}
	    		}
               
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               	System.out.println("Statement!!!");
               	//첫번째 첨부파일
               	if(dm.add_file1 != null && dm.add_file1.length != 0 && dm.getFile_delyn1().equals("N")){
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAADM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	REPT_CLSF   = '"+r_temp+"' " +
		               					"   AND 	MAKE_DT 	= '"+m_temp+"' " +
		               					"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq1+"' " +
		               					"	FOR 	UPDATE";
	               	//System.out.println("blobQuery1::"+blobQuery1);
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	
	               	System.out.println("Blob query execute!!!"+rset1);
         	
	               	if (rset1.next()) { System.out.println("resin-BLOB-start::"+rset1); 
	               		//weblogic
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   //BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	           	   		//레진용(ep1)
		       	   		oracle.sql.BLOB oracle_blob1 = (BLOB)rset1.getBlob(1);	
				   		
				   		OutputStream os1 = oracle_blob1.getBinaryOutputStream();
		                for (int i = 0; i < tempCont1.length; i++) {
		                  os1.write(tempCont1[i]);
		                }
		                os1.close();

	               	}
               	}
               	
               	//두번째 첨부파일
               	if(dm.add_file2 != null && dm.add_file2.length != 0 && dm.getFile_delyn2().equals("N")){
	               	String blobQuery2 = "	SELECT 	ADD_FILE " +
	 								   	"  	FROM 	TAADM_DDREPTFILE " +
	 								   	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
	 								   	"   AND 	REPT_CLSF   = '"+r_temp+"' " +
	 								   	"   AND 	MAKE_DT 	   = '"+m_temp+"' " +
	 								   	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
	 								   	"   AND 	ADD_FILE_NO = '"+a_tempSeq2+"' " +
	 								   	"	FOR 		UPDATE";
				   	OracleResultSet rset2 = (OracleResultSet)stmt.executeQuery(blobQuery2);
				   	if (rset2.next()) {             
//				   		weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset2.getBlob(1);
//				   		BLOB oracle_blob2 = (BLOB)weblogic_blob.getVendorObj();
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
			   	
				//세번째 첨부파일
               	if(dm.add_file3 != null && dm.add_file3.length != 0 && dm.getFile_delyn3().equals("N")){
					String blobQuery3 = "	SELECT 	ADD_FILE " +
										"  	FROM 	TAADM_DDREPTFILE " +
										" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
										"   AND 	REPT_CLSF   = '"+r_temp+"' " +
										"   AND 	MAKE_DT 	= '"+m_temp+"' " +
										"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
										"   AND	 	ADD_FILE_NO = '"+a_tempSeq3+"' " +
										"	FOR 	UPDATE";
					OracleResultSet rset3 = (OracleResultSet)stmt.executeQuery(blobQuery3);
					if (rset3.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset3.getBlob(1);
//						BLOB oracle_blob3 = (BLOB)weblogic_blob.getVendorObj();
	           	   		//레진용(ep1)
	           	   		oracle.sql.BLOB oracle_blob3 = (BLOB)rset3.getBlob(1);	
						
						OutputStream os3 = oracle_blob3.getBinaryOutputStream();
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<tempCont3.length; i++){
						os3.write(tempCont3[i]);
						}
						os3.close();
					}
               	}

               	//네번째 첨부파일
               	if(dm.add_file4 != null && dm.add_file4.length != 0 && dm.getFile_delyn4().equals("N")){
					String blobQuery4 = "	SELECT 	ADD_FILE " +
									  	"  	FROM 	TAADM_DDREPTFILE " +
									  	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
									  	"   AND 	REPT_CLSF   = '"+r_temp+"' " +
									  	"   AND 	MAKE_DT 	  = '"+m_temp+"' " +
									  	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
									  	"   AND 	ADD_FILE_NO = '"+a_tempSeq4+"' " +
									  	"	FOR 	UPDATE";
					OracleResultSet rset4 = (OracleResultSet)stmt.executeQuery(blobQuery4);
					if (rset4.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob4 = (weblogic.jdbc.wrapper.Blob)rset4.getBlob(1);
//						BLOB oracle_blob4 = (BLOB)weblogic_blob4.getVendorObj();
	           	   		//레진용(ep1)
	           	   		oracle.sql.BLOB oracle_blob4 = (BLOB)rset4.getBlob(1);	
						
						OutputStream os4 = oracle_blob4.getBinaryOutputStream();
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<tempCont4.length; i++){
						os4.write(tempCont4[i]);
						}
						os4.close();
					}
               	}

               	//다섯번째 첨부파일
               	if(dm.add_file5 != null && dm.add_file5.length != 0 && dm.getFile_delyn5().equals("N")){
					String blobQuery5 =	"	SELECT 	ADD_FILE " +
									  	"  	FROM 	TAADM_DDREPTFILE " +
									  	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
									  	"   AND		REPT_CLSF   = '"+r_temp+"' " +
									  	"   AND 	MAKE_DT 	  = '"+m_temp+"' " +
									  	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
									  	"   AND 	ADD_FILE_NO = '"+a_tempSeq5+"' " +
									  	"	FOR 	UPDATE";
					OracleResultSet rset5 = (OracleResultSet)stmt.executeQuery(blobQuery5);
					if (rset5.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob5 = (weblogic.jdbc.wrapper.Blob)rset5.getBlob(1);
//						BLOB oracle_blob5 = (BLOB)weblogic_blob5.getVendorObj();
	           	   		//레진용(ep1)
	           	   		oracle.sql.BLOB oracle_blob5 = (BLOB)rset5.getBlob(1);	
						
						OutputStream os5 = oracle_blob5.getBinaryOutputStream();
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<tempCont5.length; i++){
						os5.write(tempCont5[i]);
						}
						os5.close();
					}
               	}    
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);               	
               stmt.close();
               manager.disConnection();
               //System.out.println("java end!!!!");
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            throw new SysException(e);
           }
        }else{        	
        	DBManager manager = new DBManager("MISADV");
        	ds = (AD_BAS_1550_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }	
	
    /**
     * 일일보고등록 파일저장
     * @param  AD_BAS_1555_ADM
     * @return AD_BAS_1555_ADataSet
     */
	public AD_BAS_1555_ADataSet ad_bas_1555_a(AD_BAS_1555_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1555_ADataSet ds = (AD_BAS_1555_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
/*  
	public AD_BAS_1560_LDataSet ad_bas_1560_l(AD_BAS_1560_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1560_LDataSet ds = (AD_BAS_1560_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
    /**
     * 야근일지 상세조회
     * @param  AD_BAS_1570_SDM
     * @return AD_BAS_1570_SDataSet
     */
	public AD_BAS_1570_SDataSet ad_bas_1570_s(AD_BAS_1570_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");		
		AD_BAS_1570_SDataSet ds = (AD_BAS_1570_SDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
	
    /**
     * 야근일지 입력, 수정, 삭제
     * @param  AD_BAS_1580_ADM
     * @return AD_BAS_1580_ADataSet
     */
	public AD_BAS_1580_ADataSet ad_bas_1580_a(AD_BAS_1580_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1580_ADataSet ds = (AD_BAS_1580_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    /**
     * 야근일지 입력, 수정, 삭제
     * @param  AD_BAS_1590_ADM
     * @return AD_BAS_1590_ADataSet
     */
	public AD_BAS_1590_ADataSet ad_bas_1590_a(AD_BAS_1590_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1590_ADataSet ds = (AD_BAS_1590_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
/*	
	public AD_BAS_1590_LDataSet ad_bas_1590_l(AD_BAS_1590_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_1590_LDataSet ds = (AD_BAS_1590_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/         
}
