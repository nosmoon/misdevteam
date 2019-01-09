/***************************************************************************************************
* ���ϸ� : SSExtn1600DAO.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-���,������ ���� DAO
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-���,������ ���� DAO
 */

public class SSExtn1600DAO {
    /**
     * Ȯ����Ȳ-���̹�Ȯ��-�������-�ʱ�ȭ��
     * @param dm SS_L_PROMSTAF_INIT_CYEXTNDM
     * @return SS_L_PROMSTAF_INIT_CYEXTNDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_INIT_CYEXTNDataSet initPromStafCYEXTN(SS_L_PROMSTAF_INIT_CYEXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_INIT_CYEXTNDataSet ds = (SS_L_PROMSTAF_INIT_CYEXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-�������-���
     * @param dm SS_L_PROMSTAF_CYEXTNDM
     * @return SS_L_PROMSTAF_CYEXTNDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXTNDataSet selectPromStafCYEXTNList(SS_L_PROMSTAF_CYEXTNDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXTNDataSet ds = (SS_L_PROMSTAF_CYEXTNDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-�������-��
     * @param dm  SS_S_PROMSTAF_CYEXTNDM
     * @return  SS_S_PROMSTAF_CYEXTNDataSet
     * @throws AppException
     */
    public SS_S_PROMSTAF_CYEXTNDataSet selectPromStafCYEXTNDetail(SS_S_PROMSTAF_CYEXTNDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_PROMSTAF_CYEXTNDataSet ds = (SS_S_PROMSTAF_CYEXTNDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-�������-�μ�
     * @param dm SS_L_PROMSTAF_CYEXTN_PRINTDM
     * @return SS_L_PROMSTAF_CYEXTN_PRINTDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXTN_PRINTDataSet printPromStafCYEXTNList(SS_L_PROMSTAF_CYEXTN_PRINTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = (SS_L_PROMSTAF_CYEXTN_PRINTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ��
     * @param dm SS_L_PROMSTAF_CYEXPAY_INITDM
     * @return SS_L_PROMSTAF_CYEXPAY_INITDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXPAY_INITDataSet initPromStafCYEXPay(SS_L_PROMSTAF_CYEXPAY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXPAY_INITDataSet ds = (SS_L_PROMSTAF_CYEXPAY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-���
     * @param dm SS_L_PROMSTAF_CYEXPAYDM
     * @return SS_L_PROMSTAF_CYEXPAYDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXPAYDataSet selectPromStafCYEXPayList(SS_L_PROMSTAF_CYEXPAYDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-����
     * @param dm  SS_U_CYEXPAYDM
     * @return  SS_U_CYEXPAYDataSet
     * @throws AppException
     */
    public SS_U_CYEXPAYDataSet updatePromStafCYEXpay(SS_U_CYEXPAYDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_CYEXPAYDataSet ds = (SS_U_CYEXPAYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}