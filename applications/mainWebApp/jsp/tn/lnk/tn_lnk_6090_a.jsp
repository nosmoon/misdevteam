<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_6090_ADataSet ds = (TN_LNK_6090_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	int mobApplyResult    = rx.add(root, "mobApplyResult", "");
	rx.add(mobApplyResult, "header",		ds.header_result);	//HEADER RECORD RESULT
	rx.add(mobApplyResult, "data",  		ds.data_result  );	//DATA   RECORD RESULT
	rx.add(mobApplyResult, "tail",      	ds.tail_result	);	//TAIL   RECORD RESULT
	rx.add(mobApplyResult, "header_msg",	ds.header_msg	);	//HEADER RECORD RESULT
	rx.add(mobApplyResult, "data_msg",  	ds.data_msg  	);	//DATA   RECORD RESULT
	rx.add(mobApplyResult, "tail_msg",  	ds.tail_msg		);	//TAIL   RECORD RESULT
	rx.add(mobApplyResult, "errcode",   	errcode	    	);	//errorcode
	rx.add(mobApplyResult, "errmsg",    	errmsg	    	);	//errmsg

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Mon Nov 28 18:26:53 KST 2016 */ %>