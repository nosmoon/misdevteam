package chosun.ciis.mt.submatrout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 *
 */

public class MT_SUBMATROUT_2000DAO {

	/************************************* ����� ������ ���� **********************************/

	/**
     *  ����� ������ ���� ȭ�� SETTING
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2000_LDataSet getMt_Submatrout_2000(MT_SUBMATROUT_2000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2000_LDataSet ds = (MT_SUBMATROUT_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ������ HEAD ���� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2001_LDataSet getMt_Submatrout_2001(MT_SUBMATROUT_2001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2001_LDataSet ds = (MT_SUBMATROUT_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     *  ����� ������ ��  ���� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2002_LDataSet getMt_Submatrout_2002(MT_SUBMATROUT_2002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2002_LDataSet ds = (MT_SUBMATROUT_2002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ������ ����� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2003_LDataSet getMt_Submatrout_2003(MT_SUBMATROUT_2003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2003_LDataSet ds = (MT_SUBMATROUT_2003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ������ ���� ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2004_UDataSet getMt_Submatrout_2004(MT_SUBMATROUT_2004_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2004_UDataSet ds = (MT_SUBMATROUT_2004_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ������ ���� ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2005_UDataSet getMt_Submatrout_2005(MT_SUBMATROUT_2005_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2005_UDataSet ds = (MT_SUBMATROUT_2005_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/**
     *  ����� ������ ������ �Է� / �����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_SUBMATROUT_2006_ADataSet getMt_Submatrout_2006(MT_SUBMATROUT_2006_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_SUBMATROUT_2006_ADataSet ds = (MT_SUBMATROUT_2006_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}