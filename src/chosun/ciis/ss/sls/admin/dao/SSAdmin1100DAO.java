/***************************************************************************************************
* ���ϸ� : SSAdmin1100DAO.java
* ��� : ������-�۾�-���̱׷��̼��� ���� DAO
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;
import somo.framework.prop.*;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.text.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * ������-�۾�-���̱׷��̼��� ���� DAO
 */

public class SSAdmin1100DAO {
    /**
     * ������-�۾�-���̱׷��̼�-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initMig(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-���
     * @param dm SS_S_MIGRWORKINFODM
     * @return SS_S_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_S_MIGRWORKINFODataSet selectMigList(SS_S_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MIGRWORKINFODataSet ds = (SS_S_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-����DB���ε�
     * @param bocd ���������ڵ�
     * @param bonm ���������
     * @param incmgpers �Է���
     * @throws AppException
     */
    public void boUpload(String bocd, String bonm, String incmgpers) throws AppException {
        // ���� ���̱׷��̼� �ϷῩ�� üũ
        SS_L_MIGRWORKINFODM migDM = new SS_L_MIGRWORKINFODM();
        migDM.setBocd(bocd);
        DBManager migManager = new DBManager("Oracle");
        SS_L_MIGRWORKINFODataSet migDS = (SS_L_MIGRWORKINFODataSet) migManager.executeCall(migDM);
        if (!"".equals(migDS.errcode)) {
           throw new AppException(migDS.errcode, migDS.errmsg);
       }

// ������ �̹� ���̱׷��̼ǿϷ�� �����̸� ����ó��
       if(migDS.curcommlist.size() != 0){

           SS_L_MIGRWORKINFOCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKINFOCURCOMMLISTRecord)migDS.curcommlist.get(0);
           if ("Y".equals(curcommlistRec.getEndcnfmyn())) {
               throw new AppException("SSAdmin1100DAO.boUpload()", "�̹� ���̱׷��̼��� �Ϸ�� �����Դϴ�.");
           }
       }

