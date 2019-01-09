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
* 파일명 : se_snd_2410_l.jsp
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
	SE_SND_2410_LDataSet ds = (SE_SND_2410_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");
	
	try {
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2410_LCURLISTRecord rec = (SE_SND_2410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd			);
			rx.add(record, "aply_dt"			, rec.aply_dt			);
			rx.add(record, "aply_dt_key"		, rec.aply_dt_key		);
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas	);
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd		);
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm);
			rx.add(record, "route_clsf"			, rec.route_clsf		);
			rx.add(record, "route_cd"			, rec.route_cd			);
			rx.add(record, "route_nm"			, rec.route_nm			);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd		);
			rx.add(record, "route_lgth"			, rec.route_lgth		);
			rx.add(record, "load_wgt"			, rec.load_wgt			);
			rx.add(record, "tran_cost"			, rec.tran_cost			);
			rx.add(record, "tran_cost_ren"		, rec.tran_cost_ren		);
			rx.add(record, "rmks"				, rec.rmks				);
			rx.add(record, "cnsg_seqo"			, rec.cnsg_seqo			);
			rx.add(record, "tran_uprc_qty_clsf"	, rec.tran_uprc_qty_clsf);
			rx.add(record, "use_yn"				, rec.use_yn			);
			rx.add(record, "qty01"				, rec.qty01				);
			rx.add(record, "qty02"				, rec.qty02				);
			rx.add(record, "qty03"				, rec.qty03				);
			rx.add(record, "qty04"				, rec.qty04				);
			rx.add(record, "qty05"				, rec.qty05				);
			rx.add(record, "qty06"				, rec.qty06				);
			rx.add(record, "qty07"				, rec.qty07				);
			rx.add(record, "qty08"				, rec.qty08				);
			rx.add(record, "qty09"				, rec.qty09				);
			rx.add(record, "qty10"				, rec.qty10				);

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
			<chg_no/>
			<aply_dt/>
			<route_cnt/>
			<resn/>
			<remk/>
			<decid_stat_clsf/>
			<aply_yn/>
			<incmg_dt_tm/>
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

<% /* 작성시간 : Thu Feb 19 15:56:26 KST 2009 */ %>