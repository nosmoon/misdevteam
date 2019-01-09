/***************************************************************************************************
* ���ϸ� : SSAdmin1200DAO.java
* ��� : ������-�۾�-���̱׷��̼��� ���� DAO
* �ۼ����� : 2004-02-13
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������-�۾�-���̱׷��̼��� ���� DAO
 */
public class SSAdmin1200DAO {
    /**
     * ������-���̱׷��̼�-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet init(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-���̱׷��̼�-���
     * @param dm SS_L_MIGRWORKCHKDM
     * @return SS_L_MIGRWORKCHKDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKCHKDataSet selectMigBOCDList(SS_L_MIGRWORKCHKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKCHKDataSet ds = (SS_L_MIGRWORKCHKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-���̱׷��̼�-TEMP���̺� ������Ȳ
     * @param dm SS_L_MIGRTMPMECDDM
     * @return SS_L_MIGRTMPMECDDataSet
     * @throws AppException
     */
    public SS_L_MIGRMECDDataSet selectMIGRMECD(SS_L_MIGRMECDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRMECDDataSet ds = (SS_L_MIGRMECDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-���̱׷��̼�-TEMP���̺� ��������Ȳ
     * @param dm SS_L_MIGRGUYUKDM
     * @return SS_L_MIGRGUYUKDataSet
     * @throws AppException
     */
    public SS_L_MIGRGUYUKDataSet selectMIGRGUYUK(SS_L_MIGRGUYUKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRGUYUKDataSet ds = (SS_L_MIGRGUYUKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-���̱׷��̼�-TEMP���̺� ���ݹ������Ȳ
     * @param dm SS_L_MIGRSGBANGDM
     * @return SS_L_MIGRSGBANGDataSet
     * @throws AppException
     */
    public SS_L_MIGRSGBANGDataSet selectMIGRSGBANG(SS_L_MIGRSGBANGDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRSGBANGDataSet ds = (SS_L_MIGRSGBANGDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-���̱׷��̼�-�������� ��ȸ
     * @param dm SS_L_MIGRERRDM
     * @return SS_L_MIGRERRDataSet
     * @throws AppException
     */
    public SS_L_MIGRERRDataSet selectMIGRERR(SS_L_MIGRERRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRERRDataSet ds = (SS_L_MIGRERRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
