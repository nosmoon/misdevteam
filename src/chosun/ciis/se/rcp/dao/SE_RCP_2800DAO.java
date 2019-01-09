/***************************************************************************************************
* 파일명 : SE_RCP_2800DAO.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-24
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_2800_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2810_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2820_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2800_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2810_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2820_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_2800DAO {
	
    public SE_RCP_2800_MDataSet se_rcp_2800_m(SE_RCP_2800_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_2800_MDataSet ds = (SE_RCP_2800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_RCP_2810_LDataSet se_rcp_2810_l(SE_RCP_2810_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_2810_LDataSet ds = (SE_RCP_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_RCP_2820_LDataSet se_rcp_2820_l(SE_RCP_2820_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_2820_LDataSet ds = (SE_RCP_2820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
