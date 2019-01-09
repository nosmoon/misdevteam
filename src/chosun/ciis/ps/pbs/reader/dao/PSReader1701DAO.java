/***************************************************************************************************
 * ���ϸ�   : PSReader1701DAO.java
 * ���     : ����-�����Է¸���Ʈ
 * �ۼ����� : 2004-11-29
 * �ۼ���   : ����ǥ
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
 *  ����-�����Է¸���Ʈ
 */
public class PSReader1701DAO {
    public PSReader1701DAO() {
    }

    /**
     *  ����-�����Է¸���Ʈ
     * @param PS_L_TODAYINPUT_RDRDM
     * @return PS_L_TODAYINPUT_RDRDataSet
     */
    public PS_L_TODAYINPUT_RDRDataSet selectTodayInputList(PS_L_TODAYINPUT_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_TODAYINPUT_RDRDataSet ds = (PS_L_TODAYINPUT_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
