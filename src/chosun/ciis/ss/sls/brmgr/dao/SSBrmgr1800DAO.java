/***************************************************************************************************
 * ���ϸ� : SSBrmgr1800DAO.java
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
public class SSBrmgr1800DAO {

    /**
     * �����濵-����Ʈ���Է�-�ʱ�ȭ��(����Ʈ)
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initApt(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
      * �����濵-����Ʈ���Է�-����Ʈ���(�������μ� 1853)
      * @param dm SL_L_APTLISTDM
      * @return SL_L_APTLISTDataSet
      * @throws AppException
      */
     public SL_L_APTLISTDataSet selectAptAddrList(SL_L_APTLISTDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         SL_L_APTLISTDataSet ds = (SL_L_APTLISTDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
     * �����濵-����Ʈ���Է�-���(����Ʈ)
     * @param dm SS_L_APTDM
     * @return SS_L_APTDataSet
     * @throws AppException
     */
    public SS_L_APTDataSet selectAptList(SS_L_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDataSet ds = (SS_L_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Ʈ������Ȳ(����Ʈ)
     * @param dm SS_L_COMM_APT_THRWDM
     * @return SS_L_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SS_L_COMM_APT_THRWDataSet selectThrwList(SS_L_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(��Ȳ �󼼺���)
     * @param dm SL_S_COMM_APT_THRWDM
     * @return SL_S_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_THRWDataSet selectThrwDetail(SL_S_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }


    /**
     * ����Ʈ������Ȳ(����Ʈ ����)
     * @param dm SL_S_COMM_APT_STRUCTDM
     * @return SL_S_COMM_APT_STRUCTDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_STRUCTDataSet selectAptinfo(SL_S_COMM_APT_STRUCTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(����Ʈ ����)�ٷΰ���
     * @param dm SL_S_COMM_APT_QSEARCHDM
     * @return SL_S_COMM_APT_QSEARCHDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_QSEARCHDataSet selectAptQuickSearch(SL_S_COMM_APT_QSEARCHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_QSEARCHDataSet ds = (SL_S_COMM_APT_QSEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(�� ����Ʈ)
     * @param dm SL_L_COMM_APT_DONGNODM
     * @return SL_L_COMM_APT_DONGNODataSet
     * @throws AppException
     */
    public SL_L_COMM_APT_DONGNODataSet selectDongList(SL_L_COMM_APT_DONGNODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(�� ����Ʈ)
     * @param dm SS_L_ADDR_TO_APTDM
     * @return SS_L_ADDR_TO_APTDataSet
     * @throws AppException
     */
    public SS_L_ADDR_TO_APTDataSet selectAddrToAptList(SS_L_ADDR_TO_APTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_ADDR_TO_APTDataSet ds = (SS_L_ADDR_TO_APTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }



    /**
     * ����Ʈ������Ȳ(�����˻�)
     * @param SL_L_BOEMPDM
     * @return SL_L_BOEMPDataSet
     * @throws AppException
     */
    public SL_L_BOEMPDataSet selectBoempList(SL_L_BOEMPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BOEMPDataSet ds = (SL_L_BOEMPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }



    /**
     * ����Ʈ������Ȳ(��ü��� ����Ʈ)
     * @param dm SL_L_COMM_MEDIYNMDM
     * @return SL_L_COMM_MEDIYNMDataSet
     * @throws AppException
     **/
    public SL_L_COMM_MEDIYNMDataSet selectMediyList(SL_L_COMM_MEDIYNMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_MEDIYNMDataSet ds = (SL_L_COMM_MEDIYNMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(��Ȳ ���,����)
     * @param dm SL_A_COMM_APT_THRWDM
     * @return SL_A_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SL_A_COMM_APT_THRWDataSet accessThrw(SL_A_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }


    /**
     * ����Ʈ������Ȳ-Ȱ������(��ȸ,����,����)
     * @param dm SS_A_ACTMEMODM
     * @return SS_A_ACTMEMODataSet
     * @throws AppException
     */
    public SS_A_ACTMEMODataSet accessActMemo(SS_A_ACTMEMODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_A_ACTMEMODataSet ds = (SS_A_ACTMEMODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(�������)
     * @param dm SS_L_COMM_APT_RESULTDM
     * @return SS_L_COMM_APT_RESULTDataSet
     * @throws AppException
     */
    public SS_L_COMM_APT_RESULTDataSet selectResult(SS_L_COMM_APT_RESULTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_COMM_APT_RESULTDataSet ds = (SS_L_COMM_APT_RESULTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * ����Ʈ������Ȳ(���Է����)
     * @param dm SL_L_COMM_THRW_RATEDM
     * @return SL_L_COMM_THRW_RATEDataSet
     * @throws AppException
     */
    public SL_L_COMM_THRW_RATEDataSet calcThrwRate(SL_L_COMM_THRW_RATEDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_THRW_RATEDataSet ds = (SL_L_COMM_THRW_RATEDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

}
