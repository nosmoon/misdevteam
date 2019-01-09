<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.mg.rec.*
	,	chosun.ciis.ad.mg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_MG_1010_LDataSet ds = (AD_MG_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {  

		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_MG_1010_LCURLISTRecord rec = (AD_MG_1010_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "work_clsf", "32".equals(rec.work_clsf) ? "신문" : "출판");  
			rx.add(record, "clos_dt", rec.clos_dt); 
			rx.add(record, "mang_frdt", rec.mang_frdt); 
			rx.add(record, "mang_todt", rec.mang_todt);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "totz_yn", rec.totz_yn);
			rx.add(record, "totz", "시작");
			rx.add(record, "deposit_yn", rec.deposit_yn);
			rx.add(record, "deposit", "시작");
			rx.add(record, "agn_eval_yn", rec.agn_eval_yn);
			rx.add(record, "agn_eval", "시작");  
			rx.add(record, "bo_eval_yn", rec.bo_eval_yn);
			rx.add(record, "bo_eval", "시작");
			rx.add(record, "exec_no", rec.exec_no);
			rx.add(record, "basi_dt", rec.basi_dt);
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
