package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr12500DAO {


  //�������հ���-���Ͱ���-���Ͱ�����-Ȯ��μ�_����Ͽ�
    public SS_MO_SLS_BRMGR_2510_LDataSet mo_selectBrmgr2510(SS_MO_SLS_BRMGR_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_SLS_BRMGR_2510_LDataSet ds = (SS_MO_SLS_BRMGR_2510_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }


    //�������հ���-���Ͱ���-���Ͱ�����-�μ���Ȳ_����Ͽ�
    public SS_MO_SLS_BRMGR_2511_LDataSet mo_selectBrmgr2511(SS_MO_SLS_BRMGR_2511_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_SLS_BRMGR_2511_LDataSet ds = (SS_MO_SLS_BRMGR_2511_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //�������հ���-���Ͱ���-���Ͱ�����-����_����Ͽ�
    public SS_MO_SLS_BRMGR_2512_LDataSet mo_selectBrmgr2512(SS_MO_SLS_BRMGR_2512_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_SLS_BRMGR_2512_LDataSet ds = (SS_MO_SLS_BRMGR_2512_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //�������հ���-���Ͱ���-���Ͱ�����-���������_����Ͽ�
    public SS_MO_SLS_BRMGR_2513_LDataSet mo_selectBrmgr2513(SS_MO_SLS_BRMGR_2513_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_SLS_BRMGR_2513_LDataSet ds = (SS_MO_SLS_BRMGR_2513_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //�������հ���-���Ͱ���-���Ͱ�����-����/��Ÿ_����Ͽ�
    public SS_MO_SLS_BRMGR_2514_LDataSet mo_selectBrmgr2514(SS_MO_SLS_BRMGR_2514_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_SLS_BRMGR_2514_LDataSet ds = (SS_MO_SLS_BRMGR_2514_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}

