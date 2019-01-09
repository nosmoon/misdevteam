<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.sal.rec.*
	,	chosun.ciis.pl.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_sal_1200_m.jsp
* 기능 : 
* 작성일자 : 2009-03-24
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
	PL_SAL_1200_MDataSet ds = (PL_SAL_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** SALE_CLSFCUR BEGIN */
		int sale_clsf = rx.add(dataSet, "sale_clsf", "");
		for(int i = 0; i < ds.sale_clsfcur.size(); i++) {
			PL_SAL_1200_MSALE_CLSFCURRecord rec = (PL_SAL_1200_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);
			int record = rx.add(sale_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SALE_CLSFCUR END */

		/****** SENDCLSFCUR BEGIN */
		int sendclsf = rx.add(dataSet, "sendclsf", "");
		for(int i = 0; i < ds.sendclsfcur.size(); i++) {
			PL_SAL_1200_MSENDCLSFCURRecord rec = (PL_SAL_1200_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);
			int record = rx.add(sendclsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SENDCLSFCUR END */

		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf = rx.add(dataSet, "medi_clsf", "");
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_SAL_1200_MMEDI_CLSFCURRecord rec = (PL_SAL_1200_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** MEDI_CLSFCUR END */

		/****** WH_CDCUR BEGIN */
		int wh_cd = rx.add(dataSet, "wh_cd", "");
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_SAL_1200_MWH_CDCURRecord rec = (PL_SAL_1200_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** WH_CDCUR END */

		/****** SELL_TYPECUR BEGIN */
		int sell_type = rx.add(dataSet, "sell_type", "");
		for(int i = 0; i < ds.sell_typecur.size(); i++) {
			PL_SAL_1200_MSELL_TYPECURRecord rec = (PL_SAL_1200_MSELL_TYPECURRecord)ds.sell_typecur.get(i);
			int record = rx.add(sell_type, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SELL_TYPECUR END */

		/****** MEDI_CDCUR BEGIN */
		int medi_cd = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_SAL_1200_MMEDI_CDCURRecord rec = (PL_SAL_1200_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CDCUR END */

		/****** DEAL_PTCRCUR BEGIN */
		int DEAL_PTCRCUR = rx.add(dataSet, "DEAL_PTCRCUR", "");
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_SAL_1200_MDEAL_PTCRCURRecord rec = (PL_SAL_1200_MDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "stok_qty", rec.stok_qty);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sell_type", rec.sell_type);
			rx.add(record, "absence_clsf", "");
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** DEAL_PTCRCUR END */

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
	<SALE_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SALE_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SENDCLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SENDCLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDI_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<WH_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</WH_CDCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SELL_TYPECUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SELL_TYPECUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DEAL_PTCRCUR>
		<record>
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<medi_clsf/>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<stok_qty/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
			<sale_clsf/>
			<sendclsf/>
			<wh_cd/>
			<sell_type/>
			<remk/>
		</record>
	</DEAL_PTCRCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDI_CDCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 24 18:16:37 KST 2009 */ %>