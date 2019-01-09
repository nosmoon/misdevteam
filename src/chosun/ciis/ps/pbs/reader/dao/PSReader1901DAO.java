/***************************************************************************************************
 * ���ϸ�   : PSReader1901DAO.java
 * ��  ��   : ����-�����Է¸��
 * �ۼ����� : 2008-07-14
 * �ۼ���   : ������
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
 *  ����-�����Է¸��
 */
public class PSReader1901DAO {
    public PSReader1901DAO() {
    }

    /**
     *  ����-�����Է¸��
     * @param PS_L_PBLMCLAMTDM
     * @return PS_L_PBLMCLAMTDataSet
     */
    public PS_L_PBLMCLAMTDataSet selectClamtList(PS_L_PBLMCLAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_PBLMCLAMTDataSet ds = (PS_L_PBLMCLAMTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
