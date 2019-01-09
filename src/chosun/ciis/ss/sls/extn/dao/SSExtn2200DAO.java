/***************************************************************************************************
* ���ϸ� : SSExtn2200DAO.java
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

public class SSExtn2200DAO {
    /**
     * Ȯ����Ȳ-����Ȯ�帶��-�ʱ�ȭ��
     * @param dm SS_L_TASLM_RDREXTNCLOS_INITDM
     * @return SS_L_TASLM_RDREXTNCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_TASLM_RDREXTNCLOS_INITDataSet extnExtnclosInit(SS_L_TASLM_RDREXTNCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
		SS_L_TASLM_RDREXTNCLOS_INITDataSet ds = (SS_L_TASLM_RDREXTNCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-����ȭ�帶��-���
     * @param dm SS_L_TASLM_RDREXTNCLOSDM
     * @return SS_L_TASLM_RDREXTNCLOSDataSet
     * @throws AppException
     */
    public SS_L_TASLM_RDREXTNCLOSDataSet extnExtnclosList(SS_L_TASLM_RDREXTNCLOSDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
        SS_L_TASLM_RDREXTNCLOSDataSet ds = (SS_L_TASLM_RDREXTNCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����Ȯ�帶��-����
     * @param dm SS_U_TASLM_RDREXTNCLOSDM
     * @return SS_U_TASLM_RDREXTNCLOSDataSet
     * @throws AppException
     */
    public SS_U_TASLM_RDREXTNCLOSDataSet extnExtnclosUpdate(SS_U_TASLM_RDREXTNCLOSDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_U_TASLM_RDREXTNCLOSDataSet ds = (SS_U_TASLM_RDREXTNCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**
     * Ȯ����Ȳ-����Ȯ�帶��-��������/����IS�����ݿ� ���� ��ȸ
     * @param dm SL_A_EXTNCLOS_CLOSINFODM
     * @return SL_A_EXTNCLOS_CLOSINFODataSet
     * @throws AppException
     */
    public SL_A_EXTNCLOS_CLOSINFODataSet selectExtnClosInfo(SL_A_EXTNCLOS_CLOSINFODM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SL_A_EXTNCLOS_CLOSINFODataSet ds = (SL_A_EXTNCLOS_CLOSINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**
     * Ȯ����Ȳ-������������-�ʱ�ȭ��
     * @param dm SS_L_TASLM_BOSUSPCLOS_INITDM
     * @return SS_L_TASLM_BOSUSPCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_TASLM_BOSUSPCLOS_INITDataSet extnBosuspclosInit(SS_L_TASLM_BOSUSPCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_TASLM_BOSUSPCLOS_INITDataSet ds = (SS_L_TASLM_BOSUSPCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * Ȯ����Ȳ-��������-��ȸ
     * @param dm SS_L_TASLM_BOSUSPCLOS_INITDM
     * @return SS_L_TASLM_BOSUSPCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_BOCLOS_2DataSet boclosList(SS_L_BOCLOS_2DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOCLOS_2DataSet ds = (SS_L_BOCLOS_2DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-������������-���
     * @param dm SS_L_TASLM_BOSUSPCLOSDM
     * @return SS_L_TASLM_BOSUSPCLOSDataSet
     * @throws AppException
     */
    public SS_L_TASLM_BOSUSPCLOSDataSet extnBosuspclosList(SS_L_TASLM_BOSUSPCLOSDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_TASLM_BOSUSPCLOSDataSet ds = (SS_L_TASLM_BOSUSPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-������������-����
     * @param dm SS_L_TASLM_BOSUSPCLOSDM
     * @return SS_U_TASLM_BOSUSPCLOSDataSet
     * @throws AppException
     */
    public SS_U_TASLM_BOSUSPCLOSDataSet extnBosuspclosUpdate(SS_U_TASLM_BOSUSPCLOSDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_U_TASLM_BOSUSPCLOSDataSet ds = (SS_U_TASLM_BOSUSPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
	/**
	 * Ȯ����Ȳ-Ȯ��ν�����(�ʱ�ȭ��)
	 * @param dm  SS_L_RDR_EXTNCLOS_INITDM
	 * @return SS_L_RDR_EXTNCLOS_INITDataSet
	 * @throws AppException
	 */
	public SS_L_RDR_EXTNCLOS_INITDataSet initExtnClos(SS_L_RDR_EXTNCLOS_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_RDR_EXTNCLOS_INITDataSet ds = (SS_L_RDR_EXTNCLOS_INITDataSet)manager.executeCall(dm);
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
	public SL_L_EXTNCLOSDataSet selectExtnClosList(SL_L_EXTNCLOSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_EXTNCLOSDataSet ds = (SL_L_EXTNCLOSDataSet)manager.executeCall(dm);
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
	public SL_S_EXTNCLOS_DTLSDataSet selectExtnClosDtls(SL_S_EXTNCLOS_DTLSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_S_EXTNCLOS_DTLSDataSet ds = (SL_S_EXTNCLOS_DTLSDataSet)manager.executeCall(dm);

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
	public SL_A_EXTNCLOS_DTLSDataSet selectExtnClosUpdate(SL_A_EXTNCLOS_DTLSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_A_EXTNCLOS_DTLSDataSet ds = (SL_A_EXTNCLOS_DTLSDataSet)manager.executeCall(dm);

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
	public SL_U_EXTNCLOS_ISSUPDataSet updateExtnclosIssup(SL_U_EXTNCLOS_ISSUPDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_U_EXTNCLOS_ISSUPDataSet ds = (SL_U_EXTNCLOS_ISSUPDataSet)manager.executeCall(dm);

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
	public SL_L_EXTNCLOS_REPORTDataSet selectExtnclosReport(SL_L_EXTNCLOS_REPORTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_EXTNCLOS_REPORTDataSet ds = (SL_L_EXTNCLOS_REPORTDataSet)manager.executeCall(dm);

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
	public SL_U_EXTNCLOS_CLOSEDataSet updateExtnClosClose(SL_U_EXTNCLOS_CLOSEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_U_EXTNCLOS_CLOSEDataSet ds = (SL_U_EXTNCLOS_CLOSEDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	
	/**
	 * Ȯ�����-�������� ��ȸ/��������
	 * @param dm  SL_L_CLOS_REPORTDM
	 * @return SL_L_CLOS_REPORTDataSet
	 * @throws AppException
	 */
	public SL_L_CLOS_REPORTDataSet selectClosReport(SL_L_CLOS_REPORTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
