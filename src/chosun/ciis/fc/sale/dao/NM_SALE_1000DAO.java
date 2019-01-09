/***************************************************************************************************
* 파일명 : SE_ETC_1000DAO.java
* 기능 : 판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.fc.sale.dao;

import java.sql.SQLException;

import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class NM_SALE_1000DAO {
	
	public NM_SALE_1000_MDataSet nm_sale_1000_m(NM_SALE_1000_MDM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1000_MDataSet ds 	= (NM_SALE_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public NM_SALE_1001_LDataSet nm_sale_1001_l(NM_SALE_1001_LDM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1001_LDataSet ds 	= (NM_SALE_1001_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public NM_SALE_1002_LDataSet nm_sale_1002_l(NM_SALE_1002_LDM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1002_LDataSet ds 	= (NM_SALE_1002_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public NM_SALE_1003_ADataSet nm_sale_1003_a(NM_SALE_1003_ADM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1003_ADataSet ds 	= (NM_SALE_1003_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public NM_SALE_1004_ADataSet nm_sale_1004_a(NM_SALE_1004_ADM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1004_ADataSet ds 	= (NM_SALE_1004_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public NM_SALE_1005_ADataSet nm_sale_1005_a(NM_SALE_1005_ADM dm) throws AppException, SQLException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISFNC");
        NM_SALE_1005_ADataSet ds 	= (NM_SALE_1005_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
