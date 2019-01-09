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

import chosun.ciis.se.rcp.dm.SE_RCP_5300_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5310_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5320_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5300_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5310_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5320_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_5300DAO {
	
    public SE_RCP_5300_MDataSet se_rcp_5300_m(SE_RCP_5300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("dao.bong");
        SE_RCP_5300_MDataSet ds = (SE_RCP_5300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5310_LDataSet se_rcp_5310_l(SE_RCP_5310_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5310_LDataSet ds = (SE_RCP_5310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_RCP_5320_ADataSet se_rcp_5320_a(SE_RCP_5320_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5320_ADataSet ds = (SE_RCP_5320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
