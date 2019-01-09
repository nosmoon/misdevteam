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
	FC_FUNC_6090_MDataSet ds = (FC_FUNC_6090_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_deps_isav_stat_cd_010", ds.getXx_deps_isav_stat_cd_010());
		rx.add(dataSet, "xx_deps_isav_stat_cd_020", ds.getXx_deps_isav_stat_cd_020());
		rx.add(dataSet, "xx_deps_isav_stat_cd_030", ds.getXx_deps_isav_stat_cd_030());
		rx.add(dataSet, "xx_budg_cd_010", ds.getXx_budg_cd_010());
		
		/****** CUR_CBOHY_YEYGGB BEGIN */
		recordSet = rx.add(dataSet, "CUR_CBOHY_YEYGGB", "");

		for(int i = 0; i < ds.cur_cbohy_yeyggb.size(); i++) {
			FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord rec = (FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord)ds.cur_cbohy_yeyggb.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_cbohy_yeyggb.size());
		/****** CUR_CBOHY_YEYGGB END */

		/****** CUR_CBOYJGBCD BEGIN */
		recordSet = rx.add(dataSet, "CUR_CBOYJGBCD", "");

		for(int i = 0; i < ds.cur_cboyjgbcd.size(); i++) {
			FC_FUNC_6090_MCUR_CBOYJGBCDRecord rec = (FC_FUNC_6090_MCUR_CBOYJGBCDRecord)ds.cur_cboyjgbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_cboyjgbcd.size());
		/****** CUR_CBOYJGBCD END */

		/****** XX_BUDG_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_LIST", "");

		for(int i = 0; i < ds.xx_budg_cd_list.size(); i++) {
			FC_FUNC_6090_MXX_BUDG_CD_LISTRecord rec = (FC_FUNC_6090_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_list.size());
		/****** XX_BUDG_CD_LIST END */
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
	<CUR_CBOHY_YEYGGB>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_CBOHY_YEYGGB>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_CBOYJGBCD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_CBOYJGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 09 10:09:59 KST 2009 */ %>