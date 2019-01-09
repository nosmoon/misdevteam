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
    		System.out.println("카드결제진행...");
    		BaseAction conn = new XC_JavaSocket();
    		System.out.println("카드결제진행 lib loaded");
    		ConsoleLog log = new ConsoleLog();
    		
    		String	server_ip 	= ds.server_ip;
    		int		server_port	= Integer.parseInt(ds.server_port);
    		String	tag = "\r\n";
    		String 	sep = "#";
    		String	errcode = "";
    		String	errmsg  = "";    		
    		int	dataCnt = 0;
    		
    		log.msgLog("카드결제 승인의뢰 진행...");
    		
    		
    		/**
    		 * 서버접속
    		 * 카드 출금신청 결과(배치)
    		 */
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
			
			/*** 2. 시작전문 응답수신 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:"+sdata);

			/*** 2.1시작전문 오류일경우 오류설정 후 리턴 ***/
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
			
				/*** 3. 승인신청Data (Header전문,Data전문,Tail전문) 송신 ***/
				log.msgLog("승인신청 Data 송신 시작");
				for(int i = 0; i < ds.curlist.size(); i++) {
					TN_LNK_5050_ACURLISTRecord rec = (TN_LNK_5050_ACURLISTRecord)ds.curlist.get(i);
					conn.sendData(rec.filedata.replaceAll("]", tag));
					log.tgrLog("송신", rec.filedata.replaceAll("]", tag));
				}			
				log.msgLog("승인신청 Data 송신 완료");


	    		/*** 4. 승인신청(결과)HEADER전문 수신 ***/
				String hdr = new String(conn.recvData());
				log.tgrLog("[결과 data]수신", hdr);
							
				/*** 5. 승인신청(결과:승인의뢰오류)Data 수신 ***/
				try {
					dm2.header     = "";	//레코드헤더
					dm2.tail       = "";    //레코드테일
					dm2.pymt_cd    = "";	//약정번호(납부자번호)		
					dm2.acptdate   = "";	//실제승인일자
					dm2.acptprice  = "";	//승인성공금액
					dm2.fee        = "";	//수수료
					dm2.acptno     = "";	//승인성공시 승인번호
					dm2.cnclokdate = "";	//취소가능일자
					dm2.result     = "";	//처리결과(Y/N)
					dm2.resultcode = "";	//결과코드
					dm2.resultmsg  = "";	//결과코드의 메세지

					int k = 0;
					dataCnt = (int)ds.data_cnt;
					while(dataCnt>0){
						dataCnt--;
						String tgl = new String(conn.recvData());
						//log.tgrLog("[결과 data]수신", tgl);
						log.msgLog("[" + getByteString(tgl,284,4).trim() + "][결과 data] " + tgl);
						log.msgLog("AT: " + tgl.substring(0,1).charAt(0));

						if(tgl.substring(0,1).charAt(0)=='D'){
							//정상 송신건이 아닌경우
							if( !getByteString(tgl,284,4).trim().equals("D000") ) {
								
								dm2.pymt_cd    += getByteString(tgl,17,20).trim()  + sep;	//약정번호(납부자번호)		
								dm2.acptdate   += getByteString(tgl,205,8).trim()  + sep;	//실제승인일자
								dm2.acptprice  += getByteString(tgl,213,10).trim() + sep;	//승인성공금액
								dm2.fee        += getByteString(tgl,223,5).trim()  + sep;	//수수료
								dm2.acptno     += getByteString(tgl,228,20).trim() + sep;	//승인성공시 승인번호
								dm2.cnclokdate += getByteString(tgl,275,8).trim()  + sep;	//취소가능일자
								dm2.result     += getByteString(tgl,283,1).trim()  + sep;	//처리결과(Y/N)
								dm2.resultcode += getByteString(tgl,284,4).trim()  + sep;	//결과코드
								//dm2.resultmsg  += getByteString(tgl,288,30).trim() + sep;	//결과코드의 메세지
								
								++k;
								log.msgLog("["+k+"][" + getByteString(tgl,284,4).trim() + sep + "][결과 data]수신오류자료: " + tgl);								
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
					System.out.println("*** Data record 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "Data record 수신 중 오류";
				}				
				log.msgLog("Data record 수신 종료");


				//종료전문 수신
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//종료전문이 [T000]이 아닌경우 신청된 건이 없는것으로 처리 [전체 데이터 승인신청 오류]
						errcode = tail_result;
						errmsg  = "승인신청 오류";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** 종료전문 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "종료전문 수신 중 오류";
				}

			}

			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret>0){
				log.msgLog("연결종료");
			} else {
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...카드결제 승인의뢰 진행종료.");
			
			
			//카드결제 승인의뢰 처리결과 철이
			dm2.fmserr 	  = errcode;	//송수신오류코드설정
			dm2.fmserrmsg = errmsg;		//송수신오류메세지설정
			dm2.print();
            ds2 = dao.tn_lnk_5055_a(dm2);            
            req.setAttribute("ds2", ds2);

		} catch (Exception e) {
			System.out.println("*** 카드결제 승인요청 처리중 오류: " + e.getMessage() );
            throw e;
		}

	}
	
	public void tn_lnk_5060_a(HttpServletRequest req, HttpServletResponse res) throws Exception {
		TN_LNK_5060_ADataSet ds  = null;
		TN_LNK_5065_ADataSet ds2 = null;
		TN_LNK_5060_ADM dm  = new TN_LNK_5060_ADM(); //결과전송 시작전문 헤더
		TN_LNK_5065_ADM dm2 = new TN_LNK_5065_ADM(); //결과데이저 처리

		dm.cmpy_cd     = dm2.cmpy_cd     = Util.checkString(req.getParameter("cmpy_cd"));
		dm.sdsiidx     = dm2.sdsiidx     = Util.checkString(req.getParameter("sdsiidx"));
		dm.requestdate = dm2.requestdate = Util.checkString(req.getParameter("requestdate"));
		dm.fmsseq      = dm2.fmsseq      = Util.checkString(req.getParameter("fmsseq"));
		dm2.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm2.incmg_pers      = Util.getSessionParameterValue(req,"emp_no",true);
		
		try {
			//출금결과처리 시작전문 가져생성
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
    		
    		log.msgLog("카드결제 결과처리 진행...");

			/*** 서버접속 ***/
    		try {
				//카드 출금신청 결과(배치)
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
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );

			} else {
	
				log.msgLog("Data record 수신 시작");
				//테일전문 리턴받을때까지
				try {
					dm2.header     = "";	//레코드헤더
					dm2.tail       = "";    //레코드테일
					dm2.pymt_cd    = "";	//약정번호(납부자번호)		
					dm2.acptdate   = "";	//실제승인일자
					dm2.acptprice  = "";	//승인성공금액
					dm2.fee        = "";	//수수료
					dm2.acptno     = "";	//승인성공시 승인번호
					dm2.cnclokdate = "";	//취소가능일자
					dm2.result     = "";	//처리결과(Y/N)
					dm2.resultcode = "";	//결과코드
					dm2.resultmsg  = "";	//결과코드의 메세지
					
					while(true){
		
						String tgl = new String(conn.recvData());
						log.tgrLog("수신", tgl);
	
						if(tgl.substring(0,1).charAt(0)=='D'){	

							dm2.pymt_cd    += getByteString(tgl,17,20).trim()  + sep;	//약정번호(납부자번호)		
							dm2.acptdate   += getByteString(tgl,205,8).trim()  + sep;	//실제승인일자
							dm2.acptprice  += getByteString(tgl,213,10).trim() + sep;	//승인성공금액
							dm2.fee        += getByteString(tgl,223,5).trim()  + sep;	//수수료
							dm2.acptno     += getByteString(tgl,228,20).trim() + sep;	//승인성공시 승인번호
							dm2.cnclokdate += getByteString(tgl,275,8).trim()  + sep;	//취소가능일자
							dm2.result     += getByteString(tgl,283,1).trim()  + sep;	//처리결과(Y/N)
							dm2.resultcode += getByteString(tgl,284,4).trim()  + sep;	//결과코드							
							//dm2.resultmsg  += getByteString(tgl,288,30).trim() + sep;	//결과코드의 메세지
							
							/*
							dm2.pymt_cd    += sep + getByteString(tgl,17,20).trim();	//약정번호(납부자번호)		
							dm2.acptdate   += sep + getByteString(tgl,205,8).trim();	//실제승인일자
							dm2.acptprice  += sep + getByteString(tgl,213,10).trim();	//승인성공금액
							dm2.fee        += sep + getByteString(tgl,223,5).trim();	//수수료
							dm2.acptno     += sep + getByteString(tgl,228,20).trim();	//승인성공시 승인번호
							dm2.cnclokdate += sep + getByteString(tgl,275,8).trim();	//취소가능일자
							dm2.result     += sep + getByteString(tgl,283,1).trim();	//처리결과(Y/N)
							dm2.resultcode += sep + getByteString(tgl,284,4).trim();	//결과코드
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
					System.out.println("*** Data record 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "Data record 수신 중 오류";
				}
				log.msgLog("Data record 수신 종료");
				
				
				/*** 3. 종료전문 수신 ***/
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//종료전문이 [T000]이 아닌경우 신청된 건이 없는것으로 처리 [전체 데이터 승인신청 오류]
						errcode = tail_result;
						errmsg  = "승인신청 오류";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** 종료전문 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "종료전문 수신 중 오류";
				}
			}


			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret > 0){
				log.msgLog("연결종료");
			}else{
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...카드결제 결과처리 진행종료");
			
			//카드승인결과처리 완료처리
			dm2.fmserr 	  = errcode;	//송수신오류코드설정
			dm2.fmserrmsg = errmsg;		//송수신오류메세지설정			
            ds2 = dao.tn_lnk_5065_a(dm2);
            req.setAttribute("ds2", ds2);

		} catch (Exception e) {
			System.out.println("*** 결과처리중 오류: " + e.getMessage() );
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
    		log.msgLog("카드결제 취소요청 진행...");

    		
			for(int i = 0; i < ds.curlist.size(); i++) {

				errcode = "";
				errmsg  = "";
				dm2.cmpy_cd         = "";  // 회사코드
				dm2.sdsiidx         = "";  // SDSIIDX
				dm2.sdsipaymentidx  = "";  // SDSIPAYMENTIDX
				dm2.promisecode     = "";  // PROMISEIDX
				dm2.result          = "";  // 처리결과 (Y,N)
				dm2.resultcode      = "";  // 처리결과코드
				dm2.resultmsg       = "";  // 처리결과코드의 메세지
				dm2.fmserr          = "";  // 송수신 에러코드
				dm2.fmserrmsg       = "";  // 송수신 에러메세지
				dm2.incmg_pers_addr = "";  // 입력자 IP
				dm2.incmg_pers      = "";  // 입력자   

				
				/*** 1. 서버접속 ***/
	    		try {
					//카드 출금신청 결과(배치)
	    			/*
					if(conn.connect(Property.CARD_TEST_IP, Property.CARD_TEST_PORT)<0){
						log.msgLog("연결실패");
						throw new Exception();
					}else{
						log.msgLog("연결성공");
					}*/

					if( conn.connect(server_ip, server_port) < 0 ){
						log.msgLog("연결실패");
						throw new Exception();
					}else{
						log.msgLog("연결성공");
					}
					
	    		} catch (Exception e) {
	    			throw e;
	    		}
	    		

				/*** 2. 취소요청Data 송신 및 수신 ***/
				//취소요청Data 송신
				TN_LNK_5070_ACURLISTRecord rec = (TN_LNK_5070_ACURLISTRecord)ds.curlist.get(i);
				conn.sendData(rec.filedata.replaceAll("]", tag));
				log.tgrLog("송신", rec.filedata.replaceAll("]", tag));
				
				/*** 2.1. 취소요청Data 결과수신 ***/
				String	tgl = new String(conn.recvData());
				log.tgrLog("수신", tgl);
				
				
				/*** 3. 취소요청결과 처리 ***/
				dm2.cmpy_cd			= cmpy_cd;
				dm2.sdsiidx         = sdsiidx;
				dm2.sdsipaymentidx 	= getByteString(tgl,53, 6).trim();	//해당 레코드 SDSIPAYMENTIDX (레이아웃상에서 원거래건의 전문번호)
				dm2.promisecode		= getByteString(tgl,60,20).trim();	//해당 레코드 약정코드
				dm2.result     		= getByteString(tgl,343,1).trim();	//처리결과(Y/N)
				dm2.resultcode 		= getByteString(tgl,344,4).trim();	//결과코드
				dm2.resultmsg  		= getByteString(tgl,348,30).trim();	//결과코드의 메세지
				dm2.fmserr          = errcode;  						// 송수신 에러코드
				dm2.fmserrmsg       = errmsg;  							// 송수신 에러메세
				dm2.incmg_pers_addr = incmg_pers_addr;
				dm2.incmg_pers      = incmg_pers;
				dm2.print();
				
	    		
				/*** 4. 소켓종료 ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("연결종료");
				}else{
					log.msgLog("연결종료 실패 : " + ret);
				}
				log.msgLog("...카드결제 취소요청 진행종료");
				
				//수신한 취소 결과반영
				ds2 = dao.tn_lnk_5075_a(dm2);
			}

			//취소처리종료
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
    		
    		log.msgLog("카드결제 승인요청내용 조회 진행...");

    		
    		/*** 서버접속 */
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

			/*** 2. 시작전문 응답수신 ***/
			String sdata = new String(conn.recvData());
			System.out.println("R:"+sdata);

			/*** 2.1시작전문 오류일경우 오류설정 후 리턴 ***/
			if( getByteString(sdata, 285, 1).charAt(0)=='N' ) {
				errcode = getByteString(sdata, 286, 4).trim();
				errmsg  = getByteString(sdata, 290, 30).trim();
				ds.errcode = errcode;
				ds.errmsg  = errmsg;
				log.tgrLog("시작전문 오류", errcode + " : " + errmsg );
			} else {

				log.msgLog("Data record 수신 시작");
				//테일전문 리턴받을때까지
				try {

					dm_buff.seq      = seq++ + sep;
					dm_buff.filedata = ("H"+String.format("%100s", " ")) + sep;
					
					while(true){
		
						String tgl = new String(conn.recvData());
						log.tgrLog("수신", tgl);
	
						//String tgr = null;
						//tgr = new String(conn.recvData());
						log.tgrLog("승인요청내용수신 : ", tgl);
						dm_buff.seq      += seq++ + sep;
						dm_buff.filedata += tgl   + sep;
						dataCnt++;
						
						if( dataCnt >= maxCnt ) {
							//1. write buff table
							dm_buff.print();
							ds_buff = dao_buff.tn_lnk_6081_a(dm_buff);

							//2. init dm2, datacnt
							dm_buff.seq         = "";	//일련번호
							dm_buff.filedata	= "";	//수신Data
							dataCnt = 0;
						}
						
						if( getByteString(tgl, 0, 1).charAt(0)=='T' ) {
							break;
						}
						
					}
					dm_buff.print();
					ds_buff = dao_buff.tn_lnk_6081_a(dm_buff);

					log.msgLog("카드결제 승인요청내용조회 종료전문 수신 시작...");
					String tail = new String(conn.recvData());
					log.tgrLog("[TAIL] 송신결과수신 : ", tail);
					log.msgLog("...카드결제 승인요청내용조회 종료전문 수신 종료");


				} catch (Exception e) {
					System.out.println("*** Data record 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "Data record 수신 중 오류";
				}
				log.msgLog("Data record 수신 종료");
				
				
				/*** 3. 종료전문 수신 **
				try {
					String tail_result = "";
					sdata = new String(conn.recvData());
					tail_result = getByteString(sdata,286,4).trim();
					
					if( !tail_result.equals("T000") && !tail_result.equals("E000") ) {
						//종료전문이 [T000]이 아닌경우 신청된 건이 없는것으로 처리 [전체 데이터 승인신청 오류]
						errcode = tail_result;
						errmsg  = "승인신청 오류";
					}
					System.out.println("R:"+sdata);
				} catch (Exception e) {			
					System.out.println("*** 종료전문 수신 중 오류");
					errcode = "WB Exception";
					errmsg  = "종료전문 수신 중 오류";
				}
				*/

			}
			
			
			/*** 소켓종료 ***/
			int ret = conn.close();
			if(ret>0){
				log.msgLog("연결종료");
			} else {
				log.msgLog("연결종료 실패 : " + ret);
			}
			log.msgLog("...카드결제 승인요청내용 조회 종료.");

			
			log.msgLog("==== 카드결제 승인요청내용조회 결과처리 시작 ====");
			if(ds.errcode.equals("")) {
				dm2.print();
				ds2 = dao.tn_lnk_5085_a(dm2);
				ds.errcode = ds2.tailresult;
				ds.errmsg  = ds2.tailresultmsg;
			}
			log.msgLog("==== 카드결제 승인요청내용조회 결과처리 완료 ====");
			
            req.setAttribute("ds",   ds);
            req.setAttribute("ds2", ds2); //승인요청내용

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
    		log.msgLog("카드결제 회원삭제요청 진행...");

    		
			for(int i = 0; i < ds.curlist.size(); i++) {

				errcode = "";
				errmsg  = "";
				
				/*** 1. 서버접속 ***/
	    		try {
					if( conn.connect(server_ip, server_port) < 0 ){
						log.msgLog("연결실패");
						throw new Exception();
					}else{
						log.msgLog("연결성공");
					}
					
	    		} catch (Exception e) {
	    			throw e;
	    		}
	    		

				/*** 2. 회원삭제요청Data 송신 및 수신 ***/
				//취소요청Data 송신
				TN_LNK_5090_ACURLISTRecord rec = (TN_LNK_5090_ACURLISTRecord)ds.curlist.get(i);
				conn.sendData(rec.filedata.replaceAll("]", tag));
				log.tgrLog("송신", rec.filedata.replaceAll("]", tag));
				
				/*** 2.1. 회원삭제요청Data 결과수신 ***/
				String	tgl = new String(conn.recvData());
				log.tgrLog("수신", tgl);

	    		
				/*** 4. 소켓종료 ***/
				int ret = conn.close();
				if(ret>0){
					log.msgLog("연결종료");
				}else{
					log.msgLog("연결종료 실패 : " + ret);
				}
				log.msgLog("...카드결제 회원삭제요청 진행종료");
				
			}

			//취소처리종료
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
