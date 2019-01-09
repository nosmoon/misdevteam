/***************************************************************************************************
 * 파일명 : TnLnk1100DAO.java
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

package chosun.ciis.tn.lnk.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class TnLnk1100DAO {
	 
    public TN_LNK_1110_LDataSet tn_lnk_1110_l(TN_LNK_1110_LDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1110_LDataSet ds = (TN_LNK_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public TN_LNK_1151_LDataSet tn_lnk_1151_l(TN_LNK_1151_LDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1151_LDataSet ds = (TN_LNK_1151_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    public TN_LNK_1152_ADataSet tn_lnk_1152_a(TN_LNK_1152_ADM dm) throws AppException {    	
    	TN_LNK_1152_ADataSet ds = null;
    	
    	System.out.println("dm.add_file::"+dm.add_file);
        // 등록시 첨부파일이 있을 경우 또는 수정시 파일갱신이고 첨부파일이 있을 경우... 
        if ((dm.add_file != null && dm.add_file.length > 0) &&
   	        !dm.getFlag().equals("D")){  
        	//System.out.println("dao start1");
        	String tempSeq = "";     // 임시 순번
        	byte[] tempCont;    	// 임시 첨부파일 내용
        	String excl_pmnt_idx = dm.excl_pmnt_idx;
        	String excl_pmnt_dtl_idx = dm.excl_pmnt_dtl_idx;
        	
        	tempCont = dm.add_file;

        	DBManager manager = null;
        	CallableStatement cstmt  = null;
        	Statement stmt = null;
        	
        	try {
        		System.out.println("java start!!!");
                manager = new DBManager("MISTNN");
                manager.getConnection();
                manager.m_conn.setAutoCommit(false);
                     
                //배열
                String [] mode           = Util.checkString(dm.mode).split("#");
                String [] row_num        = Util.checkString(dm.row_num).split("#");
                String [] input_type     = Util.checkString(dm.input_type).split("#");
                String [] memb_cd        = Util.checkString(dm.memb_cd.replaceAll("#", "#*")).split("#");
                String [] name           = Util.checkString(dm.name.replaceAll("#", "#*")).split("#");   
                String [] memb_type      = Util.checkString(dm.memb_type.replaceAll("#", "#*")).split("#");                    
                String [] memb_ctgr_cd   = Util.checkString(dm.memb_ctgr_cd.replaceAll("#", "#*")).split("#");                 
                String [] ern            = Util.checkString(dm.ern.replaceAll("#", "#*")).split("#");                          
                String [] prsd_nm        = Util.checkString(dm.prsd_nm.replaceAll("#", "#*")).split("#");                      
                String [] cell_no        = Util.checkString(dm.cell_no.replaceAll("#", "#*")).split("#");                      
                String [] phone          = Util.checkString(dm.phone.replaceAll("#", "#*")).split("#");                        
                String [] zip_cd         = Util.checkString(dm.zip_cd.replaceAll("#", "#*")).split("#");                       
                String [] addr           = Util.checkString(dm.addr.replaceAll("#", "#*")).split("#");                         
                String [] memb_memo      = Util.checkString(dm.memb_memo.replaceAll("#", "#*")).split("#");                    
                String [] prms_dt        = Util.checkString(dm.prms_dt.replaceAll("#", "#*")).split("#");                      
                String [] prms_amt       = Util.checkString(dm.prms_amt.replaceAll("#", "#*")).split("#");                     
                String [] use_orign      = Util.checkString(dm.use_orign.replaceAll("#", "#*")).split("#");                    
                String [] fund_idx       = Util.checkString(dm.fund_idx.replaceAll("#", "#*")).split("#");                     
                String [] suprt_idx      = Util.checkString(dm.suprt_idx.replaceAll("#", "#*")).split("#");                    
                String [] paymth_cd      = Util.checkString(dm.paymth_cd.replaceAll("#", "#*")).split("#");                    
                String [] cms_ownr_yn    = Util.checkString(dm.cms_ownr_yn.replaceAll("#", "#*")).split("#");                  
                String [] cms_bank_cd    = Util.checkString(dm.cms_bank_cd.replaceAll("#", "#*")).split("#");                  
                String [] cms_acct_no    = Util.checkString(dm.cms_acct_no.replaceAll("#", "#*")).split("#");                  
                String [] cms_ownr_nm    = Util.checkString(dm.cms_ownr_nm.replaceAll("#", "#*")).split("#");                  
                String [] cms_ern        = Util.checkString(dm.cms_ern.replaceAll("#", "#*")).split("#");                      
                String [] card_cmpy      = Util.checkString(dm.card_cmpy.replaceAll("#", "#*")).split("#");                    
                String [] card_num       = Util.checkString(dm.card_num.replaceAll("#", "#*")).split("#");                     
                String [] card_yymm      = Util.checkString(dm.card_yymm.replaceAll("#", "#*")).split("#");
                String [] card_idntt     = Util.checkString(dm.card_idntt.replaceAll("#", "#*")).split("#");
                String [] card_owner     = Util.checkString(dm.card_owner.replaceAll("#", "#*")).split("#");
                String [] mobl_aprv_nm   = Util.checkString(dm.mobl_aprv_nm.replaceAll("#", "#*")).split("#");                 
                String [] mobl_aprv_cmpy = Util.checkString(dm.mobl_aprv_cmpy.replaceAll("#", "#*")).split("#");               
                String [] mobl_aprv_num  = Util.checkString(dm.mobl_aprv_num.replaceAll("#", "#*")).split("#");                
                String [] mobl_aprv_prn  = Util.checkString(dm.mobl_aprv_prn.replaceAll("#", "#*")).split("#");                
                String [] prttn_type     = Util.checkString(dm.prttn_type.replaceAll("#", "#*")).split("#");                   
                String [] mon_pay_dt     = Util.checkString(dm.mon_pay_dt.replaceAll("#", "#*")).split("#");                   
                String [] mon_pay_amt    = Util.checkString(dm.mon_pay_amt.replaceAll("#", "#*")).split("#");                  
                String [] pay_frdt       = Util.checkString(dm.pay_frdt.replaceAll("#", "#*")).split("#");                     
                String [] prttn_cnt      = Util.checkString(dm.prttn_cnt.replaceAll("#", "#*")).split("#");                    
                String [] prms_memo      = Util.checkString(dm.prms_memo.replaceAll("#", "#*")).split("#");                    
                String [] pay_dt         = Util.checkString(dm.pay_dt.replaceAll("#", "#*")).split("#");                       
                String [] pay_amt        = Util.checkString(dm.pay_amt.replaceAll("#", "#*")).split("#");                      
                System.out.println(row_num.length);
                for( int row=0; row<row_num.length; row++){
                    cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // 파라미터 설정
                    cstmt.registerOutParameter(1, Types.VARCHAR);
                    cstmt.registerOutParameter(2, Types.VARCHAR);
                    cstmt.setString(3, dm.cmpy_cd);
                    cstmt.setString(4, dm.dept_idx);
                    cstmt.setString(5, dm.excl_type);
                    cstmt.setString(6, dm.title);
                    cstmt.setString(7, dm.flag+Integer.toString(row));
                    cstmt.setString(8, excl_pmnt_idx);
                    cstmt.setString(9, excl_pmnt_dtl_idx);
                    cstmt.setString(10, dm.add_file_nm);
                    cstmt.setString(11, dm.add_file_size);
                    cstmt.setBytes(12, "0101".getBytes()); 
                    cstmt.setString(13, mode[row]);
                    cstmt.setString(14, row_num[row]);
                    cstmt.setString(15, input_type[row]);
                    cstmt.setString(16, memb_cd[row]);
                    cstmt.setString(17, name[row]);
                    cstmt.setString(18, memb_type[row]);
                    cstmt.setString(19, memb_ctgr_cd[row]);
                    cstmt.setString(20, ern[row]);
                    cstmt.setString(21, prsd_nm[row]);
                    cstmt.setString(22, cell_no[row]);
                    cstmt.setString(23, phone[row]);
                    cstmt.setString(24, zip_cd[row]);
                    cstmt.setString(25, addr[row]);
                    cstmt.setString(26, memb_memo[row]);
                    cstmt.setString(27, prms_dt[row]);
                    cstmt.setString(28, prms_amt[row]);
                    cstmt.setString(29, use_orign[row]);
                    cstmt.setString(30, fund_idx[row]);
                    cstmt.setString(31, suprt_idx[row]);
                    cstmt.setString(32, paymth_cd[row]);
                    cstmt.setString(33, cms_ownr_yn[row]);
                    cstmt.setString(34, cms_bank_cd[row]);
                    cstmt.setString(35, cms_acct_no[row]);
                    cstmt.setString(36, cms_ownr_nm[row]);
                    cstmt.setString(37, cms_ern[row]);
                    cstmt.setString(38, card_cmpy[row]);
                    cstmt.setString(39, card_num[row]);
                    cstmt.setString(40, card_yymm[row]);
            		cstmt.setString(41, card_idntt[row]);
            		cstmt.setString(42, card_owner[row]);
            		cstmt.setString(43, mobl_aprv_nm[row]);
            		cstmt.setString(44, mobl_aprv_cmpy[row]);
            		cstmt.setString(45, mobl_aprv_num[row]);
            		cstmt.setString(46, mobl_aprv_prn[row]);
            		cstmt.setString(47, prttn_type[row]);
            		cstmt.setString(48, mon_pay_dt[row]);
            		cstmt.setString(49, mon_pay_amt[row]);
            		cstmt.setString(50, pay_frdt[row]);
            		cstmt.setString(51, prttn_cnt[row]);
            		cstmt.setString(52, prms_memo[row]);
            		cstmt.setString(53, pay_dt[row]);
            		cstmt.setString(54, pay_amt[row]);
            		cstmt.setString(55, dm.incmg_pers_ip);
            		cstmt.setString(56, dm.incmg_pers);
            		cstmt.registerOutParameter(57, Types.VARCHAR);
            		cstmt.registerOutParameter(58, Types.VARCHAR);
					
					//System.out.println("proc gogo!");
		           // 실행
		    		cstmt.execute();//System.out.println("proc execute!!!");
		           // 결과
		    		ds = (TN_LNK_1152_ADataSet)dm.createDataSetObject();
		    		ds.getValues(cstmt);
		    		
		    		if(!"".equals(ds.excl_pmnt_idx)){
		    			excl_pmnt_idx = ds.excl_pmnt_idx;
		    			ds.setExcl_pmnt_idx(excl_pmnt_idx);
		    		}
		    		if(!"".equals(ds.excl_pmnt_dtl_idx)){
		    			excl_pmnt_dtl_idx = ds.excl_pmnt_dtl_idx;
		    			ds.setExcl_pmnt_dtl_idx(excl_pmnt_dtl_idx);
		    		}		    		
		    		if(!"".equals(ds.errcode)){
                       System.out.println(ds.errcode);
		               throw new AppException(ds.errcode, ds.errmsg);
		    		}
		    		if("0".equals(Integer.toString(row))){
		    		//if(Integer.toString(mode.length-1).equals(Integer.toString(row))){
			           // 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
			           //입력일 때
			       	   	tempSeq = ds.getExcl_pmnt_idx();
			       	    System.out.println("blob!!!"+tempSeq);
			           // BLOB 구하기
			       	   	stmt = manager.m_conn.createStatement();
			       	    if(dm.add_file != null && dm.add_file.length != 0){
				       	   	StringBuffer blobQuery = new StringBuffer();
				       	   	blobQuery.append(" SELECT ADD_FILE FROM EXCEL_PAYMENT_FILE ");
				       	   	blobQuery.append(" WHERE  EXCELPAYMENTIDX  = '"+tempSeq+"' ");
				       	   	blobQuery.append(" FOR 	 UPDATE ");  
				       	    //System.out.println(blobQuery);    
				       	   	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery.toString());
				       	   	//System.out.println("Blob query execute!!!"+rset);	
				       	   	if (rset.next()) {  //System.out.println("resin-BLOB-start::"+rset);         
				       	   		//웹로직용
				//           	   		weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
				//           	   		BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				       	   		
				       	   		//레진용(ep1)
				       	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
				       	   		
				       	   		OutputStream os = oracle_blob.getBinaryOutputStream();                       
				               // 파일로부터 읽어서 BLOB 에 WRITE 한다.
				       	   		for(int i=0; i<tempCont.length; i++){
				       	   			os.write(tempCont[i]);
				       	   		}
				       	   		os.close();
				       	   	}
			       	   	}
			       	   	
			       	   	//manager.m_conn.setAutoCommit(true);  
			    	   	stmt.close();
			    	   	//manager.disConnection();
		    		}
		    		//System.out.println("commit="+row);
		    		manager.commit();
		    		manager.m_conn.commit(); 
		    		cstmt.close();
                }//for
                ds.setExcl_pmnt_idx(excl_pmnt_idx);
                ds.setExcl_pmnt_dtl_idx(excl_pmnt_dtl_idx);
                manager.m_conn.commit(); 
                manager.m_conn.setAutoCommit(true);
                manager.commit();
                manager.disConnection();
	     	} catch (AppException e) {
		    	  if (manager != null)
			          manager.rollback();	
	             throw e;   
			}catch (SQLException e) {
				if (manager != null)
			          manager.rollback();	
		    	  throw new SysException(e);
			}catch (Exception e) {
			      if (manager != null)
			          manager.rollback();	
		    	  throw new SysException(e);
		    } finally {	    	
			    if (manager != null)	
			    	manager.disConnection();
		    }
        }else{
        	DBManager manager = new DBManager("MISTNN");
        	ds = (TN_LNK_1152_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }
    
    public TN_LNK_1153_ADataSet tn_lnk_1153_a(TN_LNK_1153_ADM dm) throws AppException {    	
    	TN_LNK_1153_ADataSet ds = null;
    	System.out.println("dm.add_file::"+dm.add_file);
        // 등록시 첨부파일이 있을 경우 또는 수정시 파일갱신이고 첨부파일이 있을 경우... 
        if ((dm.add_file != null && dm.add_file.length > 0) &&
   	        !dm.getFlag().equals("D")){  
        	//System.out.println("dao start1");
        	String tempSeq = "";     // 임시 순번
        	byte[] tempCont;    	// 임시 첨부파일 내용
        	String excl_pmnt_idx = dm.excl_pmnt_idx;
           
        	tempCont = dm.add_file;

        	DBManager manager = null;
            CallableStatement cstmt = null;
        	Statement stmt = null;
        	try {
          	//System.out.println("java start!!!");
                manager = new DBManager("MISTNN");
                manager.getConnection();
                manager.m_conn.setAutoCommit(false);
                     
                //배열
                //메모에 특수문자로 인해 자르기가 이상하게 발생할때가 있어서 리플레이스 한후에 스플릿시킴
                String [] mode           = Util.checkString(dm.mode).split("#");
                String [] row_num        = Util.checkString(dm.row_num).split("#");
                String [] memb_nm        = Util.checkString(dm.memb_nm.replaceAll("#","#*")).split("#");
                String [] prms_cd        = Util.checkString(dm.prms_cd.replaceAll("#","#*")).split("#");
                String [] pay_dt         = Util.checkString(dm.pay_dt.replaceAll("#","#*")).split("#");
                String [] pay_amt        = Util.checkString(dm.pay_amt.replaceAll("#","#*")).split("#");
                String [] bank_acct_cd   = Util.checkString(dm.bank_acct_cd.replaceAll("#","#*")).split("#");
                String [] pmnt_memo      = Util.checkString(dm.pmnt_memo.replaceAll("#","#*")).split("#");
                System.out.println(row_num.length);
                for( int row=0; row<row_num.length; row++){
	               // 파라미터 설정
	                cstmt = manager.m_conn.prepareCall(dm.getSQL());
					cstmt.registerOutParameter(1, Types.VARCHAR);
					cstmt.registerOutParameter(2, Types.VARCHAR);
					cstmt.setString(3, dm.cmpy_cd);
					cstmt.setString(4, dm.dept_idx);
					cstmt.setString(5, dm.excl_type);
					cstmt.setString(6, dm.title);
					cstmt.setString(7, dm.flag+Integer.toString(row));
					cstmt.setString(8, excl_pmnt_idx);
					cstmt.setString(9, dm.add_file_nm);
					cstmt.setString(10, dm.add_file_size);
					cstmt.setBytes(11, "0101".getBytes());
					cstmt.setString(12, mode[row]);
					cstmt.setString(13, row_num[row]);
					cstmt.setString(14, memb_nm[row]);
					cstmt.setString(15, prms_cd[row]);
					cstmt.setString(16, pay_dt[row]);
					cstmt.setString(17, pay_amt[row]);
					cstmt.setString(18, bank_acct_cd[row]);
					cstmt.setString(19, pmnt_memo[row]);
					cstmt.setString(20, dm.incmg_pers_ip);
					cstmt.setString(21, dm.incmg_pers);
					cstmt.registerOutParameter(22, Types.VARCHAR);
	
		           // 실행
		    		cstmt.execute();//System.out.println("proc execute!!!");
		           // 결과
		    		ds = (TN_LNK_1153_ADataSet)dm.createDataSetObject();
		    		//System.out.println("ds result::"+ds);
		    		ds.getValues(cstmt);
		    		
		    		if(!"".equals(ds.excl_pmnt_idx)){
		    			excl_pmnt_idx = ds.excl_pmnt_idx;
		    			ds.setExcl_pmnt_idx(excl_pmnt_idx);
		    		}
		    		if(!"".equals(ds.errcode)){
		    			
		    			System.out.println(ds.errmsg);
		               throw new AppException(ds.errcode, ds.errmsg);
		    		}
		    		if("0".equals(Integer.toString(row))){		    		
			           // 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
			           //입력일 때
			       	   	tempSeq = ds.getExcl_pmnt_idx();
			       	    System.out.println("blob!!!"+tempSeq);
			           // BLOB 구하기
			       	   	stmt = manager.m_conn.createStatement();
			       	    if(dm.add_file != null && dm.add_file.length != 0){
				       	   	StringBuffer blobQuery = new StringBuffer();
				       	   	blobQuery.append(" SELECT ADD_FILE FROM EXCEL_PAYMENT_FILE ");
				       	   	blobQuery.append(" WHERE  EXCELPAYMENTIDX  = '"+tempSeq+"' ");
				       	   	blobQuery.append(" FOR 	 UPDATE ");  
				       	    //System.out.println(blobQuery);    
				       	   	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery.toString());
				       	   	//System.out.println("Blob query execute!!!"+rset);	
				       	   	if (rset.next()) {  //System.out.println("resin-BLOB-start::"+rset);         
				       	   		//웹로직용
				//           	   		weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
				//           	   		BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				       	   		
				       	   		//레진용(ep1)
				       	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
				       	   		
				       	   		OutputStream os = oracle_blob.getBinaryOutputStream();                       
				               // 파일로부터 읽어서 BLOB 에 WRITE 한다.
				       	   		for(int i=0; i<tempCont.length; i++){
				       	   			os.write(tempCont[i]);
				       	   		}
				       	   		os.close();
				       	   	}
			       	   	}
			    	   	stmt.close();
			    	   	//manager.disConnection();
		    		}
		    		//System.out.println("commit="+row);
		    		manager.commit();
		    		manager.m_conn.commit(); 
		    		cstmt.close();
                }//for
                ds.setExcl_pmnt_idx(excl_pmnt_idx);
                manager.m_conn.commit(); 
                manager.m_conn.setAutoCommit(true);
                manager.commit();
                manager.disConnection();
	     	} catch (AppException e){
	             manager.disConnection();
	             throw e;
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
        	DBManager manager = new DBManager("MISTNN");
        	ds = (TN_LNK_1153_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }
    
	public TN_LNK_1154_ADataSet tn_lnk_1154_a(TN_LNK_1154_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_1154_ADataSet ds = (TN_LNK_1154_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
	public TN_LNK_1155_ADataSet tn_lnk_1155_a(TN_LNK_1155_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_1155_ADataSet ds = (TN_LNK_1155_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public TN_LNK_1156_ADataSet tn_lnk_1156_a(TN_LNK_1156_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_1156_ADataSet ds = (TN_LNK_1156_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
