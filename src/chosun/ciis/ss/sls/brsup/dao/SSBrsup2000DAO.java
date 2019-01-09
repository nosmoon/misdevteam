/***************************************************************************************************
* ���ϸ� : SSBrsup2000DAO.java
* ��� : ��������-������Ȳ�� ���� DAO
* �ۼ����� : 2004-03-06
* �ۼ��� : ��뼷
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
 * ��������-������Ȳ�� ���� DAO
 */

public class SSBrsup2000DAO {
    /**
     * ��������-������Ȳ-IS���-�ʱ�ȭ��
     * @param dm SS_L_PROMSTAF_INIT_ISDM
     * @return SS_L_PROMSTAF_INIT_ISDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_INIT_ISDataSet initPromStafIS(SS_L_PROMSTAF_INIT_ISDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_INIT_ISDataSet ds = (SS_L_PROMSTAF_INIT_ISDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-IS���-���
     * @param dm SS_L_PROMSTAF_ISDM
     * @return SS_L_PROMSTAF_ISDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_ISDataSet selectPromStafISList(SS_L_PROMSTAF_ISDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_ISDataSet ds = (SS_L_PROMSTAF_ISDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-������Ȳ-IS���-excel   
     */
    public SS_L_PROMSTAF_IS_EXCELDataSet selectPromStafISPrint(SS_L_PROMSTAF_IS_EXCELDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_IS_EXCELDataSet ds = (SS_L_PROMSTAF_IS_EXCELDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-IS���-��
     * @param dm  SS_S_PROMSTAF_ISDM
     * @return  SS_S_PROMSTAF_ISDataSet
     * @throws AppException
     */
    public SS_S_PROMSTAF_ISDataSet selectPromStafISDetail(SS_S_PROMSTAF_ISDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_PROMSTAF_ISDataSet ds = (SS_S_PROMSTAF_ISDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-IS���-���
     * @param dm SS_A_PROMSTAF_ISDM
     * @return SS_A_PROMSTAF_ISDataSet
     * @throws AppException
     */
    public SS_A_PROMSTAF_ISDataSet insertPromStafIS(SS_A_PROMSTAF_ISDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_PROMSTAF_ISDataSet ds = (SS_A_PROMSTAF_ISDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-IS���-����
     * @param dm SS_A_PROMSTAF_ISDM
     * @return SS_A_PROMSTAF_ISDataSet
     * @throws AppException
     */
    public SS_A_PROMSTAF_ISDataSet updatePromStafIS(SS_A_PROMSTAF_ISDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_PROMSTAF_ISDataSet ds = (SS_A_PROMSTAF_ISDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-IS���-����
     * @param dm SS_A_PROMSTAF_ISDM
     * @return SS_A_PROMSTAF_ISDataSet
     * @throws AppException
     */
    public SS_A_PROMSTAF_ISDataSet deletePromStafIS(SS_A_PROMSTAF_ISDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_PROMSTAF_ISDataSet ds = (SS_A_PROMSTAF_ISDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-�������-�ʱ�ȭ��
     * @param dm SS_L_PROMSTAF_INITDM
     * @return SS_L_PROMSTAF_INITDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_INITDataSet initPromStaf(SS_L_PROMSTAF_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_INITDataSet ds = (SS_L_PROMSTAF_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-������Ȳ-�������-���
     * @param dm SS_L_PROMSTAFDM
     * @return SS_L_PROMSTAFDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAFDataSet selectPromStafList(SS_L_PROMSTAFDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAFDataSet ds = (SS_L_PROMSTAFDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_PROMSTAF_PRINTDataSet selectPromStafListPrint(SS_L_PROMSTAF_PRINTDM dm ) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_PROMSTAF_PRINTDataSet ds = (SS_L_PROMSTAF_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    

    /**
     * ��������-������Ȳ-�������-��
     * @param dm  SS_S_PROMSTAFDM
     * @return  SS_S_PROMSTAFDataSet
     * @throws AppException
     */
    public SS_S_PROMSTAFDataSet selectPromStafDetail(SS_S_PROMSTAFDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_PROMSTAFDataSet ds = (SS_S_PROMSTAFDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}