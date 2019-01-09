<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%--

	RwXml rx = new RwXml();
	CO_SMTB_1075_MDataSet ds = (CO_SMTB_1075_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	

	try {
			//int item  = rx.add( hndl_clsf , "item" , "");
			//rx.add ( item, "value", rec.cd );
			//rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		//int regno = rx.add( tempData , "regno" , "");
		
--%>

<% /* 작성시간 : Thu Dec 22 10:02:36 KST 2011 */ %>