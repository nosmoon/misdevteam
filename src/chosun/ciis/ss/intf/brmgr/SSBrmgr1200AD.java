/***************************************************************************************************
* 파일명 : SSBrmgr1200AD.java
* 기능 : 결재처리 - 부수증감 본지(담당)
* 작성일자 : 2009-04-30
* 작성자 : 황성진
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.intf.brmgr;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.util.PostDataUtil;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.co.lib.intf.crmApprovalDocument;
import chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_DOCIDDataSet;
import chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_ILGYEDataSet;
import chosun.ciis.ss.sls.brmgr.rec.SS_L_QTYAPLC_ILGYECURCOMMLISTRecord;
import somo.framework.util.Util;

public class SSBrmgr1200AD extends crmApprovalDocument{
	
	public static String docType = "SL001";
	public static String subject = "부수조정신청서(본지)";
	
	public void send(HttpServletRequest req) throws AppException, SysException, Exception
	{
		super.send(req, docType);
	}
	
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		//doc id. SS_L_QTYAPLC_DOCIDDataSet -> CO_DECID_1000_IDataSet 로 변경.
		/*SS_L_QTYAPLC_DOCIDDataSet docidds = (SS_L_QTYAPLC_DOCIDDataSet)req.getAttribute("docidds");
		if(docidds == null || docidds.documentid == null || "".equals(docidds.documentid))
			throw new AppException("결재 번호 채번에 실패했습니다.");*/
		CO_DECID_1000_IDataSet docidds = (CO_DECID_1000_IDataSet)req.getAttribute("docidds");
		if(docidds == null || docidds.decid_key == null || "".equals(docidds.decid_key))
			throw new AppException("결재 번호 채번에 실패했습니다.");
		setInformation(crmApprovalDocument.eleDocID, docidds.decid_key);
		
		//documentInformation
		setInformation(crmApprovalDocument.eleDocType, docType);
		setInformation(crmApprovalDocument.eleCrtTime, Calendar.getInstance());
		setInformation(crmApprovalDocument.eleModTime, Calendar.getInstance());
		setInformation(crmApprovalDocument.eleCrtSys, crmApprovalDocument.createSystem);
		setInformation(crmApprovalDocument.eleCrtSrv, crmApprovalDocument.createServer);
		setInformation(crmApprovalDocument.eleCreator, req.getSession().getAttribute("emp_nm"));
		setInformation(crmApprovalDocument.eleSubect, subject);
		
		//processInformation
		setInformation(crmApprovalDocument.eleDest, "SmartFlowXF");
		setInformation(crmApprovalDocument.eleRecpt, req.getSession().getAttribute("uid"));
		setInformation(crmApprovalDocument.eleDocStat, "create");
		
		//work_item
		//header
		addWorkItem("001", "신청일", sf.format(cal.getTime()));
		addWorkItem("002", "신청부서", (String)req.getSession().getAttribute("deptnm"));
		
		//지역단위 부수현황
		SS_L_QTYAPLC_ILGYEDataSet ilgyds = (SS_L_QTYAPLC_ILGYEDataSet)req.getAttribute("ilgyds");
		for(int i=0; i<ilgyds.curcommlist.size(); i++)
		{
			SS_L_QTYAPLC_ILGYECURCOMMLISTRecord rec = (SS_L_QTYAPLC_ILGYECURCOMMLISTRecord)ilgyds.curcommlist.get(i);
			
			addWorkItem(""+(i+1)+"01", "", rec.areanm);
			addWorkItem(""+(i+1)+"02", "", Util.comma(rec.iytot));
			addWorkItem(""+(i+1)+"03", "", Util.comma(rec.realtot));
			addWorkItem(""+(i+1)+"04", "", rec.iytot==0 ? "" : String.valueOf(Math.round(1.0f*rec.realtot/rec.iytot*10000) / 100.0f));
		}
		//addWorkItem("area_10", "", sf.format(cal.getTime()));
		
		//부수조정 신청내역
		String[] bonm  = req.getParameterValues("bonm");
        //String[] wygbs = req.getParameterValues("aft_iygwygbs");		//변경전 부수를 사용.
        //String[] wmgbs = req.getParameterValues("aft_iygwmgbs");
		String[] wygbs = req.getParameterValues("iygwygbs");
        String[] wmgbs = req.getParameterValues("iygwmgbs");
        String[] realtot = req.getParameterValues("realtot");
        String[] chgqty = req.getParameterValues("chrgupdicdcqty");
        //String[] chgyn = req.getParameterValues("chrgcnfmyn");
        String[] chkyn = req.getParameterValues("chk");
        String[] remk = req.getParameterValues("remk");
        
        long subtot = 0;
        int idx = 1;
        for(int i=0; chkyn!=null && i<chkyn.length; i++)
        {
        	if("Y".equals(chkyn[i]))
        	{
        		long gbs = Long.parseLong(wygbs[i]==null?"0":wygbs[i]) + Long.parseLong(wmgbs[i]==null?"0":wmgbs[i]);
        		long tot = Long.parseLong(realtot[i]==null?"0":realtot[i]);
        		float rate = Math.round(gbs==0 ? 0 : 1.0f*tot/gbs*10000) / 100.0f;
        		
        		addWorkItem("" + (10+idx) + "01", "", bonm[i]==null ? "" : bonm[i]);
        		addWorkItem("" + (10+idx) + "02", "", Util.comma(gbs));
        		addWorkItem("" + (10+idx) + "03", "", Util.comma(tot));
        		addWorkItem("" + (10+idx) + "04", "", String.valueOf(rate));
        		addWorkItem("" + (10+idx) + "05", "", chgqty[i]==null ? "" : Util.comma(Long.parseLong(chgqty[i])));
        		addWorkItem("" + (10+idx) + "06", "", remk[i]==null ? "" : remk[i]);
        		
        		subtot += Long.parseLong(chgqty[i]==null?"0":chgqty[i]);
        		idx++;
        	}
        }
        addWorkItem("2601", "", Util.comma(subtot));
        addWorkItem("5001", "", "");
	}
}
