<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_3010_l.jsp
* 기능 :  판매-발송관리-발송부수증감체크 및 조회
* 작성일자 : 2009-05-22
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_3010_LDataSet ds = (SE_SND_3010_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "issu_dt"		, ds.issu_dt	);
	rx.add(formData		, "be_issu_dt"	, ds.be_issu_dt	);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_3010_LCURLISTRecord rec = (SE_SND_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "medi_cd"	, rec.medi_cd	);
			rx.add(record, "medi_nm"	, rec.medi_nm	);
			rx.add(record, "be_qty"		, rec.be_qty	);
			rx.add(record, "icdc_qty"	, rec.icdc_qty	);
			rx.add(record, "qty"		, rec.qty		);
			rx.add(record, "err_qty"	, rec.err_qty	);
		}
		
		recordSet			= rx.add(formData	, "sublist"		, "");
		for(int i = 0; i < ds.sublist.size(); i++) {
			SE_SND_3010_LSUBLISTRecord rec = (SE_SND_3010_LSUBLISTRecord)ds.sublist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "medi_cd"		, rec.medi_cd		);
			rx.add(record, "medi_nm"		, rec.medi_nm		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "bo_cd"			, rec.bo_cd			);
			rx.add(record, "send_plac_seq"	, rec.send_plac_seq	);
			rx.add(record, "send_plac_nm"	, rec.send_plac_nm	);
			rx.add(record, "be_qty"			, rec.be_qty		);
			rx.add(record, "icdc_qty"		, rec.icdc_qty		);
			rx.add(record, "qty"			, rec.qty			);
			rx.add(record, "err_qty"		, rec.err_qty		);
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
			<be_qty/>
			<icdc_qty/>
			<qty/>
			<err_qty/>
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
		<issu_dt/>
		<be_issu_dt/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri May 22 14:53:41 KST 2009 */ %>