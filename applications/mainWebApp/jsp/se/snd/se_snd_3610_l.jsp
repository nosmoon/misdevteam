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
* 파일명 : se_snd_3610_l.jsp
* 기능 : 판매 - 발송관리 - 노선코드 인쇄처 변경  - 대표노선 조회
* 작성일자 : 2009.06.24
* 작성자 : 이근탁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_3610_LDataSet ds = (SE_SND_3610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData 	= rx.add(root		, "resData"		, "");
	recordSet 	= rx.add(formData	, "gridData"	, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_3610_LCURLISTRecord rec = (SE_SND_3610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");

			rx.add(record, "cmpy_cd"			, rec.cmpy_cd				);
			rx.add(record, "rptv_route_clsf"	, rec.rptv_route_clsf		);
			rx.add(record, "rptv_route_cd"		, rec.rptv_route_cd			);
			rx.add(record, "rptv_route_nm"		, rec.rptv_route_nm			);
			rx.add(record, "route_rank"			, rec.route_rank			);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd			);
			rx.add(record, "ecnt_cd"			, rec.ecnt_cd				);
			rx.add(record, "ledt_cd"			, rec.ledt_cd				);
			rx.add(record, "route_cd"			, rec.route_cd				);
			rx.add(record, "route_nm"			, rec.route_nm				);
			rx.add(record, "qty"				, rec.qty					);
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
<resData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<rptv_route_clsf/>
			<rptv_route_cd/>
			<rptv_route_nm/>
			<route_rank/>
			<prt_plac_cd/>
			<ecnt_cd/>
			<ledt_cd/>
			<route_cd/>
			<route_nm/>
			<qty/>
			<rptv_route_clsf/>
			<rptv_route_cd/>
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

<% /* 작성시간 : Mon Feb 02 14:56:04 KST 2009 */ %>