/***************************************************************************************************
 * ���ϸ� : SSBrmgr1900DAO.java
 * ��� : �����濵-����Ʈ���Է��� ���� DAO
 * �ۼ����� : 2004-11-20
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * �����濵-����Ʈ���Է��� ���� DAO
 */
public class SSBrmgr1900DAO {

    /**
     * �����߼�ó�� �ڵ���� �ʱ� Combo Box����
     * @param dm SS_S_BO_SEND_INITDM
     * @return SS_S_BO_SEND_INITDataSet
     * @throws AppException
     */
    public SS_S_BO_SEND_INITDataSet selectCombolist(SS_S_BO_SEND_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ����Ʈ ��ȸ
     * @param dm SS_L_SEND_PBLMEDISENDBODM
     * @return SS_L_SEND_PBLMEDISENDBODataSet
     * @throws AppException
     */
    public SS_L_SEND_PBLMEDISENDBODataSet selectList(SS_L_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SEND_PBLMEDISENDBODataSet ds = (SS_L_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ������ ����ȸ
     * @param dm SS_L_BOSEND_LUMPDM
     * @return SS_L_BOSEND_LUMPDataSet
     * @throws AppException
     */
    public SS_L_BOSEND_LUMPDataSet selectBoList(SS_L_BOSEND_LUMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSEND_LUMPDataSet ds = (SS_L_BOSEND_LUMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ��� ����
     * @param dm SS_P_SEND_PBLMEDISENDBODataSet
     * @return SS_P_SEND_PBLMEDISENDBODM
     * @throws AppException
     */
    public SS_P_SEND_PBLMEDISENDBODataSet printSticker(SS_P_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_SEND_PBLMEDISENDBODataSet ds = (SS_P_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����-���� ���� �˻�
     * @param SS_L_BO_READER_SEARCHDM
     * @return SS_L_BO_READER_SEARCHDataSet
     */
    public SS_L_BO_READER_SEARCHDataSet selectBoReaderList(SS_L_BO_READER_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_READER_SEARCHDataSet ds = (SS_L_BO_READER_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ����-���� ���� �󼼰˻�
     * @param SS_S_BO_READERINFODM
     * @return SS_S_BO_READERINFODataSet
     */
    public SS_S_BO_READERINFODataSet selectBoReaderDetail(SS_S_BO_READERINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_READERINFODataSet ds = (SS_S_BO_READERINFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ڰ���--���������� ����
     * @param SS_U_BO_READERINFO_ONEDM
     * @return SB_U_BO_READERINFO_ONEDataSet
     */
    public SS_U_BO_READERINFO_ONEDataSet updateBoReaderInfo(SS_U_BO_READERINFO_ONEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BO_READERINFO_ONEDataSet ds = (SS_U_BO_READERINFO_ONEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
