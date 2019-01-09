/***************************************************************************************************
* 파일명 : TnLnk5000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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

import chosun.ciis.tn.lnk.rec.TN_LNK_6050_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_6052_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_6070_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_6072_ACURLISTRecord;
import chosun.ciis.tn.lnk.rec.TN_LNK_6090_ACURLISTRecord;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
//import fms.common.tele.CARD_CMS_Sample_Telegrams;
//import fms.common.tele.HP_SampleTelegrams;

/**
 * 
 */

public class TnLnk6000WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void tn_lnk_6000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6000_MDataSet ds = null;
		TN_LNK_6000_MDM dm = new TN_LNK_6000_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();
        
        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6000_m(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("uid", Util.getSessionParameterValue(req,"emp_no",true));
        }
        catch (AppException e) {
            throw e;
        } 
    }
	
	public void tn_lnk_6005_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		String	server_ip 	= "121.134.74.90";
		int		server_port = 22000;		//real
		int		server_port_dev = 12000;	//dev		
		String	status = "";
		
		/**
		 * 서버접속가능여부테스트(real)
		 */
		try {
			status = "connect to (real)==> " + server_ip + ":" + server_port + "\n\n";
			//log.msgLog("connect to (real)==> " + server_ip + ":" + server_port);
    		if(conn.connect(server_ip, server_port) < 0){
    			status += "연결실패(real).........\n\n";    			
    			//log.msgLog(status);
    		}else{
    			status += "연결성공(real).......!!\n\n";
    			//log.msgLog(status);
    		}
    		
		} catch (Exception e) {
			status += "connect fail to (real)==> " + server_ip + ":" + server_port + "\n\n";
			//log.msgLog("connect fail to (real)==> " + server_ip + ":" + server_port);
		}

		/*** 소켓종료 ***/
		int ret = conn.close();
		if(ret>0){
			status += "연결종료(real)\n\n";
			//log.msgLog("연결종료(real)");
		} else {
			status += "연결종료 실패(real) : " + ret + "\n\n";
			//log.msgLog("연결종료 실패(real) : " + ret);
		}
		
		
		/**
		 * 서버접속가능여부테스트(dev)
		 */
		try {
			status += "connect to (dev)==> " + server_ip + ":" + server_port_dev + "\n\n";
			//log.msgLog("connect to (dev)==> " + server_ip + ":" + server_port);
    		if(conn.connect(server_ip, server_port_dev) < 0){
    			status += "연결실패(dev).........\n\n";
    			//log.msgLog("연결실패(dev).........");
    			//throw new Exception();
    		}else{
    			status += "연결성공(dev).......!!\n\n";
    			//log.msgLog("연결성공(dev).......!!");
    		}
    		
		} catch (Exception e) {
			status += "connect fail to (dev)==> " + server_ip + ":" + server_port_dev + "\n\n";
			//log.msgLog("connect fail to (dev)==> " + server_ip + ":" + server_port);
		}

		/*** 소켓종료 ***/
		ret = conn.close();
		if(ret>0){
			status += "연결종료(dev)\n\n";
			//log.msgLog("연결종료(dev)");
		} else {
			status += "연결종료 실패(dev) : " + ret + "\n\n";
			//log.msgLog("연결종료 실패(dev) : " + ret);
		}
		
		req.setAttribute("conn_log", status);
		log.msgLog(status);
 
    }
	
	public void tn_lnk_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6010_LDataSet ds = null;
		TN_LNK_6010_LDM dm = new TN_LNK_6010_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.pymtyymm = Util.checkString(req.getParameter("pymtyymm"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();
		
        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

	}
	
	
	public void tn_lnk_6020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6020_LDataSet ds = null;
		TN_LNK_6020_LDM dm = new TN_LNK_6020_LDM();

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
		dm.delyn = Util.checkString(req.getParameter("delyn"));

		dm.print();

        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	
	public void tn_lnk_6030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6030_LDataSet ds = null;
		TN_LNK_6030_LDM dm = new TN_LNK_6030_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));

		dm.print();
		
        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

	}

	
	public void tn_lnk_6035_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6035_ADataSet ds = null;
		TN_LNK_6035_ADM dm = new TN_LNK_6035_ADM();

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
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6035_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	
	public void tn_lnk_6040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6040_ADataSet ds = null;
		TN_LNK_6040_ADM dm = new TN_LNK_6040_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.chg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	
	public void tn_lnk_6050_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6050_ADataSet ds  = null;
		TN_LNK_6055_ADataSet ds2 = null;
		TN_LNK_6050_ADM dm  = new TN_LNK_6050_ADM();
		TN_LNK_6055_ADM dm2 = new TN_LNK_6055_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();

		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.incmg_pers_addr	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers      = dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "0";
		dm.print();

        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6050_a(dm);
            req.setAttribute("ds", ds);
            
            /*----------------------------------------------*/
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		boolean sended_flag = false;    		

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int	maxCnt	= 50;

			log.msgLog("==== 휴대폰결제 승인신청 Data 송신 시작  [all: " + ds.curlist.size() + "===");
			dm_buff.seq      = seq++ + sep;
			dm_buff.filedata = ("H"+String.format("%100s", " ")) + sep;
			
			for(int i = 0; i < ds.curlist.size(); i++) {
				TN_LNK_6050_ACURLISTRecord rec = (TN_LNK_6050_ACURLISTRecord)ds.curlist.get(i);				

				
	    		/*** 1. 서버접속 ***/
	    		log.msgLog("휴대폰결제 승인의뢰 진행...");
	    		try {
	    			log.msgLog("connect to ==> " + server_ip + ":" + server_port);
		    		if(conn.connect(server_ip, server_port) < 0){    			
		    			log.msgLog("연결실패.........");
		    			throw new Exception();
		    		}else{
		    			log.msgLog("연결성공.......!!");
		    		}
	    		} catch (Exception e) {
	    			throw e;
	    		}


				/*** 2. 전문송신시작 ***/
				sended_flag = false;
				sended_flag = conn.sendData(rec.filedata.replaceAll("]", tag));
				if(sended_flag) {

					log.tgrLog("[" + i + "] 송신 : ", rec.filedata.replaceAll("]", tag));

					/*** 2-1. 전문 응답 수신 ***/
					String tgr = null;
					tgr = new String(conn.recvData());
					log.tgrLog("[" + i + "] 송신결과수신 : ", tgr);
					//tgr = getByteString(rec.filedata, 0, 194) + "Z031" + getByteString(rec.filedata, 198, 51); //test
					dm_buff.seq      += seq++ + sep;
					dm_buff.filedata += tgr   + sep;
					dataCnt++;
					
				} else {
					log.tgrLog("####### [" + i + "] 송신 ERROR", rec.filedata.replaceAll("]", tag));
					//전문송신오류 발생시 내부오류(Z031)처리
					String	err = rec.filedata;
					dm_buff.seq      += seq++ + sep;
					dm_buff.filedata += getByteString(err, 0, 194) + "Z031" + getByteString(err, 198, 51) + sep;
					dataCnt++;

				}

				if( dataCnt >= maxCnt ) {
					//1. write buff table
					dm_buff.print();
					ds_buff = dao.tn_lnk_6081_a(dm_buff);

					//2. init dm2, datacnt
					dm_buff.seq         = "";	//일련번호
					dm_buff.filedata	= "";	//수신Data
					dataCnt = 0;
				}
				/*** 2. 전문송신종료 ***/


				/*** 3. 소켓종료 ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("연결종료");
				} else {
					log.msgLog("연결종료 실패 : " + ret);
				}
				log.msgLog("...휴대폰결제 승인의뢰 진행종료.");

			}
			dm_buff.seq      += seq++ + sep;
			dm_buff.filedata += ("T"+String.format("%100s", " ")) + sep;
			dm_buff.print();
			ds_buff = dao.tn_lnk_6081_a(dm_buff);


			log.msgLog("==== 휴대폰결제 승인신청 Data 송신 완료 ====");
			
			//승인신청자료 송신결과처리
			ds2 = dao.tn_lnk_6055_a(dm2);
			req.setAttribute("ds2", ds2);

        }
        catch (AppException e) {
            throw e;
        }
        
	}

	
	public void tn_lnk_6052_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6052_ADataSet ds  = null;
		TN_LNK_6052_ADM dm  = new TN_LNK_6052_ADM();
		TN_LNK_6057_ADataSet ds2  = null;
		TN_LNK_6057_ADM dm2  = new TN_LNK_6057_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();

		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.incmg_pers_addr	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers 	  = dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "0";	//결제승인요청 송신결과:0
		dm.print();
		
        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6052_a(dm);
            
            
            /*----------------------------------------------*/
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		boolean sended_flag = false;    		

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int buffCnt = 0;
    		int	maxCnt	= 50;

			log.msgLog("==== 휴대폰결제 승인신청(BATCH) Data 송신 시작  [all: " + ds.curlist.size() + "===");
			/*** 서버접속 ***/
    		try {
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("연결실패");
					throw new Exception();
				}else{
					log.msgLog("연결성공");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}
    		
    		
			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 종료 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
				
				log.msgLog("휴대폰결제 승인신청(BATCH) Data 송신 시작");
				for(int i = 0; i < ds.curlist.size(); i++) {
					TN_LNK_6052_ACURLISTRecord rec = (TN_LNK_6052_ACURLISTRecord)ds.curlist.get(i);
					
					/*** 2.2. 전문송신시작 ***/
					sended_flag = false;
					sended_flag = conn.sendData(rec.file_data.replaceAll("]", tag));
					if(sended_flag) {						
						log.tgrLog("[" + i + "] 송신 : ", rec.file_data.replaceAll("]", tag));						
					} else {
						//전문송신오류 발생시 내부오류(Z031)처리
						log.tgrLog("####### [" + i + "] 송신 ERROR", rec.file_data.replaceAll("]", tag));
						ds.errcode = "Z031";
						break;
					}
					dataCnt++;
				}
				log.msgLog("휴대폰결제 승인신청(BATCH) 송신 종료");
				
				
				log.msgLog("휴대폰결제 승인신청(BATCH) 신청결과 Data [" + dataCnt + "] 수신 시작");
				/*** 2-1. 전문 응답 수신 ***/
				dm_buff.seq 		= "";
				dm_buff.filedata 	= "";

				while(dataCnt > 0) {
					String tgr = null;
					tgr = new String(conn.recvData());
					log.tgrLog("[" + dataCnt-- + "] 송신결과수신 : ", tgr);
					
					dm_buff.seq      += seq++ + sep;
					dm_buff.filedata += tgr   + sep;					
					buffCnt++;
					
					if(buffCnt >= maxCnt) {
						dm_buff.print();
						ds_buff = dao.tn_lnk_6081_a(dm_buff);
						
						//2. init dm_buff, buffCnt
						dm_buff.seq			= "";
						dm_buff.filedata	= "";
						buffCnt = 0;
					}

				}
				
				dm_buff.print();
				ds_buff = dao.tn_lnk_6081_a(dm_buff);
				log.msgLog("휴대폰결제 승인신청(BATCH) 신청결과 Data 수신 종료");
				
				log.msgLog("휴대폰결제 승인신청(BATCH) 종료전문 수신 시작...");
				String tail = new String(conn.recvData());
				log.tgrLog("[TAIL] 송신결과수신 : ", tail);
				log.msgLog("...휴대폰결제 승인신청(BATCH)종료전문 수신 종료");
				
			}
    		
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("==== 휴대폰결제 승인신청(BATCH) Data 송신 종료 ===");

			
			if(errcode.equals("")) {
				//승인신청자료 송신결과처리
				ds2 = dao.tn_lnk_6057_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}

			req.setAttribute("ds", ds);

        }
        catch (Exception e) {
            throw e;
        }
        
	}
	
	
	public void tn_lnk_6060_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6060_ADataSet ds = null;
		TN_LNK_6065_ADataSet ds2 = null;
		TN_LNK_6060_ADM dm  = new TN_LNK_6060_ADM();
		TN_LNK_6065_ADM dm2 = new TN_LNK_6065_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();

		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.incmg_pers_addr	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers      = dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "1";	//승인결과조회수신:1
		dm.print();

		try {
			TnLnk6000DAO dao = new TnLnk6000DAO();
	        ds = dao.tn_lnk_6060_a(dm);

	            
	        /*----------------------------------------------*/
	    	BaseAction conn = new XC_JavaSocket();
	    	ConsoleLog log = new ConsoleLog();
	    		
	    	String	server_ip 	= ds.server_ip;
	    	int		server_port	= Integer.parseInt(ds.server_port);
	    	String	tag = "\r\n";
	    	String 	sep = "#";
	    	String	errcode = "";
	    	String	errmsg  = "";
	    	boolean sended_flag = false;    		

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int	maxCnt	= 50;

    		
			log.msgLog("==== 휴대폰결제 승인결과조회(BATCH) Data 처리 시작 ===");

			/*** 서버접속 ***/
			log.msgLog("휴대폰결제 승인결과조회 진행...");
			try {
				log.msgLog("connect to ==> " + server_ip + ":" + server_port);
				if(conn.connect(server_ip, server_port) < 0){    			
					log.msgLog("연결실패.........");
				    throw new Exception();
				}else{
					log.msgLog("연결성공.......!!");
				}
			} catch (Exception e) {
				throw e;
			}


			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 종료 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				ds.errcode = errcode;
				ds.errmsg  = errmsg;
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
				dm_buff.seq      = "";
				dm_buff.filedata = "";
				
				while(true) {
					
					String tgr = null;
					tgr = new String(conn.recvData());
					log.tgrLog("송신결과수신 : ", tgr);
					
					dm_buff.seq      += seq++ + sep;
					dm_buff.filedata += tgr   + sep;
					dataCnt++;
	
					if( dataCnt >= maxCnt ) {
						//1. write buff table
						dm_buff.print();
						ds_buff = dao.tn_lnk_6081_a(dm_buff);
	
						//2. init dm2, datacnt
						dm_buff.seq         = "";	//일련번호
						dm_buff.filedata	= "";	//수신Data
						dataCnt = 0;
					}
					
					if( getByteString(tgr, 0, 1).charAt(0)=='T' ) {
						break;
					}
					
				}
				dm_buff.print();
				ds_buff = dao.tn_lnk_6081_a(dm_buff);
				
				log.msgLog("휴대폰결제 승인결과조회(BATCH) 종료전문 수신 시작...");
				String tail = new String(conn.recvData());
				log.tgrLog("[TAIL] 송신결과수신 : ", tail);
				log.msgLog("...휴대폰결제 승인결과조회(BATCH) 종료전문 수신 종료");

			}
    		
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...휴대폰 회원승인신청 종료");
			

			log.msgLog("==== 휴대폰결제 승인결과조회(BATCH) 결과처리 시작 ====");
			if(ds.errcode.equals("")) {
				dm2.print();
				ds2 = dao.tn_lnk_6065_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}
			log.msgLog("==== 휴대폰결제 승인결과조회(BATCH) 결과처리 완료 ====");
		
			req.setAttribute("ds", ds);

        }
        catch (AppException e) {
            throw e;
        }

	}

	
	public void tn_lnk_6070_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6070_ADataSet ds = null;
		TN_LNK_6075_ADataSet ds2 = null;
		TN_LNK_6070_ADM dm = new TN_LNK_6070_ADM();
		TN_LNK_6075_ADM dm2 = new TN_LNK_6075_ADM();
		TN_LNK_6081_ADataSet ds_buff = null;
		TN_LNK_6081_ADM dm_buff = new TN_LNK_6081_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd  = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx  = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.sdsipaymentidx  	= (String)hash.get("sdsipaymentidx");
		dm.promiseidx      	= (String)hash.get("promiseidx");
		dm.cnclclsf 		= Util.checkString(req.getParameter("cnclclsf"));
		dm.incmg_pers_addr 	= dm2.incmg_pers_addr 	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers		= dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "3";
		dm.print();
		
		
		try {
			TnLnk6000DAO dao = new TnLnk6000DAO();
	        ds = dao.tn_lnk_6070_a(dm);
	        req.setAttribute("ds", ds);
	            
	        /*----------------------------------------------*/
	    	BaseAction conn = new XC_JavaSocket();
	    	ConsoleLog log = new ConsoleLog();
	    		
	    	String	server_ip 	= ds.server_ip;
	    	int		server_port	= Integer.parseInt(ds.server_port);
	    	String	tag = "\r\n";
	    	String 	sep = "#";
	    	String	errcode = "";
	    	String	errmsg  = "";
	    	boolean sended_flag = false;

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int	maxCnt	= 50;

			log.msgLog("==== 휴대폰결제 승인취소의뢰  Data 처리 시작  [all: " + ds.curlist.size() + "===");
			//header record
			dm_buff.seq      = seq++ + sep;
			dm_buff.filedata = ("H"+String.format("%100s", " ")) + sep;

			//data record
			for(int i = 0; i < ds.curlist.size(); i++) {
				TN_LNK_6070_ACURLISTRecord rec = (TN_LNK_6070_ACURLISTRecord)ds.curlist.get(i);

			    /*** 서버접속 ***/
			    log.msgLog("휴대폰결제 승인결과조회 진행...");
			    try {
			    	log.msgLog("connect to ==> " + server_ip + ":" + server_port);
				    if(conn.connect(server_ip, server_port) < 0){    			
				    	log.msgLog("연결실패.........");
				    	throw new Exception();
				    }else{
				    	log.msgLog("연결성공.......!!");
				    }
			    } catch (Exception e) {
			    	throw e;
			    }


				/*** 1. 전문송신 ***/
				sended_flag = false;
				sended_flag = conn.sendData(rec.filedata.replaceAll("]", tag));
				if(sended_flag) {
					log.tgrLog("[" + i + "] 송신 : ", rec.filedata.replaceAll("]", tag));
				} else {
					log.tgrLog("####### [" + i + "] 송신 ERROR", rec.filedata.replaceAll("]", tag));
				}
						
				/*** 2. 전문 응답 수신 ***/
				String tgr = null;
				tgr = new String(conn.recvData());
				log.tgrLog("[" + i + "] 승인취소의뢰 송신결과수신 : ", tgr);

				
				dm_buff.seq      += seq++ + sep;
				dm_buff.filedata += tgr   + sep;
				dataCnt++;

				if( dataCnt >= maxCnt ) {
					//1. write buff table
					dm_buff.print();
					ds_buff = dao.tn_lnk_6081_a(dm_buff);

					//2. init dm2, datacnt
					dm_buff.seq         = "";	//일련번호
					dm_buff.filedata	= "";	//수신Data
					dataCnt = 0;
				}
					
				/*** 소켓종료 ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("연결종료");
				} else {
					log.msgLog("연결종료 실패 : " + ret);
				}
				log.msgLog("...휴대폰결제 승인취소의뢰 진행종료.");

			}
			//tail record
			dm_buff.seq      += seq++ + sep;
			dm_buff.filedata += ("T"+String.format("%100s", " ")) + sep;
			dm_buff.print();
			ds_buff = dao.tn_lnk_6081_a(dm_buff);

			log.msgLog("==== 휴대폰결제 승인취소의뢰 Data 처리 완료 ====");

			//휴대폰결제 승인취소 결과처리
			ds2 = dao.tn_lnk_6075_a(dm2);
			req.setAttribute("ds2", ds2);

        }
        catch (AppException e) {
            throw e;
        }
        
	}

	
	public void tn_lnk_6072_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6072_ADataSet ds  = null;
		TN_LNK_6072_ADM dm  = new TN_LNK_6072_ADM();
		TN_LNK_6077_ADataSet ds2  = null;
		TN_LNK_6077_ADM dm2  = new TN_LNK_6077_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.promiseidx = (String)hash.get("promiseidx");
		dm.incmg_pers_addr	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers 	  = dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "3";	//결제승인취소요청결과:3
		dm.print();
		
        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6072_a(dm);
            
            
            /*----------------------------------------------*/
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		boolean sended_flag = false;    		

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int buffCnt = 0;
    		int	maxCnt	= 50;

			log.msgLog("==== 휴대폰결제 승인취소신청(BATCH) Data 송신 시작  [all: " + ds.curlist.size() + "===");
			/*** 서버접속 ***/
    		try {
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("연결실패");
					throw new Exception();
				}else{
					log.msgLog("연결성공");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}
    		
    		
			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 종료 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
				
				log.msgLog("휴대폰결제 승인취소신청(BATCH) Data 송신 시작");
				for(int i = 0; i < ds.curlist.size(); i++) {
					TN_LNK_6072_ACURLISTRecord rec = (TN_LNK_6072_ACURLISTRecord)ds.curlist.get(i);
					
					/*** 2.2. 전문송신시작 ***/
					sended_flag = false;
					sended_flag = conn.sendData(rec.file_data.replaceAll("]", tag));
					if(sended_flag) {						
						log.tgrLog("[" + i + "] 송신 : ", rec.file_data.replaceAll("]", tag));						
					} else {
						//전문송신오류 발생시 내부오류(Z031)처리
						log.tgrLog("####### [" + i + "] 송신 ERROR", rec.file_data.replaceAll("]", tag));
						ds.errcode = "Z031";
						break;
					}
					dataCnt++;
				}
				log.msgLog("휴대폰결제 승인취소신청(BATCH) 송신 종료");
				
				
				log.msgLog("휴대폰결제 승인취소신청(BATCH) 신청결과 Data [" + dataCnt + "] 수신 시작");
				/*** 2-1. 전문 응답 수신 ***/
				dm_buff.seq 		= "";
				dm_buff.filedata 	= "";

				while(dataCnt > 0) {
					String tgr = null;
					tgr = new String(conn.recvData());
					log.tgrLog("[" + dataCnt-- + "] 송신결과수신 : ", tgr);
					
					dm_buff.seq      += seq++ + sep;
					dm_buff.filedata += tgr   + sep;					
					buffCnt++;
					
					if(buffCnt >= maxCnt) {
						dm_buff.print();
						ds_buff = dao.tn_lnk_6081_a(dm_buff);
						
						//2. init dm_buff, buffCnt
						dm_buff.seq			= "";
						dm_buff.filedata	= "";
						buffCnt = 0;
					}

				}
				
				dm_buff.print();
				ds_buff = dao.tn_lnk_6081_a(dm_buff);
				log.msgLog("휴대폰결제 승인취소신청(BATCH) 신청결과 Data 수신 종료");
				
				log.msgLog("휴대폰결제 승인취소신청(BATCH) 종료전문 수신 시작...");
				String tail = new String(conn.recvData());
				log.tgrLog("[TAIL] 송신결과수신 : ", tail);
				log.msgLog("...휴대폰결제 승인취소신청(BATCH)종료전문 수신 종료");
				
			}
    		
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("==== 휴대폰결제 승인취소신청(BATCH) Data 송신 종료 ===");

			
			if(errcode.equals("")) {
				//승인취소신청자료 송신결과처리
				ds2 = dao.tn_lnk_6077_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}

			req.setAttribute("ds", ds);

        }
        catch (Exception e) {
            throw e;
        }
        
	}
	
	

	public void tn_lnk_6080_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6080_ADataSet ds = null;
		TN_LNK_6080_ADM dm = new TN_LNK_6080_ADM();
		TN_LNK_6085_ADataSet ds2 = null;
		TN_LNK_6085_ADM dm2 = new TN_LNK_6085_ADM();
		TN_LNK_6081_ADataSet ds_buff = null;
		TN_LNK_6081_ADM dm_buff = new TN_LNK_6081_ADM();


		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm_buff.sdsiidx = dm2.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.request_dt = Util.checkString(req.getParameter("requestdate"));
		dm.incmg_pers_addr 	= dm2.incmg_pers_addr 	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm_buff.incmg_pers		= dm2.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= "2";
		dm.print();


		try {
			//출금결과처리 시작전문 가져생성
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6080_a(dm);
            
            
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int	dataCnt = 0;
    		
    		log.msgLog("휴대폰결제 출금 결과처리자료 수신 시작...");

			/*** 서버접속 ***/
    		try {
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("연결실패");
					throw new Exception();
				}else{
					log.msgLog("연결성공");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}

    		
			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 리턴 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				ds.errcode = errcode;
	            ds.errmsg  = errmsg;
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );
			} else {

				log.msgLog("Data record 수신 시작");
				//테일전문 리턴받을때까지
				try {
					int seq     = 0;
					int	datacnt = 0;
					int	maxCnt  = 90;					
					dm_buff.seq         = "";	//일련번호
					dm_buff.filedata	= "";	//수신Data

					while(true){

						/*** 3. 출금결과 Data 수신 ***/
						String data = new String(conn.recvData());
						System.out.println("[" + seq + "] DATA 수신 : ["+data+"]");

						//data record
						dm_buff.seq     	+= seq++ + sep;	//레코드순번
						dm_buff.filedata	+= data  + sep;	//레코드Data
						datacnt++;
							
						if( datacnt >= maxCnt ) {
							//1. write buff table
							ds_buff = dao.tn_lnk_6081_a(dm_buff);

							//2. init dm2, datacnt
							dm_buff.seq         = "";	//일련번호
							dm_buff.filedata	= "";	//수신Data
							datacnt = 0;
						}
						
						if( data.substring(0,1).charAt(0)=='T') {
							//tail record
							break;
						}

					}
					dm_buff.print();
					ds_buff = dao.tn_lnk_6081_a(dm_buff);

					/*** END Data 수신 ***/
					String edata = new String(conn.recvData());
					System.out.println("DATA 수신 : ["+edata+"]");
					//dm_buff.seq     	+= seq++ + sep;	//레코드순번
					//dm_buff.filedata	+= edata + sep;	//레코드Data
					//datacnt++;


				} catch (Exception e) {
					System.out.println("*** Data record 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "Data record 수신 중 오류";
				}

			}
    		
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...휴대폰결 출금 결과처리자료 수신 종료");


			if( errcode.equals("")) {
				//휴대폰결제 결과처리 완료처리			
	            ds2 = dao.tn_lnk_6085_a(dm2);
	            ds.errcode = ds2.tailresult;
	            ds.errmsg  = ds2.tailresultmsg;
			} else {
				ds2 = new TN_LNK_6085_ADataSet();
				ds2.tot_okcnt = 0;
				ds2.tot_okamt = 0;
				ds2.tot_oktax = 0;
				ds2.tot_okfee = 0;
	            ds2.errcode = errcode;
	            ds2.errmsg  = errmsg;
			}

			req.setAttribute("ds",  ds);
            req.setAttribute("ds2", ds2);
            System.out.println("========== finish ===========");

		} catch (Exception e) {
			System.out.println("*** 결과처리중 오류: " + e.getMessage() );
            throw e;
		}

	}
	
	
	public void tn_lnk_6087_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_6087_ADataSet ds = null;
		TN_LNK_6087_ADM dm = new TN_LNK_6087_ADM();

		dm.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.print();

        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6087_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

	}

	
	public void tn_lnk_6090_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6090_ADataSet ds = null;
		TN_LNK_6090_ADM dm = new TN_LNK_6090_ADM();
		TN_LNK_6095_ADataSet ds2 = null;
		TN_LNK_6095_ADM dm2 = new TN_LNK_6095_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.aplcclsf   = Util.checkString(req.getParameter("aplcclsf"));
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));
		dm.incmg_pers = dm2.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		try {
			//휴대폰 회원승인 신청전문 작성
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6090_a(dm);            
    		BaseAction conn = new XC_JavaSocket();    		
    		ConsoleLog log = new ConsoleLog();
    		String 	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		int		dataCnt = 0;
    		boolean sended_flag = false;
    		
    		log.msgLog("휴대폰 회원승인신청 시작...");

			/*** 서버접속 ***/
    		try {
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("연결실패");
					throw new Exception();
				}else{
					log.msgLog("연결성공");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}

    		
			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 종료 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				ds.data_result = errcode;
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
				
				log.msgLog("승인신청 Data 송신 시작");
				for(int i = 0; i < ds.curlist.size(); i++) {
					TN_LNK_6090_ACURLISTRecord rec = (TN_LNK_6090_ACURLISTRecord)ds.curlist.get(i);
					
					/*** 2. 전문송신시작 ***/
					sended_flag = false;
					sended_flag = conn.sendData(rec.file_data.replaceAll("]", tag));
					if(sended_flag) {						
						log.tgrLog("[" + i + "] 송신 : ", rec.file_data.replaceAll("]", tag));						
					} else {
						log.tgrLog("####### [" + i + "] 송신 ERROR", rec.file_data.replaceAll("]", tag));
						//전문송신오류 발생시 내부오류(Z031)처리
						ds.data_result = "Z031";
						break;
					}
					dataCnt++;
				}
				log.msgLog("승인신청 Data 송신 종료");
								
				log.msgLog("승인신청결과 Data [" + dataCnt + "] 수신 시작");
				/*** 2-1. 전문 응답 수신 ***/
				dm2.file_data = "";
				while(dataCnt > 0) {
					String tgr = null;
					tgr = new String(conn.recvData());
					log.tgrLog("[" + dataCnt-- + "] 송신결과수신 : ", tgr);
					
					if( getByteString(tgr, 0, 1).charAt(0)=='H' ) {
						dm2.header = tgr + sep;
					} else if( getByteString(tgr, 0, 1).charAt(0)=='T' ) {
						dm2.tail = tgr + sep;
					} else {
						dm2.file_data += tgr + sep;
					}					
				}
				log.msgLog("승인신청결과 Data 수신 종료");
				
				log.msgLog("휴대폰 회원승인신청 종료전문 수신 시작...");
				String tail = new String(conn.recvData());
				log.tgrLog("[TAIL] 송신결과수신 : ", tail);
				log.msgLog("...휴대폰 회원승인신청 종료전문 수신 종료");

			}
    		
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...휴대폰 회원승인신청 종료");


			if( errcode.equals("")) {
				//휴대폰결제 결과처리 완료처리
				System.out.println("휴대폰 회원승인신청 처리결과  완료처리....");
				dm2.seq = ds.sdsi_seq;
				dm2.promiseidx = dm.promiseidx; 
				dm2.print();
				ds2 = dao.tn_lnk_6095_a(dm2);
				
				ds.header_result	= ds2.header_result;	//Header record result
				ds.data_result 		= ds2.data_result;		//Data recoard result
				ds.tail_result		= ds2.tail_result;		//Tail record result				
				ds.header_msg		= ds2.header_msg;		//Header record result
				ds.data_msg 		= ds2.data_msg;			//Data recoard result
				ds.tail_msg			= ds2.tail_msg;			//Tail record result

			} else {
				System.out.println("휴대폰 회원승인신청 처리결과 [오류]처리....[" + errcode + "]");
				ds.header_result	= errcode;			//Header record result
				ds.data_result 		= errcode;			//Data recoard result
				ds.tail_result		= errcode;			//Tail record result
				ds.header_msg		= errmsg;			//Header record result
				ds.data_msg 		= errmsg;			//Data recoard result
				ds.tail_msg			= errmsg;			//Tail record result
				ds.errcode			= errcode;
				ds.errmsg			= errmsg;
			}
			
			req.setAttribute("ds",  ds);
			System.out.println("*** 휴대폰 승인신청 종료 ***");
		} catch (Exception e) {
			System.out.println("*** 휴대폰 승인신청중 오류: " + e.getMessage() );
            throw e;
		}

	}	


	public void tn_lnk_6096_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_6096_ADataSet 	ds	 = null;
		TN_LNK_6096_ADM 		dm 	 = new TN_LNK_6096_ADM();
		TN_LNK_6097_ADataSet 	ds2  = null;
		TN_LNK_6097_ADM 		dm2  = new TN_LNK_6097_ADM();
		TN_LNK_6081_ADataSet 	ds_buff = null;
		TN_LNK_6081_ADM 		dm_buff = new TN_LNK_6081_ADM();
		String	jobclsf	= "";

		dm.cmpy_cd = dm2.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx = dm2.sdsiidx = dm_buff.sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
		dm.jobclsf = dm2.jobclsf = jobclsf = Util.checkString(req.getParameter("jobclsf"));
		dm.requestdate = Util.checkString(req.getParameter("requestdate"));
		dm.incmg_pers_addr	= dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 		= dm2.incmg_pers 	  = dm_buff.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm_buff.sdsiclsf	= (jobclsf.equals("C") ? "4" : "5");	//결제승인요청 요청내용조회
		dm.print();
		

        try {
        	TnLnk6000DAO dao = new TnLnk6000DAO();
            ds = dao.tn_lnk_6096_a(dm);
            
            /*----------------------------------------------*/
    		BaseAction conn = new XC_JavaSocket();
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		boolean sended_flag = false;    		

    		int seq 	= 0;
    		int	dataCnt	= 0;
    		int buffCnt = 0;
    		int	maxCnt	= 50;

			log.msgLog("==== 휴대폰결제 승인신청 요청내용조회(BATCH) Data 시작  ===");
			/*** 서버접속 ***/
    		try {
    			if(conn.connect(server_ip, server_port) < 0){
					log.msgLog("연결실패");
					throw new Exception();
				}else{
					log.msgLog("연결성공");
				}
				
    		} catch (Exception e) {
    			throw e;
    		}
    		
    		
			/*** 1. 시작전문 송신 ***/
			conn.sendData(ds.tg_begin.replaceAll("]", tag));
			log.msgLog(ds.tg_begin.replaceAll("]", tag));
			
			/*** 2. 시작전문 리턴 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:["+sdata+"]");
						
			/*** 2.1. 시작전문 오류일경우 오류설정 후 종료 ***/
			if( getByteString(sdata, 130, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 131, 4).trim();
				errmsg  = getByteString(sdata, 135, 30).trim();
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {

				/*** 2-1. 전문 응답 수신 ***/
				dm_buff.seq      = "";
				dm_buff.filedata = "";
				
				log.msgLog("휴대폰결제 승인신청(BATCH) 요청내용조회  Data 수신 시작...");
				
				try	{
					while(true) {
						String tgr = null;
						tgr = new String(conn.recvData());
						log.tgrLog("수신 : ", tgr);
						
						dm_buff.seq      += seq++ + sep;
						dm_buff.filedata += tgr   + sep;					
						dataCnt++;
						
						if(dataCnt >= maxCnt) {
							dm_buff.print();							
							ds_buff = dao.tn_lnk_6081_a(dm_buff);
							
							//2. init dm_buff, buffCnt
							dm_buff.seq			= "";
							dm_buff.filedata	= "";
							dataCnt = 0;
						}
						
						if( getByteString(tgr, 0, 1).charAt(0)=='T' ) {
							break;
						}
	
					}				
					dm_buff.print();
					System.out.println("xxxxxxx : " + dm_buff.filedata.length());
					ds_buff = dao.tn_lnk_6081_a(dm_buff);				
					log.msgLog("...휴대폰결제 승인신청(BATCH) 요청내용조회  Data 수신 종료");
					
					log.msgLog("휴대폰결제 승인신청(BATCH) 요청내용조회  종료전문 수신 시작...");
					String tail = new String(conn.recvData());
					log.tgrLog("[TAIL] 송신결과수신 : ", tail);
					log.msgLog("...휴대폰결제 승인신청(BATCH) 요청내용조회  종료전문 수신 종료");
				
				} catch (Exception e) {
					System.out.println("*** Data record 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "Data record 수신 중 오류";
				}
				log.msgLog("Data record 수신 종료");
			
			}
			
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("==== 휴대폰결제 승인신청(BATCH) Data 수신 종료 ===");

	
			if(errcode.equals("")) {
				//승인신청자료 송신결과처리
				dm2.print();
				ds2 = dao.tn_lnk_6097_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}
	
			req.setAttribute("ds", ds);
			req.setAttribute("ds2", ds2);

		} catch (Exception e) {
			System.out.println("*** 휴대폰 승인신청 요청내용조회 중 오류: " + e.getMessage() );
	        throw e;
		}
	}
	
	public static String getByteString(String s, int startIdx, int bytes) {
		return new String(s.getBytes(), startIdx, bytes);
	}
	
}
