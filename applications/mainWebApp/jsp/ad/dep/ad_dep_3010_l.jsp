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
	AD_DEP_3010_LDataSet ds = (AD_DEP_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
		
		//**당월**
		long tot_pubc_amt       = 0;
		long tot_rcpm_amt       = 0;
		double tot_pubc_avg     = 0.0d;
		long tot_misu_amt       = 0;
		long tot_dhon_amt       = 0;
		long tot_tot_amt        = 0;
		double tot_sago_avg     = 0.0d;
		double tot_sil_rcpm_avg = 0.0d;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3010_LCURLISTRecord rec = (AD_DEP_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			tot_pubc_amt += StringUtil.toLong(rec.pubc_amt);
			tot_rcpm_amt += StringUtil.toLong(rec.rcpm_amt);
			
			if(0 != tot_pubc_amt){
				tot_pubc_avg =  ((double)tot_rcpm_amt / (double)tot_pubc_amt) * 100;
			}
			
			tot_misu_amt += StringUtil.toLong(rec.misu_amt);
			tot_dhon_amt += StringUtil.toLong(rec.dhon_amt);
			tot_tot_amt  += StringUtil.toLong(rec.tot_amt);
			
			if(0 != tot_pubc_amt){
				tot_sago_avg = ((double)tot_tot_amt / (double)tot_pubc_amt) * 100;
			}
			
			if(0 != tot_pubc_amt){
				tot_sil_rcpm_avg = 100 - (((double)tot_tot_amt / (double)tot_pubc_amt) * 100 );
			}

			rx.add(record, "gubun", "1".equals(rec.hndl_clsf) ? "외근" : rec.hndl_clsf_nm);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "pubc_avg", DigitUtil.cutUnderPoint(rec.pubc_avg,2));
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "dhon_amt", rec.dhon_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "sago_avg", DigitUtil.cutUnderPoint(rec.sago_avg,2));
			rx.add(record, "sil_rcpm_avg", DigitUtil.cutUnderPoint(rec.sil_rcpm_avg,2));
			
		}
		
		int tot_record1 = rx.add(gridData, "record", "");
		rx.add(tot_record1, "gubun", "합계");
		rx.add(tot_record1, "pubc_amt", tot_pubc_amt);
		rx.add(tot_record1, "rcpm_amt", tot_rcpm_amt);
		rx.add(tot_record1, "pubc_avg", DigitUtil.cutUnderPoint(tot_pubc_avg,2));
		rx.add(tot_record1, "misu_amt", tot_misu_amt);
		rx.add(tot_record1, "dhon_amt", tot_dhon_amt);
		rx.add(tot_record1, "tot_amt", tot_tot_amt);
		rx.add(tot_record1, "sago_avg", DigitUtil.cutUnderPoint(tot_sago_avg,2));
		rx.add(tot_record1, "sil_rcpm_avg", DigitUtil.cutUnderPoint(tot_sil_rcpm_avg,2));
		
		
		
		//**추이(직전 1년간)**
		long tot_pubc_amt2       = 0;
		long tot_rcpm_amt2       = 0;
		double tot_pubc_avg2     = 0.0d;
		long tot_misu_amt2       = 0;
		long tot_dhon_amt2       = 0;
		long tot_tot_amt2        = 0;
		double tot_sago_avg2     = 0.0d;
		double tot_sil_rcpm_avg2 = 0.0d;
		
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_DEP_3010_LCURLIST2Record rec = (AD_DEP_3010_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			
			tot_pubc_amt2 += StringUtil.toLong(rec.pubc_amt);
			tot_rcpm_amt2 += StringUtil.toLong(rec.rcpm_amt);
			
			if(0 != tot_pubc_amt2){
				tot_pubc_avg2 = ((double)tot_rcpm_amt2/(double)tot_pubc_amt2) * 100;
			}
			
			tot_misu_amt2 += StringUtil.toLong(rec.misu_amt);
			tot_dhon_amt2 += StringUtil.toLong(rec.dhon_amt);
			tot_tot_amt2  += StringUtil.toLong(rec.tot_amt);
			
			if(0 != tot_pubc_amt2){
				tot_sago_avg2 = ((double)tot_tot_amt2 / (double)tot_pubc_amt2) * 100;
			}
			
			if(0 != tot_pubc_amt2){
				tot_sil_rcpm_avg2 = 100 - (((double)tot_tot_amt2 / (double)tot_pubc_amt2) * 100 );
			}
			
			rx.add(record, "pubc_yymm", rec.pubc_yymm);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "pubc_avg", DigitUtil.cutUnderPoint(rec.pubc_avg,2));
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "dhon_amt", rec.dhon_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "sago_avg", DigitUtil.cutUnderPoint(rec.sago_avg,2));
			rx.add(record, "sil_rcpm_avg", DigitUtil.cutUnderPoint(rec.sil_rcpm_avg,2));
			
		}
		
		int tot_record2 = rx.add(gridData, "record", "");
		rx.add(tot_record2, "pubc_yymm", "합계");
		rx.add(tot_record2, "pubc_amt", tot_pubc_amt2);
		rx.add(tot_record2, "rcpm_amt", tot_rcpm_amt2);
		rx.add(tot_record2, "pubc_avg", DigitUtil.cutUnderPoint(tot_pubc_avg2,2));
		rx.add(tot_record2, "misu_amt", tot_misu_amt2);
		rx.add(tot_record2, "dhon_amt", tot_dhon_amt2);
		rx.add(tot_record2, "tot_amt", tot_tot_amt2);
		rx.add(tot_record2, "sago_avg", DigitUtil.cutUnderPoint(tot_sago_avg2,2));
		rx.add(tot_record2, "sil_rcpm_avg", DigitUtil.cutUnderPoint(tot_sil_rcpm_avg2,2));
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
