/***************************************************************************************************
* ���ϸ� : SE_QTY_2300Decid.java
* ��� : ���������μ� - ����ó��
* �ۼ����� : 2009-06-15
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
	public static String subject = "�μ�μ���ǥ";
	
	public void send(HttpServletRequest req) throws AppException, SysException, Exception
	{
		super.send(req, docType);
	}
	
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception
	{
		CO_DECID_1000_IDataSet coDs = (CO_DECID_1000_IDataSet)req.getAttribute("coDs");
		if(coDs == null || coDs.decid_key == null || "".equals(coDs.decid_key)){
			throw new AppException("SE_QTY_2300Decid", "���� ��ȣ ä���� �����߽��ϴ�");
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

		//�μ���Ȳ
		SE_QTY_2670_PDataSet pDs = (SE_QTY_2670_PDataSet)req.getAttribute("pDs");
		String sIssu_dt = "";

		//�������� ����
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
			sIssu_dt = "(�������� "+yy+"�� "+mm+"�� "+dd+"�� ";
	        switch(cal.get(cal.DAY_OF_WEEK)) {
	    		case java.util.Calendar.SUNDAY:
	        		sIssu_dt = sIssu_dt + "�Ͽ���";
	        		break;
	    		case java.util.Calendar.MONDAY:
	        		sIssu_dt = sIssu_dt + "������";
	        		break;
	    		case java.util.Calendar.TUESDAY:
	        		sIssu_dt = sIssu_dt + "ȭ����";
	        		break;
	    		case java.util.Calendar.WEDNESDAY:
	        		sIssu_dt = sIssu_dt + "������";
	        		break;
	    		case java.util.Calendar.THURSDAY:
	        		sIssu_dt = sIssu_dt + "�����";
	        		break;
	    		case java.util.Calendar.FRIDAY:
	        		sIssu_dt = sIssu_dt + "�ݿ���";
	        		break;
	    		case java.util.Calendar.SATURDAY:
	        		sIssu_dt = sIssu_dt + "�����";
	        		break;
	        }    
	        sIssu_dt = sIssu_dt + ")";
		}
        
		//work_item
		//header
		addWorkItem("910", "", sIssu_dt);		//��������
		addWorkItem("920", "", pDs.c_ser_no);	//����ȣ��
		addWorkItem("930", "���", pDs.p_cnt);	//���
		addWorkItem("940", "", pDs.sect_a_nm);	//����1(��������)
		addWorkItem("950", "", pDs.sect_b_nm);	//����2(����Ư��)
		addWorkItem("960", "", pDs.s_ser_no);	//�ҳ�ȣ��
		
		String sPrt_plac_cd = "";
		String sPrt_plac_cd_pre = "";
		int rowCnt = 0;		//��ü �ε���
		int grpCnt = 0;		//�׷캰 �ε���
		int frstGrpCnt = 1;	//�׷캰 ù�ε���
		
		long a_qty_sum = 0L;
		long b_qty_sum = 0L;
		long a_qty_tot = 0L;
		long b_qty_tot = 0L;
		String a_qty = "";
		String b_qty = "";
		
		//���⳻��(������� ������� ����� �ǳ� ������ �μ�ó�� ���ֶ�°��� �ϵ��ڵ���. �� �������� �μ�ó�� �ٲ��� �ϴ��� �����ϰ�� �μ�ó �ڵ带 �������ش�.
		for(int i=0; i<pDs.curlist_a.size(); i++)
		{
			SE_QTY_2670_PCURLIST_ARecord rec = (SE_QTY_2670_PCURLIST_ARecord)pDs.curlist_a.get(i);
			rowCnt++;
			grpCnt++;
			sPrt_plac_cd = rec.prt_plac_cd;
			
			if(rowCnt == 1) sPrt_plac_cd_pre = sPrt_plac_cd;
			//�μ�ó ���� �Ұ�� �հ�Ѹ�(���ִ¼Ұ軭)
			if(!sPrt_plac_cd.equals(sPrt_plac_cd_pre)){

				addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_sum+b_qty_sum)+""));
				addWorkItem("1"+lo_lpad(rowCnt)+"30","", "�Ұ�");
				addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(a_qty_sum+""));
				addWorkItem("1"+lo_lpad(rowCnt)+"50","", "�Ұ�");
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
			
			//�μ�ó�� ù����
			if(grpCnt==1){
				addWorkItem("1"+lo_lpad(rowCnt)+"10","", rec.prt_plac_nm);
			}			
			a_qty = rec.a_qty;
			if("".equals(a_qty)) a_qty = "0";
			b_qty = rec.b_qty;
			if("".equals(b_qty)) b_qty = "0";
			a_qty_sum = a_qty_sum + Long.parseLong(a_qty);
			b_qty_sum = b_qty_sum + Long.parseLong(b_qty);
			if("73".equals(sPrt_plac_cd)) addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_sum+b_qty_sum)+""));		//������ �����ϰ��
			addWorkItem("1"+lo_lpad(rowCnt)+"30","", rec.a_ledt_ecnt_cd);
			addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(rec.a_qty));
			addWorkItem("1"+lo_lpad(rowCnt)+"50","", rec.b_ledt_ecnt_cd);
			addWorkItem("1"+lo_lpad(rowCnt)+"60","", DigitUtil.nf_format(rec.b_qty));
			
		}
		//���⸶���� �հ���
		rowCnt++;
		addWorkItem("1"+lo_lpad(rowCnt)+"10","", "�հ�");
		addWorkItem("1"+lo_lpad(rowCnt)+"20","", DigitUtil.nf_format((a_qty_tot+b_qty_tot)+""));
		addWorkItem("1"+lo_lpad(rowCnt)+"30","", "");
		addWorkItem("1"+lo_lpad(rowCnt)+"40","", DigitUtil.nf_format(a_qty_tot+""));
		addWorkItem("1"+lo_lpad(rowCnt)+"50","", "");
		addWorkItem("1"+lo_lpad(rowCnt)+"60","", DigitUtil.nf_format(b_qty_tot+""));

		//���ǳ���
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
		//�����հ�
		rowCnt++;
		addWorkItem("2"+lo_lpad(rowCnt)+"10","", "�հ�");
		addWorkItem("2"+lo_lpad(rowCnt)+"20","", "");
		addWorkItem("2"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(a_qty_sum+""));
		addWorkItem("2"+lo_lpad(rowCnt)+"40","", "");
		addWorkItem("2"+lo_lpad(rowCnt)+"50","", DigitUtil.nf_format(b_qty_sum+""));
		addWorkItem("2"+lo_lpad(rowCnt)+"60","", "");
		//���Ǻ��
		addWorkItem("81", "", pDs.remk_a);		

		//�ҳ⳻��
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
		//�ҳ��հ�
		rowCnt++;
		addWorkItem("3"+lo_lpad(rowCnt)+"10","", "�հ�");
		addWorkItem("3"+lo_lpad(rowCnt)+"20","", "");
		addWorkItem("3"+lo_lpad(rowCnt)+"30","", DigitUtil.nf_format(a_qty_sum+""));

		//���
		addWorkItem("82", "", pDs.remk_b);		
		//��������
		addWorkItem("83", "", pDs.remk_c);		
		
	}

    public String lo_lpad(int number)
    {
    	number = number*10;
        DecimalFormat intFormatter = new DecimalFormat("000");
        return intFormatter.format(number);
    }

}
