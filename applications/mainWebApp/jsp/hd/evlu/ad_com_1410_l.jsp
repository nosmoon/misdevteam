<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.com.rec.*,chosun.ciis.ad.com.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_COM_1410_LDataSet ds = (AD_COM_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	
	String errcode = "";
	String errmsg = "";

	resData = rx.add(root, "resData", "");
	gridData = rx.add(resData, "gridData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST1 BEGIN */
//		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_COM_1410_LCURLIST1Record rec = (AD_COM_1410_LCURLIST1Record)ds.curlist1.get(i);
			int curlist1 = rx.add(gridData, "curlist1", "");
			rx.add(curlist1, "cmpy_cd", rec.cmpy_cd);
			rx.add(curlist1, "srch_dt", rec.srch_dt);
			rx.add(curlist1, "seq", rec.seq);
			rx.add(curlist1, "chrg_pers", rec.chrg_pers);
			rx.add(curlist1, "advt_cont", rec.advt_cont);
			rx.add(curlist1, "advt_size", rec.advt_size);
			rx.add(curlist1, "chro_clsf", rec.chro_clsf);
			rx.add(curlist1, "srch_plac", rec.srch_plac);
			rx.add(curlist1, "cntc_plac", rec.cntc_plac);
			rx.add(curlist1, "tm", rec.tm);
			rx.add(curlist1, "agn", rec.agn);
			rx.add(curlist1, "sect_clsf", rec.sect_clsf);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN */
//		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_COM_1410_LCURLIST2Record rec = (AD_COM_1410_LCURLIST2Record)ds.curlist2.get(i);
			int curlist2 = rx.add(gridData, "curlist2", "");
			rx.add(curlist2, "cmpy_cd", rec.cmpy_cd);
			rx.add(curlist2, "cnfm_dt", rec.cnfm_dt);
			rx.add(curlist2, "seq", rec.seq);
			rx.add(curlist2, "pubc_side", rec.pubc_side);
			rx.add(curlist2, "advcs", rec.advcs);
			rx.add(curlist2, "std", rec.std);
			rx.add(curlist2, "slcrg", rec.slcrg);
			rx.add(curlist2, "cnfm_matt", rec.cnfm_matt);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */	

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<cnfm_dt/>
			<seq/>
			<pubc_side/>
			<advcs/>
			<std/>
			<slcrg/>
			<cnfm_matt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<srch_dt/>
			<seq/>
			<chrg_pers/>
			<advt_cont/>
			<advt_size/>
			<chro_clsf/>
			<srch_plac/>
			<cntc_plac/>
			<tm/>
			<agn/>
			<sect_clsf/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 17:44:44 KST 2009 */ %>