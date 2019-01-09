/***************************************************************************************************
 * ���ϸ�   : PSReader1801DAO.java
 * ���     : ����-������ȸ ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-02-24
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-������ȸ
 */
public class PSReader1801DAO {

    /**
     * ������ȸ �ʱ�ȭ��
     * @param PS_S_PUBL_RDRDM
     * @return PS_S_PUBL_RDRDataSet
     */
    public PS_S_PUBL_RDRDataSet selectCodeList(PS_S_PUBL_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������ȸ ��ȸȭ��
     * @param PS_L_RDR_PUBL_ETCDM
     * @return PS_L_RDR_PUBL_ETCDataSet
     **/
    public PS_L_RDR_PUBL_ETCDataSet selectRdrList(PS_L_RDR_PUBL_ETCDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_RDR_PUBL_ETCDataSet ds = (PS_L_RDR_PUBL_ETCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������ȸ ����ȸȭ��
     * @param PS_S_READERINFODM
     * @return PS_S_READERINFODataSet
     **/
    public PS_S_READERINFODataSet selectDetailInfo(PS_S_READERINFODM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_READERINFODataSet ds = (PS_S_READERINFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ����-���� ���� �˻�
     * @param PS_L_BO_READER_SEARCHDM
     * @return PS_L_BO_READER_SEARCHDataSet
     */
    public PS_L_BO_READER_SEARCHDataSet selectBoReaderList(PS_L_BO_READER_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BO_READER_SEARCHDataSet ds = (PS_L_BO_READER_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����-���� ���� �󼼰˻�
     * @param PS_S_BO_READERINFODM
     * @return PS_S_BO_READERINFODataSet
     */
    public PS_S_BO_READERINFODataSet selectBoReaderDetail(PS_S_BO_READERINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_BO_READERINFODataSet ds = (PS_S_BO_READERINFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ڰ���--���������� ����
     * @param PS_U_BO_READERINFO_ONEDM
     * @return PB_U_BO_READERINFO_ONEDataSet
     */
    public PS_U_BO_READERINFO_ONEDataSet updateBoReaderInfo(PS_U_BO_READERINFO_ONEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_BO_READERINFO_ONEDataSet ds = (PS_U_BO_READERINFO_ONEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
