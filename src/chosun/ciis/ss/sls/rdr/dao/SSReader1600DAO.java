/***************************************************************************************************
 * ���ϸ�   : SSReader1600DAO.java
 * ���     : ������Ȳ-���ڵ�޺ο��� ���� DAO
 * �ۼ����� : 2004-04-22
 * �ۼ���   : ��뼷
 **************************************************************************************************/
 /**************************************************************************************************
  * �������� : ����������û��Ȳ �߰� �� �����ڵ� �ڸ�Ʈ ó��
  * ������ : ��뼷
  * �������� : 2005-05-04
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ-���ڵ�޺ο��� ���� DAO
 */
public class SSReader1600DAO {

    /**
     * ���ڵ�ް���-��޽�û���� �˻�
     * @param CO_L_RDRCRTS_GRAD_APLCDM
     * @return CO_L_RDRCRTS_GRAD_APLCDataSet
     */
    public CO_L_RDRCRTS_GRAD_APLCDataSet selectGradAplcList(CO_L_RDRCRTS_GRAD_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڵ�ް���-��޽�û���� ���
     * @param CO_U_RDRCRTS_GRAD_GRNTDM
     * @return CO_U_RDRCRTS_GRAD_GRNTDataSet
     */
    public CO_U_RDRCRTS_GRAD_GRNTDataSet updateGradAplcGrnt(CO_U_RDRCRTS_GRAD_GRNTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڵ�ް���-���ں񱳴�� �˻�
     * @param CO_L_RDRCRTS_APLC_CMPRDM
     * @return CO_L_RDRCRTS_APLC_CMPRDataSet
     */
    public CO_L_RDRCRTS_APLC_CMPRDataSet selectAplcCmprList(CO_L_RDRCRTS_APLC_CMPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

/* 2005-05-04 ��뼷 �߰� */
    /**
     * ����������û-�ʱ�ȭ��
     * @param SS_L_RDRCRTS_INITDM
     * @return SS_L_RDRCRTS_INITDataSet
     */
    public SS_L_RDRCRTS_INITDataSet initRdrCrts(SS_L_RDRCRTS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDRCRTS_INITDataSet ds = (SS_L_RDRCRTS_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����������û-���
     * @param SS_L_RDRCRTSDM
     * @return SS_L_RDRCRTSDataSet
     */
    public SS_L_RDRCRTSDataSet selectRdrCrtsList(SS_L_RDRCRTSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDRCRTSDataSet ds = (SS_L_RDRCRTSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
