<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_1400_m.jsp
* 기능 : 외환입금등록 - 초기화면
* 작성일자 : 2009-04-30
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
	SE_RCP_1400_MDataSet ds = (SE_RCP_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int bank_cd = rx.add(comboSet, "bank_cd", "");
		item  = rx.add(bank_cd , "item" , "");
		rx.add(item, "value", "");
		rx.add(item, "label", "");
		rx.add(item, "acct_mang_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_RCP_1400_MCOMMCDCUR1Record rec = (SE_RCP_1400_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add(bank_cd , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
			rx.add(item, "acct_mang_cd", rec.cd_abrv_nm);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
