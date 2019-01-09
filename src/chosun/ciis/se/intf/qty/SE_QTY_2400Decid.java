/***************************************************************************************************
* 파일명 : SE_QTY_2400Decid.java
* 기능 : 마감후증감부수재마감 - 결재처리
* 작성일자 : 2009-06-15
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.se.intf.qty;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.util.DigitUtil;
import chosun.ciis.co.base.util.PostDataUtil;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.co.lib.intf.crmApprovalDocument;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

public class SE_QTY_2400Decid extends crmApprovalDocument{
	
	public static String docType = "SL003";
	public static String subject = "추가인쇄의뢰";
	
	public void send(HttpServletRequest req) throws AppException, SysException, Exception
	{
		super.send(req, docType);
	}
	
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception
	{
		CO_DECID_1000_IDataSet coDs = (CO_DECID_1000_IDataSet)req.getAttribute("coDs");
		if(coDs == null || coDs.decid_key == null || "".equals(coDs.decid_key)){
			throw new AppException("SE_QTY_2400Decid", "결재 번호 채번에 실패했습니다");
		}
		setInformation(crmApprovalDocument.eleDocID, coDs.decid_key);
		
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
		
		//부수현황
		SE_QTY_2680_PDataSet pDs = (SE_QTY_2680_PDataSet)req.getAttribute("pDs");

		//work_item
		//header
		String s_yy = pDs.issu_dt.substring(0,4)+"년 ";
		String s_mm = pDs.issu_dt.substring(4,6)+"월 ";
		String s_dd = pDs.issu_dt.substring(6,8)+"일";
		addWorkItem("91", "발행일자", s_yy+s_mm+s_dd);
		addWorkItem("92", "담당자", pDs.chrg_pers);
		int rowCnt = 0;
		for(int i=0; i<pDs.curlist_a.size(); i++)
		{
			SE_QTY_2680_PCURLIST_ARecord rec = (SE_QTY_2680_PCURLIST_ARecord)pDs.curlist_a.get(i);
			rowCnt++;
			addWorkItem("4"+lo_lpad(rowCnt)+"10","", rec.sell_clsf_nm);
			addWorkItem("4"+lo_lpad(rowCnt)+"12","", rec.medi_info);
			addWorkItem("4"+lo_lpad(rowCnt)+"14","", DigitUtil.nf_format(rec.prt_rfl_qty));
			addWorkItem("4"+lo_lpad(rowCnt)+"16","", rec.arvl_clsf_nm);
			addWorkItem("4"+lo_lpad(rowCnt)+"18","", rec.remk);
		}
		//나머지 빈칸으로 12라인채움
		for(int i=0; i<(12-pDs.curlist_a.size()); i++)
		{
			rowCnt++;
			addWorkItem("4"+lo_lpad(rowCnt)+"10","", "");
			addWorkItem("4"+lo_lpad(rowCnt)+"12","", "");
			addWorkItem("4"+lo_lpad(rowCnt)+"14","", "");
			addWorkItem("4"+lo_lpad(rowCnt)+"16","", "");
			addWorkItem("4"+lo_lpad(rowCnt)+"18","", "");
		}
	}

    public String lo_lpad(int number)
    {
    	DecimalFormat intFormatter = new DecimalFormat("00");
        return intFormatter.format(number);
    }

    
}
