/***************************************************************************************************
* ���ϸ� : SSExtn3100DAO.java
* ��� : ����Ȯ�帶�� ���� DAO
* �ۼ����� : 2009-07-09
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-����Ȯ�帶�� �� ���� DAO
 */

public class SSExtn3100DAO {
     
	/**
	 * Ȯ����Ȳ-Ȯ��ν�����(�ʱ�ȭ��)
	 * @param dm  SS_L_RDR_EXTNCLOS_INITDM
	 * @return SS_L_RDR_EXTNCLOS_INITDataSet
	 * @throws AppException
	 */
	public SS_L_RDR_EXTNCLOS_JM_INITDataSet initExtnClos(SS_L_RDR_EXTNCLOS_JM_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_RDR_EXTNCLOS_JM_INITDataSet ds = (SS_L_RDR_EXTNCLOS_JM_INITDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    
	/**
	 * Ȯ����Ȳ-Ȯ��ν�����(����Ʈ)
	 * @param dm  SL_L_EXTNCLOSDM
	 * @return SL_L_EXTNCLOSDataSet
	 * @throws AppException
	 */
	public SL_L_EXTNCLOS_JMDataSet selectExtnClosList(SL_L_EXTNCLOS_JMDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_EXTNCLOS_JMDataSet ds = (SL_L_EXTNCLOS_JMDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	
	/**
	 * Ȯ����Ȳ-Ȯ��ν�����(�󼼸��)
	 * @param dm  SL_S_EXTNCLOS_DTLSDM
	 * @return SL_S_EXTNCLOS_DTLSDataSet
	 * @throws AppException
	 */
	public SL_S_EXTNCLOS_JM_DTLSDataSet selectExtnClosDtls(SL_S_EXTNCLOS_JM_DTLSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_S_EXTNCLOS_JM_DTLSDataSet ds = (SL_S_EXTNCLOS_JM_DTLSDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	
	/**
	 * Ȯ����Ȳ-Ȯ��ν����� ����(�����Ұ�/���Ȯ�ΰ��)
	 * @param dm  SL_S_EXTNCLOS_DTLSDM
	 * @return SL_S_EXTNCLOS_DTLSDataSet
	 * @throws AppException
	 */
	public SL_A_EXTNCLOS_JM_DTLSDataSet selectExtnClosUpdate(SL_A_EXTNCLOS_JM_DTLSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_A_EXTNCLOS_JM_DTLSDataSet ds = (SL_A_EXTNCLOS_JM_DTLSDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * Ȯ����Ȳ-Ȯ��ν����� ����IS�����ݿ�
	 * @param dm  SL_U_EXTNCLOS_ISSUPDM
	 * @return SL_U_EXTNCLOS_ISSUPDataSet
	 * @throws AppException
	 */
	public SL_U_EXTNCLOS_JM_ISSUPDataSet updateExtnclosIssup(SL_U_EXTNCLOS_JM_ISSUPDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_U_EXTNCLOS_JM_ISSUPDataSet ds = (SL_U_EXTNCLOS_JM_ISSUPDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * Ȯ����Ȳ-Ȯ��ν����� ��ǥ��ȸ
	 * @param dm  SL_L_EXTNCLOS_REPORTDM
	 * @return SL_L_EXTNCLOS_REPORTDataSet
	 * @throws AppException
	 */
	public SL_L_EXTNCLOS_JM_REPORTDataSet selectExtnclosReport(SL_L_EXTNCLOS_JM_REPORTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_EXTNCLOS_JM_REPORTDataSet ds = (SL_L_EXTNCLOS_JM_REPORTDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

	/**
	 * Ȯ����Ȳ-Ȯ��ν����� ��ǥ��ȸ
	 * @param dm  SL_U_EXTNCLOS_CLOSEDM
	 * @return SL_U_EXTNCLOS_CLOSEDataSet
	 * @throws AppException
	 */
	public SL_U_EXTNCLOS_JM_CLOSEDataSet updateExtnClosClose(SL_U_EXTNCLOS_JM_CLOSEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_U_EXTNCLOS_JM_CLOSEDataSet ds = (SL_U_EXTNCLOS_JM_CLOSEDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
     * Ȯ����Ȳ-����Ȯ�帶��-��������/����IS�����ݿ� ���� ��ȸ
     * @param dm SL_A_EXTNCLOS_CLOSINFODM
     * @return SL_A_EXTNCLOS_CLOSINFODataSet
     * @throws AppException
     */
/*    public SL_A_EXTNCLOS_JM_CLOSINFODataSet selectExtnClosInfo(SL_A_EXTNCLOS_JM_CLOSINFODM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SL_A_EXTNCLOS_JM_CLOSINFODataSet ds = (SL_A_EXTNCLOS_JM_CLOSINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }*/
}
