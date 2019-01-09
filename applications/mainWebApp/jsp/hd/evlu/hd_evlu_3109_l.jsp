<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3109_LDataSet ds = (HD_EVLU_3109_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */

		rx.add(dataSet, "xx_message",ds.getMessage() );
		rx.add(dataSet, "xx_use_yn",ds.getUse_yn());
		
		/****** CURLIST END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_evlu_3109_l>
	<dataSet>
		<CURLIST>
			<record>
				<sel_chk/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<asst_pnt/>
				<spc_psdo_redu_scorcnt/>
				<tmp_grad/>
				<evlu_pers_meda_grad_1tms/>
				<evlu_pers_deci_grad_2tms/>
				<evlu_pers_meda_opn_2tms/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_3109_l>
*/
%>

<% /* �ۼ��ð� : Fri Apr 04 11:01:36 KST 2014 */ %>