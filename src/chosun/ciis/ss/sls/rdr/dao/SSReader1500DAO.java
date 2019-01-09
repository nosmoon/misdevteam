/***************************************************************************************************
 * ���ϸ� : SSReader1500DAO.java
 * ��  �� : ������Ȳ-VacationStop-�ڵ带 ���� DAO
 * �ۼ����� : 2004-03-29
 * �ۼ��� : ��뼷
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
 * ������Ȳ-VacationStop-�ڵ带 ���� DAO
 */

public class SSReader1500DAO {

    /**
     * ������Ȳ-VacationStop-�ڵ�-�ʱ�ȭ��
     * @param dm SS_L_VSCD_INITDM ��ü
     * @return SS_L_VSCD_INITDataSet
     * @throws AppException
     */
    public SS_L_VSCD_INITDataSet initVsCode(SS_L_VSCD_INITDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_L_VSCD_INITDataSet ds = (SS_L_VSCD_INITDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * ������Ȳ-VacationStop-�ڵ�-���
     * @param dm SS_L_VSCDDM ��ü
     * @return SS_L_VSCDDataSet
     * @throws AppException
     * @throws RemoteException
     */
    public SS_L_VSCDDataSet selectVsCodeList(SS_L_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_L_VSCDDataSet ds = (SS_L_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * ������Ȳ-VacationStop-�ڵ�-��
     * @param dm SS_S_VSCDDM ��ü
     * @return SS_S_VSCDDataSet
     * @throws AppException
     */
    public SS_S_VSCDDataSet selectVsCodeDetail(SS_S_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_S_VSCDDataSet ds = (SS_S_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * ������Ȳ-VacationStop-�ڵ�-���
     * @param dm SS_A_VSCDDM ��ü
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet insertVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * ������Ȳ-VacationStop-�ڵ�-����
     * @param dm SS_A_VSCDDM ��ü
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet updateVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * ������Ȳ-VacationStop-�ڵ�-����
     * @param dm SS_A_VSCDDM ��ü
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet deleteVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

}