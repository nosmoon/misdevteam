package chosun.ciis.pr.prtexec.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 *
 */

public class PR_PRTEXEC_1000DAO {

	/**
     *  인쇄실행 화면설정정보 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1001_LDataSet getPr_prtexec_1001(PR_PRTEXEC_1001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1001_LDataSet ds = (PR_PRTEXEC_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  인쇄실행 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1100_LDataSet getPr_prtexec_1100(PR_PRTEXEC_1100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1100_LDataSet ds = (PR_PRTEXEC_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행에 데이터 구성을 위한 발송정보 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1101_LDataSet getPr_prtexec_1101(PR_PRTEXEC_1101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1101_LDataSet ds = (PR_PRTEXEC_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행정보 등록,수정,삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1102_ADataSet getPr_prtexec_1102(PR_PRTEXEC_1102_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1102_ADataSet ds = (PR_PRTEXEC_1102_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행정보 특기사항 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1103_SDataSet getPr_prtexec_1103(PR_PRTEXEC_1103_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1103_SDataSet ds = (PR_PRTEXEC_1103_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행정보 특기사항 저장
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1104_ADataSet getPr_prtexec_1104(PR_PRTEXEC_1104_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1104_ADataSet ds = (PR_PRTEXEC_1104_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행정보 특기사항 초기화면 구성
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1105_LDataSet getPr_prtexec_1105(PR_PRTEXEC_1105_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1105_LDataSet ds = (PR_PRTEXEC_1105_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  제작시간현황 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1200_LDataSet getPr_prtexec_1200(PR_PRTEXEC_1200_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1200_LDataSet ds = (PR_PRTEXEC_1200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄기준 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1300_LDataSet getPr_prtexec_1300(PR_PRTEXEC_1300_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1300_LDataSet ds = (PR_PRTEXEC_1300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  인쇄기준에서 매체를 선택한 뒤에 섹션코드 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1301_LDataSet getPr_prtexec_1301(PR_PRTEXEC_1301_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1301_LDataSet ds = (PR_PRTEXEC_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄기준 등록,수정,삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1302_ADataSet getPr_prtexec_1302(PR_PRTEXEC_1302_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1302_ADataSet ds = (PR_PRTEXEC_1302_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행면수 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1400_LDataSet getPr_prtexec_1400(PR_PRTEXEC_1400_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1400_LDataSet ds = (PR_PRTEXEC_1400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  인쇄실행면수 등록,수정,삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_1401_ADataSet getPr_prtexec_1401(PR_PRTEXEC_1401_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_1401_ADataSet ds = (PR_PRTEXEC_1401_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}