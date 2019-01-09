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
* 파일명 : se_snd_2580_l.jsp
* 기능 :  판매-발송관리-발송비청구
* 작성일자 : 2009-02-25
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
	SE_SND_2580_LDataSet ds = (SE_SND_2580_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "exllist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2580_LCURLISTRecord rec = (SE_SND_2580_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData		, "record"			, "");
			rx.add(record, "route_nm"			, rec.route_nm          );
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm     );
			rx.add(record, "prt_plac_cd_nm"		, rec.prt_plac_cd_nm    );
			rx.add(record, "tran_cmpy_nm"		, rec.tran_cmpy_nm      );
			rx.add(record, "acct_no"			, rec.acct_no          	);
			rx.add(record, "pay_tran_uprc"		, rec.pay_tran_uprc     );
			rx.add(record, "work_dds"			, rec.work_dds  		);
			rx.add(record, "pay_tran_cost"		, rec.pay_tran_cost     );
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
