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
* 파일명 : se_snd_2320_l.jsp
* 기능 : 
* 작성일자 : 2009-02-13
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
	SE_SND_2320_LDataSet ds = (SE_SND_2320_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int recordSet 			= 0;

	recordSet				= rx.add(root	, "chglist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2320_LCURLISTRecord rec = (SE_SND_2320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas	);
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd			);
			rx.add(record, "tran_cmpy_cd"		, rec.tran_cmpy_cd		);
			rx.add(record, "uprc_seq"			, rec.uprc_seq			);
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd		);
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm);
			rx.add(record, "route_clsf"			, rec.route_clsf		);
			rx.add(record, "route_cd"			, rec.route_cd			);
			rx.add(record, "route_nm"			, rec.route_nm			);
			rx.add(record, "tran_cost"			, rec.tran_cost			);
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm		);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd		);
			rx.add(record, "cnsg_seqo"			, rec.cnsg_seqo		);
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
			<aply_dt/>
			<route_clsf_nm/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<cnsg_seqo/>
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

<% /* 작성시간 : Fri Feb 13 15:47:27 KST 2009 */ %>