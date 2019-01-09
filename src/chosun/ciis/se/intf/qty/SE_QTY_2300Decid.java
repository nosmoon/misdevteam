/***************************************************************************************************
* 파일명 : SE_QTY_2300Decid.java
* 기능 : 일일증감부수 - 결재처리
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.PostDataUtil;
import chosun.ciis.co.base.util.DigitUtil;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.co.lib.intf.crmApprovalDocument;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

import java.util.*;
import java.text.*;

public class SE_QTY_2300Decid extends crmApprovalDocument{
	
	public static String docType = "SL002";
	public static String subject = "인쇄부수전표";
	
	public void send(HttpServletRequest req) throws AppException, SysException, Exception
	{
		super.send(req, docType);
	}
	
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception
	{
		CO_DECID_1000_IDataSet coDs = (CO_DECID_1000_IDataSet)req.getAttribute("coDs");
		if(coDs == null || coDs.decid_key == null || "".equals(coDs.decid_key)){
			throw new AppException("SE_QTY_2300Decid", "결재 번호 채번에 실패했습니다");
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
		SE_QTY_2670_PDataSet pDs = (SE_QTY_2670_PDataSet)req.getAttribute("pDs");
		String sIssu_dt = "";

		//발행일자 구성
		if(!"".equals(pDs.issu_dt)){
			/*
	        Calendar cal = null;
	        Date date = Util.toDate(pDs.issu_dt, "yyyymmdd");
	        cal = Calendar.getInstance();
	        cal.setTime(date);
			*/
			Calendar cal = Calendar.getInstance();
			int yy = Integer.parseInt(pDs.issu_dt.substring(0,4));
			int mm = Integer.parseInt(pDs.issu_dt.substring(4,6));
			int dd = Integer.parseInt(pDs.issu_dt.substring(6,8));

			cal.clear();
			cal.set(yy, mm,dd);
			sIssu_dt = "(발행일자 "+yy+"년 "+mm+"월 "+dd+"일 ";
	        switch(cal.get(cal.DAY_OF_WEEK)) {
	    		case java.util.Calendar.SUNDAY:
	        		sIssu_dt = sIssu_dt + "일요일";
	        		break;
	    		case java.util.Calendar.MONDAY:
	        		sIssu_dt = sIssu_dt + "월요일";
	        		break;
	    		case java.util.Calendar.TUESDAY:
	        		sIssu_dt = sIssu_dt + "화요일";
	        		break;
	    		case java.util.Calendar.WEDNESDAY:
	        		sIssu_dt = sIssu_dt + "수요일";
	        		break;
	    		case java.util.Calendar.THURSDAY:
	        		sIssu_dt = sIssu_dt + "목요일";
	        		break;
	    		case java.util.Calendar.FRIDAY:
	        		sIssu_dt = sIssu_dt + "금요일";
	        		break;
	    		case java.util.Calendar.SATURDAY:
	        		sIssu_dt = sIssu_dt + "토요일";
	        		break;
	        }    
	        sIssu_dt = sIssu_dt + ")";
		}
        
		//work_item
		//header
		addWorkItem("910", "", sIssu_dt);		//발행일자
		addWorkItem("920", "", pDs.c_ser_no);	//본쇄호수
		addWorkItem("930", "면수", pDs.p_cnt);	//면수
		addWorkItem("940", "", pDs.sect_a_nm);	//섹션1(조선경제)
		addWorkItem("950", "", pDs.sect_b_nm);	//섹션2(별쇄특집)
		addWorkItem("960", "", pDs.s_ser_no);	//소년호수
		
		String sPrt_plac_cd = "";
		String sPrt_plac_cd_pre = "";
		int rowCnt = 0;		//전체 인덱스
		int grpCnt = 0;		//그룹별 인덱스
		int frstGrpCnt = 1;	//그룹별 첫인덱스
		
		long a_qty_sum = 0L;
		long b_qty_sum = 0L;
		long a_qty_tot = 0L;
		long b_qty_tot = 0L;
		String a_qty = "";
		String b_qty = "";
		
		//본쇄내역(쿼리결과 순서대로 출력이 되나 마지막 인쇄처가 제주라는것을 하드코딩함. 즉 마지막의 인쇄처가 바뀔경우 하단의 제주일경우 인쇄처 코드를 변경해준다.
		for(int i=0; i<pDs.curlist_a.size(); i++)
		{
			SE_QTY_2670_PCURLIST_ARecord rec = (SE_QTY_2670_PCURLIST_ARecord)pDs.curlist_a.get(i);
			rowCnt++;
			grpCnt++;
			sPrt_plac_cd = rec.prt_plac_cd;
			
			if(rowCnt == 1) sPrt_plac_cd_pre = sPrt_plac_cd;
			//인쇄처 끝에 소계및 합계뿌림(제주는소계뺌)
			if(!sPrt_plac_cd.equals(sPrt_plac_cd_pre)){

				addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_sum+b_qty_sum)+""));
				addWorkItem("1"+lo_lpad(rowCnt)+"30","", "소계");
				addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(a_qty_sum+""));
				addWorkItem("1"+lo_lpad(rowCnt)+"50","", "소계");
				addWorkItem("1"+lo_lpad(rowCnt)+"60","", DigitUtil.nf_format(b_qty_sum+""));
				sPrt_plac_cd_pre = sPrt_plac_cd;
				rowCnt++;
				grpCnt = 1;
				frstGrpCnt = rowCnt;
				a_qty_tot += a_qty_sum;
				b_qty_tot += b_qty_sum;
				a_qty_sum = 0;
				b_qty_sum = 0;
			}
			
			//인쇄처별 첫라인
			if(grpCnt==1){
				addWorkItem("1"+lo_lpad(rowCnt)+"10","", rec.prt_plac_nm);
			}			
			a_qty = rec.a_qty;
			if("".equals(a_qty)) a_qty = "0";
			b_qty = rec.b_qty;
			if("".equals(b_qty)) b_qty = "0";
			a_qty_sum = a_qty_sum + Long.parseLong(a_qty);
			b_qty_sum = b_qty_sum + Long.parseLong(b_qty);
			if("73".equals(sPrt_plac_cd)) addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_sum+b_qty_sum)+""));		//마지막 제주일경우
			addWorkItem("1"+lo_lpad(rowCnt)+"30","", rec.a_ledt_ecnt_cd);
			addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(rec.a_qty));
			addWorkItem("1"+lo_lpad(rowCnt)+"50","", rec.b_ledt_ecnt_cd);
			addWorkItem("1"+lo_lpad(rowCnt)+"60","", DigitUtil.nf_format(rec.b_qty));
			
		}
		//본쇄마지막 합계줄
		rowCnt++;
		addWorkItem("1"+lo_lpad(rowCnt)+"10","", "합계");
		addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_tot+b_qty_tot)+""));
		addWorkItem("1"+lo_lpad(rowCnt)+"30","", "");
		addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(a_qty_tot+""));
		addWorkItem("1"+lo_lpad(rowCnt)+"50","", "");
		addWorkItem("1"+lo_lpad(rowCnt)+"60","", DigitUtil.nf_format(b_qty_tot+""));

		//섹션내역
		rowCnt = 0;
		a_qty_sum = 0L;
		b_qty_sum = 0L;
		for(int i=0; i<pDs.curlist_b.size(); i++)
		{
			SE_QTY_2670_PCURLIST_BRecord rec = (SE_QTY_2670_PCURLIST_BRecord)pDs.curlist_b.get(i);
			rowCnt++;

			a_qty = rec.a_qty;
			if("".equals(a_qty)) a_qty = "0";
			b_qty = rec.b_qty;
			if("".equals(b_qty)) b_qty = "0";
			addWorkItem("2"+lo_lpad(rowCnt)+"10","", rec.real_prt_plac_nm);
			addWorkItem("2"+lo_lpad(rowCnt)+"20","", rec.a_pcnt);
			addWorkItem("2"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(rec.a_qty));
			addWorkItem("2"+lo_lpad(rowCnt)+"40","", rec.b_pcnt);
			addWorkItem("2"+lo_lpad(rowCnt)+"50","", DigitUtil.nf_format(rec.b_qty));
			addWorkItem("2"+lo_lpad(rowCnt)+"60","", rec.remk);
			a_qty_sum = a_qty_sum + Long.parseLong(a_qty);
			b_qty_sum = b_qty_sum + Long.parseLong(b_qty);
		}
		//섹션합계
		rowCnt++;
		addWorkItem("2"+lo_lpad(rowCnt)+"10","", "합계");
		addWorkItem("2"+lo_lpad(rowCnt)+"20","", "");
		addWorkItem("2"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(a_qty_sum+""));
		addWorkItem("2"+lo_lpad(rowCnt)+"40","", "");
		addWorkItem("2"+lo_lpad(rowCnt)+"50","", DigitUtil.nf_format(b_qty_sum+""));
		addWorkItem("2"+lo_lpad(rowCnt)+"60","", "");
		//섹션비고
		addWorkItem("81", "", pDs.remk_a);		

		//소년내역
		rowCnt = 0;
		a_qty_sum = 0L;
		b_qty_sum = 0L;
		for(int i=0; i<pDs.curlist_c.size(); i++)
		{
			SE_QTY_2670_PCURLIST_CRecord rec = (SE_QTY_2670_PCURLIST_CRecord)pDs.curlist_c.get(i);
			rowCnt++;

			a_qty = rec.a_qty;
			if("".equals(a_qty)) a_qty = "0";
			addWorkItem("3"+lo_lpad(rowCnt)+"10","", rec.a_prt_plac_nm);
			addWorkItem("3"+lo_lpad(rowCnt)+"20","", rec.a_pcnt);
			addWorkItem("3"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(rec.a_qty));
			addWorkItem("3"+lo_lpad(rowCnt)+"40","", rec.b_route_prt_plac_nm);
			addWorkItem("3"+lo_lpad(rowCnt)+"50","", DigitUtil.nf_format(rec.b_qty));
			a_qty_sum = a_qty_sum + Long.parseLong(a_qty);
		}
		//소년합계
		rowCnt++;
		addWorkItem("3"+lo_lpad(rowCnt)+"10","", "합계");
		addWorkItem("3"+lo_lpad(rowCnt)+"20","", "");
		addWorkItem("3"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(a_qty_sum+""));

		//비고
		addWorkItem("82", "", pDs.remk_b);		
		//변동사항
		addWorkItem("83", "", pDs.remk_c);		
		
	}

    public String lo_lpad(int number)
    {
    	number = number*10;
        DecimalFormat intFormatter = new DecimalFormat("000");
        return intFormatter.format(number);
    }

}
