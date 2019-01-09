/***************************************************************************************************
* ���ϸ� : SE_RCP_4300DAO.java
* ��� : �Ǹ� - �Աݰ��� - �����Աݰ��� - ���������ù���
* �ۼ����� : 2009-05-25
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_4300_MDM;
import chosun.ciis.se.rcp.ds.SE_RCP_4300_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_4300DAO {
	
    public SE_RCP_4300_MDataSet se_rcp_4300_m(SE_RCP_4300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_4300_MDataSet ds = (SE_RCP_4300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
