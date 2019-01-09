/***************************************************************************************************
* ���ϸ� : PSBill1501DAO.java
* ��� : ����-���,����,������ ���� DAO
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ps.pbs.bill.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;
import chosun.ciis.ps.pbs.bill.ds.*;

//import sls.common.ds.*;
//import sls.common.dm.*;

/**
 * ����-���,����,������ ���� DAO
 */

public class PSBill1501DAO {


    /**
     * ����-���,����,����
     * @param dm PS_A_TMDM
     * @return PS_A_TMDataSet
     * @throws AppException
     * /
    public PS_A_TMDataSet accessCNS(PS_A_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_TMDataSet ds = (PS_A_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ǵ��ڰ˻�-���
     * @param dm PS_L_PBRDR_LISTDM
     * @return PS_L_PBRDR_LISTDataSet
     * @throws AppException
     */
    public PS_L_PBRDR_LISTDataSet selectPbrdrList(PS_L_PBRDR_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_PBRDR_LISTDataSet ds = (PS_L_PBRDR_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ����-�ڵ���ü����-�ʱ�ȭ��
     * @param dm PS_L_SHFTAPLC_INITDM
     * @return PS_L_SHFTAPLC_INITDataSet
     * @throws AppException
     */
    public PS_L_SHFTAPLC_INITDataSet initAutoShftAplc(PS_L_SHFTAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFTAPLC_INITDataSet ds = (PS_L_SHFTAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ڵ���ü����-���
     * @param dm PS_I_SHFTAPLCDM
     * @return PS_I_SHFTAPLCDataSet
     * @throws AppException
     */
    public PS_I_SHFTAPLCDataSet insertAutoshftAplc(PS_I_SHFTAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_SHFTAPLCDataSet ds = (PS_I_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����-���� ���-���
     * @param dm PS_L_DSCTSTAT_TMDM
     * @return PS_L_DSCTSTAT_TMDataSet
     * @throws AppException
     * /
    public PS_L_DSCTSTAT_TMDataSet selectDsctStatDetail(PS_L_DSCTSTAT_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCTSTAT_TMDataSet ds = (PS_L_DSCTSTAT_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
}
