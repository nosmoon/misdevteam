/***************************************************************************************************
* ���ϸ� : SSCAMP1000DAO.java
* ��� : ķ����Ȯ�� DAO
* �ۼ����� : 2005-05-27
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.camp.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ķ����Ȯ���� DAO
 */

public class SSCAMP1000DAO {

    /**
     * ķ����Ȯ���� �ʱ�ȭ��
     * @param dm SS_L_CAMP_EXTN_INITDM
     * @return SS_L_CAMP_EXTN_INITDataSet
     * @throws AppException
     */
    public SS_L_CAMP_EXTN_INITDataSet init(SS_L_CAMP_EXTN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMP_EXTN_INITDataSet ds = (SS_L_CAMP_EXTN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ����Ȯ����-���
     * @param dm SS_I_CAMP_EXTNDM
     * @return SS_I_CAMP_EXTNDataSet
     * @throws AppException
     */
    public SS_I_CAMP_EXTNDataSet saveCampExtn(SS_I_CAMP_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_CAMP_EXTNDataSet ds = (SS_I_CAMP_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ����Ȯ����-�̺�Ʈ�����ȸ
     * @param dm SS_L_CAMP_EVENT_LISTDM
     * @return SS_L_CAMP_EVENT_LISTDataSet
     * @throws AppException
     */
    public SS_L_CAMP_EVENT_LISTDataSet searchCampEventList(SS_L_CAMP_EVENT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMP_EVENT_LISTDataSet ds = (SS_L_CAMP_EVENT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
