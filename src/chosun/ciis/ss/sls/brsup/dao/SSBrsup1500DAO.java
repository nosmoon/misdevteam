/***************************************************************************************************
* ���ϸ� : SSBrsup1500DAO.java
* ��� : ��������-���غ���-���,�����,������Ȳ�� ���� DAO
* �ۼ����� : 2004-02-20
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
 * ��������-���غ���-���,�����,������Ȳ�� ���� DAO
 */

public class SSBrsup1500DAO {
    /**
     * ��������-���غ���-���-�ʱ�ȭ��
     * @param dm SS_L_INSRACCD_INITDM
     * @return SS_L_INSRACCD_INITDataSet
     * @throws AppException
     */
    public SS_L_INSRACCD_INITDataSet initInsrAccd(SS_L_INSRACCD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRACCD_INITDataSet ds = (SS_L_INSRACCD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-���
     * @param dm SS_L_INSRACCDDM
     * @return SS_L_INSRACCDDataSet
     * @throws AppException
     */
    public SS_L_INSRACCDDataSet selectInsrAccdList(SS_L_INSRACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRACCDDataSet ds = (SS_L_INSRACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-��
     * @param dm SS_S_INSRACCDDM
     * @return SS_S_INSRACCDDataSet
     * @throws AppException
     */
    public SS_S_INSRACCDDataSet selectInsrAccdDetail(SS_S_INSRACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRACCDDataSet ds = (SS_S_INSRACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-����(����)
     * @param dm SS_A_INSRACCDDM
     * @return SS_A_INSRACCDDataSet
     * @throws AppException
     */
    public SS_A_INSRACCDDataSet updateInsrAccd(SS_A_INSRACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRACCDDataSet ds = (SS_A_INSRACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-����
     * @param dm SS_A_INSRACCDDM
     * @return SS_A_INSRACCDDataSet
     * @throws AppException
     */
    public SS_A_INSRACCDDataSet deleteInsrAccd(SS_A_INSRACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRACCDDataSet ds = (SS_A_INSRACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-�μ�
     * @param dm XXX
     * @return XXX
     * @throws AppException
     */
    /*
    public SS_A_NWSPITEMACCDDataSet deleteNwspItemAccd(SS_A_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMACCDDataSet ds = (SS_A_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    */

   /**
    * ��������-���غ���-�����-�ʱ�ȭ��
    * @param dm SS_L_NWBUSEOCDDM
    * @return SS_L_NWBUSEOCDDataSet
    * @throws AppException
    */
   public SS_L_INSRAMT_INITDataSet initInsrAmt(SS_L_INSRAMT_INITDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_INSRAMT_INITDataSet ds = (SS_L_INSRAMT_INITDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }

   /**
    * ��������-���غ���-�����-���
    * @param dm SS_L_INSRAMTDM
    * @return SS_L_INSRAMTDataSet
    * @throws AppException
    */
   public SS_L_INSRAMTDataSet selectInsrAmtList(SS_L_INSRAMTDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_INSRAMTDataSet ds = (SS_L_INSRAMTDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }

   /**
    * ��������-���غ���-�����-����(����)
    * @param dm SS_U_INSRAMTDM
    * @return SS_U_INSRAMTDataSet
    * @throws AppException
    */
   public SS_U_INSRAMTDataSet updateInsrAmt(SS_U_INSRAMTDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_U_INSRAMTDataSet ds = (SS_U_INSRAMTDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }

   /**
    * ��������-���غ���-������Ȳ-�ʱ�ȭ��
    * @param dm SS_L_NWBUSEOCDDM
    * @return SS_L_NWBUSEOCDDataSet
    * @throws AppException
    */
   public SS_L_INSR_STCS_INITDataSet initInsrStcs(SS_L_INSR_STCS_INITDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_INSR_STCS_INITDataSet ds = (SS_L_INSR_STCS_INITDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }

   /**
    * ��������-���غ���-������Ȳ-���
    * @param dm SS_L_INSR_STCSDM
    * @return SS_L_INSR_STCSDataSet
    * @throws AppException
    */
   public SS_L_INSR_STCSDataSet selectInsrStcsList(SS_L_INSR_STCSDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_INSR_STCSDataSet ds = (SS_L_INSR_STCSDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }

}