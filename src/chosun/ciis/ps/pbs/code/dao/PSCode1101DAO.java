/***********************************************
 * �Լ���   : PSCode1101DAO.java
 * ó������ : �ڵ�-���ົ�ڵ� ���, ��ȸ, ����, ����
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȯ
 ***********************************************
 */

package chosun.ciis.ps.pbs.code.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * �ڵ�-���ົ�ڵ� ó�����α׷��� ���, ��ȸ, ����, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSCode1101DAO {

    /**
      * ���ົ �ڵ���� �ʱ� Combo Box����
      * @param dm PS_S_SEPBK_CODEDM
      * @return PS_S_SEPBK_CODEDataSet
      * @throws AppException
      */
     public PS_S_SEPBK_CODEDataSet selectCombolist(PS_S_SEPBK_CODEDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_S_SEPBK_CODEDataSet ds = (PS_S_SEPBK_CODEDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
      * ���ົ �󼼳��� ��ȸ
      * @param dm PS_S_SEPBK_INFODM
      * @return PS_S_SEPBK_INFODataSet
      * @throws AppException
      */
     public PS_S_SEPBK_INFODataSet selectSepbkDtl(PS_S_SEPBK_INFODM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_S_SEPBK_INFODataSet ds = (PS_S_SEPBK_INFODataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
      * ���ົ �ڵ���� ����Ʈ ��ȸ
      * @param dm PS_L_SEPBK_CODEDM
      * @return PS_L_SEPBK_CODEDataSet
      * @throws AppException
      */
     public PS_L_SEPBK_CODEDataSet selectList(PS_L_SEPBK_CODEDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_L_SEPBK_CODEDataSet ds = (PS_L_SEPBK_CODEDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }

    /**
     * ���ົ �ڵ���� ���
     * @param dm PS_I_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean insertSepbkCode(PS_I_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_SEPBK_CODEDataSet ds = (PS_I_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * ���ົ �ڵ���� ����
     * @param dm PS_U_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean updateSepbkCode(PS_U_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_SEPBK_CODEDataSet ds = (PS_U_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * ���ົ �ڵ���� ����
     * @param dm PS_D_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean deleteSepbkCode(PS_D_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_SEPBK_CODEDataSet ds = (PS_D_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}