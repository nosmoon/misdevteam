/***************************************************************************************************
* 파일명 : SE_RCP_5200DAO.java
* 기능 : 판매
* 작성일자 : 2012-11-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_5200_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5210_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5220_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_5230_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_5240_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5200_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5210_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5220_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5230_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5240_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_5200DAO {
	
    public SE_RCP_5200_MDataSet se_rcp_5200_m(SE_RCP_5200_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("dao.bong");
        SE_RCP_5200_MDataSet ds = (SE_RCP_5200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5210_LDataSet se_rcp_5210_l(SE_RCP_5210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5210_LDataSet ds = (SE_RCP_5210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5220_ADataSet se_rcp_5220_a(SE_RCP_5220_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5220_ADataSet ds = (SE_RCP_5220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5230_ADataSet se_rcp_5230_a(SE_RCP_5230_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5230_ADataSet ds = (SE_RCP_5230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5240_ADataSet se_rcp_5240_a(SE_RCP_5240_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5240_ADataSet ds = (SE_RCP_5240_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
