/***************************************************************************************************
* ���ϸ� : SSCa1000DAO.java
* ��� : ���̹�����-���̹�������
* �ۼ����� : 2005-04-18
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.ca.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;

public class SSCa1000DAO {
    /**
     * ���̹�����-���̹�������-�ʱ�ȭ��
     * @param dm SS_L_CA_HEAD_INITDM
     * @return SS_L_CA_HEAD_INITDataSet
     * @throws AppException
     */
    public SS_L_CA_HEAD_INITDataSet initCaHead(SS_L_CA_HEAD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CA_HEAD_INITDataSet ds = (SS_L_CA_HEAD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹�������-���
     * @param dm SS_L_CA_HEADDM
     * @return SS_L_CA_HEADDataSet
     * @throws AppException
     */
    public SS_L_CA_HEADDataSet selectCaHeadList(SS_L_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CA_HEADDataSet ds = (SS_L_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹�������-��
     * @param dm  SS_S_CA_HEADDM
     * @return  SS_S_CA_HEADDataSet
     * @throws AppException
     */
    public SS_S_CA_HEADDataSet selectCaHeadDetail(SS_S_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_CA_HEADDataSet ds = (SS_S_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹�������-���,����,����
     * @param dm SS_A_CA_HEADDM
     * @return SS_A_CA_HEADDataSet
     * @throws AppException
     */
    public SS_A_CA_HEADDataSet accessCaHead(SS_A_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_CA_HEADDataSet ds = (SS_A_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}