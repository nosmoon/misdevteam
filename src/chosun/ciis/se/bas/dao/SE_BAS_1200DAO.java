/***************************************************************************************************
* 파일명 : SE_BAS_1200DAO.java
* 기능 :  판매 - 기준정보 - 매체단가관리
 * 작성일자 : 2009.02.21
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.bas.dm.SE_BAS_1200_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1210_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1220_ADM;
import chosun.ciis.se.bas.ds.SE_BAS_1200_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1210_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1220_ADataSet;

/**
 * 
 */
public class SE_BAS_1200DAO {
	
	public SE_BAS_1200_MDataSet se_bas_1200_m(SE_BAS_1200_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1200_MDataSet ds 	= (SE_BAS_1200_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BAS_1210_LDataSet se_bas_1210_l(SE_BAS_1210_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1210_LDataSet ds 	= (SE_BAS_1210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BAS_1220_ADataSet se_bas_1220_a(SE_BAS_1220_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1220_ADataSet ds 	= (SE_BAS_1220_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /*
    public SE_BAS_1002DataSet getCodeList(SE_BAS_1002DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1002DataSet ds = (SE_BAS_1002DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1010DataSet insUpdDel(SE_BAS_1010DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1010DataSet ds = (SE_BAS_1010DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1020DataSet multiUpdate(SE_BAS_1020DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1020DataSet ds = (SE_BAS_1020DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    */
    
}
