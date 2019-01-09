<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_2220_l.jsp
* 기능 : 
* 작성일자 : 2009-05-28
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_2220_LDataSet ds = (SE_BOI_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = 0;
	//int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "boidtl", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2220_LCURLISTRecord rec = (SE_BOI_2220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_addr", rec.bo_addr);
			rx.add(record, "ratio", rec.ratio);
			rx.add(record, "apt_cnt", rec.apt_cnt);
			rx.add(record, "hous_cnt", rec.hous_cnt);
			rx.add(record, "shop_cnt", rec.shop_cnt);
			rx.add(record, "offi_cnt", rec.offi_cnt);
			rx.add(record, "tot_cnt", rec.tot_cnt);
			rx.add(record, "popl_cnt", rec.popl_cnt);
	  }
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<bo_cd/>
			<bo_nm/>
			<bo_addr/>
			<ratio/>
			<apt_cnt/>
			<hous_cnt/>
			<shop_cnt/>
			<offi_cnt/>
			<tot_cnt/>
			<popl_cnt/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu May 28 14:47:03 KST 2009 */ %>