/***************************************************************************************************
* ���ϸ� 	: SSBrsup2100DAO.java
* ��� 		: ��������-��ǻ��A/S,������Ȳ�� ���� DAO
* �ۼ����� 	: 2004-03-12
* �ۼ��� 	: ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-��ǻ��A/S,������Ȳ�� ���� DAO
 */

public class SSBrsup2100DAO {

    /**
     * ��������-��ǻ��A/S-���
     * @param dm SS_L_ASREQDM
     * @return SS_L_ASREQDataSet
     * @throws AppException
     */
    public SS_L_ASREQDataSet selectAsreqList(SS_L_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-��ǻ��A/S-��
     * @param dm SS_S_ASREQDM
     * @return SS_S_ASREQDataSet
     * @throws AppException
     */
    public SS_S_ASREQDataSet selectAsreqDetail(SS_S_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ASREQDataSet ds = (SS_S_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-��ǻ��A/S-���,����,����
     * @param dm SS_A_ASREQDM
     * @return SS_A_ASREQDataSet
     * @throws AppException
     */
    public SS_A_ASREQDataSet accessAsreq(SS_A_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_ASREQDataSet ds = (SS_A_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_COMMDEPTCDDataSet initLeafScat(SS_L_COMMDEPTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_COMMDEPTCDDataSet ds = (SS_L_COMMDEPTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-���
     * @param dm SS_L_ISLEAF_SCATDM
     * @return SS_L_ISLEAF_SCATDataSet
     * @throws AppException
     */
    public SS_L_ISLEAF_SCATDataSet selectLeafScatList(SS_L_ISLEAF_SCATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ISLEAF_SCATDataSet ds = (SS_L_ISLEAF_SCATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}