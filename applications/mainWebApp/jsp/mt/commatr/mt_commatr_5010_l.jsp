<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_commatr_5010_l.jsp
* 기능 : 
* 작성일자 : 2010-04-12
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
	MT_COMMATR_5010_LDataSet ds = (MT_COMMATR_5010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "basi_fac", "");
	//resform = rx.add(resData, "resform", "");

	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_5010_LCURLISTRecord rec = (MT_COMMATR_5010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);			
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_nm", rec.fac_nm);
			rx.add(record, "issu_pcnt_0100", rec.issu_pcnt_0100);
			rx.add(record, "issu_pcnt_0200", rec.issu_pcnt_0200);
			rx.add(record, "issu_pcnt_9999", rec.issu_pcnt_9999);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "basi_yn", rec.basi_yn);
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
			<issu_dt/>
			<fac_clsf/>
			<fac_nm/>
			<issu_pcnt_0100/>
			<issu_pcnt_0200/>
			<issu_pcnt_9999/>
			<issu_pcnt/>
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

<% /* 작성시간 : Mon Apr 12 11:27:07 KST 2010 */ %>