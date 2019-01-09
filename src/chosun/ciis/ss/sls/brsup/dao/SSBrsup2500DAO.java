/***************************************************************************************************
* ���ϸ� : SSBrsup2500DAO.java
* ��� : �������������ý���-���˹������� ���� DAO
* �ۼ����� : 2004-04-28
* �ۼ��� : ����
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
 * �������������ý���-���˹������� ���� DAO
 */

public class SSBrsup2500DAO {
    /**
     * �������������ý���-���˹�������-�ʱ�ȭ��
     * @param dm SS_L_BNSITEMINOUT_INITDM
     * @return SS_L_BNSITEMINOUT_INITDataSet
     * @throws AppException
     */
    public SS_L_BNSITEMINOUT_INITDataSet initSalespromotion(SS_L_BNSITEMINOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BNSITEMINOUT_INITDataSet ds = (SS_L_BNSITEMINOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
     * @param dm SS_L_POPINBNSITEMINOUT_INITDM
     * @return SS_L_POPINBNSITEMINOUT_INITDataSet
     * @throws AppException
     */
    public SS_L_POPINBNSITEMINOUT_INITDataSet popInInitSalespromotion(SS_L_POPINBNSITEMINOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_POPINBNSITEMINOUT_INITDataSet ds = (SS_L_POPINBNSITEMINOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹������Ȳ-��ȸȭ��-����߰� �˾�
     * @param dm SS_L_POPOUTBNSITEM_INITDM
     * @return SS_L_POPOUTBNSITEM_INITDataSet
     * @throws AppException
     */
    public SS_L_POPOUTBNSITEM_INITDataSet popOutInitSalespromotion(SS_L_POPOUTBNSITEM_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_POPOUTBNSITEM_INITDataSet ds = (SS_L_POPOUTBNSITEM_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-������Ȳ-���˹������Ȳ ��������� �˾�
     * @param dm SS_I_BNSITEMTOTALOUT_INITDM
     * @return SS_I_BNSITEMTOTALOUT_INITDataSet
     * @throws AppException
     */
    public SS_I_BNSITEMTOTALOUT_INITDataSet popTotalOutInitSalespromotion(SS_I_BNSITEMTOTALOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BNSITEMTOTALOUT_INITDataSet ds = (SS_I_BNSITEMTOTALOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�-���
     * @param dm SS_I_POPINBNSITEMINOUTDM
     * @return SS_I_POPINBNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_I_POPINBNSITEMINOUTDataSet popInInsertSalespromotion(SS_I_POPINBNSITEMINOUTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPINBNSITEMINOUTDataSet ds = (SS_I_POPINBNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-������Ȳ-���˹������Ȳ ����߰� ��ǰ�űԵ��   
     * @param dm SS_I_POPOUTBNSITEMDM
     * @return SS_I_POPOUTBNSITEMDataSet
     * @throws AppException
     */
    public SS_I_POPOUTBNSITEMDataSet popOutInsertSalespromotion(SS_I_POPOUTBNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPOUTBNSITEMDataSet ds = (SS_I_POPOUTBNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-������Ȳ-���˹������Ȳ ���Ĺ�� �ǿ� ���� ���� ����
     * @param dm SS_I_POPAFTERBNSITEMDM
     * @return SS_I_POPAFTERBNSITEMDataSet
     * @throws AppException
     */
    public SS_I_POPAFTERBNSITEMDataSet popAfterInsertSalespromotion(SS_I_POPAFTERBNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPAFTERBNSITEMDataSet ds = (SS_I_POPAFTERBNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-������Ȳ-���˹������Ȳ ���Ĺ�� �ǿ� ���� ���� ����
     * @param dm SS_I_BNSITEMTOTALOUTDM
     * @return SS_I_BNSITEMTOTALOUTDataSet
     * @throws AppException
     */
    public SS_I_BNSITEMTOTALOUTDataSet popTotalOutInsertSalespromotion(SS_I_BNSITEMTOTALOUTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BNSITEMTOTALOUTDataSet ds = (SS_I_BNSITEMTOTALOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹�������-�����ȸȭ��
     * @param dm SS_L_TASLM_BNSITEMINOUTDM
     * @return SS_L_TASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_L_TASLM_BNSITEMINOUTDataSet listSalespromotion(SS_L_TASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_TASLM_BNSITEMINOUTDataSet ds = (SS_L_TASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹�������-��ȭ��
     * @param dm  SS_S_TASLM_BNSITEMINOUTDM
     * @return  SS_S_TASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_S_TASLM_BNSITEMINOUTDataSet detailSalespromotion(SS_S_TASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_TASLM_BNSITEMINOUTDataSet ds = (SS_S_TASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹�������-����ȸȭ��
     * @param dm SS_S_DETASLM_BNSITEMINOUTDM
     * @return SS_S_DETASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_S_DETASLM_BNSITEMINOUTDataSet detailSearchSalespromotion(SS_S_DETASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_DETASLM_BNSITEMINOUTDataSet ds = (SS_S_DETASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������������ý���-���˹�������-����ȸȭ��-����
     * @param dm SS_D_BNSITEMINOUTDM
     * @return SS_D_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_D_BNSITEMINOUTDataSet detailDeleteSalespromotion(SS_D_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_D_BNSITEMINOUTDataSet ds = (SS_D_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}