<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_2720_LDataSet ds = (AD_BAS_2720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData2 = 0;
	int gridData2 = 0;
	
	String errcode = "";
	String errmsg = "";

	resData2 = rx.add(root, "resData2", "");
	gridData2 = rx.add(resData2, "gridData2", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2720_LCURLISTRecord rec = (AD_BAS_2720_LCURLISTRecord)ds.curlist.get(i);
			int curlist2 = rx.add(gridData2, "curlist2", "");
			rx.add(curlist2, "cmpy_cd", rec.cmpy_cd);
			rx.add(curlist2, "medi_clsf", rec.medi_clsf);
			rx.add(curlist2, "part_nm", rec.part_nm);
			rx.add(curlist2, "acct_id", rec.acct_id);
			rx.add(curlist2, "acct_nm", rec.acct_nm);
			rx.add(curlist2, "posi_nm", rec.posi_nm);
			rx.add(curlist2, "part_posi", rec.part_posi);  
			rx.add(curlist2, "chrg_clsf", rec.chrg_clsf);  
			rx.add(curlist2, "chrg_medi", rec.chrg_medi);  
			rx.add(curlist2, "frdt", rec.frdt);
			rx.add(curlist2, "todt", rec.todt);
			rx.add(curlist2, "alt_team_pers_nm", rec.alt_team_pers_nm);
			rx.add(curlist2, "alt_chrg_pers_nm", rec.alt_chrg_pers_nm);
			rx.add(curlist2, "part_cd", rec.part_cd);
			rx.add(curlist2, "seq", rec.seq);
			rx.add(curlist2, "alt_chrg_pers", rec.alt_chrg_pers);
			rx.add(curlist2, "alt_team_pers", rec.alt_team_pers);
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
			<part_cd/>
			<acct_id/>
			<seq/>
			<part_posi/>
			<chrg_clsf/>
			<frdt/>
			<todt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 20:44:26 KST 2009 */ %>