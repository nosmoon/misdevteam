/***************************************************************************************************
 * �Լ���   : PSAllow1801DAO.java
 * ó������ : ����-���������
 * �ۼ����� : 2004-03-12
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
 * ����-���������
 */
public class PSAllow1801DAO {

    /**
     * ���������-�ʱ�
     * @param PS_L_DEPTEMP_ALON_PTCRDM
     * @return PS_L_DEPTEMP_ALON_PTCRDataSet
     */
    public PS_L_DEPTEMP_ALON_PTCRDataSet selectAlonClos(PS_L_DEPTEMP_ALON_PTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DEPTEMP_ALON_PTCRDataSet ds = (PS_L_DEPTEMP_ALON_PTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���������-����
     * @param PS_A_BO_ALON_COLSDM
     * @return PS_A_BO_ALON_COLSDataSet
     */
    public PS_A_BO_ALON_COLSDataSet accessAlonClos(PS_A_BO_ALON_COLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BO_ALON_COLSDataSet ds = (PS_A_BO_ALON_COLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���������-�������
     * @param PS_D_BO_ALON_CANCDM
     * @return PS_D_BO_ALON_CANCDataSet
     */
    public PS_D_BO_ALON_CANCDataSet deleteAlonClos(PS_D_BO_ALON_CANCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_BO_ALON_CANCDataSet ds = (PS_D_BO_ALON_CANCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}