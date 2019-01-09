package chosun.ciis.mt.outsdelmt.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.ds.*;

/**
 *
 */

public class MT_OUTSDELMT_1000DAO {

	/**
     *  �ܺο�� ���� �����ڵ� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1000_LDataSet getMt_outsdelmt_1000(MT_OUTSDELMT_1000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1000_LDataSet ds = (MT_OUTSDELMT_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� ���п� ���� �ܺο�� �����ڵ� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1001_LDataSet getMt_outsdelmt_1001(MT_OUTSDELMT_1001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1001_LDataSet ds = (MT_OUTSDELMT_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1002_LDataSet getMt_outsdelmt_1002(MT_OUTSDELMT_1002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1002_LDataSet ds = (MT_OUTSDELMT_1002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� ���,����,����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1003_ADataSet getMt_outsdelmt_1003(MT_OUTSDELMT_1003_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1003_ADataSet ds = (MT_OUTSDELMT_1003_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�ұ��а� �ܺο�ҿ� ���� �����ڵ�3(�ܺο�� ����) ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1004_LDataSet getMt_outsdelmt_1004(MT_OUTSDELMT_1004_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1004_LDataSet ds = (MT_OUTSDELMT_1004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� �ڵ�����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_1005_ADataSet getMt_outsdelmt_1005(MT_OUTSDELMT_1005_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_1005_ADataSet ds = (MT_OUTSDELMT_1005_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� ��������� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_2000_LDataSet getMt_outsdelmt_2000(MT_OUTSDELMT_2000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_2000_LDataSet ds = (MT_OUTSDELMT_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�� ����������� ���,����,����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_2001_ADataSet getMt_outsdelmt_2001(MT_OUTSDELMT_2001_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_2001_ADataSet ds = (MT_OUTSDELMT_2001_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ش����� �ܺο�ҿ��� ����������� ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_2002_ADataSet getMt_outsdelmt_2002(MT_OUTSDELMT_2002_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_2002_ADataSet ds = (MT_OUTSDELMT_2002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�Һ��������� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_3000_LDataSet getMt_outsdelmt_3000(MT_OUTSDELMT_3000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_3000_LDataSet ds = (MT_OUTSDELMT_3000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     *  �ܺο�Һ������� ������ ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_3001_LDataSet getMt_outsdelmt_3001(MT_OUTSDELMT_3001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_3001_LDataSet ds = (MT_OUTSDELMT_3001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο�Һ������� ������ ����
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_3002_ADataSet getMt_outsdelmt_3002(MT_OUTSDELMT_3002_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_3002_ADataSet ds = (MT_OUTSDELMT_3002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �����ڵ��� �ܰ������� ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_3003_LDataSet getMt_outsdelmt_3003(MT_OUTSDELMT_3003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_3003_LDataSet ds = (MT_OUTSDELMT_3003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ܺο���� ���뱸�п� ���� �⵵, ���ڿ� ���� ������ ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_3004_LDataSet getMt_outsdelmt_3004(MT_OUTSDELMT_3004_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_3004_LDataSet ds = (MT_OUTSDELMT_3004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/**
     *  �ùķ��̼��� ���� �ܺο������ ��ȸ
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_OUTSDELMT_5000_LDataSet getMt_outsdelmt_5000(MT_OUTSDELMT_5000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_OUTSDELMT_5000_LDataSet ds = (MT_OUTSDELMT_5000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}