<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_cocd_1000_m.jsp
* 기능 : 공통코드팝업-목록조회
* 작성일자 : 2009-02-09
* 작성자 : 김태길
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1210_LDataSet ds = (CO_COCD_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COCD_1210_LCURLISTRecord rec = (CO_COCD_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "mang_cd_4", rec.mang_cd_4); 
			rx.add(record, "mang_cd_5", rec.mang_cd_5);
			rx.add(record, "mang_cd_6", rec.mang_cd_6);
			rx.add(record, "mang_cd_7", rec.mang_cd_7);
			rx.add(record, "mang_cd_8", rec.mang_cd_8);
			rx.add(record, "mang_cd_9", rec.mang_cd_9);
			rx.add(record, "mang_cd_10", rec.mang_cd_10);
			rx.add(record, "mang_cd_11", rec.mang_cd_11);
			rx.add(record, "mang_cd_12", rec.mang_cd_12);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cd_clsf", rec.cd_clsf);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
