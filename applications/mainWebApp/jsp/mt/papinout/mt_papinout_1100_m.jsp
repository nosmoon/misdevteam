<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_papinout_1100_m.jsp
* 기능 : 
* 작성일자 : 2011-02-09
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
	MT_PAPINOUT_1100_MDataSet ds = (MT_PAPINOUT_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int fact_cd = rx.add(comboSet, "fact_cd", "");
		for(int i = 0; i < ds.factlist.size(); i++) {
			MT_PAPINOUT_1100_MFACTLISTRecord rec = (MT_PAPINOUT_1100_MFACTLISTRecord)ds.factlist.get(i);
			
			item  = rx.add( fact_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int matr_cd = rx.add(comboSet, "matr_cd", "");
		for(int i = 0; i < ds.matrlist.size(); i++) {
			MT_PAPINOUT_1100_MMATRLISTRecord rec = (MT_PAPINOUT_1100_MMATRLISTRecord)ds.matrlist.get(i);
			
			item  = rx.add( matr_cd , "item" , "");
			
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