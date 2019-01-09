/***************************************************************************************************
 * ���ϸ� : PSShare1601DAO.java
 * ��� : �������� ���� �޷�ó���� ���� DAO
 * �ۼ����� : 2004-03-08
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

import java.sql.*;
import java.io.*;

import oracle.jdbc.driver.*;
import oracle.sql.*;
import oracle.jdbc.*;

import weblogic.jdbc.vendor.oracle.*;

/**
 * ��������-�޷� ���� DAO
 */
public class PSShare1601DAO {

    /**
     * �������� �Խ��� �Ǹű� ����Ʈ ��ȸ
     * @param SS_L_INFOEXG_INITDM ��ü
     * @return SS_L_INFOEXG_INITDataSet ��ü
     * @author CRM ���Ǳ���
     * @since 2003.10.30    ver : 1.0
     */

    public PS_L_MONTH_SCHEDataSet selectMonthScheList(PS_L_MONTH_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MONTH_SCHEDataSet ds = (PS_L_MONTH_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� ����-�޷�-����ȸ
     * @param PS_L_INFOEXG_SRCHDM ��ü
     * @return PS_L_INFOEXG_SRCHDataSet ��ü
     * @author CRM ���Ǳ���
     * @since 2003.10.30    ver : 1.0
     */

    public PS_L_DAY_SCHEDataSet selectDayScheDetail(PS_L_DAY_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}