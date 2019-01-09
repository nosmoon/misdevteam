/***************************************************************************************************
 * �Լ���   : PSAllow1101DAO.java
 * ó������ : ����-������������
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ����
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����-������������
 */
public class PSAllow1101DAO {

    /**
     * ������������-�ʱ�
     * @param PS_L_BOEMP_ALON_KINDDM
     * @return PS_L_BOEMP_ALON_KINDDataSet
     */
    public PS_L_BOEMP_ALON_KINDDataSet selectBoemp_AlonKind(PS_L_BOEMP_ALON_KINDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOEMP_ALON_KINDDataSet ds = (PS_L_BOEMP_ALON_KINDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-����
     * @param PS_A_BOEMP_ALONKINDDM
     * @return PS_A_BOEMP_ALONKINDDataSet
     */
    public PS_A_BOEMP_ALONKINDDataSet accessBoemp_AlonKind(PS_A_BOEMP_ALONKINDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BOEMP_ALONKINDDataSet ds = (PS_A_BOEMP_ALONKINDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}