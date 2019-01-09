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
* 파일명 : se_snd_2310_l.jsp
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
	SE_SND_2310_LDataSet ds = (SE_SND_2310_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");
	try {
		recordSet			= rx.add(formData	, "curlist"	, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2310_LCURLISTRecord rec = (SE_SND_2310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd		);
			rx.add(record, "tran_cmpy_cd"	, rec.tran_cmpy_cd	);
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "car_no"			, rec.car_no		);
			rx.add(record, "tran_cmpy_nm"	, rec.tran_cmpy_nm	);
			rx.add(record, "corp_clsf"		, rec.corp_clsf		);
			//rx.add(record, "zip"			, rec.zip_1 + "-" + rec.zip_2 );
			rx.add(record, "zip"			, rec.zip_1 + rec.zip_2 );
			rx.add(record, "addr"			, rec.addr			);
			rx.add(record, "dtls_addr"		, rec.dtls_addr		);
			rx.add(record, "tel_no"			, rec.tel_no		);
			rx.add(record, "ptph_no"		, rec.ptph_no		);
			rx.add(record, "cntr_dt"		, rec.cntr_dt		);
			rx.add(record, "cctr_dt"		, rec.cctr_dt		);
			rx.add(record, "use_yn"			, rec.use_yn		);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "acct_no"		, rec.acct_no		);
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
			<tran_cmpy_cd/>
			<dlco_no/>
			<car_no/>
			<tran_cmpy_nm/>
			<cmpy_clsf/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<tel_no/>
			<ptph_no/>
			<cntr_dt/>
			<cctr_dt/>
			<use_yn/>
			<route_clsf/>
			<route_cd/>
			<cnsg_seqo/>
			<route_nm/>
			<prt_plac_nm/>
			<tran_cost/>
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

<% /* 작성시간 : Fri Feb 13 14:29:43 KST 2009 */ %>