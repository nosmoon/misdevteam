<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_cocd_2000_m.jsp
* 기능 : 신우편번호 메인화면
* 작성일자 : 2012-01-00
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_COCD_2000_MDataSet ds = (CO_COCD_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int comboSet = 0;
	int tempData = rx.add(root, "tempData", "");

	try {
		int addr1 = rx.add(tempData, "addr1", "");	
		for(int i = 0; i < ds.curlist1.size(); i++) {
			CO_COCD_2000_MCURLIST1Record rec = (CO_COCD_2000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(addr1, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			rx.add(record, "pcode1", "");
		
		//System.out.println("addr1::"+rec.cd);
		}

		int addr2 = rx.add(tempData, "addr2", "");	
		for(int i = 0; i < ds.curlist2.size(); i++) {
			CO_COCD_2000_MCURLIST2Record rec = (CO_COCD_2000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(addr2, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			rx.add(record, "pcode1", rec.cd1);
			
		}
		
		int addr11 = rx.add(tempData, "addr11", "");	
		for(int i = 0; i < ds.curlist3.size(); i++) {
			CO_COCD_2000_MCURLIST3Record rec = (CO_COCD_2000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(addr11, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			rx.add(record, "pcode1", "");
			
		}				
		
		int addr22 = rx.add(tempData, "addr22", "");	
		for(int i = 0; i < ds.curlist4.size(); i++) {
			CO_COCD_2000_MCURLIST4Record rec = (CO_COCD_2000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(addr22, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			rx.add(record, "pcode1", rec.cd1);
		
		}			
		int addr33 = rx.add(tempData, "addr33", "");	
		for(int i = 0; i < ds.curlist5.size(); i++) {
			CO_COCD_2000_MCURLIST5Record rec = (CO_COCD_2000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(addr22, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			rx.add(record, "pcode1", rec.cd2 + rec.cd1);

		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
