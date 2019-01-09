/**************************************************************************************************
* ���ϸ�    : SLReader2400DAO.java
* ���      : ����-VacationStop������ ���� DAO
* �ۼ�����  : 2004-01-20
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/

package chosun.ciis.ss.sal.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.dao.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;

/**
 * ����-VacationStop������ ���� DAO
 */
public class SLReader2400DAO {
    /**
     * VacationStop����-�ʱ�ȭ��
     * @param dm SL_L_VS_INITDM
     * @return SL_L_VS_INITDataSet
     * @throws AppException
     */
    public SL_L_VS_INITDataSet initVS(SL_L_VS_INITDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_VS_INITDataSet ds = (SL_L_VS_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop����-�����ȸ
     * @param dm SL_L_VSDM
     * @return SL_L_VSDataSet
     * @throws AppException
     */
    public SL_L_VSDataSet selectVSList(SL_L_VSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_VSDataSet ds = (SL_L_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop����-�󼼺���
     * @param dm SL_S_VSDM
     * @return SL_S_VSDataSet
     * @throws AppException
     */
    public SL_S_VSDataSet selectVSDetail(SL_S_VSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_VSDataSet ds = (SL_S_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop����-�ް���������� �����ȸ
     * @param dm SL_L_VS_AREANMDM
     * @return SL_L_VS_AREANMDataSet
     * @throws AppException
     */
    public SL_L_VS_AREANMDataSet selectVSAreaRegn(SL_L_VS_AREANMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_VS_AREANMDataSet ds = (SL_L_VS_AREANMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop����-�ް���������� ������,������ȭ��ȣ ��
     * @param dm SL_S_VS_AREABODM
     * @return SL_S_VS_AREABODataSet
     * @throws AppException
     */
    public SL_S_VS_AREABODataSet selectVSBODetail(SL_S_VS_AREABODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_S_VS_AREABODataSet ds = (SL_S_VS_AREABODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop����-�Է�,����,����
     * @param dm SL_A_VSDM
     * @return SL_A_VSDataSet
     * @throws AppException
     */
    public SL_A_VSDataSet accessVS(SL_A_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_A_VSDataSet ds = (SL_A_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
