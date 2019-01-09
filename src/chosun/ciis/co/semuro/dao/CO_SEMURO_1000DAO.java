package chosun.ciis.co.semuro.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;

/**
 *
 */
public class CO_SEMURO_1000DAO {
	/*
	 * 		전자세금계산서 담당자 관리목록 조회
	 */
	public CO_SEMURO_1000_LDataSet getCo_Semuro_1000(CO_SEMURO_1000_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_SEMURO_1000_LDataSet ds = (CO_SEMURO_1000_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/*
	 * 		전자세금계산서 담당자 등록,수정,삭제
	 */
	public CO_SEMURO_1001_ADataSet getCo_Semuro_1001(CO_SEMURO_1001_ADM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_SEMURO_1001_ADataSet ds = (CO_SEMURO_1001_ADataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	/**
     *  TAB 1 세무로 에서 넘어온 데이터 INSERT UPDATE....
     * @param dm
     * @return
     * @throws AppException
     */
	public CO_SEMURO_1100_ADataSet getCo_Semuro_1100(CO_SEMURO_1100_ADM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1100_ADataSet ds = (CO_SEMURO_1100_ADataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1200_IDataSet getCo_Semuro_1200(CO_SEMURO_1200_IDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1200_IDataSet ds = (CO_SEMURO_1200_IDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1300_UDataSet getCo_Semuro_1300(CO_SEMURO_1300_UDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1300_UDataSet ds = (CO_SEMURO_1300_UDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1301_UDataSet getCo_Semuro_1301(CO_SEMURO_1301_UDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1301_UDataSet ds = (CO_SEMURO_1301_UDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public CO_SEMURO_1400_LDataSet getCo_Semuro_1400(CO_SEMURO_1400_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1400_LDataSet ds = (CO_SEMURO_1400_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1500_LDataSet getCo_Semuro_1500(CO_SEMURO_1500_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

        CO_SEMURO_1500_LDataSet ds = (CO_SEMURO_1500_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1600_ADataSet getCo_Semuro_1600(CO_SEMURO_1600_ADM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

//        System.out.println(manager.m_dbPool);
        CO_SEMURO_1600_ADataSet ds = (CO_SEMURO_1600_ADataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1700_LDataSet getCo_Semuro_1700(CO_SEMURO_1700_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

        CO_SEMURO_1700_LDataSet ds = (CO_SEMURO_1700_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_SEMURO_1800_LDataSet getCo_Semuro_1800(CO_SEMURO_1800_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

        CO_SEMURO_1800_LDataSet ds = (CO_SEMURO_1800_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public CO_SEMURO_1900_LDataSet getCo_Semuro_1900(CO_SEMURO_1900_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");

        CO_SEMURO_1900_LDataSet ds = (CO_SEMURO_1900_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}