/***************************************************************************************************
 * ���ϸ�   : PSprint1101DAO.java
 * ���     : ���-���ȭ���� �ڵ尪�� ��ȸ
 * �ۼ����� : 2006-02-01
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.print.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.dao.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * ���-����ʱ�Ŵ�
 */
public class PSPrint1101DAO {
    public PSPrint1101DAO() {
    }

    /**
     * ���-����ʱ�Ŵ�
     * @param PS_S_PRINT_INITDM
     * @return PS_S_PRINT_INITDataSet
     */
    public PS_S_PRINT_INITDataSet selectCodeList(PS_S_PRINT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_PRINT_INITDataSet ds = (PS_S_PRINT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
