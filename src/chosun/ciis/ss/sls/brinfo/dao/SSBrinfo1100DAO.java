/***************************************************************************************************
 * ���ϸ� : SSBrinfo1100DAO.java
 * ��� : ����Info-������Ȳ�� ���� DAO
 * �ۼ����� : 2004-02-09
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.rdr.dm.SS_L_READER_BOINFO_INITDM;
import chosun.ciis.ss.sls.rdr.ds.SS_L_READER_BOINFO_INITDataSet;

/**
 * ����Info-������Ȳ�� ���� DAO
 */
public class SSBrinfo1100DAO {

    /**
     * ����Info-������Ȳ �ʱ�ȭ
     * @param dm SS_L_BOINFO_INITDM ��ü
     * @return SS_L_BOINFO_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOINFO_INITDataSet selectInitList(SS_L_BOINFO_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOINFO_INITDataSet ds = (SS_L_BOINFO_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-������Ȳ ��ȸ
     * @param dm SS_L_BOINFODM ��ü
     * @return SS_L_BOINFODataSet ��ü
     * @throws AppException
     */
    public SS_L_BOINFODataSet selectBoinfoList(SS_L_BOINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOINFODataSet ds = (SS_L_BOINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-������Ȳ-��
     * @param dm SS_S_BOINFODM ��ü
     * @return SS_S_BOINFODataSet ��ü
     * @throws AppException
     */
    public SS_S_BOINFODataSet selectBoinfoDetail(SS_S_BOINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOINFODataSet ds = (SS_S_BOINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-�������°���(�ǽð�������ü) �ʱ�ȭ��
     * @param dm SS_L_BOACCT_INITDM ��ü
     * @return SS_L_BOACCT_INITDataSet ��ü
     * @throws AppException
     */  
    public SS_L_BOACCT_INITDataSet selectBoAcctInit(SS_L_BOACCT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOACCT_INITDataSet ds = (SS_L_BOACCT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Info-�������°���(�ǽð�������ü) ��ȸ
     * @param dm SS_L_BOACCTDM ��ü
     * @return SS_L_BOACCTDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOACCT_LISTDataSet selectBoAcctList(SS_L_BOACCT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ����Info-�������°���(�ǽð�������ü) ����
     * @param dm SS_U_BOACCTDM ��ü
     * @return SS_U_BOACCTDataSet ��ü
     * @throws AppException
     */
    public SS_U_BOACCTDataSet updateBoAcctItem(SS_U_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BOACCTDataSet ds = (SS_U_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ����Info-�������°���(�ǽð�������ü) ����
     * @param dm SS_D_BOACCTDM ��ü
     * @return SS_D_BOACCTDataSet ��ü
     * @throws AppException
     */
    public SS_D_BOACCTDataSet deleteBoAcctItem(SS_D_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_D_BOACCTDataSet ds = (SS_D_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-�������°���(�ǽð�������ü) ���
     * @param dm SS_I_BOACCTDM ��ü
     * @return SS_I_BOACCTDataSet ��ü
     * @throws AppException
     */
    public SS_I_BOACCTDataSet insertBoAcctItem(SS_I_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BOACCTDataSet ds = (SS_I_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Info-�������°���(�ǽð�������ü) �����丮��ȸ 20150922 �弱��
     * @param dm SS_S_BOACCT_LISTDM ��ü
     * @return SS_S_BOACCT_LISTDataSet ��ü
     * @throws AppException
     */
    public SS_S_BOACCT_LISTDataSet histBoAcctList(SS_S_BOACCT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOACCT_LISTDataSet ds = (SS_S_BOACCT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-�������°���(�ǽð�������ü) ���Ȯ�� 20170919 ������
     * @param dm SS_U_BOACCT_CNFMDM ��ü
     * @return SS_U_BOACCT_CNFMDataSet ��ü
     * @throws AppException
     */
    public SS_U_BOACCT_CNFMDataSet cnfmBoAcctItem(SS_U_BOACCT_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BOACCT_CNFMDataSet ds = (SS_U_BOACCT_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
