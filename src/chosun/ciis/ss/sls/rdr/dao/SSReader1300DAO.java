/***************************************************************************************************
* ���ϸ� : SSReader1300DAO.java
* ��� : ������Ȳ-VacationStop-������ ���� DAO
* �ۼ����� : 2004-02-25
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;


import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-VacationStop-������ ���� DAO
 */

public class SSReader1300DAO {
    /**
     * ������Ȳ-VacationStop-����-���
     * @param dm SS_L_VSCLOSDM
     * @return SS_L_VSCLOSDataSet
     * @throws AppException
     */
    public SS_L_VSCLOSDataSet selectVsclosList(SS_L_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCLOSDataSet ds = (SS_L_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-��
     * @param dm  SS_S_VSCLOSDM
     * @return  SS_S_VSCLOSDataSet
     * @throws AppException
     */
    public SS_S_VSCLOSDataSet selectVsclosDetail(SS_S_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_VSCLOSDataSet ds = (SS_S_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-����(���)
     * @param dm SS_A_VSCLOSDM
     * @return SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet insertVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-����(����)
     * @param dm  SS_A_VSCLOSDM
     * @return  SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet updateVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-����
     * @param dm SS_A_VSCLOSDM
     * @return SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet deleteVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-����
     * @param dm SS_A_VSCLOS_CLOSEDM
     * @return SS_A_VSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_VSCLOS_CLOSEDataSet closeVsclos(SS_A_VSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOS_CLOSEDataSet ds = (SS_A_VSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop-����-�������
     * @param dm SS_A_VSCLOS_CLOSEDM
     * @return SS_A_VSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_VSCLOS_CLOSEDataSet closeCancelVsclos(SS_A_VSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOS_CLOSEDataSet ds = (SS_A_VSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}