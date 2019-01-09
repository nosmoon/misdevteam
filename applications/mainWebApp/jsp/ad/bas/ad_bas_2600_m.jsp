<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_2600_MDataSet ds = (AD_BAS_2600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	String errcode = "";
	String errmsg = "";

	initData = rx.add(root, "initData", "");
	comboSet = rx.add(initData, "comboSet", "");
	
	errcode = ds.errcode;
	errmsg = ds.errmsg;
	try {
		/****** CURLIST2 BEGIN */
		int team_cd = rx.add( comboSet , "team_cd" , "");
		int item2  = rx.add( team_cd , "item" , "");
		rx.add ( item2, "value", "");	
		rx.add ( item2, "label", "전체");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2600_MCURLIST2Record rec = (AD_BAS_2600_MCURLIST2Record)ds.curlist2.get(i);
			item2  = rx.add( team_cd , "item" , "");
			rx.add ( item2, "value", rec.dept_cd );
			rx.add ( item2, "label", rec.dept_nm);
		}				
		/****** CURLIST2 END */
		
		/****** CURLIST1 BEGIN */
		int medi_cd = rx.add( comboSet , "medi_cd" , "");
		int item1  = rx.add( medi_cd , "item" , "");
		rx.add ( item1, "value", "");	
		rx.add ( item1, "label", "전체");		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_2600_MCURLIST1Record rec = (AD_BAS_2600_MCURLIST1Record)ds.curlist1.get(i);
			item1  = rx.add( team_cd , "item" , "");
			rx.add ( item1, "value", rec.cd );
			rx.add ( item1, "label", rec.cdnm);
		}		
		/****** CURLIST1 END */	
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
			<dept_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 20:35:21 KST 2009 */ %>