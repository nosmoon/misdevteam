<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.report.rec.*
	,	chosun.ciis.mt.report.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_report_5000_m.jsp
* 기능 : 
* 작성일자 : 2010-04-08
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
	MT_REPORT_5000_MDataSet ds = (MT_REPORT_5000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			MT_REPORT_5000_MMEDILISTRecord rec = (MT_REPORT_5000_MMEDILISTRecord)ds.medilist.get(i);
			
			item  = rx.add( medi_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int sect_cd = rx.add(comboSet, "sect_cd", "");
		for(int i = 0; i < ds.sectlist.size(); i++) {
			MT_REPORT_5000_MSECTLISTRecord rec = (MT_REPORT_5000_MSECTLISTRecord)ds.sectlist.get(i);
			
			item  = rx.add( sect_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
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
	<SELLCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SELLCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<UPRCCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</UPRCCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<MEDILIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDILIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 09 15:29:11 KST 2009 */ %>