<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.brn.rec.*,chosun.ciis.ad.brn.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	
	AD_BRN_2000_MDataSet ds = (AD_BRN_2000_MDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int tempData = 0;
	String errcode = "";
	String errmsg = "";

	tempData = rx.add(root, "tempData", "");
	
	errcode = ds.errcode;
	errmsg = ds.errmsg;
	
	try {
		/****** CURLIST3 BEGIN */	//담당자
		int chrg_pers = rx.add( tempData , "chrg_pers" , "");
		int item3  = rx.add( chrg_pers , "item" , "");
		if(ds.page_id.equals("AD_BRN_2000")){	//일일보고 화면일때만 생성(일일보고 등록 X)
			rx.add ( item3, "value", "");
			rx.add ( item3, "label", "전체");
		}
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BRN_2000_MCURLIST3Record rec = (AD_BRN_2000_MCURLIST3Record)ds.curlist3.get(i);
			item3  = rx.add( chrg_pers , "item" , "");		
			rx.add ( item3, "value", rec.acct_id );
			rx.add ( item3, "label", rec.acct_nm);
		}
		/****** CURLIST3 END */
		
		/****** CURLIST2 BEGIN */	//광고주구분
		int advcs_clsf = rx.add( tempData , "advcs_clsf" , "");
		int item2  = rx.add( advcs_clsf , "item" , "");		
		if(ds.page_id.equals("AD_BRN_2000")){	//일일보고 화면일때만 생성(일일보고 등록 X)
			rx.add ( item2, "value", "");
			rx.add ( item2, "label", "전체");	
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BRN_2000_MCURLIST2Record rec = (AD_BRN_2000_MCURLIST2Record)ds.curlist2.get(i);
			item2  = rx.add( advcs_clsf , "item" , "");		
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd + " " + rec.cdnm);
		}
		/****** CURLIST2 END */
		
		/****** CURLIST1 BEGIN */ 	//매체구분
		int medi_clsf = rx.add( tempData , "medi_clsf" , "");
		int item1  = rx.add( medi_clsf , "item" , "");		
		if(ds.page_id.equals("AD_BRN_2000")){	//일일보고 화면일때만 생성(일일보고 등록 X)
			rx.add ( item1, "value", "");
			rx.add ( item1, "label", "전체");
		}			
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BRN_2000_MCURLIST1Record rec = (AD_BRN_2000_MCURLIST1Record)ds.curlist1.get(i);
			item1  = rx.add( medi_clsf , "item" , "");		
			rx.add ( item1, "value", rec.cd );
			rx.add ( item1, "label", rec.cd + " " + rec.cdnm);
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
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
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
			<cd/>
			<cdnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 09 16:51:50 KST 2009 */ %>