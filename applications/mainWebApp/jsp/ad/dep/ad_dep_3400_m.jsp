<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_3400_MDataSet ds = (AD_DEP_3400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int codeData = rx.add(root, "codeData", "");

	try {
		
		//매체구분
		int medi_cd = rx.add( codeData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		rx.add(item, "value", "");
		rx.add(item, "label", "전체");			
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_DEP_3400_MCURLIST1Record rec = (AD_DEP_3400_MCURLIST1Record)ds.curlist1.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
	}
	
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
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

<% /* 작성시간 : Tue Apr 14 15:22:07 KST 2009 */ %>