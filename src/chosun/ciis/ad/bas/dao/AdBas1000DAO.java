/***************************************************************************************************
 * 파일명 : AdBas1000DAO.java
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

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.bas.dm.AD_BAS_1000_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1010_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1030_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1050_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1051_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1055_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1000_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1010_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1030_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1050_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1051_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1055_ADataSet;

import chosun.ciis.co.dlco.dm.CO_DLCO_1007_ADM;
import chosun.ciis.co.dlco.ds.CO_DLCO_1007_ADataSet;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class AdBas1000DAO { 
	  
    public AD_BAS_1000_MDataSet ad_bas_1000_m(AD_BAS_1000_MDM dm) throws AppException {
    	DBManager manager = new DBManager("MISADV");
        AD_BAS_1000_MDataSet ds = (AD_BAS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_BAS_1010_SDataSet ad_bas_1010_s(AD_BAS_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1010_SDataSet ds = (AD_BAS_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println(ds.errcode + ", " + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_BAS_1030_ADataSet ad_bas_1030_a(AD_BAS_1030_ADM dm) throws AppException {

    	AD_BAS_1030_ADataSet ds = null;
    	 

       	DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt  = null;
       	CallableStatement cstmt1 = null;
       	String    jobStep        = "A:작업시작";
       	
       	try {
           	manager = new DBManager("MISADV");
           	manager.getConnection();
           	manager.m_conn.setAutoCommit(false);
           	cstmt = manager.m_conn.prepareCall(dm.getSQL());
           	// 파라미터 설정
           	dm.setParams(cstmt,dm);
		
	       	// 실행
	       	cstmt.execute();
	       	// 결과
	       	ds = (AD_BAS_1030_ADataSet) dm.createDataSetObject();
	       	ds.getValues(cstmt);
	       	cstmt.close();
	        if (!"".equals(ds.errcode)) {
		        	manager.rollback();
		            throw new AppException(ds.errcode, ds.errmsg);
	        }
        	jobStep        = "B:ERP 수정완료";
        	 
	        if ("Y".equals(ds.bis_dlco_yn) ){ 
	        	System.out.println("1-1;;;;;;;;");	        	
		        // DM Setting
		    	CO_DLCO_1007_ADM dm1 = new CO_DLCO_1007_ADM();
		    	dm1.setMode(dm.flag);
		    	dm1.setCd_cust(ds.dlco_no);
		    	dm1.setNm_cust(ds.dlco_abrv_nm);
		    	dm1.setNo_tax(ds.ern);
		    	dm1.setNm_president(ds.presi_nm);
		    	dm1.setNm_businesscond(ds.bizcond);
		    	dm1.setNm_item(ds.item);
		    	dm1.setNo_post(ds.zip);
		    	dm1.setNm_address(ds.addr);
		    	dm1.setNm_addrdtl(ds.dtls_addr);
		    	dm1.setNm_cust_full(ds.dlco_nm);
		    	dm1.setUse_yn(ds.use_yn);
		    	dm1.setCustype(ds.advcs_agn_flag);
		    	dm1.setIncmg_pers_ipadd(dm.incmg_pers_ip);
		    	dm1.setIncmg_pers(dm.incmg_pers);
		    	dm1.setIncmg_pers_cmpy_cd(dm.cmpy_cd); 
		    	
	        	System.out.println("1-2");	 		    			    		
	           	managerBis = new DBManager("MISTV");
	           	managerBis.getConnection();
	           	managerBis.m_conn.setAutoCommit(false);
	           	cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
	           	// 파라미터 설정
	           	dm1.setParams(cstmt1,dm1);
		       	// 실행
		       	cstmt1.execute();
		       	// 결과
		       	CO_DLCO_1007_ADataSet ds1 = (CO_DLCO_1007_ADataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt.close();	    	
		        if (!"".equals(ds1.errcode)) {
		        	manager.rollback();
		        	managerBis.rollback();		        	
		            throw new AppException(ds1.errcode, ds1.errmsg);
		        }	    		    	
	        	System.out.println("1-3");			    	
		    	managerBis.commit();
		    	jobStep        = "C:BIS 수정완료";
 	
	        }
 
 		    manager.commit();     
 		    
			jobStep        = "D:ERP,BIS 수정완료";
			
	    }catch (AppException e){
		      if (managerBis != null)
		          managerBis.rollback();	
		      if (manager != null)
		          manager.rollback();	
              throw e;   
 
        }catch (SQLException e) {
		      if (managerBis != null)
		          managerBis.rollback();	
		      if (manager != null)
		          manager.rollback();	
		      if ("B:ERP 수정완료".equals(jobStep)){
		         throw new AppException("접속오류", "BIS DBMS 접속/처리 오류가 발생하였습니다. 시스템담당자에게 연락바랍니다.");
		      }else{		               
		    	  throw new SysException(e);
		      }

        	
        }catch (Exception e) {
		      if (managerBis != null)
		          managerBis.rollback();	
		      if (manager != null)
		          manager.rollback();	
 
		      if ("B:ERP 수정완료".equals(jobStep)){
			         throw new AppException("접속오류", "BIS DBMS 접속/처리 오류가 발생하였습니다. 시스템담당자에게 연락바랍니다.");
			      }else{		               
			    	  throw new SysException(e);
			      }	      
        	              
	    } finally {	 
		    if (managerBis != null)	    	
		    	managerBis.disConnection();
		    if (manager != null)	
		    	manager.disConnection();
	        System.out.println(jobStep);
	    }
 
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }        
    
    public AD_BAS_1050_MDataSet ad_bas_1050_m(AD_BAS_1050_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1050_MDataSet ds = (AD_BAS_1050_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_BAS_1051_LDataSet ad_bas_1051_l(AD_BAS_1051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1051_LDataSet ds = (AD_BAS_1051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println(ds.errcode + ", " + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_BAS_1055_ADataSet ad_bas_1055_a(AD_BAS_1055_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1055_ADataSet ds = (AD_BAS_1055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
}
