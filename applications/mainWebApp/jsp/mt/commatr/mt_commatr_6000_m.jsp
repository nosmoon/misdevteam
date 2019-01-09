<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_6000_MDataSet ds = (MT_COMMATR_6000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	tempData = rx.add(root, "tempData", "");
	
	try {
		
		/****** CURLIST1 BEGIN */	//광고주구분
		int dlco_clsf = rx.add( tempData , "dlco_clsf" , "");
		int item2  = rx.add( dlco_clsf , "item" , "");		
		if(ds.page_id.equals("MT_COMMATR_6000")){	//일일보고 화면일때만 생성(일일보고 등록 X)
			rx.add ( item2, "value", "");
			rx.add ( item2, "label", "전체");	
		}
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_6000_MCURLIST1Record rec = (MT_COMMATR_6000_MCURLIST1Record)ds.curlist1.get(i);
			item2  = rx.add( dlco_clsf , "item" , "");		
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd + " " + rec.cdnm);
		}
		/****** CURLIST1 END */
		/****** CURLIST2 BEGIN */
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_COMMATR_6000_MCURLIST2Record rec1 = (MT_COMMATR_6000_MCURLIST2Record)ds.curlist2.get(i);
			rx.add(tempData, "mang_cd_1", rec1.mang_cd_1);
		}
		/****** CURLIST2 END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_commatr_6000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_commatr_6000_m>
*/
%>

<% /* 작성시간 : Thu Jun 21 15:40:49 KST 2012 */ %>