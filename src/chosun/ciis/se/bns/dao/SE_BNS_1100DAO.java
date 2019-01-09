/***************************************************************************************************
* 파일명 : SE_BNS_1100DAO.java
* 기능 :  판매 - 판촉물관리 - 판촉물등록
 * 작성일자 : 2009.03.11
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.bns.dm.SE_BNS_1100_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1110_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1120_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1130_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1140_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1160_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1170_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1180_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1100_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1110_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1120_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1130_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1140_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1160_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1170_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1180_ADataSet;

/**
 * 
 */
public class SE_BNS_1100DAO {
	
	public SE_BNS_1100_MDataSet se_bns_1100_m(SE_BNS_1100_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1100_MDataSet ds 	= (SE_BNS_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BNS_1110_LDataSet se_bns_1110_l(SE_BNS_1110_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1110_LDataSet ds 	= (SE_BNS_1110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1120_SDataSet se_bns_1120_s(SE_BNS_1120_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1120_SDataSet ds = (SE_BNS_1120_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BNS_1130_LDataSet se_bns_1130_l(SE_BNS_1130_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1130_LDataSet ds 	= (SE_BNS_1130_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1140_LDataSet se_bns_1140_l(SE_BNS_1140_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1140_LDataSet ds = (SE_BNS_1140_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1160_ADataSet se_bns_1160_a(SE_BNS_1160_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1160_ADataSet ds 	= (SE_BNS_1160_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BNS_1170_ADataSet se_bns_1170_a(SE_BNS_1170_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1170_ADataSet ds 	= (SE_BNS_1170_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BNS_1180_ADataSet se_bns_1180_a(SE_BNS_1180_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1180_ADataSet ds 	= (SE_BNS_1180_ADataSet) manager.executeCall(dm);
        
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
