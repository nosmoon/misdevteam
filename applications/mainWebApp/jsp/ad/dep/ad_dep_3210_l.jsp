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
	RwXml rx = new RwXml();
	AD_DEP_3210_LDataSet ds = (AD_DEP_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
	
		//���������� 
		double avg_note3    = 0.0d;
		double avg_note4    = 0.0d;
		double avg_note5    = 0.0d;
		double avg_note6    = 0.0d;
		double avg_note_amt = 0.0d;
		//�Աݱ�����
		double avg_cash_amt    = 0.0d;
		double avg_rcpm3       = 0.0d;
		double avg_rcpm4       = 0.0d;
		double avg_rcpm5       = 0.0d;
		double avg_rcpm6       = 0.0d;
		double avg_rcpm_amt    = 0.0d;
		double avg_fee_amt     = 0.0d;
		double avg_etc_amt     = 0.0d;
		double avg_tot_amt     = 0.0d;
		//���(����,����,�Ұ�)
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3210_LCURLISTRecord rec = (AD_DEP_3210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "gubun",    "�ݾ�");
			rx.add(record, "cash_amt", rec.cash_amt);
			rx.add(record, "note3",    rec.note3);
			rx.add(record, "note4",    rec.note4);
			rx.add(record, "note5",    rec.note5);
			rx.add(record, "note6",    rec.note6);
			rx.add(record, "note_amt", rec.note_amt);
			
			//���������� = (�ݾ�/�Ұ�)*100
			if(!"0".equals(rec.note_amt)){
				avg_note3    = (StringUtil.toDouble(rec.note3)    / StringUtil.toDouble(rec.note_amt)) * 100;
				avg_note4    = (StringUtil.toDouble(rec.note4)    / StringUtil.toDouble(rec.note_amt)) * 100;
				avg_note5    = (StringUtil.toDouble(rec.note5)    / StringUtil.toDouble(rec.note_amt)) * 100;
				avg_note6    = (StringUtil.toDouble(rec.note5)    / StringUtil.toDouble(rec.note_amt)) * 100;
				avg_note_amt = (StringUtil.toDouble(rec.note_amt) / StringUtil.toDouble(rec.note_amt)) * 100;
		    }
		    //�Աݱ����� = (�ݾ�/�Ѱ�)*100
		    if(!"0".equals(rec.tot_amt)){
		    	avg_cash_amt    = (StringUtil.toDouble(rec.cash_amt) / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_rcpm3       = (StringUtil.toDouble(rec.note3)    / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_rcpm4       = (StringUtil.toDouble(rec.note4)    / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_rcpm5       = (StringUtil.toDouble(rec.note5)    / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_rcpm6       = (StringUtil.toDouble(rec.note6)    / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_rcpm_amt    = (StringUtil.toDouble(rec.note_amt) / StringUtil.toDouble(rec.tot_amt)) * 100;
		    }
		}
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "gubun", "����������(%)");
		rx.add(record, "cash_amt", "");
		rx.add(record, "note3", DigitUtil.cutUnderPoint(avg_note3,1));
		rx.add(record, "note4", DigitUtil.cutUnderPoint(avg_note4,1));
		rx.add(record, "note5", DigitUtil.cutUnderPoint(avg_note5,1));
		rx.add(record, "note6", DigitUtil.cutUnderPoint(avg_note6,1));
		rx.add(record, "note_amt", DigitUtil.cutUnderPoint(avg_note_amt,1));
		
		record = rx.add(gridData, "record", "");
		
		rx.add(record, "gubun", "�Աݱ�����(%)");
		rx.add(record, "cash_amt", DigitUtil.cutUnderPoint(avg_cash_amt,1));
		rx.add(record, "note3", DigitUtil.cutUnderPoint(avg_rcpm3,1));
		rx.add(record, "note4", DigitUtil.cutUnderPoint(avg_rcpm4,1));
		rx.add(record, "note5", DigitUtil.cutUnderPoint(avg_rcpm5,1));
		rx.add(record, "note6", DigitUtil.cutUnderPoint(avg_rcpm6,1));
		rx.add(record, "note_amt", DigitUtil.cutUnderPoint(avg_rcpm_amt,1));
		
		//���(������ü,��Ÿ,�հ�)
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3210_LCURLISTRecord rec = (AD_DEP_3210_LCURLISTRecord)ds.curlist.get(i);
			int record2 = rx.add(gridData, "record2", "");

			rx.add(record2, "gubun", "�ݾ�");
			rx.add(record2, "fee", rec.fee);
			rx.add(record2, "etc_amt", rec.etc_amt);
			rx.add(record2, "tot_amt", rec.tot_amt);
			
			//�Աݱ�������
		    if(!"0".equals(rec.tot_amt)){
		    	avg_fee_amt    = (StringUtil.toDouble(rec.fee) / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_etc_amt    = (StringUtil.toDouble(rec.etc_amt) / StringUtil.toDouble(rec.tot_amt)) * 100;
		    	avg_tot_amt    = (StringUtil.toDouble(rec.tot_amt) / StringUtil.toDouble(rec.tot_amt)) * 100;
		    }

		}
		
		int record2 = rx.add(gridData, "record2", "");
		
		rx.add(record2, "gubun", "�Աݱ�����(%)");
		rx.add(record2, "fee", DigitUtil.cutUnderPoint(avg_fee_amt,1));
		rx.add(record2, "etc_amt", DigitUtil.cutUnderPoint(avg_etc_amt,1));
		rx.add(record2, "tot_amt", DigitUtil.cutUnderPoint(avg_tot_amt,1));
		
		//����(�Աݱ�����)
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_DEP_3210_LCURLIST2Record rec = (AD_DEP_3210_LCURLIST2Record)ds.curlist2.get(i);
			int record3 = rx.add(gridData, "record3", "");
			
			double avg_cash_amt2 = 0.0d;
			double avg_note3_amt = 0.0d;
			double avg_note4_amt = 0.0d;
			double avg_note5_amt = 0.0d;
			double avg_note6_amt = 0.0d;
			double avg_note_amt2 = 0.0d;
			double avg_fee_amt2  = 0.0d;
			double avg_etc_amt2  = 0.0d;
			double avg_tot_amt2  = 0.0d;
			
			if(!"0".equals(rec.tot_amt)){
				avg_cash_amt2 = (StringUtil.toDouble(rec.cash_amt)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_note3_amt = (StringUtil.toDouble(rec.note3)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_note4_amt = (StringUtil.toDouble(rec.note4)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_note5_amt = (StringUtil.toDouble(rec.note5)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_note6_amt = (StringUtil.toDouble(rec.note6)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_note_amt2 = (StringUtil.toDouble(rec.note_amt)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_fee_amt2  = (StringUtil.toDouble(rec.fee)/StringUtil.toDouble(rec.tot_amt)) * 100;
				avg_etc_amt2  = (StringUtil.toDouble(rec.etc_amt)/StringUtil.toDouble(rec.tot_amt)) * 100; 
				avg_tot_amt2  = (StringUtil.toDouble(rec.tot_amt)/StringUtil.toDouble(rec.tot_amt)) * 100;
			}
			
			rx.add(record3, "gubun1", rec.rcpm_yymm.substring(0,4));
			rx.add(record3, "gubun2", "13".equals(rec.rcpm_yymm.substring(4,6)) ? "���":rec.rcpm_yymm.substring(4,6));
			rx.add(record3, "cash_amt", DigitUtil.cutUnderPoint(avg_cash_amt2,1));
            rx.add(record3, "note3", DigitUtil.cutUnderPoint(avg_note3_amt,1));
            rx.add(record3, "note4", DigitUtil.cutUnderPoint(avg_note4_amt,1));
            rx.add(record3, "note5", DigitUtil.cutUnderPoint(avg_note5_amt,1));
            rx.add(record3, "note6", DigitUtil.cutUnderPoint(avg_note6_amt,1));
            rx.add(record3, "note_amt", DigitUtil.cutUnderPoint(avg_note_amt2,1));
            rx.add(record3, "fee", DigitUtil.cutUnderPoint(avg_fee_amt2,1));
			rx.add(record3, "etc_amt", DigitUtil.cutUnderPoint(avg_etc_amt2,1));
			rx.add(record3, "tot_amt", DigitUtil.cutUnderPoint(avg_tot_amt2,1));

		}
		
		
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
