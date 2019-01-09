/***************************************************************************************************
* ���ϸ� : SSBrsup2600DAO.java
* ��� : ��������-����_�ڵ���ü-��ü��û���� ���� DAO
* �ۼ����� : 2009-05-20
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
 * ��������-����_�ڵ���ü-��ü��û���� ���� DAO
 */

public class SSBrsup2600DAO {
    
    /**
     * ��������-����_�ڵ���ü-��ü��û����-�����ȸȭ��
     * @param dm SS_L_SHFTAPLCDM
     * @return SS_L_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLCDataSet listSearchTransfer(SS_L_SHFTAPLCDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLCDataSet ds = (SS_L_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-����_�ڵ���ü-��ü��û����-��ȭ��
     * @param dm SS_S_SHFTAPLCDM
     * @return SS_S_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_S_SHFTAPLCDataSet detailSearchTransfer(SS_S_SHFTAPLCDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SHFTAPLCDataSet ds = (SS_S_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-����_�ڵ���ü-��ü��û����-���ε�
     * @param dm SS_S_SHFTAPLCDM
     * @return SS_S_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLC_UPLOADDataSet uploadSearchTransfer(SS_L_SHFTAPLC_UPLOADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLC_UPLOADDataSet ds = (SS_L_SHFTAPLC_UPLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}