<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	//입금현황-기간별
	RwXml rx = new RwXml();
	AD_DEP_2340_LDataSet ds = (AD_DEP_2340_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData4 = rx.add(root, "resData4", "");
	int gridData = rx.add(resData4, "gridData", "");

	try {  
		
		//게재액 합계 변수 
		long tot_pubc_advt_fee_01 = 0;
		long tot_pubc_advt_fee_02 = 0;
		long tot_pubc_advt_fee_03 = 0;
		long tot_pubc_advt_fee_04 = 0;
		long tot_pubc_advt_fee_05 = 0;
		long tot_pubc_advt_fee_06 = 0;
		long tot_pubc_advt_fee_07 = 0;
		long tot_pubc_advt_fee_08 = 0;
		long tot_pubc_advt_fee_09 = 0;
		long tot_pubc_advt_fee_10 = 0;
		long tot_pubc_advt_fee_11 = 0;
		long tot_pubc_advt_fee_12 = 0;
		long tot_pubc_advt_fee    = 0;
		
		//입금액 합계 변수 
		long tot_rcpm_advt_fee_01 = 0;
		long tot_rcpm_advt_fee_02 = 0;
		long tot_rcpm_advt_fee_03 = 0;
		long tot_rcpm_advt_fee_04 = 0;
		long tot_rcpm_advt_fee_05 = 0;
		long tot_rcpm_advt_fee_06 = 0;
		long tot_rcpm_advt_fee_07 = 0;
		long tot_rcpm_advt_fee_08 = 0;
		long tot_rcpm_advt_fee_09 = 0;
		long tot_rcpm_advt_fee_10 = 0;
		long tot_rcpm_advt_fee_11 = 0;
		long tot_rcpm_advt_fee_12 = 0;
		long tot_rcpm_advt_fee    = 0; 
		
		//잔액 합계 변수 
		long tot_jan_advt_fee_01 = 0;
		long tot_jan_advt_fee_02 = 0;
		long tot_jan_advt_fee_03 = 0;
		long tot_jan_advt_fee_04 = 0;
		long tot_jan_advt_fee_05 = 0;
		long tot_jan_advt_fee_06 = 0;
		long tot_jan_advt_fee_07 = 0;
		long tot_jan_advt_fee_08 = 0;
		long tot_jan_advt_fee_09 = 0;
		long tot_jan_advt_fee_10 = 0;
		long tot_jan_advt_fee_11 = 0;
		long tot_jan_advt_fee_12 = 0;
		long tot_jan_advt_fee    = 0;
		
		//합계 입금율 변수 
		double avg_advt_fee_01 = 0.0d;
		double avg_advt_fee_02 = 0.0d;
		double avg_advt_fee_03 = 0.0d;
		double avg_advt_fee_04 = 0.0d;
		double avg_advt_fee_05 = 0.0d;
		double avg_advt_fee_06 = 0.0d;
		double avg_advt_fee_07 = 0.0d;
		double avg_advt_fee_08 = 0.0d;
		double avg_advt_fee_09 = 0.0d;
		double avg_advt_fee_10 = 0.0d;
		double avg_advt_fee_11 = 0.0d;
		double avg_advt_fee_12 = 0.0d;
		double avg_advt_fee    = 0.0d;
		
		for(int i = 0; i<ds.curlist.size(); i += 2) {
			AD_DEP_2340_LCURLISTRecord pubc_rec = (AD_DEP_2340_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			//게재액 
			rx.add(record, "medi_nm", pubc_rec.medi_nm);
			rx.add(record, "gubun", pubc_rec.gubun);
			rx.add(record, "advt_fee_01", pubc_rec.advt_fee_01);
			rx.add(record, "advt_fee_02", pubc_rec.advt_fee_02);
			rx.add(record, "advt_fee_03", pubc_rec.advt_fee_03);
			rx.add(record, "advt_fee_04", pubc_rec.advt_fee_04);
			rx.add(record, "advt_fee_05", pubc_rec.advt_fee_05);
			rx.add(record, "advt_fee_06", pubc_rec.advt_fee_06);
			rx.add(record, "advt_fee_07", pubc_rec.advt_fee_07);
			rx.add(record, "advt_fee_08", pubc_rec.advt_fee_08);
			rx.add(record, "advt_fee_09", pubc_rec.advt_fee_09);
			rx.add(record, "advt_fee_10", pubc_rec.advt_fee_10);
			rx.add(record, "advt_fee_11", pubc_rec.advt_fee_11);
			rx.add(record, "advt_fee_12", pubc_rec.advt_fee_12);
			rx.add(record, "advt_fee_tot", pubc_rec.advt_fee_tot);
			
			//게재액 합계 			
			tot_pubc_advt_fee_01 += StringUtil.toLong(pubc_rec.advt_fee_01);
			tot_pubc_advt_fee_02 += StringUtil.toLong(pubc_rec.advt_fee_02);
			tot_pubc_advt_fee_03 += StringUtil.toLong(pubc_rec.advt_fee_03);
			tot_pubc_advt_fee_04 += StringUtil.toLong(pubc_rec.advt_fee_04);
			tot_pubc_advt_fee_05 += StringUtil.toLong(pubc_rec.advt_fee_05);
			tot_pubc_advt_fee_06 += StringUtil.toLong(pubc_rec.advt_fee_06);
			tot_pubc_advt_fee_07 += StringUtil.toLong(pubc_rec.advt_fee_07);
			tot_pubc_advt_fee_08 += StringUtil.toLong(pubc_rec.advt_fee_08);
			tot_pubc_advt_fee_09 += StringUtil.toLong(pubc_rec.advt_fee_09);
			tot_pubc_advt_fee_10 += StringUtil.toLong(pubc_rec.advt_fee_10);
			tot_pubc_advt_fee_11 += StringUtil.toLong(pubc_rec.advt_fee_11);
			tot_pubc_advt_fee_12 += StringUtil.toLong(pubc_rec.advt_fee_12);
			tot_pubc_advt_fee    += StringUtil.toLong(pubc_rec.advt_fee_tot);		
			
			
			AD_DEP_2340_LCURLISTRecord rcpm_rec = (AD_DEP_2340_LCURLISTRecord)ds.curlist.get(i+1);

			record = rx.add(gridData, "record", "");
			//입금액 
			rx.add(record, "medi_nm", rcpm_rec.medi_nm);
			rx.add(record, "gubun", rcpm_rec.gubun);
			rx.add(record, "advt_fee_01", rcpm_rec.advt_fee_01);
			rx.add(record, "advt_fee_02", rcpm_rec.advt_fee_02);
			rx.add(record, "advt_fee_03", rcpm_rec.advt_fee_03);
			rx.add(record, "advt_fee_04", rcpm_rec.advt_fee_04);
			rx.add(record, "advt_fee_05", rcpm_rec.advt_fee_05);
			rx.add(record, "advt_fee_06", rcpm_rec.advt_fee_06);
			rx.add(record, "advt_fee_07", rcpm_rec.advt_fee_07);
			rx.add(record, "advt_fee_08", rcpm_rec.advt_fee_08);
			rx.add(record, "advt_fee_09", rcpm_rec.advt_fee_09);
			rx.add(record, "advt_fee_10", rcpm_rec.advt_fee_10);
			rx.add(record, "advt_fee_11", rcpm_rec.advt_fee_11);
			rx.add(record, "advt_fee_12", rcpm_rec.advt_fee_12);
			rx.add(record, "advt_fee_tot", rcpm_rec.advt_fee_tot);
			
			//입금액 합계 			
			tot_rcpm_advt_fee_01 += StringUtil.toLong(rcpm_rec.advt_fee_01);
			tot_rcpm_advt_fee_02 += StringUtil.toLong(rcpm_rec.advt_fee_02);
			tot_rcpm_advt_fee_03 += StringUtil.toLong(rcpm_rec.advt_fee_03);
			tot_rcpm_advt_fee_04 += StringUtil.toLong(rcpm_rec.advt_fee_04);
			tot_rcpm_advt_fee_05 += StringUtil.toLong(rcpm_rec.advt_fee_05);
			tot_rcpm_advt_fee_06 += StringUtil.toLong(rcpm_rec.advt_fee_06);
			tot_rcpm_advt_fee_07 += StringUtil.toLong(rcpm_rec.advt_fee_07);
			tot_rcpm_advt_fee_08 += StringUtil.toLong(rcpm_rec.advt_fee_08);
			tot_rcpm_advt_fee_09 += StringUtil.toLong(rcpm_rec.advt_fee_09);
			tot_rcpm_advt_fee_10 += StringUtil.toLong(rcpm_rec.advt_fee_10);
			tot_rcpm_advt_fee_11 += StringUtil.toLong(rcpm_rec.advt_fee_11);
			tot_rcpm_advt_fee_12 += StringUtil.toLong(rcpm_rec.advt_fee_12);
			tot_rcpm_advt_fee    += StringUtil.toLong(rcpm_rec.advt_fee_tot);
			
			record = rx.add(gridData, "record", "");
			
			//잔액 계산
			String jan_advt_fee_01 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_01) - StringUtil.toLong(rcpm_rec.advt_fee_01));
			String jan_advt_fee_02 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_02) - StringUtil.toLong(rcpm_rec.advt_fee_02));
			String jan_advt_fee_03 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_03) - StringUtil.toLong(rcpm_rec.advt_fee_03));
			String jan_advt_fee_04 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_04) - StringUtil.toLong(rcpm_rec.advt_fee_04));
			String jan_advt_fee_05 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_05) - StringUtil.toLong(rcpm_rec.advt_fee_05));
			String jan_advt_fee_06 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_06) - StringUtil.toLong(rcpm_rec.advt_fee_06));
			String jan_advt_fee_07 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_07) - StringUtil.toLong(rcpm_rec.advt_fee_07));
			String jan_advt_fee_08 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_08) - StringUtil.toLong(rcpm_rec.advt_fee_08));
			String jan_advt_fee_09 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_09) - StringUtil.toLong(rcpm_rec.advt_fee_09));
			String jan_advt_fee_10 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_10) - StringUtil.toLong(rcpm_rec.advt_fee_10));
			String jan_advt_fee_11 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_11) - StringUtil.toLong(rcpm_rec.advt_fee_11));
			String jan_advt_fee_12 = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_12) - StringUtil.toLong(rcpm_rec.advt_fee_12));
			String jan_advt_fee_tot = String.valueOf(StringUtil.toLong(pubc_rec.advt_fee_tot) - StringUtil.toLong(rcpm_rec.advt_fee_tot));
			
			//잔액합계 계산 
			tot_jan_advt_fee_01 += StringUtil.toLong(jan_advt_fee_01);
			tot_jan_advt_fee_02 += StringUtil.toLong(jan_advt_fee_02);
			tot_jan_advt_fee_03 += StringUtil.toLong(jan_advt_fee_03);
			tot_jan_advt_fee_04 += StringUtil.toLong(jan_advt_fee_04);
			tot_jan_advt_fee_05 += StringUtil.toLong(jan_advt_fee_05);
			tot_jan_advt_fee_06 += StringUtil.toLong(jan_advt_fee_06);
			tot_jan_advt_fee_07 += StringUtil.toLong(jan_advt_fee_07);
			tot_jan_advt_fee_08 += StringUtil.toLong(jan_advt_fee_08);
			tot_jan_advt_fee_09 += StringUtil.toLong(jan_advt_fee_09);
			tot_jan_advt_fee_10 += StringUtil.toLong(jan_advt_fee_10);
			tot_jan_advt_fee_11 += StringUtil.toLong(jan_advt_fee_11);
			tot_jan_advt_fee_12 += StringUtil.toLong(jan_advt_fee_12);			
			tot_jan_advt_fee    += StringUtil.toLong(jan_advt_fee_tot);
			
			//null처리 
			if("0".equals(jan_advt_fee_01))jan_advt_fee_01 = "";
			if("0".equals(jan_advt_fee_02))jan_advt_fee_02 = "";
			if("0".equals(jan_advt_fee_03))jan_advt_fee_03 = "";
			if("0".equals(jan_advt_fee_04))jan_advt_fee_04 = "";
			if("0".equals(jan_advt_fee_05))jan_advt_fee_05 = "";
			if("0".equals(jan_advt_fee_06))jan_advt_fee_06 = "";
			if("0".equals(jan_advt_fee_07))jan_advt_fee_07 = "";
			if("0".equals(jan_advt_fee_08))jan_advt_fee_08 = "";
			if("0".equals(jan_advt_fee_09))jan_advt_fee_09 = "";
			if("0".equals(jan_advt_fee_10))jan_advt_fee_10 = "";
			if("0".equals(jan_advt_fee_11))jan_advt_fee_11 = "";
			if("0".equals(jan_advt_fee_12))jan_advt_fee_12 = "";
			if("0".equals(jan_advt_fee_tot))jan_advt_fee_tot = "";
			//잔액 셋팅 			
			rx.add(record, "medi_nm", rcpm_rec.medi_nm);
			rx.add(record, "gubun", "잔   액");
			rx.add(record, "advt_fee_01", jan_advt_fee_01);
			rx.add(record, "advt_fee_02", jan_advt_fee_02);
			rx.add(record, "advt_fee_03", jan_advt_fee_03);
			rx.add(record, "advt_fee_04", jan_advt_fee_04);
			rx.add(record, "advt_fee_05", jan_advt_fee_05);
			rx.add(record, "advt_fee_06", jan_advt_fee_06);
			rx.add(record, "advt_fee_07", jan_advt_fee_07);
			rx.add(record, "advt_fee_08", jan_advt_fee_08);
			rx.add(record, "advt_fee_09", jan_advt_fee_09);
			rx.add(record, "advt_fee_10", jan_advt_fee_10);
			rx.add(record, "advt_fee_11", jan_advt_fee_11);
			rx.add(record, "advt_fee_12", jan_advt_fee_12);
			rx.add(record, "advt_fee_tot", jan_advt_fee_tot);
			
			//입금율 계산 && null처리 
			String avg_rcpm_fee_01 = StringUtil.toDouble(pubc_rec.advt_fee_01) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_01)/StringUtil.toDouble(pubc_rec.advt_fee_01))*100);
			String avg_rcpm_fee_02 = StringUtil.toDouble(pubc_rec.advt_fee_02) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_02)/StringUtil.toDouble(pubc_rec.advt_fee_02))*100);
			String avg_rcpm_fee_03 = StringUtil.toDouble(pubc_rec.advt_fee_03) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_03)/StringUtil.toDouble(pubc_rec.advt_fee_03))*100);
			String avg_rcpm_fee_04 = StringUtil.toDouble(pubc_rec.advt_fee_04) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_04)/StringUtil.toDouble(pubc_rec.advt_fee_04))*100);
			String avg_rcpm_fee_05 = StringUtil.toDouble(pubc_rec.advt_fee_05) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_05)/StringUtil.toDouble(pubc_rec.advt_fee_05))*100);
			String avg_rcpm_fee_06 = StringUtil.toDouble(pubc_rec.advt_fee_06) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_06)/StringUtil.toDouble(pubc_rec.advt_fee_06))*100);
			String avg_rcpm_fee_07 = StringUtil.toDouble(pubc_rec.advt_fee_07) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_07)/StringUtil.toDouble(pubc_rec.advt_fee_07))*100);
			String avg_rcpm_fee_08 = StringUtil.toDouble(pubc_rec.advt_fee_08) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_08)/StringUtil.toDouble(pubc_rec.advt_fee_08))*100);
			String avg_rcpm_fee_09 = StringUtil.toDouble(pubc_rec.advt_fee_09) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_09)/StringUtil.toDouble(pubc_rec.advt_fee_09))*100);
			String avg_rcpm_fee_10 = StringUtil.toDouble(pubc_rec.advt_fee_10) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_10)/StringUtil.toDouble(pubc_rec.advt_fee_10))*100);
			String avg_rcpm_fee_11 = StringUtil.toDouble(pubc_rec.advt_fee_11) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_11)/StringUtil.toDouble(pubc_rec.advt_fee_11))*100);
			String avg_rcpm_fee_12 = StringUtil.toDouble(pubc_rec.advt_fee_12) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_12)/StringUtil.toDouble(pubc_rec.advt_fee_12))*100);
			String avg_rcpm_fee_tot = StringUtil.toDouble(pubc_rec.advt_fee_tot) == 0 ? "" : String.valueOf((double)(StringUtil.toDouble(rcpm_rec.advt_fee_tot)/StringUtil.toDouble(pubc_rec.advt_fee_tot))*100);
			
			record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_nm", rcpm_rec.medi_nm);
			rx.add(record, "gubun", "입금율");
			rx.add(record, "advt_fee_01", DigitUtil.cutUnderPoint(avg_rcpm_fee_01,2));
			rx.add(record, "advt_fee_02", DigitUtil.cutUnderPoint(avg_rcpm_fee_02,2));
			rx.add(record, "advt_fee_03", DigitUtil.cutUnderPoint(avg_rcpm_fee_03,2));
			rx.add(record, "advt_fee_04", DigitUtil.cutUnderPoint(avg_rcpm_fee_04,2));
			rx.add(record, "advt_fee_05", DigitUtil.cutUnderPoint(avg_rcpm_fee_05,2));
			rx.add(record, "advt_fee_06", DigitUtil.cutUnderPoint(avg_rcpm_fee_06,2));
			rx.add(record, "advt_fee_07", DigitUtil.cutUnderPoint(avg_rcpm_fee_07,2));
			rx.add(record, "advt_fee_08", DigitUtil.cutUnderPoint(avg_rcpm_fee_08,2));
			rx.add(record, "advt_fee_09", DigitUtil.cutUnderPoint(avg_rcpm_fee_09,2));
			rx.add(record, "advt_fee_10", DigitUtil.cutUnderPoint(avg_rcpm_fee_10,2));
			rx.add(record, "advt_fee_11", DigitUtil.cutUnderPoint(avg_rcpm_fee_11,2));
			rx.add(record, "advt_fee_12", DigitUtil.cutUnderPoint(avg_rcpm_fee_12,2));
			rx.add(record, "advt_fee_tot", DigitUtil.cutUnderPoint(avg_rcpm_fee_tot,2));
			
		}
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "medi_nm", "합계");
		rx.add(record, "gubun",   "게재액");
		rx.add(record, "advt_fee_01", tot_pubc_advt_fee_01 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_01));
		rx.add(record, "advt_fee_02", tot_pubc_advt_fee_02 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_02));
		rx.add(record, "advt_fee_03", tot_pubc_advt_fee_03 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_03));
		rx.add(record, "advt_fee_04", tot_pubc_advt_fee_04 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_04));
		rx.add(record, "advt_fee_05", tot_pubc_advt_fee_05 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_05));
		rx.add(record, "advt_fee_06", tot_pubc_advt_fee_06 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_06));
		rx.add(record, "advt_fee_07", tot_pubc_advt_fee_07 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_07));
		rx.add(record, "advt_fee_08", tot_pubc_advt_fee_08 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_08));
		rx.add(record, "advt_fee_09", tot_pubc_advt_fee_09 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_09));
		rx.add(record, "advt_fee_10", tot_pubc_advt_fee_10 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_10));
		rx.add(record, "advt_fee_11", tot_pubc_advt_fee_11 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_11));
		rx.add(record, "advt_fee_12", tot_pubc_advt_fee_12 == 0 ? "" : String.valueOf(tot_pubc_advt_fee_12));
		rx.add(record, "advt_fee_tot", tot_pubc_advt_fee == 0 ? "" : String.valueOf(tot_pubc_advt_fee));
		
		record = rx.add(gridData, "record", "");
		
		rx.add(record, "medi_nm", "합계");
		rx.add(record, "gubun",   "입금액");
		rx.add(record, "advt_fee_01", tot_rcpm_advt_fee_01 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_01));
		rx.add(record, "advt_fee_02", tot_rcpm_advt_fee_02 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_02));
		rx.add(record, "advt_fee_03", tot_rcpm_advt_fee_03 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_03));
		rx.add(record, "advt_fee_04", tot_rcpm_advt_fee_04 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_04));
		rx.add(record, "advt_fee_05", tot_rcpm_advt_fee_05 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_05));
		rx.add(record, "advt_fee_06", tot_rcpm_advt_fee_06 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_06));
		rx.add(record, "advt_fee_07", tot_rcpm_advt_fee_07 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_07));
		rx.add(record, "advt_fee_08", tot_rcpm_advt_fee_08 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_08));
		rx.add(record, "advt_fee_09", tot_rcpm_advt_fee_09 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_09));
		rx.add(record, "advt_fee_10", tot_rcpm_advt_fee_10 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_10));
		rx.add(record, "advt_fee_11", tot_rcpm_advt_fee_11 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_11));
		rx.add(record, "advt_fee_12", tot_rcpm_advt_fee_12 == 0 ? "" : String.valueOf(tot_rcpm_advt_fee_12));
		rx.add(record, "advt_fee_tot", tot_rcpm_advt_fee == 0 ? "" : String.valueOf(tot_rcpm_advt_fee));
		
		record = rx.add(gridData, "record", "");
		
		rx.add(record, "medi_nm", "합계");
		rx.add(record, "gubun",   "잔   액");
		rx.add(record, "advt_fee_01", tot_jan_advt_fee_01 == 0 ? "" : String.valueOf(tot_jan_advt_fee_01));
		rx.add(record, "advt_fee_02", tot_jan_advt_fee_02 == 0 ? "" : String.valueOf(tot_jan_advt_fee_02));
		rx.add(record, "advt_fee_03", tot_jan_advt_fee_03 == 0 ? "" : String.valueOf(tot_jan_advt_fee_03));
		rx.add(record, "advt_fee_04", tot_jan_advt_fee_04 == 0 ? "" : String.valueOf(tot_jan_advt_fee_04));
		rx.add(record, "advt_fee_05", tot_jan_advt_fee_05 == 0 ? "" : String.valueOf(tot_jan_advt_fee_05));
		rx.add(record, "advt_fee_06", tot_jan_advt_fee_06 == 0 ? "" : String.valueOf(tot_jan_advt_fee_06));
		rx.add(record, "advt_fee_07", tot_jan_advt_fee_07 == 0 ? "" : String.valueOf(tot_jan_advt_fee_07));
		rx.add(record, "advt_fee_08", tot_jan_advt_fee_08 == 0 ? "" : String.valueOf(tot_jan_advt_fee_08));
		rx.add(record, "advt_fee_09", tot_jan_advt_fee_09 == 0 ? "" : String.valueOf(tot_jan_advt_fee_09));
		rx.add(record, "advt_fee_10", tot_jan_advt_fee_10 == 0 ? "" : String.valueOf(tot_jan_advt_fee_10));
		rx.add(record, "advt_fee_11", tot_jan_advt_fee_11 == 0 ? "" : String.valueOf(tot_jan_advt_fee_11));
		rx.add(record, "advt_fee_12", tot_jan_advt_fee_12 == 0 ? "" : String.valueOf(tot_jan_advt_fee_12));
		rx.add(record, "advt_fee_tot", tot_jan_advt_fee == 0 ? "" : String.valueOf(tot_jan_advt_fee));
		
		record = rx.add(gridData, "record", "");
		
		//합계율 계산 		
		String avg_tot_advt_fee_01 = (double)tot_pubc_advt_fee_01 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_01/(double)tot_pubc_advt_fee_01)*100);
		String avg_tot_advt_fee_02 = (double)tot_pubc_advt_fee_02 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_02/(double)tot_pubc_advt_fee_02)*100);
		String avg_tot_advt_fee_03 = (double)tot_pubc_advt_fee_03 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_03/(double)tot_pubc_advt_fee_03)*100);
		String avg_tot_advt_fee_04 = (double)tot_pubc_advt_fee_04 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_04/(double)tot_pubc_advt_fee_04)*100);
		String avg_tot_advt_fee_05 = (double)tot_pubc_advt_fee_05 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_05/(double)tot_pubc_advt_fee_05)*100);
		String avg_tot_advt_fee_06 = (double)tot_pubc_advt_fee_06 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_06/(double)tot_pubc_advt_fee_06)*100);
		String avg_tot_advt_fee_07 = (double)tot_pubc_advt_fee_07 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_07/(double)tot_pubc_advt_fee_07)*100);
		String avg_tot_advt_fee_08 = (double)tot_pubc_advt_fee_08 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_08/(double)tot_pubc_advt_fee_08)*100);
		String avg_tot_advt_fee_09 = (double)tot_pubc_advt_fee_09 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_09/(double)tot_pubc_advt_fee_09)*100);
		String avg_tot_advt_fee_10 = (double)tot_pubc_advt_fee_10 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_10/(double)tot_pubc_advt_fee_10)*100);
		String avg_tot_advt_fee_11 = (double)tot_pubc_advt_fee_11 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_11/(double)tot_pubc_advt_fee_11)*100);
		String avg_tot_advt_fee_12 = (double)tot_pubc_advt_fee_12 == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee_12/(double)tot_pubc_advt_fee_12)*100);
		String avg_tot_advt_fee_00 = (double)tot_rcpm_advt_fee == 0 ? "" : String.valueOf(((double)tot_rcpm_advt_fee/(double)tot_pubc_advt_fee)*100);
		
		rx.add(record, "medi_nm", "합계");
		rx.add(record, "gubun",   "입금율");
		rx.add(record, "advt_fee_01", DigitUtil.cutUnderPoint(avg_tot_advt_fee_01,2));
		rx.add(record, "advt_fee_02", DigitUtil.cutUnderPoint(avg_tot_advt_fee_02,2));
		rx.add(record, "advt_fee_03", DigitUtil.cutUnderPoint(avg_tot_advt_fee_03,2));
		rx.add(record, "advt_fee_04", DigitUtil.cutUnderPoint(avg_tot_advt_fee_04,2));
		rx.add(record, "advt_fee_05", DigitUtil.cutUnderPoint(avg_tot_advt_fee_05,2));
		rx.add(record, "advt_fee_06", DigitUtil.cutUnderPoint(avg_tot_advt_fee_06,2));
		rx.add(record, "advt_fee_07", DigitUtil.cutUnderPoint(avg_tot_advt_fee_07,2));
		rx.add(record, "advt_fee_08", DigitUtil.cutUnderPoint(avg_tot_advt_fee_08,2));
		rx.add(record, "advt_fee_09", DigitUtil.cutUnderPoint(avg_tot_advt_fee_09,2));
		rx.add(record, "advt_fee_10", DigitUtil.cutUnderPoint(avg_tot_advt_fee_10,2));
		rx.add(record, "advt_fee_11", DigitUtil.cutUnderPoint(avg_tot_advt_fee_11,2));
		rx.add(record, "advt_fee_12", DigitUtil.cutUnderPoint(avg_tot_advt_fee_12,2));
		rx.add(record, "advt_fee_tot", DigitUtil.cutUnderPoint(avg_tot_advt_fee_00,2));
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
