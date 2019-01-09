/***************************************************************************************************
 * ���ϸ�   : PSReader1601DAO.java
 * ���     : ����-���ڵ�޺ο�
 * �ۼ����� : 2004-04-22
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-���ڵ�޺ο�
 */
public class PSReader1601DAO {
    public PSReader1601DAO() {
    }

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

    /**
     * ���ڵ�ް���-����÷��� ȸ�� �˻�
     * @param CO_S_TASOM_RDRIDDM
     * @return CO_S_TASOM_RDRIDDataSet
     */
    public CO_S_TASOM_RDRIDDataSet select_mplist(CO_S_TASOM_RDRIDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_S_TASOM_RDRIDDataSet ds = (CO_S_TASOM_RDRIDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
