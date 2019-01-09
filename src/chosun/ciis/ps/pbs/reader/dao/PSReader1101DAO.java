/***************************************************************************************************
 * ���ϸ�   : PSReader1101DAO.java
 * ���     : ����-Ȯ�嵶�ڰ���
 * �ۼ����� : 2004-02-25
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
 * ����-Ȯ�嵶�ڰ���
 */
public class PSReader1101DAO {
    public PSReader1101DAO() {
    }

    /**
     * Ȯ�嵶�ڰ���-�ʱ�,����ȸ,RESET
     * @param PS_S_RDR_EXTNDM
     * @return PS_S_RDR_EXTNDataSet
     */
    public PS_S_RDR_EXTNDataSet selectRdr_ExtnINFO(PS_S_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ�嵶�ڰ���-�Է�
     * @param PS_I_RDR_EXTNDM
     * @return PS_I_RDR_EXTNDataSet
     */
    public PS_I_RDR_EXTNDataSet insertRdr_ExtnINFO(PS_I_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_RDR_EXTNDataSet ds = (PS_I_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ�嵶�ڰ���-����
     * @param PS_U_RDR_EXTNDM
     * @return PS_U_RDR_EXTNDataSet
     */
    public PS_U_RDR_EXTNDataSet updateRdr_ExtnINFO(PS_U_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_RDR_EXTNDataSet ds = (PS_U_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ�嵶�ڰ���-����
     * @param PS_D_RDR_EXTNDM
     * @return PS_D_RDR_EXTNDataSet
     */
    public PS_D_RDR_EXTNDataSet deleteRdr_ExtnINFO(PS_D_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_RDR_EXTNDataSet ds = (PS_D_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
