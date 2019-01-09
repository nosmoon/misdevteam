<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2800_MDataSet ds = (AD_BAS_2800_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		//팀
		int team_cd = rx.add( tempData , "team_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_BAS_2800_MCURLIST1Record rec = (AD_BAS_2800_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( team_cd , "item" , "");
			rx.add ( item, "value", rec.dept_cd );
			rx.add ( item, "label", i+1 +" "+ rec.dept_nm);
			
		}	
		//파트
		int part_cd = rx.add( tempData , "part_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_BAS_2800_MCURLIST2Record rec = (AD_BAS_2800_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( part_cd , "item" , "");
			rx.add ( item, "value", rec.part_cd );
			rx.add ( item, "label", i+1 +" "+ rec.part_nm);
			
		}	
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>