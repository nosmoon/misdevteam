<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1320_l.jsp
* 기능 : 
* 작성일자 : 2009-02-27
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1320_LDataSet ds = (PL_BAS_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** MEDI_CD_DLCOCUR BEGIN */
		int MEDI_CD_DLCOCUR = rx.add(dataSet, "MEDI_CD_DLCOCUR", "");
		for(int i = 0; i < ds.medi_cd_dlcocur.size(); i++) {
			PL_BAS_1320_LMEDI_CD_DLCOCURRecord rec = (PL_BAS_1320_LMEDI_CD_DLCOCURRecord)ds.medi_cd_dlcocur.get(i);
			int record = rx.add(MEDI_CD_DLCOCUR, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "area", rec.area);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "deal_yn", rec.deal_yn);
			rx.add(record, "no_val_exne", rec.no_val_exne);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "remk", rec.remk);
		}
		/****** MEDI_CD_DLCOCUR END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CD_DLCOCUR>
		<record>
			<medi_cd/>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<area/>
			<area_nm/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<use_yn/>
			<no_val_exne/>
			<dcrate/>
			<base_wh/>
			<sendclsf/>
			<remk/>
		</record>
	</MEDI_CD_DLCOCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 26 19:45:46 KST 2009 */ %>