/***************************************************************************************************
* 파일명 : TnLnk000WB.java
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
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk3000DAO;
import chosun.ciis.tn.lnk.dao.TnLnk4000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.tn.lnk.TN_MailsSender;
/**
 * 
 */

public class TnLnk4000WB extends BaseWB {


	public void tn_lnk_4010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_4010_LDataSet ds = null;
		TN_LNK_4010_LDM dm = new TN_LNK_4010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));

		dm.print();
        
        try {
        	TnLnk4000DAO dao = new TnLnk4000DAO();
            ds = dao.tn_lnk_4010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }


	public void tn_lnk_4020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_4020_ADataSet ds = null;
		TN_LNK_4020_ADM dm = new TN_LNK_4020_ADM();
		
		String sendType = "";
		String title = "";	
		String sendContents = "";
		String senderInfo = "";
		String receiver = "";
		String receiverWrite = "";
		String umsIdx = "";
		String chg_pers = "";
		sendType = Util.checkString(req.getParameter("sendtype"));
		
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.name = (String)hash.get("name");
		dm.memberidx = (String)hash.get("memberidx");
		if(sendType.equals("1")){
			dm.receiver = (String)hash.get("email");
			receiver =  (String)hash.get("email");
		}else{
			dm.receiver = (String)hash.get("cellphone");
		}
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.receiverlist = Util.checkString(req.getParameter("receiverlist"));
		dm.receiverwritelist = Util.checkString(req.getParameter("receiverwritelist"));
		receiverWrite= Util.checkString(req.getParameter("receiverwritelist"));
		dm.receiveroption = Util.checkString(req.getParameter("receiveroption"));
		dm.sendtype = Util.checkString(req.getParameter("sendtype"));
		dm.purpose = Util.checkString(req.getParameter("purpose"));
		dm.title = Util.checkString(req.getParameter("title"));
		dm.adminname = Util.checkString(req.getParameter("adminname"));
		dm.adminidx = Util.checkString(req.getParameter("adminidx"));
		dm.memo = Util.checkString(req.getParameter("memo"));
		dm.sender = Util.checkString(req.getParameter("sender"));
		dm.senderinfo = Util.checkString(req.getParameter("senderinfo"));
		dm.sendtitle = Util.checkString(req.getParameter("sendtitle"));
		dm.sendcontents = Util.checkString(req.getParameter("sendcontents"));
		dm.startdate = Util.checkString(req.getParameter("startdate"));
		dm.enddate = Util.checkString(req.getParameter("enddate"));
		dm.status = Util.checkString(req.getParameter("status"));
		//dm.memberidx = Util.checkString(req.getParameter("memberidx"));
		//dm.name = Util.checkString(req.getParameter("name"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		title = Util.checkString(req.getParameter("title"));
		sendContents = Util.checkString(req.getParameter("sendcontents"));
		senderInfo = Util.checkString(req.getParameter("senderinfo"));
		
		dm.print();
		
        try {
        	TnLnk4000DAO dao = new TnLnk4000DAO();
            ds = dao.tn_lnk_4020_a(dm);
            req.setAttribute("ds", ds);
            umsIdx = ds.umsidx;
        }
        catch (AppException e) {
            throw e;
        } 
      
        if(sendType.equals("1")){
        	
        	
        	if(!receiver.equals("")){
//        		이메일 전송 - 지정된 사용자
            	try {
            		System.out.println("메이르1");
            		TN_MailsSender ms = new TN_MailsSender();
        			//String sToEmail = "villach@chosun.com";
        			//String sToEmail = "villach@chosun.com";
        			String sFromEmail = senderInfo;
        			String sMailSubject = title;
        			String sMailContent = sendContents;	 
        			//System.out.println("$$$");
        			StringTokenizer st = new StringTokenizer(receiver,"#");
        			int i=0;
        			for(;st.hasMoreTokens();i++){
        				//System.out.println(st.nextToken()+"|");
        				ms.sendmail(sMailSubject,  sMailContent, sFromEmail, st.nextToken(), "", "",dm.cmpy_cd, umsIdx, chg_pers);
                		
        			}
        			//메일보낸다.
        			
        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        	}
        	if(!receiverWrite.equals("")){
//    			이메일 전송 - 추가입력 사용자
	        	try {
	        		System.out.println("메이르2");
	        		TN_MailsSender ms = new TN_MailsSender();
	    			//String sToEmail = "villach@chosun.com";
	    			//String sToEmail = "villach@chosun.com";
	    			String sFromEmail = senderInfo;
	    			String sMailSubject = title;
	    			String sMailContent = sendContents;	 

        			//System.out.println("###");
        			StringTokenizer st = new StringTokenizer(receiverWrite,",");
        			int i=0;
        			for(;st.hasMoreTokens();i++){
        				//System.out.println(st.nextToken()+"|");
        				ms.sendmail(sMailSubject,  sMailContent, sFromEmail, st.nextToken(), "", "",dm.cmpy_cd, umsIdx, chg_pers );
                		
        			}
	    		} catch(Exception e) {
	    			e.printStackTrace();
	    		}
        	}
    		
        }
        
        
	}

	public void tn_lnk_4110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_4110_LDataSet ds = null;
		TN_LNK_4110_LDM dm = new TN_LNK_4110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.status = Util.checkString(req.getParameter("status"));
		dm.startdate_fr = Util.checkString(req.getParameter("startdate_fr"));
		dm.startdate_to = Util.checkString(req.getParameter("startdate_to"));
		dm.title = Util.checkString(req.getParameter("title"));

		dm.print();
        
        try {
        	TnLnk4000DAO dao = new TnLnk4000DAO();
            ds = dao.tn_lnk_4110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
	
	public void tn_lnk_4120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_4120_LDataSet ds = null;
		TN_LNK_4120_LDM dm = new TN_LNK_4120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.umsidx = Util.checkString(req.getParameter("umsidx"));

		dm.print();
        
        try {
        	TnLnk4000DAO dao = new TnLnk4000DAO();
            ds = dao.tn_lnk_4120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
}
