<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1090_MDataSet ds = (FC_FUNC_1090_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_budg_cd_010", ds.getXx_budg_cd_010());
	rx.add(dataSet, "xx_budg_cd_020", ds.getXx_budg_cd_020());
	rx.add(dataSet, "xx_budg_cd_030", ds.getXx_budg_cd_030());
	rx.add(dataSet, "xx_budg_cd_040", ds.getXx_budg_cd_040());
	rx.add(dataSet, "xx_budg_cd_050", ds.getXx_budg_cd_050());
	rx.add(dataSet, "xx_budg_cd_060", ds.getXx_budg_cd_060());
	rx.add(dataSet, "xx_budg_cd_070", ds.getXx_budg_cd_070());
	rx.add(dataSet, "xx_budg_cd_080", ds.getXx_budg_cd_080());
	rx.add(dataSet, "xx_now_note_stat_cd_010", ds.getXx_now_note_stat_cd_010());
	rx.add(dataSet, "xx_now_note_stat_cd_020", ds.getXx_now_note_stat_cd_020());
	rx.add(dataSet, "xx_note_clsf_cd_010", ds.getXx_note_clsf_cd_010());
	rx.add(dataSet, "xx_clsf_cd", ds.getXx_clsf_cd());
	rx.add(dataSet, "xx_occr_slip_clsf_010", ds.getXx_occr_slip_clsf_010());
	rx.add(dataSet, "xx_trufnd_slip_no", ds.getXx_trufnd_slip_no());
	rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());
	
	try {
		/****** CUR_CARD_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_CARD_CD", "");

		for(int i = 0; i < ds.cur_card_cd.size(); i++) {
			FC_FUNC_1090_MCUR_CARD_CDRecord rec = (FC_FUNC_1090_MCUR_CARD_CDRecord)ds.cur_card_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_card_cd.size());
		/****** CUR_CARD_CD END */

		/****** CUR_DLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_DLCO_CLSF_CD", "");

		for(int i = 0; i < ds.cur_dlco_clsf_cd.size(); i++) {
			FC_FUNC_1090_MCUR_DLCO_CLSF_CDRecord rec = (FC_FUNC_1090_MCUR_DLCO_CLSF_CDRecord)ds.cur_dlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_dlco_clsf_cd.size());
		/****** CUR_DLCO_CLSF_CD END */

		/****** CUR_NOTE_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_NOTE_CLSF_CD", "");

		for(int i = 0; i < ds.cur_note_clsf_cd.size(); i++) {
			FC_FUNC_1090_MCUR_NOTE_CLSF_CDRecord rec = (FC_FUNC_1090_MCUR_NOTE_CLSF_CDRecord)ds.cur_note_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_note_clsf_cd.size());
		/****** CUR_NOTE_CLSF_CD END */

		/****** CUR_ISS_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_ISS_CD", "");

		for(int i = 0; i < ds.cur_iss_cd.size(); i++) {
			FC_FUNC_1090_MCUR_ISS_CDRecord rec = (FC_FUNC_1090_MCUR_ISS_CDRecord)ds.cur_iss_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_iss_cd.size());
		/****** CUR_ISS_CD END */

		/****** CUR_FREX_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_FREX_CD", "");

		for(int i = 0; i < ds.cur_frex_cd.size(); i++) {
			FC_FUNC_1090_MCUR_FREX_CDRecord rec = (FC_FUNC_1090_MCUR_FREX_CDRecord)ds.cur_frex_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_frex_cd.size());
		/****** CUR_FREX_CD END */

		/****** CUR_DEPS_CD BEGIN */
		recordSet = rx.add(dataSet, "CUR_DEPS_CD", "");

		for(int i = 0; i < ds.cur_deps_cd.size(); i++) {
			FC_FUNC_1090_MCUR_DEPS_CDRecord rec = (FC_FUNC_1090_MCUR_DEPS_CDRecord)ds.cur_deps_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_deps_cd.size());
		/****** CUR_DEPS_CD END */

		/****** XX_BUDG_CD_100 BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_100", "");

		for(int i = 0; i < ds.xx_budg_cd_100.size(); i++) {
			FC_FUNC_1090_MXX_BUDG_CD_100Record rec = (FC_FUNC_1090_MXX_BUDG_CD_100Record)ds.xx_budg_cd_100.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_100.size());
		/****** XX_BUDG_CD_100 END */

		/****** XX_BUDG_CD_090 BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_090", "");

		for(int i = 0; i < ds.xx_budg_cd_090.size(); i++) {
			FC_FUNC_1090_MXX_BUDG_CD_090Record rec = (FC_FUNC_1090_MXX_BUDG_CD_090Record)ds.xx_budg_cd_090.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_090.size());
		/****** XX_BUDG_CD_090 END */
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
	<CUR_CARD_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_CARD_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_DLCO_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_DLCO_CLSF_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_NOTE_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_NOTE_CLSF_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_ISS_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_ISS_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_FREX_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_FREX_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_DEPS_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_DEPS_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 19 18:52:38 KST 2009 */ %>