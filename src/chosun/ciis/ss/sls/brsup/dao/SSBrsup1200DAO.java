/***************************************************************************************************
* ���ϸ� : SSBrsup1200DAO.java
* ��� : ��������-�Ź�������ǰ-����,����� ���� DAO
* �ۼ����� : 2004-02-06
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
 * ��������-�Ź�������ǰ-����,����� ���� DAO
 */

public class SSBrsup1200DAO {
    /**
     * ��������-�Ź�������ǰ-����-���
     * @param dm SS_L_NWSPITEMCOSTCLOSDM
     * @return SS_L_NWSPITEMCOSTCLOSDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMCOSTCLOSDataSet selectNwspitemCostList(SS_L_NWSPITEMCOSTCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMCOSTCLOSDataSet ds = (SS_L_NWSPITEMCOSTCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-��
     * @param dm  SS_S_NWSPITEMCOSTCLOSDM
     * @return  SS_S_NWSPITEMCOSTCLOSDataSet
     * @throws AppException
     */
    public SS_S_NWSPITEMCOSTCLOSDataSet selectNwspitemCostDetail(SS_S_NWSPITEMCOSTCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_NWSPITEMCOSTCLOSDataSet ds = (SS_S_NWSPITEMCOSTCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-����(���)
     * @param dm SS_A_NWSPITEMCOSTCLOSDM
     * @return SS_A_NWSPITEMCOSTCLOSDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLOSDataSet insertNwspitemCost(SS_A_NWSPITEMCOSTCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLOSDataSet ds = (SS_A_NWSPITEMCOSTCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-����(����)
     * @param dm  SS_A_NWSPITEMCOSTCLOSDM
     * @return  SS_A_NWSPITEMCOSTCLOSDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLOSDataSet updateNwspitemCost(SS_A_NWSPITEMCOSTCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLOSDataSet ds = (SS_A_NWSPITEMCOSTCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-����
     * @param dm SS_A_NWSPITEMCOSTCLOSDM
     * @return SS_A_NWSPITEMCOSTCLOSDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLOSDataSet deleteNwspitemCost(SS_A_NWSPITEMCOSTCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLOSDataSet ds = (SS_A_NWSPITEMCOSTCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-����
     * @param dm SS_A_NWSPITEMCOSTCLOS_CLOSEDM
     * @return SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet closeNwspitemCost(SS_A_NWSPITEMCOSTCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet ds = (SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-����-�������
     * @param dm SS_A_NWSPITEMCOSTCLOS_CLOSEDM
     * @return SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet closeCancelNwspitemCost(SS_A_NWSPITEMCOSTCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet ds = (SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet nwspitemCostBusnInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-���
     * @param dm SS_L_NWSPITEMCOST_BUSNDM
     * @return SS_L_NWSPITEMCOST_BUSNDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMCOST_BUSNDataSet selectNwspitemCostBusnList(SS_L_NWSPITEMCOST_BUSNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMCOST_BUSNDataSet ds = (SS_L_NWSPITEMCOST_BUSNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-�󼼸��
     * @param dm SS_L_NWSPITEMCOSTCLMTDM
     * @return SS_L_NWSPITEMCOSTCLMTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMCOSTCLMTDataSet selectNwspitemCostBusnDetail(SS_L_NWSPITEMCOSTCLMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMCOSTCLMTDataSet ds = (SS_L_NWSPITEMCOSTCLMTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-����(���)
     * @param dm SS_A_NWSPITEMCOSTCLMTDM
     * @return SS_A_NWSPITEMCOSTCLMTDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMCOSTCLMTDataSet insertNwspitemCostBusn(SS_A_NWSPITEMCOSTCLMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMCOSTCLMTDataSet ds = (SS_A_NWSPITEMCOSTCLMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet nwspitemCostSplyInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-���
     * @param dm SS_L_NWSPITEMCOST_SPLYDM
     * @return SS_L_NWSPITEMCOST_SPLYDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMCOST_SPLYDataSet selectNwspitemCostSplyList(SS_L_NWSPITEMCOST_SPLYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMCOST_SPLYDataSet ds = (SS_L_NWSPITEMCOST_SPLYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���(�������)-����(����)
     * @param dm SS_U_NWSPITEMCOSTDM
     * @return SS_U_NWSPITEMCOSTDataSet
     * @throws AppException
     */
    public SS_U_NWSPITEMCOSTDataSet updateNwspitemCostSply(SS_U_NWSPITEMCOSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NWSPITEMCOSTDataSet ds = (SS_U_NWSPITEMCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}