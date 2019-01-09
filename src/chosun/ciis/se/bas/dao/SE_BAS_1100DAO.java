/***************************************************************************************************
* 파일명 : SE_BAS_1100DAO.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
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

import chosun.ciis.se.bas.dm.SE_BAS_1100_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1110_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1120_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1130_ADM;
import chosun.ciis.se.bas.ds.SE_BAS_1100_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1110_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1120_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1130_ADataSet;

/**
 * 
 */
public class SE_BAS_1100DAO {
	
	public SE_BAS_1100_MDataSet se_bas_1100_m(SE_BAS_1100_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1100_MDataSet ds 	= (SE_BAS_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BAS_1110_LDataSet se_bas_1110_l(SE_BAS_1110_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1110_LDataSet ds 	= (SE_BAS_1110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BAS_1120_LDataSet se_bas_1120_l(SE_BAS_1120_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1120_LDataSet ds 	= (SE_BAS_1120_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BAS_1130_ADataSet se_bas_1130_a(SE_BAS_1130_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1130_ADataSet ds 	= (SE_BAS_1130_ADataSet) manager.executeCall(dm);
        
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
