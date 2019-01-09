package chosun.ciis.mt.submatrout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 *
 */

public class MT_SUBMATROUT_1000DAO {

	/**
     *  TAB 1 부재료 출고 화면 화면 셋팅
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1100_LDataSet getMt_Submatrout_1100(MT_SUBMATROUT_1100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1100_LDataSet ds = (MT_SUBMATROUT_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_SUBMATROUT_1101_LDataSet getMt_Submatrout_1101(MT_SUBMATROUT_1101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1101_LDataSet ds = (MT_SUBMATROUT_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 1 부재료 출고 화면 현재고조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1102_LDataSet getMt_Submatrout_1102(MT_SUBMATROUT_1102_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_1102_LDataSet ds = (MT_SUBMATROUT_1102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 1 부재료 출고 내역 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1103_LDataSet getMt_Submatrout_1103(MT_SUBMATROUT_1103_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1103_LDataSet ds = (MT_SUBMATROUT_1103_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  TAB 1 부재료 출고 상세 내역 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1104_LDataSet getMt_Submatrout_1104(MT_SUBMATROUT_1104_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1104_LDataSet ds = (MT_SUBMATROUT_1104_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 1 부재료 출고 상세 내역 등록
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1109_ADataSet getMt_Submatrout_1109(MT_SUBMATROUT_1109_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1109_ADataSet ds = (MT_SUBMATROUT_1109_ADataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 1 부재료 출고 내역 건별 또는 전체 삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1111_ADataSet getMt_Submatrout_1111(MT_SUBMATROUT_1111_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1111_ADataSet ds = (MT_SUBMATROUT_1111_ADataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 1 부재료 출고 마감
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1112_UDataSet getMt_Submatrout_1112(MT_SUBMATROUT_1112_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1112_UDataSet ds = (MT_SUBMATROUT_1112_UDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_SUBMATROUT_1114_LDataSet getMt_Submatrout_1114(MT_SUBMATROUT_1114_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1114_LDataSet ds = (MT_SUBMATROUT_1114_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  TAB 2 PS판 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1115_LDataSet getMt_Submatrout_1115(MT_SUBMATROUT_1115_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_SUBMATROUT_1115_LDataSet ds = (MT_SUBMATROUT_1115_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  TAB 2 PS판 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1116_LDataSet getMt_Submatrout_1116(MT_SUBMATROUT_1116_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_SUBMATROUT_1116_LDataSet ds = (MT_SUBMATROUT_1116_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  TAB 2 PS판 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1118_LDataSet getMt_Submatrout_1118(MT_SUBMATROUT_1118_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_SUBMATROUT_1118_LDataSet ds = (MT_SUBMATROUT_1118_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  TAB 1 부재료 출고 마감취소
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1117_UDataSet getMt_Submatrout_1117(MT_SUBMATROUT_1117_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1117_UDataSet ds = (MT_SUBMATROUT_1117_UDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	 /**
     *  TAB 2 건별 출고 조회 화면 셋팅
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1200_LDataSet getMt_Submatrout_1200(MT_SUBMATROUT_1200_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1200_LDataSet ds = (MT_SUBMATROUT_1200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	 /**
     *  TAB 2 재고관리 자재코드 검색
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1201_LDataSet getMt_Submatrout_1201(MT_SUBMATROUT_1201_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1201_LDataSet ds = (MT_SUBMATROUT_1201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	 /**
     *  TAB 2 재고관리 데이터 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1202_LDataSet getMt_Submatrout_1202(MT_SUBMATROUT_1202_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1202_LDataSet ds = (MT_SUBMATROUT_1202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     *  TAB 3 자재별 출고 조회 화면 셋팅
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1300_LDataSet getMt_Submatrout_1300(MT_SUBMATROUT_1300_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1300_LDataSet ds = (MT_SUBMATROUT_1300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  TAB 3 자재별 출고 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1301_LDataSet getMt_Submatrout_1301(MT_SUBMATROUT_1301_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1301_LDataSet ds = (MT_SUBMATROUT_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  TAB 4 안전재고 화면 공장코드 셋팅
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1400_LDataSet getMt_Submatrout_1400(MT_SUBMATROUT_1400_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1400_LDataSet ds = (MT_SUBMATROUT_1400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  TAB 4 안전재고 내역 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1401_LDataSet getMt_Submatrout_1401(MT_SUBMATROUT_1401_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1401_LDataSet ds = (MT_SUBMATROUT_1401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  TAB 4 발주요청
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_1402_IDataSet getMt_Submatrout_1402(MT_SUBMATROUT_1402_IDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_1402_IDataSet ds = (MT_SUBMATROUT_1402_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}