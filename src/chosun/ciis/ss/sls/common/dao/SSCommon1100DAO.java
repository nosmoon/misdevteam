/***************************************************************************************************
* ���ϸ� : SSCommon1100DAO.java
* ��� : �μ�,���� �� ���� DAO
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �Ǹű� ���� ������ ���� DAO
 */
public class SSCommon1100DAO {
    /**
     * ����-�μ��ڵ�,�ڵ�� ���
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet selectDeptList(SS_L_NWBUSEOCDDM dm) throws AppException{
       DBManager manager = new DBManager("Oracle");
       SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * ����-�����ڵ�,�ڵ�� ���
     * @param dm SS_L_JIYEOGCDDM
     * @return SS_L_JIYEOGCDDataSet
     * @throws AppException
     */
    public SS_L_JIYEOGCDDataSet selectAreaList(SS_L_JIYEOGCDDM dm) throws AppException{
       DBManager manager = new DBManager("Oracle");
       SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * ����-�����˻� ���
     * @param dm SS_L_BO_SRCHDM
     * @return SS_L_BO_SRCHDataSet
     * @throws AppException
     */
    public SS_L_BO_SRCH_TEMPDataSet selectBOList(SS_L_BO_SRCH_TEMPDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_BO_SRCH_TEMPDataSet ds = (SS_L_BO_SRCH_TEMPDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * ����-�������(LIST)
     * @param dm SS_L_BOLISTDM
     * @return SS_L_BOLISTDataSet
     * @throws AppException
     */
    public SS_L_BOLISTDataSet selectBoinfoList(SS_L_BOLISTDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_BOLISTDataSet ds = (SS_L_BOLISTDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * �����ȣ(�����ȸ)
     * @param dm CO_L_ZIPDM
     * @return CO_L_ZIPDataSet
     * @throws AppException
     */
    public CO_L_ZIPDataSet selectZipList(CO_L_ZIPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ü�ڵ�˻�(ȸ�纰)
     * @param dm SS_L_CMPY_MEDICDDM
     * @return SS_L_CMPY_MEDICDDataSet
     * @throws AppException
     */
    public SS_L_CMPY_MEDICDDataSet selectCmpyMedicdList(SS_L_CMPY_MEDICDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_CMPY_MEDICDDataSet ds = (SS_L_CMPY_MEDICDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ޱ����ڵ�˻�(���ޱ��к�-���ϸ���)
     * @param dm SS_L_MIG_CLSF_BASIDM
     * @return SS_L_MIG_CLSF_BASIDataSet
     * @throws AppException
     */
    public SS_L_MIG_CLSF_BASIDataSet selectClsfBasiList(SS_L_MIG_CLSF_BASIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIG_CLSF_BASIDataSet ds = (SS_L_MIG_CLSF_BASIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڻ���ȸ�˾�(������)(�����ȸ)
     * @param dm SS_L_RDR_DTLS_SECHDM
     * @return SS_L_RDR_DTLS_SECHDataSet
     * @throws AppException
     */
    public SS_L_RDR_DTLS_SECHDataSet selectReaderDetailList(SS_L_RDR_DTLS_SECHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DTLS_SECHDataSet ds = (SS_L_RDR_DTLS_SECHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڰ˻��˾�(�⺻��)(�����ȸ)
     * @param dm SS_L_READER_01DM
     * @return ds SS_L_READER_01DataSet
     * @throws AppException
     */
    public SS_L_READER_01DataSet selectReaderList(SS_L_READER_01DM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_READER_01DataSet ds = (SS_L_READER_01DataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����-���ڰ˻� ���
     * @param dm CO_L_RDR_SRCHDM
     * @return CO_L_RDR_SRCHDataSet
     * @throws AppException
     */
    public CO_L_RDR_SRCHDataSet selectRDRList(CO_L_RDR_SRCHDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       CO_L_RDR_SRCHDataSet ds = (CO_L_RDR_SRCHDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    public SL_L_GUGUNDataSet selectGugunList(SL_L_GUGUNDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_GUGUNDataSet ds = (SL_L_GUGUNDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_ZIP_AGENCYDataSet selectNewZipList(CO_L_ZIP_AGENCYDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_ZIP_AGENCYDataSet ds = (CO_L_ZIP_AGENCYDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_NEWGUGUNDataSet selectNewGugunList(CO_L_NEWGUGUNDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_NEW_ADDRDataSet selectNewAddrList(CO_L_NEW_ADDRDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_NEW_ADDRDataSet ds = (CO_L_NEW_ADDRDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
