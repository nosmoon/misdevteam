package chosun.ciis.mt.submatrout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 *
 */

public class MT_SUBMATROUT_3000DAO {

	/************************************* ����� ������ ���� **********************************/
	/**
     *  ����� ��û ������ SETTING
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3000_LDataSet getMt_Submatrout_3000(MT_SUBMATROUT_3000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_3000_LDataSet ds = (MT_SUBMATROUT_3000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ���� ȸ�� SETTING
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3100_LDataSet getMt_Submatrout_3100(MT_SUBMATROUT_3100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_3100_LDataSet ds = (MT_SUBMATROUT_3100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ���� ��û ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3101_LDataSet getMt_Submatrout_3101(MT_SUBMATROUT_3101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_3101_LDataSet ds = (MT_SUBMATROUT_3101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  ����� ���� ȸ�� SETTING
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3200_LDataSet getMt_Submatrout_3200(MT_SUBMATROUT_3200_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_3200_LDataSet ds = (MT_SUBMATROUT_3200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ������ INFO GET
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3201_LDataSet getMt_Submatrout_3201(MT_SUBMATROUT_3201_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3201_LDataSet ds = (MT_SUBMATROUT_3201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  �ŷ�ó INFO GET
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3202_LDataSet getMt_Submatrout_3202(MT_SUBMATROUT_3202_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3202_LDataSet ds = (MT_SUBMATROUT_3202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ���ֳ��� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3203_LDataSet getMt_Submatrout_3203(MT_SUBMATROUT_3203_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3203_LDataSet ds = (MT_SUBMATROUT_3203_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ���ֳ��� �� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3204_LDataSet getMt_Submatrout_3204(MT_SUBMATROUT_3204_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3204_LDataSet ds = (MT_SUBMATROUT_3204_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  �������ڵ� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3205_LDataSet getMt_Submatrout_3205(MT_SUBMATROUT_3205_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3205_LDataSet ds = (MT_SUBMATROUT_3205_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ���� ���� �Է�/���� /�Ǻ� ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3206_ADataSet getMt_Submatrout_3206(MT_SUBMATROUT_3206_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3206_ADataSet ds = (MT_SUBMATROUT_3206_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ���� ���� ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_3207_LDataSet getMt_Submatrout_3207(MT_SUBMATROUT_3207_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATROUT_3207_LDataSet ds = (MT_SUBMATROUT_3207_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}