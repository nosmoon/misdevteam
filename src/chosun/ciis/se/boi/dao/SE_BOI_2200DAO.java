/***************************************************************************************************
* 파일명 : SE_BOI_2200DAO.java
* 기능 :  판매 - 지국관리 - 지국세대등록
 * 작성일자 : 2009.03.11
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


import chosun.ciis.se.boi.dm.SE_BOI_2210_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2220_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2230_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2240_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2250_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2260_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2210_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2220_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2230_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2240_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2250_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2260_ADataSet;

/**
 * 
 */
public class SE_BOI_2200DAO {
	/*
	public SE_BNS_1100_MDataSet se_bns_1100_m(SE_BNS_1100_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1100_MDataSet ds 	= (SE_BNS_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	*/
    public SE_BOI_2210_LDataSet se_boi_2210_l(SE_BOI_2210_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BOI_2210_LDataSet ds 	= (SE_BOI_2210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_2220_LDataSet se_boi_2220_l(SE_BOI_2220_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_2220_LDataSet ds = (SE_BOI_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
/*
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
    */
    public SE_BOI_2230_ADataSet se_boi_2230_a(SE_BOI_2230_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BOI_2230_ADataSet ds 	= (SE_BOI_2230_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BOI_2240_ADataSet se_boi_2240_a(SE_BOI_2240_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BOI_2240_ADataSet ds 	= (SE_BOI_2240_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_2250_ADataSet se_boi_2250_a(SE_BOI_2250_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BOI_2250_ADataSet ds 	= (SE_BOI_2250_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_2260_ADataSet se_boi_2260_a(SE_BOI_2260_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BOI_2260_ADataSet ds 	= (SE_BOI_2260_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /*
    public SE_BNS_1180_ADataSet se_bns_1180_a(SE_BNS_1180_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BNS_1180_ADataSet ds 	= (SE_BNS_1180_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }*/
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
