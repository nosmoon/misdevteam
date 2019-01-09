/***************************************************************************************************
* ���ϸ� : SSAdmin1000DAO.java
* ��� : ������-�۾�-����� ���� DAO
* �ۼ����� : 2004-04-09
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������-�۾�-����� ���� DAO
 */

public class SSAdmin1400DAO {
    /**
     * ������-�۾�-���-�ʱ�ȭ��
     * @param dm SS_L_WRK_INITDM
     * @return SS_L_WRK_INITDataSet
     * @throws AppException
     */
    public SS_L_WRK_INITDataSet initWrk(SS_L_WRK_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRK_INITDataSet ds = (SS_L_WRK_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-���
     * @param dm SS_L_WRKDM
     * @return SS_L_WRKDataSet
     * @throws AppException
     */
    public SS_L_WRKDataSet selectWrkList(SS_L_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKDataSet ds = (SS_L_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-��
     * @param dm SS_S_WRKDM
     * @return SS_S_WRKDataSet
     * @throws AppException
     */
    public SS_S_WRKDataSet selectWrkDetail(SS_S_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WRKDataSet ds = (SS_S_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-���
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet insertWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-����
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet updateWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-����
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet deleteWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���-��������
     * @param id �۾����̵�
     * @param incmgpers �۾���
     * @throws AppException
     */
    public void runWrk(String id, String incmgpers) throws AppException {
        // �۾����̵� üũ
        if (id == null || id.length() == 0) {
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "�۾����̵� �������� �ʽ��ϴ�.");
        }
        // �۾��� üũ
        if (incmgpers == null || incmgpers.length() == 0) {
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "�۾��ڰ� �������� �ʽ��ϴ�.");
        }
        // �۾� ���丮 �� ���� ��ũ��Ʈ
        String cmdPath = null;
        String cmd = null;

        // �۾�ID�� ���� ���������� �����Ѵ�.
        if("00010".equals(id.trim())){          // MIS ���ε�
            // MIS_EXEC ����
            cmdPath = "ksh /misdata/bin/";
            cmd = "MIS_EXEC " + incmgpers;
        }else if("00020".equals(id.trim())){    // ����IS ���� ���ε�
            // ISLEAF_EXEC.sh ����
            cmdPath = "ksh /isleaf/";
            cmd = "ISLEAF_EXEC " + incmgpers;
        }else if("00050".equals(id.trim())){    // ����ȸ������
            // PRIENTRMEMB_EXEC.sh ����
            cmdPath = "ksh /batch/";
            cmd = "PRIENTRMEMB_EXEC " + incmgpers;
        }else if ("00100".equals(id.trim())) { // ����û��(CD-ATM)�۽�
            // GIRO_EXEC.sh ����
            cmdPath = "ksh /batch/";
            cmd = "GIRO_EXEC " + incmgpers;
        }else if ("00180".equals(id.trim())) { // �ڵ���ü����
            // SHFTAPLY_EXEC.sh ����
            cmdPath = "ksh /batch/";
            cmd = "SHFTAPLY_EXEC " + incmgpers;
        }else if ("00200".equals(id.trim())) { // ���������������
            // BODDRSLTINFO_EXEC.sh ����
            cmdPath = "ksh /batch/";
            cmd = "BODDRSLTINFO_EXEC " + incmgpers;
        }else{
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "������ �۾��� ���������� �� �����ϴ�.");
        }

        try{
            Runtime r = Runtime.getRuntime();
            Process proc = r.exec(cmdPath+cmd);
// ����� �ڵ� ����
            InputStream stdin = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            while ( (line = br.readLine()) != null)
                System.out.println(line);
            System.out.println("</OUTPUT>");
            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
// ����� �ڵ� ��
        }catch(Exception e){
            e.printStackTrace();
            throw new AppException("SSAdmin1400DAO.runWrk()", id+"_EXEC ��ũ��Ʈ ����� ������ �߻��߽��ϴ�.");
        }
    }

    /**
     * ������-�۾��̷�-�ʱ�ȭ��
     * @param dm SS_L_WRKHIST_INITDM
     * @return SS_L_WRKHIST_INITDataSet
     * @throws AppException
     */
    public SS_L_WRKHIST_INITDataSet initWrkHist(SS_L_WRKHIST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-�̷�-���(�̷�)
     * @param dm SS_L_WRKHISTDM
     * @return SS_L_WRKHISTDataSet
     * @throws AppException
     */
    public SS_L_WRKHISTDataSet selectWrkHstyList(SS_L_WRKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKHISTDataSet ds = (SS_L_WRKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-�̷�-���(����)
     * @param dm SS_L_WRKDTLDM
     * @return SS_L_WRKDTLDataSet
     * @throws AppException
     */
    public SS_L_WRKDTLDataSet selectWrkPtcrList(SS_L_WRKDTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKDTLDataSet ds = (SS_L_WRKDTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
