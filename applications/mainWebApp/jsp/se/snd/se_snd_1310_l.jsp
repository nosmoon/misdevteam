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
* 파일명 : se_snd_1300_m.jsp
* 기능 : 판매 - 발송관리 - 노선별인쇄처변경 - 노선별 인쇄처 조회
* 작성일자 : 2009.01.30
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
	SE_SND_1310_LDataSet ds = (SE_SND_1310_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	formData 		= rx.add(root		, "resData"		, "");
	formData 		= rx.add(formData	, "gridData"	, "");

	try {
		recordSet 	= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1310_LCURLISTRecord rec = (SE_SND_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"    		, rec.cmpy_cd     );
			rx.add(record, "reg_dt"			    , rec.reg_dt      );
			rx.add(record, "reg_seq"		    , rec.reg_seq     );
			rx.add(record, "route_clsf"	  		, rec.route_clsf  );
			rx.add(record, "bgn_route_cd"		, rec.bgn_route_cd);
			rx.add(record, "end_route_cd"		, rec.end_route_cd);
			rx.add(record, "medi_cd"			, rec.medi_cd     );
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd );
			rx.add(record, "incmg_pers"	  		, rec.incmg_pers  );
			rx.add(record, "incmg_dt_tm"      	, rec.incmg_dt_tm );
			rx.add(record, "bgn_route_nm"		, rec.bgn_route_nm);
			rx.add(record, "end_route_nm"		, rec.end_route_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
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
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jan 29 20:43:48 KST 2009 */ %>