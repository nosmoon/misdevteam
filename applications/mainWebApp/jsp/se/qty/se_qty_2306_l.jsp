<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_2306_l.jsp
* 기능 : 일일증감부수마감-발송선택 팝업 리스트
* 작성일자 : 2009-03-10
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
	SE_QTY_2306_LDataSet ds = (SE_QTY_2306_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	int item = 0;
	resform = rx.add(root, "resform", "");
	gridData = rx.add(resform, "issugrid", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2306_LCURLISTRecord rec = (SE_QTY_2306_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_nm_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "prt_plac_nm", rec.prt_plac_nm);
			rx.add(record, "chkyn", "N");
		}
		int route_clsf = rx.add(resform, "cbo_route_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2306_LCOMMCDCUR1Record rec = (SE_QTY_2306_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( route_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
			<medi_cd/>
			<medi_nm/>
			<sect_nm_cd/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR1>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<commcdcur1/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Mar 10 15:37:19 KST 2009 */ %>