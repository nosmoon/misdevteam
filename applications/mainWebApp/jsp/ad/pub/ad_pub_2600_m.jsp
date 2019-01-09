<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_pub_2600_m.jsp
* 기능 : 
* 작성일자 : 2009-03-12
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2600_MDataSet ds = (AD_PUB_2600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int codeData = rx.add(root, "codeData", "");

	try {
		int medi_cd = rx.add( codeData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		//rx.add ( item, "value", "");	
		//rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2600_MCURLISTRecord rec = (AD_PUB_2600_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);

			
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Mar 12 21:37:05 KST 2009 */ %>