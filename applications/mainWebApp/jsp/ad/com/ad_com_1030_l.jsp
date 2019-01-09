<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.com.rec.*,chosun.ciis.ad.com.ds.*, somo.framework.util.* " %>


<%
	RwXml rx = new RwXml();
	AD_COM_1030_LDataSet ds = (AD_COM_1030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;

	String errcode = "";
	String errmsg = "";
	
	resData = rx.add(root, "resData", "");

	
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
		
			int gridData = rx.add(resData, "gridData", "");
			
			AD_COM_1030_LCURLISTRecord rec = (AD_COM_1030_LCURLISTRecord)ds.curlist.get(i);

			rx.add(gridData, "cmpy_cd", rec.cmpy_cd);
			rx.add(gridData, "medi_clsf", rec.medi_clsf);
			rx.add(gridData, "cntc_seq", rec.cntc_seq);
			rx.add(gridData, "answer_seq", rec.answer_seq);
			rx.add(gridData, "answer_pers", rec.answer_pers);
			rx.add(gridData, "answer_cont", rec.answer_cont);
			rx.add(gridData, "add_file_nm", rec.add_file_nm);
			rx.add(gridData, "answer_dt", rec.answer_dt);
			rx.add(gridData, "team_cd", rec.team_cd);
			rx.add(gridData, "part_cd", rec.part_cd);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<medi_clsf/>
			<cntc_seq/>
			<answer_seq/>
			<answer_pers/>
			<answer_cont/>
			<add_file_nm/>
			<answer_dt/>
			<team_cd/>
			<part_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jan 23 14:11:28 KST 2009 */ %>