        // ����DB���ε� ����Ȯ��, �����۾���ȣ�� ���
        SS_S_MIGR_DBUPDM upDM = new SS_S_MIGR_DBUPDM();
        upDM.setBocd(bocd);
        DBManager upManager = new DBManager("Oracle");
        SS_S_MIGR_DBUPDataSet upDS = (SS_S_MIGR_DBUPDataSet) upManager.executeCall(upDM);
        if (!"".equals(upDS.errcode)) {
            throw new AppException(upDS.errcode, upDS.errmsg);
        }
        // ����DB���ε� ���°� �������̸� ����ó��
        if ("1".equals(upDS.getBodbupstatcd())) {
            throw new AppException("SSAdmin1100DAO.boUpload()", "�ش� ������ ����DB���ε� �۾��� �������Դϴ�.");
        }
        try{

            // default.properties ���Ϸκ��� sqlload�� �����θ� ��´�.
            Properties p = new Properties();
            File propFile = new File("//was//salesdept//prop//default.properties");

            FileInputStream fis = new FileInputStream(propFile);
            p.load(fis);
            fis.close();

            // SQL*Loader script ����
//      String cmdPath = "ksh /isdata/chosunis/dataload/";
            String cmdPath = "ksh " + p.get("MIG.SQLLOAD.PATH");
            String cmd = "sqlload " + bocd + " " + bonm + " " + upDS.workno + " " + incmgpers;
            Runtime r = Runtime.getRuntime();
            Process proc = r.exec(cmdPath + cmd);
// ����� �ڵ� ����
            InputStream stdin = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            while ( (line = br.readLine()) != null){
                System.out.println(line);
                if(line.indexOf("ORA-") != -1 || line.indexOf("Exception") != -1){
                    throw new Exception();
                }
            }
            System.out.println("</OUTPUT>");
            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
            if(exitVal == -1){
                throw new Exception();
            }
// ����� �ڵ� ��
        }catch(Exception e){
            e.printStackTrace();
            throw new AppException("SSAdmin1100DAO.boUpload()", "sqlload ����� ������ �߻��߽��ϴ�.");
        }
    }


    /**
     * Deletes all files and subdirectories under dir.
     * Returns true if all deletions were successful.
     * If a deletion fails, the method stops attempting to delete and returns false.
     * @param dir File
     * @return success
     */
    private boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return dir.delete();
    }

    /**
     * �ӽ����Ϸ� ���� �о���� ���ڿ�����
     * �ϳ��� ���α����ڱ����� ���ڵ� ArrayList�� ���� �� ����
     * @param str String Souce String
     * @param cd String  Column Delimiter
     * @param ld String  Line Delimiter
     * @return ArrayList
     */
    private ArrayList parseRecords(String str, String cd, String ld) {
        ArrayList al = new ArrayList();
        if(str == null || str.length() == 0) return al;
        int ldIdx = str.indexOf(ld,0); //���� �������� ��ġ
        //System.out.println("str : " + str);
        //System.out.println("ldIdx : " + ldIdx);
        //System.out.println("first cd idx : " + str.indexOf(cd));
        int idx = -1;
        while(idx != ldIdx ){
            al.add(str.substring(idx+1, (str.indexOf(cd, idx+1) == -1)? ldIdx : str.indexOf(cd, idx+1)));
            idx = (str.indexOf(cd, idx+1) == -1)? ldIdx : str.indexOf(cd, idx+1);
        }
        return al;
    }

    /**
     *
     * @param destMgr
     * @param statecd
     * @throws AppException
     */
    private SS_A_MIG_BILLUPDataSet setWorkState(DBManager destMgr, SS_A_MIG_BILLUPDM dm, SS_A_MIG_BILLUPDataSet ds, String statecd) throws AppException{
       //local variables
       //SS_A_MIG_BILLUPDataSet ds = new SS_A_MIG_BILLUPDataSet();
       PreparedStatement pstmt = null;
       ResultSet rs            = null;
       String strSql           = null;
       ArrayList al            = null;   //records
       String[] values         = null;   //record  : ������� ������ �÷����� + 1 (���������ڵ带 �ϳ��� ���� �� �־����)

       //���̱׷��̼� ����UPLOAD �۾����� Ȯ�ι� ����
       destMgr.getConnection();
       destMgr.setAutoCommit(false);
       try {
           //�̹� �ش������� ���̱׷��ü� ������ ����

           strSql = "SELECT BILLDBUPSTATCD FROM TACOM_MIGRWORKINFO WHERE BOCD = ? ";
           pstmt = destMgr.m_conn.prepareStatement(strSql);
           pstmt.setString(1, dm.bocd);
           rs = pstmt.executeQuery();
           if (rs != null) {
               al = new ArrayList();
               values = new String[1];
               while (rs.next()) {
                   values[0] = rs.getString(1);
                   al.add(values);
               }
               rs.close();

               if (!"3".equals(statecd) && "1".equals(values[0])) {
                   ds.errcode = "[SSAdmin1100DAO.java-setWorkState](1)";
                   ds.errmsg = "[SSAdmin1100DAO.java-setWorkState](1) �ش�����(" + dm.bocd + ")�� ���̱׷��̼� �۾��� �Դϴ�.";
                   throw new AppException(ds.errcode, ds.errmsg);
               }
           }
           pstmt.close();
           if (al.size() == 0) { //�ش������� TACOM_MIGRWORKINFO�� ���ڵ� ��ü�� ���� ��� �ű� �߰�
               strSql = "INSERT INTO TACOM_MIGRWORKINFO(BOCD, BILLDBUPFRDT, BILLDBUPSTATCD, ENDCNFMYN ) VALUES ( ?, SYSDATE, ?, ?)";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, dm.bocd); //���������ڵ�
               pstmt.setString(2, statecd); //(1:�۾���,2:�۾��Ϸ�, 3:�۾�����) ����
               pstmt.setString(3, "N"); //�Ϸ�Ȯ�ο��� "N" ����

               pstmt.executeUpdate();
           } else { //�ش������� ���ڵ尡 ���� �� ���
               strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPFRDT = SYSDATE, BILLDBUPSTATCD = ?, ENDCNFMYN = ?, ENDCNFMPERS = NULL, ENDCNFMDT = NULL WHERE BOCD = ? ";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, statecd); //(1:�۾���,2:�۾��Ϸ�, 3:�۾�����) ����
               pstmt.setString(2, "N"); //�Ϸ�Ȯ�ο��� "N" ����
               pstmt.setString(3, dm.bocd); //���������ڵ�
               pstmt.executeUpdate();
           }
           destMgr.commit();
           if("3".equals(statecd)){
               throw new AppException(ds.errcode, ds.errmsg);
           }
       } catch (SQLException se) {
           se.printStackTrace();
           destMgr.rollback();
           ds.errcode = "[SSAdmin1100DAO.java-setWorkState](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-setWorkState](3) �ش�����(" + dm.bocd + ")�� ���̱׷��̼� �۾��� ���� ������ �����߻�";
           throw new AppException(ds.errcode, ds.errmsg);
       } finally {
           try {if (rs != null)rs.close();} catch (SQLException se) {se.printStackTrace();}
           try {if (pstmt != null)pstmt.close();} catch (SQLException se) {se.printStackTrace();}
           destMgr.disConnection();
       }
       return ds;
    }

    /**
     * ������-���̱׷��̼�-��ȯ
     *  [Transaction1 ����](����IS���� DB select ~ ������ �ӽ����ϵ� ����)
     *  0. ���� �۾� ���۽� ��������ý��� DB�� ���̱׷��̼��۾����� TB���� �ش� ���������ڵ��� ����UP�����ڵ尡 "�۾���"�̸� AppException �߻�
     *  1.  ���̱׷��̼��۾����� TB�� ����UP�����ڵ尡 "�۾��Ϸ�", "�۾�����" ���  "�۾���"���� update (��, �ش������� �����۾��ô� �ű��� �߰�)
     *  2. ���̱׷��̼��۾����� TB "�۾���" ���� (Update)
     *  3. ����IS�� MS-SQL AutoGiro DB���� ���̺� Select
     *  4. Select �� ���̺� �ӽ� ���� ����(�������������ϸ� ����) �� write
     *  5. �� �׸�� ���� ����ø� commit;
     *  6. Exception ó�� : AppException, SysException �� ��� rollback
     *  [Transaction1 ��]
     *
     *  [Transaction2 ����](������ �ӽ����� �б� ~ Oracle CRUD)(���Ϻ�)
     *  5. (�������� read ��)���̱׷��̼��۾��̷� TB �ű� �� �߰�
     *  6. (�� ���� read ��)���Ͽ� �ش��ϴ� �ӽ����̺��� �����ڷ� Delete
     *  7. (�� ���� read ��)������ ���ϴ� ���̱׷��̼��۾����� TB �� �ϳ��� �ű� �� �߰� ==>commit
     *  8. (�� ���� Line by Line)Read �� Insert ==>addBatch
     *  9. (�� ���� ������ line Read ��) batch ����
     *  10.batch ���� ����� ���̱׷��̼��۾����� TB ��  �۾���������, ����Ǽ� update ==>commit
     *  11.batch ���� ������ (System Exception �߻��� ���)
     *                     ���̱׷��̼��۾�����TB�� (�۾���������, �����ڵ�, �����޼���) update ==>commit
     *  12.(���������Ͽ� ���� batch ������)
     *        (����� - updateCounts �� 0���� ���� ���)
     *               ���̱׷��̼��۾��̷�TB�� �۾���������, �۾����(2:�۾��Ϸ�) update
     *               ���̱׷��̼��۾�����TB�� ����UP��������, ����UP�����ڵ�(2:�۾��Ϸ�) update ==>commit
     *        (������)
     *               ���̱׷��̼��۾��̷�TB�� �۾���������, �۾����(3:�۾�����) update
     *               ���̱׷��̼��۾�����TB�� ����UP��������, ����UP�����ڵ�(3:�۾�����) update ==>commit
     *  13. (�������۾�) �ӽ������� ���ϵ� ����
     *  14. Exception ó�� : SysException �� rollback �� 12�� �׸��� (������)
     *  [Transaction2 ��]
     *
     * %�۾���� �߰��Ǵ� �α״� �ڼ��� ����� ��Ģ���� �Ѵ�.
     *
     * @param dm SS_A_MIG_BILLUPDM
     * @return SS_A_MIG_BILLUPDataSet
     * @throws AppException
     */
    public SS_A_MIG_BILLUPDataSet billUpload(SS_A_MIG_BILLUPDM dm) throws AppException {
        // PropertyManager�� ���� �÷�������, ���α�����, ���ϰ���� ���� �о�´�.

        PropertyManager pm = PropertyManager.getInstance();
        String col_delimiterStr = (String) pm.get("IS.COLUMN.DELIMITER");
        char col_delimiter = (char) Integer.parseInt(col_delimiterStr);
        final String COL_DELIMITER = new Character(col_delimiter).toString();

        String line_delimiterStr = (String) pm.get("IS.LINE.DELIMITER");
        char line_delimiter = (char) Integer.parseInt(line_delimiterStr);
        final String LINE_DELIMITER = new Character(line_delimiter).toString();
        final String FILE_PATH = (String) pm.get("IS.DIR");
       //constants

       //local variables
       String[][] columns      = null;   //���̱׷��̼� ��� ���̺��� �÷� ����
       SS_A_MIG_BILLUPDataSet ds = new SS_A_MIG_BILLUPDataSet();
       DBManager srcMgr        = new DBManager("MSSQL");
       DBManager destMgr       = new DBManager("Oracle");
       PreparedStatement pstmt = null;
       ResultSet rs            = null;
       ResultSetMetaData rsmd  = null;
       String strSql           = null;
       ArrayList al            = null;   //records
       String[] values         = null;   //record  : ������� ������ �÷����� + 1 (���������ڵ带 �ϳ��� ���� �� �־����)
       int cnt                 = 0;      //insert,update,delete �ݿ� ����
       boolean success         = false;  //��������
       File dir                = null;   //����IS ���� DB ���� select �� ������ ���� �ӽõ��丮
       File file               = null;   //����IS ���� DB ���� select �� ������ ���� �ӽ�����
       String[] children       = null;   //�ӽõ��丮�� ���ϸ� �迭
       String tempFileName     = null;   //�ӽ����ϸ�
       BufferedReader in       = null;
       BufferedWriter out      = null;

       int i = 0; //outer for loop counter
       int j = 0; //inner for loop counter

       int[] updateCounts      = null;   //��ġ���� �� �� command ����� �ݿ��� row �� �� �迭
       String workno           = null;   //�۾���ȣ
       String dtlsworkno       = null;   //������ȣ

       //��������DB ���̱׷��̼� �۾����� ���̺� "�۾���(1)" ����
       ds = setWorkState(destMgr, dm, ds, "1");

       //Transaction1(����IS���� DB select ~ ������ �ӽ����ϵ� ����) ����
System.out.println("Transaction1 ����");
       try{
           //����is DB�� ����
           srcMgr.getConnection();
           for(i=0; i<dm.tables.size(); i++){

               strSql = dm.getSelQry(i);
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(i) + ".tmp";

               //�ӽ� ���丮 �� ���� ����
               dir = new File(FILE_PATH);
               boolean exists = dir.exists();
               if (!exists) { // directory exists
                   dir.mkdirs(); //�ӽ� ���丮 ���� �õ�
               }

               file = new File(tempFileName);
               success = file.createNewFile();
               if (!success) { //������ �̹� ������ ���¶�� ���� �� �� ����
                   success = file.delete();
                   if("".equals(ds.errcode) && !success){
	                   ds.errcode = "[SSAdmin1100DAO.java-billUpload](1)";
	                   ds.errmsg = "[SSAdmin1100DAO.java-billUpload](1) �ӽ�����("+tempFileName+")�� �������� ���߽��ϴ�.";
                   }

                   success = file.createNewFile();
                   if("".equals(ds.errcode) && !success){
                   	   ds.errcode = "[SSAdmin1100DAO.java-billUpload](2)";
                       ds.errmsg = "[SSAdmin1100DAO.java-billUpload](2) �ӽ�����("+tempFileName+")�� �������� ���߽��ϴ�.";
                   }
               }

               //����IS DB�� ������ billing data ��ȸ
               pstmt = srcMgr.m_conn.prepareStatement(dm.getSelQry(i));
               dm.setSelQryParams(pstmt, dm, i);

               rs = pstmt.executeQuery();

               if (rs != null) {
                   rsmd = rs.getMetaData();
                   //al = new ArrayList();
                   while (rs.next()) {
                       values = new String[rsmd.getColumnCount() + 1]; //������� ������ �÷����� + 1 (���������ڵ带 �ϳ��� ���� �� �־����)
                       for (j = 0; j < rsmd.getColumnCount(); j++) {
                           if (rs.getString(j + 1) != null) {
                               values[j] = Util.Uni2Ksc(rs.getString(j + 1)).trim() + COL_DELIMITER;
                           } else {
                               values[j] = "" + COL_DELIMITER;
                           }
                       }
                       values[j] = dm.bocd + LINE_DELIMITER + "\n"; //������ �÷��� ���������ڵ带 �Ҵ� ('\n'�� +�ϴ� ������ FileReader �� readLine �޽�� Ȱ���ϱ� ����)

                       out = new BufferedWriter(new FileWriter(tempFileName, true));

                       for (int k = 0; k < values.length; k++) {
                           out.write(values[k]);
                       }
                       out.close();

                   }
                   rs.close();
               }
               pstmt.close();
           }
       }catch(IOException ioe){
       	   ioe.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) �������ε�� ���� ���� �����߻�";
       }catch(SQLException sqle){
       	   sqle.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) �������ε�� DB ���� �����߻�";
       }catch(Exception e){
       	   e.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](4)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](4) �������ε�� �˼� ���� �����߻�";
       } finally {
           try { if (out != null)out.close();} catch (IOException ioe) {}
           try {if (rs != null)rs.close();} catch (SQLException se) {}
           try {if (pstmt != null)pstmt.close();} catch (SQLException se) {}
           srcMgr.disConnection();
       }

       //�۾����� ���� ����
       if(!"".equals(ds.errcode)){
           ds = setWorkState(destMgr, dm, ds, "3");
       }
       //Transaction1(����IS���� DB select ~ ������ �ӽ����ϵ� ����) ��

       //Transaction2(������ �ӽ����� �б� ~ Oracle CRUD) ����
       try{
           i = 0;
System.out.println("Transaction2 ����");
           destMgr.getConnection();
           destMgr.setAutoCommit(false);

           for( i=0; i<dm.tables.size();i++){
               updateCounts = null;
               columns = (String[][])dm.columns.get(i);
               cnt = 0; //���Ϸ� ���� �о���� ���μ� ī��Ʈ
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(i) + ".tmp";
               try{
                   //�ʱ�ȭ �۾� ����
                   if(i==0){ //TACOM_MIGRWORKHIST ���̺��� �������� ó���� �ѹ��� �ű����߰�
                       //�ű����߰��� ���� �۾���ȣ ä��
                       strSql = "SELECT LPAD(TO_CHAR(TO_NUMBER(NVL(MAX(WORKNO), '000')) + 1), 3, '0') FROM TACOM_MIGRWORKHIST WHERE BOCD = ? AND WORKCLSF = ? ";

                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //���������ڵ�
                       pstmt.setString(2, dm.workclsf); //�۾�����
                       rs = pstmt.executeQuery();
                       rs.next();
                       workno = rs.getString(1); //�۾���ȣ
                       rs.close();
                       //pstmt.close();

                       //���̱׷��̼��۾��̷�TB�� �ű����߰�
                       strSql = "INSERT INTO TACOM_MIGRWORKHIST VALUES (?, ?, ?, SYSDATE, NULL, ?, ?) ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //���������ڵ�
                       pstmt.setString(2, dm.workclsf); //�۾������ڵ�
                       pstmt.setString(3, workno); //�۾���ȣ
                       pstmt.setString(4, dm.incmgpers); //�۾��� ID
                       pstmt.setString(5, "�����ҽ����� �ش������� �о� �ӽ������� ���������� �����Ǿ����ϴ�."); //�۾���� ���� �۾����� ����
                       pstmt.executeUpdate();
                       pstmt.close();
                   }

                   //���̱׷��̼��۾��̷�TB�� ������ ���
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"�� ���̺�["+dm.tables.get(i)+"] migration�� �����մϴ�."); //�۾����
                   pstmt.setString(2, dm.bocd); //���������ڵ�
                   pstmt.setString(3, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(4, workno); //�۾���ȣ
                   pstmt.executeUpdate();
                   pstmt.close();

                   //���̱׷��̼��۾����� TB  insert
                   //���̱׷��̼��۾�����TB�� �ű����߰��� ���� ������ȣ ä��
                   strSql = "SELECT LPAD(TO_CHAR(TO_NUMBER(NVL(MAX(DTLSWORKNO), '000')) + 1), 3, '0') FROM TACOM_MIGRWORKPTCR WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd); //���������ڵ�
                   pstmt.setString(2, dm.workclsf); //�۾�����
                   pstmt.setString(3, workno); //�۾���ȣ
                   rs = pstmt.executeQuery();
                   rs.next();
                   dtlsworkno = rs.getString(1); //������ȣ
                   rs.close();
                   pstmt.close();

                   //���̱׷��̼��۾�����TB�� �ű����߰�
                   strSql = "INSERT INTO TACOM_MIGRWORKPTCR VALUES (?, ?, ?, ?, ?, SYSDATE, NULL, ?, ?, ?, 0, NULL, NULL) ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd); //���������ڵ�
                   pstmt.setString(2, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(3, workno); //�۾���ȣ
                   pstmt.setString(4, dtlsworkno); //������ȣ
                   pstmt.setString(5, ""); //�۾�����
                   pstmt.setString(6, (String)dm.tables.get(i)); //�ҽ����̺�
                   pstmt.setString(7, "TEMP_" + (String)dm.tables.get(i)); //Ÿ�����̺�
                   pstmt.setString(8, "0"); //����Ǽ�
                   pstmt.executeUpdate();
                   pstmt.close();


                   //�ش������� ���� ���ڵ���� �ӽ����̺��� ����
                   strSql = "DELETE CRMSAL_MIG.TEMP_" + (String) dm.tables.get(i) + " WHERE BOCD = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd);
                   pstmt.executeUpdate();

                   destMgr.commit();
                   //�ʱ�ȭ �۾� ��
               }catch(SQLException se){
                    se.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(se);
               }finally{
                   try {if(rs != null)rs.close();} catch (SQLException se) { se.printStackTrace();}
                   try {if(pstmt != null)pstmt.close();} catch (SQLException se) {se.printStackTrace();}
               }

               try {
                   in = new BufferedReader(new InputStreamReader(new FileInputStream(tempFileName), "KSC5601"));
                   String str = null;
                   ArrayList record = null;

                   j = 0;

                   while ((str = in.readLine()) != null) {
                       cnt++; //���� ī��Ʈ + 1
                   }
                   in.close();

                   //prepared statement ����
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET WORKTODT = SYSDATE, ABSTRNOIT = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, String.valueOf(cnt));  // ����Ǽ�
                   pstmt.setString(2, dm.bocd); //���������ڵ�
                   pstmt.setString(3, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(4, workno); //�۾���ȣ
                   pstmt.setString(5, dtlsworkno); //������ȣ
                   pstmt.executeUpdate(); //����Ǽ� ������Ʈ
                   pstmt.close();

                   //(Line by Line)Read & Insert(read & insert �� ���� �۾�����, �̷�, ���� update) ���� ����
                   strSql = "INSERT INTO  CRMSAL_MIG.TEMP_" + dm.tables.get(i) + "(";
                   if(columns != null){
                       for (int k = 0; k < columns.length; k++) {
                           strSql += columns[k][1];
                           strSql += (k + 1 == columns.length) ? ")" : ", ";
                       }
                       strSql += "VALUES( ";
                       //insert ���� �ϼ�
                       if (dm.columns.get(i) != null) {
                           for (int k = 0; k < columns.length; k++) {
                               strSql += "?";
                               strSql += (k + 1 == columns.length) ? ")" : ", ";
                           }
                       }
                   }

                   in = new BufferedReader(new InputStreamReader(new FileInputStream(tempFileName), "KSC5601"));
                   str = null;
                   record = null;
                   cnt = 0; //���Ϸ� ���� �о���� ���μ� ī��Ʈ
                   j = 0;

                   //prepared statement ����
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   while ((str = in.readLine()) != null) {
                       record = parseRecords(str, COL_DELIMITER, LINE_DELIMITER);
                       //parameter ����
                       if(record.size() > 0){
                           for (int k = 0; k < record.size(); k++) {
                               if(columns != null && "DATE".equalsIgnoreCase(columns[k][2])){
                                   SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                   java.util.Date dt = sf.parse((String) record.get(k), new ParsePosition(0));
                                   if(dt != null){
                                       Timestamp ts = new Timestamp(dt.getTime());
                                       pstmt.setTimestamp(k + 1, ts);
                                   }else{
                                       pstmt.setTimestamp(k + 1, null); //�ð��� ������
                                   }
                               }else{
                                   pstmt.setString(k + 1, (String) record.get(k));
                               }

                           }
                           //���Ϸ� ���� �Ľ̵� ���ڵ尡 ���� �� ��쿡�� ��ġ�� �߰�
                           pstmt.addBatch();
                       }
                       cnt++; //���� ī��Ʈ + 1
                   }

                   //��ġ����
                   updateCounts = pstmt.executeBatch();
                   in.close();
                   pstmt.close();

                   //���̱׷��̼��۾�����TB �� ��������, ��ȯ�Ǽ� update
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET SWITNOIT = ?, WORKTODT = SYSDATE WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (updateCounts == null)? "0" : String.valueOf(updateCounts.length)); // ��ȯ�Ǽ�
                   pstmt.setString(2, dm.bocd); //���������ڵ�
                   pstmt.setString(3, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(4, workno); //�۾���ȣ
                   pstmt.setString(5, dtlsworkno); //������ȣ
                   pstmt.executeUpdate();
                   pstmt.close();

                   //���̱׷��̼��۾��̷�TB�� ������ ������Ʈ
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"�� ���̺�["+dm.tables.get(i)+"] migration�� �Ϸ� �Ǿ����ϴ�."); //�۾����
                   pstmt.setString(2, dm.bocd); //���������ڵ�
                   pstmt.setString(3, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(4, workno); //�۾���ȣ
                   pstmt.executeUpdate();
                   pstmt.close();


                   if(i + 1 == dm.tables.size()){ //������ ���̺��� ���
                       //���̱׷��̼��۾��̷�TB�� �۾���������, �۾����(2:�۾��Ϸ�) update
                       strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKTODT = SYSDATE, WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, "����("+dm.bocd+")�� ���� migration�� �Ϸ� �Ǿ����ϴ�."); //�۾����
                       pstmt.setString(2, dm.bocd); //���������ڵ�
                       pstmt.setString(3, dm.workclsf); //�۾������ڵ�
                       pstmt.setString(4, workno); //�۾���ȣ
                       pstmt.executeUpdate();
                       pstmt.close();

                       //���̱׷��̼��۾�����TB�� ����DBUP��������, ����DBUP�����ڵ�(2:�۾��Ϸ�) update
                       strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPTODT = SYSDATE, BILLDBUPSTATCD = '2' WHERE BOCD = ? ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //���������ڵ�
                       pstmt.executeUpdate();
                       pstmt.close();
                   }

                   destMgr.commit();
               } catch (FileNotFoundException fnfe) {
                   fnfe.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(fnfe);
               } catch (IOException ioe) {
                   ioe.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(ioe);
               } catch (BatchUpdateException bue){
                   bue.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(bue);
               } catch (SQLException se) {
                   se.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(se);
               } catch (Exception e) {
                   e.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(e);
               } finally {
                   try {if(in != null)in.close();} catch (IOException ioe) {}
                   try {if(rs != null)rs.close();} catch (SQLException se) {}
                   try {if(pstmt != null)pstmt.close();} catch (SQLException se) {}
               }
           }
       }catch(SysException se){
           se.printStackTrace();
           destMgr.rollback();
           try{
               //���̱׷��̼��۾�����TB�� ����DBUP��������, ����DBUP�����ڵ�(3:�۾�����) update
               strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPTODT = SYSDATE, BILLDBUPSTATCD = '3' WHERE BOCD = ?";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, dm.bocd);
               pstmt.executeUpdate();
               pstmt.close();
               destMgr.commit();

               //���̱׷��̼��۾�����TB �� ��������, ��ȯ�Ǽ�, �����ڵ�, �����޼��� update
               if(workno != null && dtlsworkno != null){
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET WORKTODT = SYSDATE, SWITNOIT = ?, ERRCD = ?, ERRMSG = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);

                   pstmt.setString(1, "0");  // ��ȯ�Ǽ� 0 ��(���̺�� �ϳ��� Ʈ������̹Ƿ�..)
                   //Batch���� �̿ܿ� SQLException �� ���
                   if ("java.sql.SQLException".equals(se.getException().getClass().getName())) {
                       pstmt.setString(2, String.valueOf( ( (SQLException) se.getException()).getErrorCode()));
                       pstmt.setString(3, String.valueOf( ( (SQLException) se.getException()).getMessage()));
                       //Batch���� �� SQLException �� ���
                   } else if ("java.sql.BatchUpdateException".equals(se.getException().getClass().getName())) {
                       updateCounts = ((BatchUpdateException) se.getException()).getUpdateCounts();
                       pstmt.setString(2, String.valueOf( ( (BatchUpdateException) se.getException()).getErrorCode()));
                       pstmt.setString(3, "\nBatch Line Number : "
                                          + String.valueOf( ( (BatchUpdateException) se.getException()).getUpdateCounts().length + 1)
                                          + "\n" + String.valueOf( ( (BatchUpdateException) se.getException()).getMessage()));
                   } else {
                       pstmt.setString(2, "");
                       pstmt.setString(3, se.getException().getClass().getName() + ":" + se.getException().getMessage());
                   }
                   pstmt.setString(4, dm.bocd); //���������ڵ�
                   pstmt.setString(5, dm.workclsf); //�۾������ڵ�
                   pstmt.setString(6, workno); //�۾���ȣ
                   pstmt.setString(7, dtlsworkno); //������ȣ
                   pstmt.executeUpdate();
                   pstmt.close();
               }

               //���̱׷��̼��۾��̷�TB�� �۾���������, �۾����(3:�۾�����) update
               if(workno != null){
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKTODT = SYSDATE, WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"�� ���̺�["+dm.tables.get(i)+"] migration�� ����"+cnt+" ��° ���ڵ� ����)�� �߻� �Ǿ����ϴ�."); //�۾����
                   pstmt.setString(2, dm.bocd);
                   pstmt.setString(3, dm.workclsf);
                   pstmt.setString(4, workno);
                   pstmt.executeUpdate();
                   pstmt.close();
               }
               destMgr.commit();
               ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
               ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) �ش�����("+dm.bocd+")�� ���� ������ �ε��� ������ �߻��Ͽ� ����Ǿ����ϴ�. �ڼ��� ������ ���� ���̺��� Ȯ���ϼ���.";
               throw new AppException(ds.errcode, ds.errmsg);
           }catch(SQLException sqle){
               destMgr.rollback();
               throw new SysException(sqle);
           }
       }finally{
           destMgr.disConnection();
           /*
           for(int k=0; k<dm.tables.size(); k++){
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(k) + ".tmp";
               file = new File(tempFileName);
               if (file.exists()) {
                   file.delete(); //�ӽ� ���� ���� �õ�
               }
           }
           */
       }
       //Transaction2 ��
       return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ
     * @param dm SS_A_MIGRWORKINFODM
     * @return SS_A_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_A_MIGRWORKINFODataSet boConvert(SS_A_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGRWORKINFODataSet ds = (SS_A_MIGRWORKINFODataSet) manager.executeCall(dm);
System.out.println("SSAdmin1100 : ds.errcode : "+ds.errcode+ " ds.errmsg : "+ds.errmsg);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ
     * @param dm SS_A_MIGRWORKINFODM
     * @return SS_A_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_A_MIGRWORKINFODataSet billConvert(SS_A_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGRWORKINFODataSet ds = (SS_A_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-����DB���ε� �۾��̷�
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBoUploadHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-����DB���ε� �۾��̷�
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBillUploadHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBoConvertHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBillConvertHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-����DB���ε� �۾�����
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBoUploadPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-����DB���ε� �۾�����
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBillUploadPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾�����
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBoConvertPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾�����
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBillConvertPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼� ��Ȳ-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initMigInfo(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼� ��Ȳ-���
     * @param dm SS_L_MIGRWORKINFODM
     * @return SS_L_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKINFODataSet selectMigInfoList(SS_L_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKINFODataSet ds = (SS_L_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-�۾�-���̱׷��̼� ��Ȳ-����
     * @param dm SS_U_MIGRWORKINFODM
     * @return SS_U_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_U_MIGRWORKINFODataSet updateMigInfo(SS_U_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_MIGRWORKINFODataSet ds = (SS_U_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
