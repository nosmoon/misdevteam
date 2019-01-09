/**************************************************************************************************
* ���ϸ�    : SLReader1100DAO.java
* ���      : �Ǹ����� ����
* �ۼ�����  : 2003-12-09
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * �Ǹ����� ���븦 ���� Data Access Object
 */
public class SLCommon1000DAO{

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
     * ���ڻ���ȸ�˾�(������)(�����ȸ)
     * @param dm SL_L_RDR_DTLS_SECHDM
     * @return SL_L_RDR_DTLS_SECHDataSet
     * @throws AppException
     */
    public SL_L_RDR_DTLS_SECHDataSet selectReaderDetailList(SL_L_RDR_DTLS_SECHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_RDR_DTLS_SECHDataSet ds = (SL_L_RDR_DTLS_SECHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڰ˻��˾�(�⺻��)(�����ȸ)
     * @param dm SL_L_READER_01DM
     * @return ds SL_L_READER_01DataSet
     * @throws AppException
     */
    public SL_L_READER_01DataSet selectReaderList(SL_L_READER_01DM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_READER_01DataSet ds = (SL_L_READER_01DataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ڵ� �����ȸ
     * @param dm CO_L_TAOCC_CDVDM
     * @return CO_L_TAOCC_CDVDataSet
     * @throws AppException
     */
    public CO_L_TAOCC_CDVDataSet selectCommCdList(CO_L_TAOCC_CDVDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ���ڰ˻�(�����ȸ)
     * @param dm SL_L_EXTNPERSDM
     * @return SL_L_EXTNPERSDataSet
     * @throws AppException
     */
    public SL_L_EXTNPERSDataSet selectExtnPersList(SL_L_EXTNPERSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ڵ� �����ȸ(�������� �ڵ� ���ÿ� ���� �����ڵ� �����ȸ)
     * @param dm SL_L_EXTNPERSDM
     * @return SL_L_EXTNPERSDataSet
     * @throws AppException
     */
    public SL_L_EXTNPERSDataSet selectClsfCodeList(SL_L_EXTNPERSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����˻�
     * @param dm SL_L_BO_SRCHDM
     * @return SL_L_BO_SRCHDataSet
     * @throws AppException
     */
    public SL_L_BO_SRCHDataSet selectBranchOfficeList(SL_L_BO_SRCHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BO_SRCHDataSet ds = (SL_L_BO_SRCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���˹� �ڵ� �����ȸ
     * @param dm SL_L_BNSITEMDM
     * @return SL_L_BNSITEMDataSet
     * @throws AppException
     */
    public SL_L_BNSITEMDataSet selectBnsItemCdList(SL_L_BNSITEMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������޸�ü(�����ȸ)
     * �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
     * @param SL_L_BOMEDIDM
     * @return SL_L_BOMEDIDataSet
     * @throws AppException
     */
    public SL_L_BOMEDIDataSet selectBoHndlMediList(SL_L_BOMEDIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BOMEDIDataSet ds = (SL_L_BOMEDIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
	 * ����-���೻������
	 * �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
	 * @param CO_A_RUNLOGDM
	 * @return CO_A_RUNLOGDataSet
	 * @throws AppException
	 */
	public CO_A_RUNLOGDataSet activeRunLog(CO_A_RUNLOGDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		CO_A_RUNLOGDataSet ds = (CO_A_RUNLOGDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
    }

    /**
     * ���� ��������(�����ȸ)
     * �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
     * @param SL_L_DSTCINFOCDDM
     * @return SL_L_DSTCINFOCDDataSet
     * @throws AppException
     */
    public SL_L_DSTCINFOCDDataSet selectDsctList(SL_L_DSTCINFOCDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_DSTCINFOCDDataSet ds = (SL_L_DSTCINFOCDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
         * ����-���� ȸ�� ���� ��ȸ
         *
         * @param dm
         *            CO_S_RDR_SERVICEDM ��ü
         * @return CO_S_RDR_SERVICEDataSet ��ü
         * @throws AppException
         */
        public CO_S_RDR_SERVICEDataSet selectRDR_SERVICE(CO_S_RDR_SERVICEDM dm)throws AppException {
                //System.out.println("#######begin manager#######");
            DBManager manager = new DBManager("PRI");
                //System.out.println("#######end manager#######");
            CO_S_RDR_SERVICEDataSet ds = (CO_S_RDR_SERVICEDataSet) manager.executeCall(dm);
                //System.out.println("#######data set#######");
            if (!"".equals(ds.errcode)) {
                throw new AppException(ds.errcode, ds.errmsg);
            }
            return ds;
	}
}
