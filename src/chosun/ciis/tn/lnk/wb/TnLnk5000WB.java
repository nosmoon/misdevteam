/***************************************************************************************************
* ���ϸ� : TnLnk5000WB.java
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.tn.lnk.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk5000DAO;
import chosun.ciis.tn.lnk.dao.TnLnk6000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.TN_LNK_5050_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_5070_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_5090_ACURLISTRecord;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
//import com.sf.xc3.*;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;

/**
 * 
 */

public class TnLnk5000WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void tn_lnk_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5000_MDataSet ds = null;
		TN_LNK_5000_MDM dm = new TN_LNK_5000_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();
        
        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5000_m(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("uid", Util.getSessionParameterValue(req,"emp_no",true));
        }
        catch (AppException e) {
            throw e;
        } 
    }
	
	public void tn_lnk_5005_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		String	server_ip 	= "121.134.74.90";
		int		server_port = 51000;		//real
		int		server_port_dev = 51001;	//dev
		String	status = "";
		
		/**
		 * �������Ӱ��ɿ����׽�Ʈ(real)
		 */
		try {
			status = "connect to (real)==> " + server_ip + ":" + server_port + "\n\n";
			//log.msgLog("connect to (real)==> " + server_ip + ":" + server_port);
    		if(conn.connect(server_ip, server_port) < 0){
    			status += "�������(real).........\n\n";    			
    			//log.msgLog(status);
    		}else{
    			status += "���Ἲ��(real).......!!\n\n";
    			//log.msgLog(status);
    		}
    		
		} catch (Exception e) {
			status += "connect fail to (real)==> " + server_ip + ":" + server_port + "\n\n";
			//log.msgLog("connect fail to (real)==> " + server_ip + ":" + server_port);
		}

		/*** �������� ***/
		int ret = conn.close();
		if(ret>0){
			status += "��������(real)\n\n";
			//log.msgLog("��������(real)");
		} else {
			status += "�������� ����(real) : " + ret + "\n\n";
			//log.msgLog("�������� ����(real) : " + ret);
		}
		
		
		/**
		 * �������Ӱ��ɿ����׽�Ʈ(dev)
		 */
		try {
			status += "connect to (dev)==> " + server_ip + ":" + server_port_dev + "\n\n";
			//log.msgLog("connect to (dev)==> " + server_ip + ":" + server_port);
    		if(conn.connect(server_ip, server_port_dev) < 0){
    			status += "�������(dev).........\n\n";
    			//log.msgLog("�������(dev).........");
    			//throw new Exception();
    		}else{
    			status += "���Ἲ��(dev).......!!\n\n";
    			//log.msgLog("���Ἲ��(dev).......!!");
    		}
    		
		} catch (Exception e) {
			status += "connect fail to (dev)==> " + server_ip + ":" + server_port_dev + "\n\n";
			//log.msgLog("connect fail to (dev)==> " + server_ip + ":" + server_port);
		}

		/*** �������� ***/
		ret = conn.close();
		if(ret>0){
			status += "��������(dev)\n\n";
			//log.msgLog("��������(dev)");
		} else {
			status += "�������� ����(dev) : " + ret + "\n\n";
			//log.msgLog("�������� ����(dev) : " + ret);
		}
		
		req.setAttribute("conn_log", status);
		log.msgLog(status);
 
    }
	
	public void tn_lnk_5010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5010_LDataSet ds = null;
		TN_LNK_5010_LDM dm = new TN_LNK_5010_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.pymtyymm = Util.checkString(req.getParameter("pymtyymm"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();

        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
        
	}

	public void tn_lnk_5020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5020_LDataSet ds = null;
		TN_LNK_5020_LDM dm = new TN_LNK_5020_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
		dm.result_stat = Util.checkString(req.getParameter("result_stat"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));
		dm.cnclyn = Util.checkString(req.getParameter("cnclyn"));
		dm.delyn  = Util.checkString(req.getParameter("delyn"));

		dm.print();
		
        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
	}
		
	public void tn_lnk_5030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5030_LDataSet ds = null;
		TN_LNK_5030_LDM dm = new TN_LNK_5030_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));

		dm.print();

        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
	}
	
	public void tn_lnk_5035_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5035_ADataSet ds = null;
		TN_LNK_5035_ADM dm = new TN_LNK_5035_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.file_clsf = Util.checkString(req.getParameter("file_clsf"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.promiseidx = (String)hash.get("promiseidx");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5035_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
	}
	
	public void tn_lnk_5040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_5040_ADataSet ds = null;
		TN_LNK_5040_ADM dm = new TN_LNK_5040_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.chg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
	}

	public void tn_lnk_5050_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_5050_ADataSet ds  = null;
		TN_LNK_5055_ADataSet ds2 = null;
		TN_LNK_5050_ADM dm  = new TN_LNK_5050_ADM();
		TN_LNK_5055_ADM dm2 = new TN_LNK_5055_ADM();

		dm.cmpy_cd     = dm2.cmpy_cd     = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx     = dm2.sdsiidx     = Util.checkString(req.getParameter("sdsiidx"));
		dm2.requestdate = Util.checkString(req.getParameter("requestdate"));
		dm2.fmsseq      = Util.checkString(req.getParameter("fmsseq"));
		dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm2.incmg_pers      = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();


        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5050_a(dm);
            req.setAttribute("ds", ds);
        	
            /*----------------------------------------------*/
    		System.out.println("ī���������...");
    		BaseAction conn = new XC_JavaSocket();
    		System.out.println("ī��������� lib loaded");
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		int	dataCnt = 0;
    		
    		log.msgLog("ī����� �����Ƿ� ����...");
    		
    		
    		/**
    		 * ��������
    		 * ī�� ��ݽ�û ���(��ġ)
    		 */
    		try {

    			log.msgLog("connect to ==> " + server_ip + ":" + server_port);
	    		if(conn.connect(server_ip, server_port) < 0){    			
	    			log.msgLog("�������.........");
	    			throw new Exception();
	    		}else{
	    			log.msgLog("���Ἲ��.......!!");
	    		}
	    		
    		} catch (Exception e) {
    			throw e;
    		}

    		/*** 1. �������� �۽� ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. �������� ������� ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:"+sdata);

			/*** 2.1�������� �����ϰ�� �������� �� ���� ***/
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				log.tgrLog("�������� ����", errcode + " : " + errmsg );

			} else {
			
				/*** 3. ���ν�ûData (Header����,Data����,Tail����) �۽� ***/
				log.msgLog("���ν�û Data �۽� ����");
				for(int i = 0; i < ds.curlist.size(); i++) {
					TN_LNK_5050_ACURLISTRecord rec = (TN_LNK_5050_ACURLISTRecord)ds.curlist.get(i);
					conn.sendData(rec.filedata.replaceAll("]", tag));
					log.tgrLog("�۽�", rec.filedata.replaceAll("]", tag));
				}			
				log.msgLog("���ν�û Data �۽� �Ϸ�");


	    		/*** 4. ���ν�û(���)HEADER���� ���� ***/
				String hdr = new String(conn.recvData());
				log.tgrLog("[��� data]����", hdr);
							
				/*** 5. ���ν�û(���:�����Ƿڿ���)Data ���� ***/
				try {
					dm2.header     = "";	//���ڵ����
					dm2.tail       = "";    //���ڵ�����
					dm2.pymt_cd    = "";	//������ȣ(�����ڹ�ȣ)		
					dm2.acptdate   = "";	//������������
					dm2.acptprice  = "";	//���μ����ݾ�
					dm2.fee        = "";	//������
					dm2.acptno     = "";	//���μ����� ���ι�ȣ
					dm2.cnclokdate = "";	//��Ұ�������
					dm2.result     = "";	//ó�����(Y/N)
					dm2.resultcode = "";	//����ڵ�
					dm2.resultmsg  = "";	//����ڵ��� �޼���

					int k = 0;
					dataCnt = (int)ds.data_cnt;
					while(dataCnt>0){
						dataCnt--;
						String tgl = new String(conn.recvData());
						//log.tgrLog("[��� data]����", tgl);
						log.msgLog("[" + getByteString(tgl,284,4).trim() + "][��� data] " + tgl);
						log.msgLog("AT: " + tgl.substring(0,1).charAt(0));

						if(tgl.substring(0,1).charAt(0)=='D'){
							//���� �۽Ű��� �ƴѰ��
							if( !getByteString(tgl,284,4).trim().equals("D000") ) {
								
								dm2.pymt_cd    += getByteString(tgl,17,20).trim()  + sep;	//������ȣ(�����ڹ�ȣ)		
								dm2.acptdate   += getByteString(tgl,205,8).trim()  + sep;	//������������
								dm2.acptprice  += getByteString(tgl,213,10).trim() + sep;	//���μ����ݾ�
								dm2.fee        += getByteString(tgl,223,5).trim()  + sep;	//������
								dm2.acptno     += getByteString(tgl,228,20).trim() + sep;	//���μ����� ���ι�ȣ
								dm2.cnclokdate += getByteString(tgl,275,8).trim()  + sep;	//��Ұ�������
								dm2.result     += getByteString(tgl,283,1).trim()  + sep;	//ó�����(Y/N)
								dm2.resultcode += getByteString(tgl,284,4).trim()  + sep;	//����ڵ�
								//dm2.resultmsg  += getByteString(tgl,288,30).trim() + sep;	//����ڵ��� �޼���
								
								++k;
								log.msgLog("["+k+"][" + getByteString(tgl,284,4).trim() + sep + "][��� data]���ſ����ڷ�: " + tgl);								
							}
						}
						
						if(tgl.substring(0,1).charAt(0)=='H'){
							dm2.header = tgl;
							System.out.println("header====> " + tgl);
						}
		
						if(tgl.substring(0,1).charAt(0)=='T'){
							dm2.tail = tgl;
							System.out.println("tail======> " + tgl);
							break;
						}
					}
					
				} catch (Exception e) {
					System.out.println("*** Data record ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "Data record ���� �� ����";
				}				
				log.msgLog("Data record ���� ����");


				//�������� ����
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//���������� [T000]�� �ƴѰ�� ��û�� ���� ���°����� ó�� [��ü ������ ���ν�û ����]
						errcode = tail_result;
						errmsg  = "���ν�û ����";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** �������� ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "�������� ���� �� ����";
				}

			}

			/*** �������� ***/
			int ret = conn.close();
			if(ret>0){
				log.msgLog("��������");
			} else {
				log.msgLog("�������� ���� : " + ret);
			}
			log.msgLog("...ī����� �����Ƿ� ��������.");
			
			
			//ī����� �����Ƿ� ó����� ö��
			dm2.fmserr 	  = errcode;	//�ۼ��ſ����ڵ弳��
			dm2.fmserrmsg = errmsg;		//�ۼ��ſ����޼�������
			dm2.print();
            ds2 = dao.tn_lnk_5055_a(dm2);            
            req.setAttribute("ds2", ds2);

		} catch (Exception e) {
			System.out.println("*** ī����� ���ο�û ó���� ����: " + e.getMessage() );
            throw e;
		}

	}
	
	public void tn_lnk_5060_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_5060_ADataSet ds  = null;
		TN_LNK_5065_ADataSet ds2 = null;
		TN_LNK_5060_ADM dm  = new TN_LNK_5060_ADM(); //������� �������� ���
		TN_LNK_5065_ADM dm2 = new TN_LNK_5065_ADM(); //��������� ó��

		dm.cmpy_cd     = dm2.cmpy_cd     = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx     = dm2.sdsiidx     = Util.checkString(req.getParameter("sdsiidx"));
		dm.requestdate = dm2.requestdate = Util.checkString(req.getParameter("requestdate"));
		dm.fmsseq      = dm2.fmsseq      = Util.checkString(req.getParameter("fmsseq"));
		dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm2.incmg_pers      = Util.getSessionParameterValue(req,"emp_no",true);
		
		try {
			//��ݰ��ó�� �������� ��������
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5060_a(dm);
            req.setAttribute("ds",  ds);
            
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int	dataCnt = 0;
    		
    		log.msgLog("ī����� ���ó�� ����...");

			/*** �������� ***/
    		try {
				//ī�� ��ݽ�û ���(��ġ)
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("�������");
					throw new Exception();
				}else{
					log.msgLog("���Ἲ��");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}


			/*** 1. �������� �۽� ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. �������� ���� ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");

			/*** 2.1. �������� �����ϰ�� �������� �� ���� ***/
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				log.tgrLog("�������� ����", errcode + " : " + errmsg );

			} else {
	
				log.msgLog("Data record ���� ����");
				//�������� ���Ϲ���������
				try {
					dm2.header     = "";	//���ڵ����
					dm2.tail       = "";    //���ڵ�����
					dm2.pymt_cd    = "";	//������ȣ(�����ڹ�ȣ)		
					dm2.acptdate   = "";	//������������
					dm2.acptprice  = "";	//���μ����ݾ�
					dm2.fee        = "";	//������
					dm2.acptno     = "";	//���μ����� ���ι�ȣ
					dm2.cnclokdate = "";	//��Ұ�������
					dm2.result     = "";	//ó�����(Y/N)
					dm2.resultcode = "";	//����ڵ�
					dm2.resultmsg  = "";	//����ڵ��� �޼���
					
					while(true){
		
						String tgl = new String(conn.recvData());
						log.tgrLog("����", tgl);
	
						if(tgl.substring(0,1).charAt(0)=='D'){	

							dm2.pymt_cd    += getByteString(tgl,17,20).trim()  + sep;	//������ȣ(�����ڹ�ȣ)		
							dm2.acptdate   += getByteString(tgl,205,8).trim()  + sep;	//������������
							dm2.acptprice  += getByteString(tgl,213,10).trim() + sep;	//���μ����ݾ�
							dm2.fee        += getByteString(tgl,223,5).trim()  + sep;	//������
							dm2.acptno     += getByteString(tgl,228,20).trim() + sep;	//���μ����� ���ι�ȣ
							dm2.cnclokdate += getByteString(tgl,275,8).trim()  + sep;	//��Ұ�������
							dm2.result     += getByteString(tgl,283,1).trim()  + sep;	//ó�����(Y/N)
							dm2.resultcode += getByteString(tgl,284,4).trim()  + sep;	//����ڵ�							
							//dm2.resultmsg  += getByteString(tgl,288,30).trim() + sep;	//����ڵ��� �޼���
							
							/*
							dm2.pymt_cd    += sep + getByteString(tgl,17,20).trim();	//������ȣ(�����ڹ�ȣ)		
							dm2.acptdate   += sep + getByteString(tgl,205,8).trim();	//������������
							dm2.acptprice  += sep + getByteString(tgl,213,10).trim();	//���μ����ݾ�
							dm2.fee        += sep + getByteString(tgl,223,5).trim();	//������
							dm2.acptno     += sep + getByteString(tgl,228,20).trim();	//���μ����� ���ι�ȣ
							dm2.cnclokdate += sep + getByteString(tgl,275,8).trim();	//��Ұ�������
							dm2.result     += sep + getByteString(tgl,283,1).trim();	//ó�����(Y/N)
							dm2.resultcode += sep + getByteString(tgl,284,4).trim();	//����ڵ�
							*/
						}
						
						if(tgl.substring(0,1).charAt(0)=='H'){
							dm2.header = tgl;
						}
		
						if(tgl.substring(0,1).charAt(0)=='T'){
							dm2.tail = tgl;
							break;
						}
					}
				} catch (Exception e) {
					System.out.println("*** Data record ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "Data record ���� �� ����";
				}
				log.msgLog("Data record ���� ����");
				
				
				/*** 3. �������� ���� ***/
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//���������� [T000]�� �ƴѰ�� ��û�� ���� ���°����� ó�� [��ü ������ ���ν�û ����]
						errcode = tail_result;
						errmsg  = "���ν�û ����";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** �������� ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "�������� ���� �� ����";
				}
			}


			/*** �������� ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("��������");
			}else{
				log.msgLog("�������� ���� : " + ret);
			}
			log.msgLog("...ī����� ���ó�� ��������");
			
			//ī����ΰ��ó�� �Ϸ�ó��
			dm2.fmserr 	  = errcode;	//�ۼ��ſ����ڵ弳��
			dm2.fmserrmsg = errmsg;		//�ۼ��ſ����޼�������			
            ds2 = dao.tn_lnk_5065_a(dm2);
            req.setAttribute("ds2", ds2);

		} catch (Exception e) {
			System.out.println("*** ���ó���� ����: " + e.getMessage() );
            throw e;
		}
        
	}

	public void tn_lnk_5070_a(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String	cmpy_cd = "";
		String	sdsiidx = "";
		String  incmg_pers_addr = "";
		String  incmg_pers = "";
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		TN_LNK_5070_ADataSet ds = null;
		TN_LNK_5070_ADM dm = new TN_LNK_5070_ADM();
		TN_LNK_5075_ADataSet ds2 = null;
		TN_LNK_5075_ADM dm2 = new TN_LNK_5075_ADM();
		
		cmpy_cd 		= Util.checkString(req.getParameter("cmpy_cd"));
		sdsiidx 		= Util.checkString(req.getParameter("sdsiidx"));
		incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		incmg_pers      = Util.getSessionParameterValue(req,"emp_no",true);

		
		dm.cmpy_cd			= cmpy_cd;
		dm.cnclclsf 		= Util.checkString(req.getParameter("cnclclsf"));
		dm.sdsiidx  		= sdsiidx;
		dm.sdsipaymentidx  	= (String)hash.get("sdsipaymentidx");
		dm.promiseidx      	= (String)hash.get("promiseidx");		
		dm.incmg_pers_addr 	= incmg_pers_addr;
		dm.incmg_pers      	= incmg_pers;
		dm.print();


        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5070_a(dm);
            
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int	dataCnt = 0;
    		log.msgLog("ī����� ��ҿ�û ����...");

    		
			for(int i = 0; i < ds.curlist.size(); i++) {

				errcode = "";
				errmsg  = "";
				dm2.cmpy_cd         = "";  // ȸ���ڵ�
				dm2.sdsiidx         = "";  // SDSIIDX
				dm2.sdsipaymentidx  = "";  // SDSIPAYMENTIDX
				dm2.promisecode     = "";  // PROMISEIDX
				dm2.result          = "";  // ó����� (Y,N)
				dm2.resultcode      = "";  // ó������ڵ�
				dm2.resultmsg       = "";  // ó������ڵ��� �޼���
				dm2.fmserr          = "";  // �ۼ��� �����ڵ�
				dm2.fmserrmsg       = "";  // �ۼ��� �����޼���
				dm2.incmg_pers_addr = "";  // �Է��� IP
				dm2.incmg_pers      = "";  // �Է���   

				
				/*** 1. �������� ***/
	    		try {
					//ī�� ��ݽ�û ���(��ġ)
	    			/*
					if(conn.connect(Property.CARD_TEST_IP, Property.CARD_TEST_PORT)<0){
						log.msgLog("�������");
						throw new Exception();
					}else{
						log.msgLog("���Ἲ��");
					}*/

					if( conn.connect(server_ip, server_port) < 0 ){
						log.msgLog("�������");
						throw new Exception();
					}else{
						log.msgLog("���Ἲ��");
					}
					
	    		} catch (Exception e) {
	    			throw e;
	    		}
	    		

				/*** 2. ��ҿ�ûData �۽� �� ���� ***/
				//��ҿ�ûData �۽�
				TN_LNK_5070_ACURLISTRecord rec = (TN_LNK_5070_ACURLISTRecord)ds.curlist.get(i);
				conn.sendData(rec.filedata.replaceAll("]", tag));
				log.tgrLog("�۽�", rec.filedata.replaceAll("]", tag));
				
				/*** 2.1. ��ҿ�ûData ������� ***/
				String	tgl = new String(conn.recvData());
				log.tgrLog("����", tgl);
				
				
				/*** 3. ��ҿ�û��� ó�� ***/
				dm2.cmpy_cd			= cmpy_cd;
				dm2.sdsiidx         = sdsiidx;
				dm2.sdsipaymentidx 	= getByteString(tgl,53, 6).trim();	//�ش� ���ڵ� SDSIPAYMENTIDX (���̾ƿ��󿡼� ���ŷ����� ������ȣ)
				dm2.promisecode		= getByteString(tgl,60,20).trim();	//�ش� ���ڵ� �����ڵ�
				dm2.result     		= getByteString(tgl,343,1).trim();	//ó�����(Y/N)
				dm2.resultcode 		= getByteString(tgl,344,4).trim();	//����ڵ�
				dm2.resultmsg  		= getByteString(tgl,348,30).trim();	//����ڵ��� �޼���
				dm2.fmserr          = errcode;  						// �ۼ��� �����ڵ�
				dm2.fmserrmsg       = errmsg;  							// �ۼ��� �����޼�
				dm2.incmg_pers_addr = incmg_pers_addr;
				dm2.incmg_pers      = incmg_pers;
				dm2.print();
				
	    		
				/*** 4. �������� ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("��������");
				}else{
					log.msgLog("�������� ���� : " + ret);
				}
				log.msgLog("...ī����� ��ҿ�û ��������");
				
				//������ ��� ����ݿ�
				ds2 = dao.tn_lnk_5075_a(dm2);
			}

			//���ó������
            req.setAttribute("ds", ds);            
        }
        catch (AppException e) {
            throw e;
        } 
    }
	
	
	public void tn_lnk_5080_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_5080_ADataSet	ds  = null;
		TN_LNK_5080_ADM 	 	dm  = new TN_LNK_5080_ADM();
		TN_LNK_5085_ADataSet	ds2 = null;
		TN_LNK_5085_ADM 	 	dm2 = new TN_LNK_5085_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();

		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.incmg_pers_addr 	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm_buff.sdsiidx 	= Util.checkString(req.getParameter("sdsiidx"));		
		dm_buff.incmg_pers 	= Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "6"; 		
		dm.print();
		
        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
        	TnLnk6000DAO dao_buff = new TnLnk6000DAO();
            ds = dao.tn_lnk_5080_a(dm);
            
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int	dataCnt = 0;    		
    		int seq 	= 0;
    		int	maxCnt	= 50;
    		
    		log.msgLog("ī����� ���ο�û���� ��ȸ ����...");

    		
    		/*** �������� */
    		try {
    			log.msgLog("connect to ==> " + server_ip + ":" + server_port);
	    		if(conn.connect(server_ip, server_port) < 0){    			
	    			log.msgLog("�������.........");
	    			throw new Exception();
	    		}else{
	    			log.msgLog("���Ἲ��.......!!");
	    		}
	    		
    		} catch (Exception e) {
    			throw e;
    		}

    		
    		/*** 1. �������� �۽� ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));

			/*** 2. �������� ������� ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:"+sdata);

			/*** 2.1�������� �����ϰ�� �������� �� ���� ***/
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				ds.errcode = errcode;
				ds.errmsg  = errmsg;
				log.tgrLog("�������� ����", errcode + " : " + errmsg );
			} else {

				log.msgLog("Data record ���� ����");
				//�������� ���Ϲ���������
				try {

					dm_buff.seq      = seq++ + sep;
					dm_buff.filedata = ("H"+String.format("%100s", " ")) + sep;
					
					while(true){
		
						String tgl = new String(conn.recvData());
						log.tgrLog("����", tgl);
	
						//String tgr = null;
						//tgr = new String(conn.recvData());
						log.tgrLog("���ο�û������� : ", tgl);
						dm_buff.seq      += seq++ + sep;
						dm_buff.filedata += tgl   + sep;
						dataCnt++;
						
						if( dataCnt >= maxCnt ) {
							//1. write buff table
							dm_buff.print();
							ds_buff = dao_buff.tn_lnk_6081_a(dm_buff);

							//2. init dm2, datacnt
							dm_buff.seq         = "";	//�Ϸù�ȣ
							dm_buff.filedata	= "";	//����Data
							dataCnt = 0;
						}
						
						if( getByteString(tgl, 0, 1).charAt(0)=='T' ) {
							break;
						}
						
					}
					dm_buff.print();
					ds_buff = dao_buff.tn_lnk_6081_a(dm_buff);

					log.msgLog("ī����� ���ο�û������ȸ �������� ���� ����...");
					String tail = new String(conn.recvData());
					log.tgrLog("[TAIL] �۽Ű������ : ", tail);
					log.msgLog("...ī����� ���ο�û������ȸ �������� ���� ����");


				} catch (Exception e) {
					System.out.println("*** Data record ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "Data record ���� �� ����";
				}
				log.msgLog("Data record ���� ����");
				
				
				/*** 3. �������� ���� **
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//���������� [T000]�� �ƴѰ�� ��û�� ���� ���°����� ó�� [��ü ������ ���ν�û ����]
						errcode = tail_result;
						errmsg  = "���ν�û ����";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** �������� ���� �� ����");
					errcode = "WB Exception";
					errmsg  = "�������� ���� �� ����";
				}
				*/

			}
			
			
			/*** �������� ***/
			int ret = conn.close();
			if(ret>0){
				log.msgLog("��������");
			} else {
				log.msgLog("�������� ���� : " + ret);
			}
			log.msgLog("...ī����� ���ο�û���� ��ȸ ����.");

			
			log.msgLog("==== ī����� ���ο�û������ȸ ���ó�� ���� ====");
			if(ds.errcode.equals("")) {
				dm2.print();
				ds2 = dao.tn_lnk_5085_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}
			log.msgLog("==== ī����� ���ο�û������ȸ ���ó�� �Ϸ� ====");
			
            req.setAttribute("ds",   ds);
            req.setAttribute("ds2", ds2); //���ο�û����

        }
        catch (AppException e) {
            throw e;
        }

	}


	public void tn_lnk_5090_a(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String	cmpy_cd = "";
		String  incmg_pers_addr = "";
		String  incmg_pers = "";
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		TN_LNK_5090_ADataSet ds = null;
		TN_LNK_5090_ADM dm = new TN_LNK_5090_ADM();
		
		dm.cmpy_cd			= Util.checkString(req.getParameter("cmpy_cd"));
		dm.promiseidx      	= (String)hash.get("promiseidx");
		dm.incmg_pers_addr 	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers      	= Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();


        try {
        	TnLnk5000DAO dao = new TnLnk5000DAO();
            ds = dao.tn_lnk_5090_a(dm);
            
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int	dataCnt = 0;
    		log.msgLog("ī����� ȸ��������û ����...");

    		
			for(int i = 0; i < ds.curlist.size(); i++) {

				errcode = "";
				errmsg  = "";
				
				/*** 1. �������� ***/
	    		try {
					if( conn.connect(server_ip, server_port) < 0 ){
						log.msgLog("�������");
						throw new Exception();
					}else{
						log.msgLog("���Ἲ��");
					}
					
	    		} catch (Exception e) {
	    			throw e;
	    		}
	    		

				/*** 2. ȸ��������ûData �۽� �� ���� ***/
				//��ҿ�ûData �۽�
				TN_LNK_5090_ACURLISTRecord rec = (TN_LNK_5090_ACURLISTRecord)ds.curlist.get(i);
				conn.sendData(rec.filedata.replaceAll("]", tag));
				log.tgrLog("�۽�", rec.filedata.replaceAll("]", tag));
				
				/*** 2.1. ȸ��������ûData ������� ***/
				String	tgl = new String(conn.recvData());
				log.tgrLog("����", tgl);

	    		
				/*** 4. �������� ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("��������");
				}else{
					log.msgLog("�������� ���� : " + ret);
				}
				log.msgLog("...ī����� ȸ��������û ��������");
				
			}

			//���ó������
            req.setAttribute("ds", ds);            
        }
        catch (AppException e) {
            throw e;
        } 
    }


	public static String getByteString(String s, int startIdx, int bytes) {
		return new String(s.getBytes(), startIdx, bytes);
	}
	
}
