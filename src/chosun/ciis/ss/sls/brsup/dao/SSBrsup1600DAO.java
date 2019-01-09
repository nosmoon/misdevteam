/***************************************************************************************************
* ���ϸ� : SSBrsup1600DAO.java
* ��� : ��������-����-����EDI ���������� DAO
* �ۼ����� : 2004-03-06
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-����-����EDI ���������� ���� DAO
 */

public class SSBrsup1600DAO {
    /**
     * ��������-����-����EDI��������-�ʱ�ȭ��
     * @param dm SS_L_EDI_INITDM
     * @return SS_L_EDI_INITDataSet
     * @throws AppException
     */
    public SS_L_EDI_INITDataSet selectEDIInit(SS_L_EDI_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EDI_INITDataSet ds = (SS_L_EDI_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-������� ��Ȳ �����ȸ
     * @param dm SS_L_EDI_RECPDM
     * @return SS_L_EDI_RECPDataSet
     * @throws AppException
     */
    public SS_L_EDI_RECPDataSet selectEDIRecp(SS_L_EDI_RECPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EDI_RECPDataSet ds = (SS_L_EDI_RECPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI ������� �����ȸ
     * @param dm SS_L_EDI_RECP_CATLDM
     * @return SS_L_EDI_RECP_CATLDataSet
     * @throws AppException
     */
    public SS_L_EDI_RECP_CATLDataSet selectRecpCatl(SS_L_EDI_RECP_CATLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EDI_RECP_CATLDataSet ds = (SS_L_EDI_RECP_CATLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI �Ա�ó����� �����ȸ
     * @param dm SS_L_GIRORECPDM
     * @return SS_L_GIRORECPDataSet
     * @throws AppException
     */
    public SS_L_GIRORECPDataSet selectRcpmCatl(SS_L_GIRORECPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_GIRORECPDataSet ds = (SS_L_GIRORECPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI Reject�����ȸ
     * @param dm SS_L_EDI_RECP_RJCTDM
     * @return SS_L_EDI_RECP_RJCTDataSet
     * @throws AppException
     */
    public SS_L_EDI_RECP_RJCTDataSet selectRejectList(SS_L_EDI_RECP_RJCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EDI_RECP_RJCTDataSet ds = (SS_L_EDI_RECP_RJCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI Reject����
     * @param dm SS_L_EDI_RECP_RJCTDM
     * @return SS_L_EDI_RECP_RJCTDataSet
     * @throws AppException
     */
    public SS_U_EDI_RECP_RJCTDataSet updateEDIReject(SS_U_EDI_RECP_RJCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EDI_RECP_RJCTDataSet ds = (SS_U_EDI_RECP_RJCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI �����ͼ���
     * @param dm SS_A_BATCH_GIRORECPDM
     * @return SS_A_BATCH_GIRORECPDataSet
     * @throws AppException
     */
    public SS_A_BATCH_GIRORECPDataSet selectGiroRecp(SS_A_BATCH_GIRORECPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BATCH_GIRORECPDataSet ds = (SS_A_BATCH_GIRORECPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-����-����EDI��������-����EDI �Աݹݿ�
     * @param dm SS_A_BATCH_RCPMRFLDM
     * @return SS_A_BATCH_RCPMRFLDataSet
     * @throws AppException
     */
    public SS_A_BATCH_RCPMRFLDataSet updateRcpmrfl(SS_A_BATCH_RCPMRFLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BATCH_RCPMRFLDataSet ds = (SS_A_BATCH_RCPMRFLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��������-����-����EDI��������-���Ͼ��ε�-����EDI 
     * @param incmgpers �Է���
     * @throws AppException
     */
    public void ediUpload(String incmgpers) throws AppException {

    	// �۾��̷�����
    	CO_A_WRKDM wrkMDm_start = new CO_A_WRKDM();
    	wrkMDm_start.setAccflag("I");
    	wrkMDm_start.setId("00111");
    	//wrkMDm.setExecno(execno);
    	//wrkMDm.setWorkfrdt(workfrdt);
    	//wrkMDm.setWorktodt(worktodt);
    	wrkMDm_start.setExecocomcd("1");
    	wrkMDm_start.setWorkremk1("EDI FILE UPLOAD");
    	//wrkMDm.setWorkremk2(workremk2);
    	wrkMDm_start.setWork_pers(incmgpers);
        DBManager migManager = new DBManager("Oracle");
        CO_A_WRKDataSet wrkMDS_start = (CO_A_WRKDataSet) migManager.executeCall(wrkMDm_start);
        
        if (!"".equals(wrkMDS_start.errcode)) {
           throw new AppException(wrkMDS_start.errcode, wrkMDS_start.errmsg);
        }
        
        // �۾��̷��� �����ȣ�� �����Ѵ�.
        String wrkMno = wrkMDS_start.getExecno();
        
       // ������ �̹� ���̱׷��̼ǿϷ�� �����̸� ����ó��
       /*
       if(migDS.curcommlist.size() != 0){

           SS_L_MIGRWORKINFOCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKINFOCURCOMMLISTRecord)migDS.curcommlist.get(0);
           if ("Y".equals(curcommlistRec.getEndcnfmyn())) {
               throw new AppException("SSAdmin1100DAO.boUpload()", "�̹� ���̱׷��̼��� �Ϸ�� �����Դϴ�.");
           }
       }
		*/
        
        // ����DB���ε� ����Ȯ��, �����۾���ȣ�� ���
        /*
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
        */
        try{

            // default.properties ���Ϸκ��� sqlload�� �����θ� ��´�.
            Properties p = new Properties();
            File propFile = new File("//appstore//webserver//resinB//prop//default-ciis.properties");
            
            FileInputStream fis = new FileInputStream(propFile);
            p.load(fis);
            fis.close();

            // SQL*Loader script ����
//      String cmdPath = "ksh /isdata/chosunis/dataload/";
            String today = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
            
            String saveFolder = "" + p.get("EDI.SQLLOAD.PATH");
            String cmdPath = "ksh " + saveFolder;
            
            File file = new File( saveFolder + today + "/");
            
            File FileList[] = file.listFiles(); 
        	
            String name = "";
            String cmd = "";
            Runtime r = null;
            Process proc = null;
            long lncnt = 0;
            if (FileList.length > 0) {
        		for( int i = 0; i < FileList.length; i++ )
        		{
        			if(FileList[i].isFile()) {
        				
        				name = FileList[i].getName();

			            lncnt = FileList[i].length();
			            
			            //������ �� ���ڵ� �Ǽ�
			            if (name.substring(0, 2).equals("GR")){
			            	lncnt = lncnt / 121; // ����EDI
			            }else if(name.substring(0, 2).equals("CS")){
			            	lncnt = lncnt / 81;	// ������ CVS����
			            }
			            
			            System.out.println("index:" + name.substring(0, 2));
        				
			            //****************************
        				//�ش� ���Ͼ��ε忡 ���� �̷����� ����
        				CO_A_WRKDTLDM wrkDDm_start = new CO_A_WRKDTLDM();
        				wrkDDm_start.setAccflag("I");
        				wrkDDm_start.setId("00111");
        				wrkDDm_start.setExecno(wrkMno);
        				//wrkDDm_start.setExecdtlsno(execdtlsno);
        				wrkDDm_start.setWorkdescri("file->DB");
        				//wrkDDm_start.setWorkfrdt(workfrdt);
        				//wrkDDm_start.setWorktodt(worktodt);
        				
        				//to do : ���̷º���..
        				wrkDDm_start.setSrctbl(name);
        				wrkDDm_start.setTargtbl("TEMP_GIRORECP");
        				wrkDDm_start.setNoit1(Long.toString(lncnt));
        				//wrkDDm_start.setNoit2(noit2);
        				//wrkDDm_start.setErrcd(errcd);
        				//wrkDDm_start.setErrmsg(errmsg);
        				CO_A_WRKDTLDataSet wrkDDS_start = (CO_A_WRKDTLDataSet) migManager.executeCall(wrkDDm_start);
        		        
        		        if (!"".equals(wrkDDS_start.errcode)) {
        		           throw new AppException(wrkDDS_start.errcode, wrkDDS_start.errmsg);
        		        }
        		        
        		        // �۾��̷��� �����ȣ�� �����Ѵ�.
        		        String wrkDno = wrkDDS_start.getExecdtlsno();
        		        //�ش� ���Ͼ��ε忡 ���� �̷����� ��
        		        //************************//
        		        
        				// to do :���ϸ�,��¥ �߰��ؾ���.


			            if (name.substring(0, 2).equals("GR")){
				            cmd = "ediload " + today + " " + name + " " + wrkMno + " " + wrkDno + " " + incmgpers;			            	
			            }else if(name.substring(0, 2).equals("CS")){
				            cmd = "cvsload " + today + " " + name + " " + wrkMno + " " + wrkDno + " " + incmgpers;
			            }
			            //cmd = "ediload " + today + " " + name + " " + wrkMno + " " + incmgpers;
			            //String cmd = "sqlload " + bocd + " " + bonm + " " + upDS.workno + " " + incmgpers;
			            r = Runtime.getRuntime();
			            proc = r.exec(cmdPath + cmd);
			            
			            System.out.println("cmd:" + cmdPath + cmd);
			// ����� �ڵ� ����
			            InputStream stdin = proc.getInputStream();
			            InputStreamReader isr = new InputStreamReader(stdin);
			            BufferedReader br = new BufferedReader(isr);
			            String line = null;

			            System.out.println("<OUTPUT>");


			            
			            while ( (line = br.readLine()) != null){
			            	System.out.println(line + ":" + lncnt);
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

        				//****************************
        				//�ش� ���Ͼ��ε忡 ���� �̷����� ����
			            /*
        				CO_A_WRKDTLDM wrkDDm_end = new CO_A_WRKDTLDM();
        				wrkDDm_end.setAccflag("U");
        				wrkDDm_end.setId("00111");
        				wrkDDm_end.setExecno(wrkMno);
        				wrkDDm_end.setExecdtlsno(wrkDno);
        				wrkDDm_end.setWorkdescri("file->DB");
        				//wrkDDm_end.setWorkfrdt(workfrdt);
        				//wrkDDm_end.setWorktodt(worktodt);
        				
        				//to do : ���̷º���..
        				wrkDDm_end.setSrctbl(name);
        				wrkDDm_end.setTargtbl("TEMP_GIRORECP");
        				wrkDDm_end.setNoit1(Long.toString(lncnt));
        				//wrkDDm_end.setNoit2(Long.toString(lncnt));
        				//wrkDDm_end.setErrcd(errcd);
        				//wrkDDm_end.setErrmsg(errmsg);
        				CO_A_WRKDTLDataSet wrkDDS_end = (CO_A_WRKDTLDataSet) migManager.executeCall(wrkDDm_end);
        		        
        		        if (!"".equals(wrkDDS_end.errcode)) {
        		           throw new AppException(wrkDDS_end.errcode, wrkDDS_end.errmsg);
        		        }
        		        */
        		        
        			}
        		}
            }

            //�۾��̷�����
        	CO_A_WRKDM wrkMDm_end = new CO_A_WRKDM();
        	wrkMDm_end.setAccflag("U");
        	wrkMDm_end.setId("00111");
        	wrkMDm_end.setExecno(wrkMno);
        	//wrkMDm.setWorkfrdt(workfrdt);
        	//wrkMDm.setWorktodt(worktodt);
        	wrkMDm_end.setExecocomcd("2");
        	wrkMDm_end.setWorkremk1("EDI FILE UPLOAD");
        	//wrkMDm.setWorkremk2(workremk2);
        	wrkMDm_end.setWork_pers(incmgpers);

            CO_A_WRKDataSet wrkMDS_end = (CO_A_WRKDataSet) migManager.executeCall(wrkMDm_end);
            
            if (!"".equals(wrkMDS_end.errcode)) {
               throw new AppException(wrkMDS_end.errcode, wrkMDS_end.errmsg);
            }

            return;
            
// ����� �ڵ� ��
        }catch(Exception e){
            e.printStackTrace();
            throw new AppException("SSAdmin1100DAO.boUpload()", "sqlload ����� ������ �߻��߽��ϴ�.");
        }

    }    

}