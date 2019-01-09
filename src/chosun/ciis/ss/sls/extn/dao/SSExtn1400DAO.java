/***************************************************************************************************
* ���ϸ� : SSExtn1400DAO.java
* ��� : ���Ȯ������ ���� DAO
* �ۼ����� : 2003-12-17
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-Ȯ��������� �� ���� DAO
 */

public class SSExtn1400DAO {

    /**
     * Ȯ����Ȳ-Ȯ��������-���
     * @param dm SS_L_RDR_EXTN_SLSCLOSDM
     * @return SS_L_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SLSCLOSDataSet selectSlsCostList(SS_L_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SLSCLOSDataSet ds = (SS_L_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-��
     * @param dm  SS_S_RDR_EXTN_SLSCLOSDM
     * @return  SS_S_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_SLSCLOSDataSet selectSlsCostDetail(SS_S_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_SLSCLOSDataSet ds = (SS_S_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-����(���)
     * @param dm SS_A_RDR_EXTN_SLSCLOSDM
     * @return SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet insertSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-����(����)
     * @param dm  SS_A_RDR_EXTN_SLSCLOSDM
     * @return  SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet updateSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-����
     * @param dm SS_A_RDR_EXTN_SLSCLOSDM
     * @return SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet deleteSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-����
     * @param dm SS_A_RDR_EXTN_SLSCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet closeSlsCost(SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-�������
     * @param dm SS_A_RDR_EXTN_SLSCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet closeCancelSlsCost(SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet slsAmtInit(SS_L_NWBUSEOCDDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-���
     * @param dm SS_L_RDR_EXTN_SLSCOSTDM
     * @return SS_L_RDR_EXTN_SLSCOSTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SLSCOSTDataSet selectSlsAmtList(SS_L_RDR_EXTN_SLSCOSTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SLSCOSTDataSet ds = (SS_L_RDR_EXTN_SLSCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-����
     * @param dm SS_U_RDR_EXTN_SLSCOSTDM
     * @return SS_U_RDR_EXTN_SLSCOSTDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_SLSCOSTDataSet updateSlsAmt(SS_U_RDR_EXTN_SLSCOSTDM dm ) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_SLSCOSTDataSet ds = (SS_U_RDR_EXTN_SLSCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}