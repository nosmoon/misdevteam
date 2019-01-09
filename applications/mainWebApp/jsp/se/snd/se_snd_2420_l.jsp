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
* 파일명 : se_snd_2420_l.jsp
* 기능 :  발송관리 - 수송단가변경
* 작성일자 : 2009-02-19
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
	SE_SND_2420_LDataSet ds = (SE_SND_2420_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "medilist"		, "");
	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2420_LCURLISTRecord rec = (SE_SND_2420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "medi_cd"		, rec.medi_cd		);
			rx.add(record, "medi_nm"		, rec.medi_nm		);
			rx.add(record, "sect_cd"		, rec.sect_cd		);
			rx.add(record, "sect_nm"		, rec.sect_nm		);
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd		);
			rx.add(record, "tran_uprc_cd"	, rec.tran_uprc_cd	);
			rx.add(record, "send_yn"		, rec.send_yn		);
			rx.add(record, "qty"			, rec.qty			);
			rx.add(record, "aply_dt"		, rec.aply_dt		);
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
			<cmpy_cd/>
			<chg_reg_dt/>
			<chg_no/>
			<tran_uprc_cd/>
			<tran_uprc_route_nm/>
			<tran_uprc_clas/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<prt_plac_cd/>
			<load_wgt/>
			<route_lgth/>
			<rmks/>
			<tran_cost/>
			<tran_uprc_qty_clsf/>
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

<% /* 작성시간 : Thu Feb 19 17:42:17 KST 2009 */ %>