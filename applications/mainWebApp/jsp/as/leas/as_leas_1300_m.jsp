<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1300_MDataSet ds = (AS_LEAS_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		 rx.add(dataSet, "xx_init_a_010", ds.getXx_init_a_010());
		 rx.add(dataSet, "xx_init_a_020", ds.getXx_init_a_020());
		 rx.add(dataSet, "xx_init_a_030", ds.getXx_init_a_030());
		 rx.add(dataSet, "xx_init_b_010", ds.getXx_init_b_010());
		 rx.add(dataSet, "xx_init_b_020", ds.getXx_init_b_020());
		 rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());
		 rx.add(dataSet, "xx_job_clsf_02", ds.getXx_job_clsf_02());
		 rx.add(dataSet, "xx_cd_clsf_020", ds.getXx_cd_clsf());
		 rx.add(dataSet, "xx_occr_slip_clsf", ds.getXx_occr_slip_clsf());
		 rx.add(dataSet, "xx_gurt_payo_clsf_010", ds.getXx_gurt_payo_clsf_010());
		 rx.add(dataSet, "xx_gurt_payo_clsf_020", ds.getXx_gurt_payo_clsf_020());
		 
		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			AS_LEAS_1300_MXX_COMBO_010Record rec = (AS_LEAS_1300_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_010.size());
		/****** XX_COMBO_010 END */

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
<as_leas_1300_m>
	<dataSet>
		<XX_COMBO_010>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</XX_COMBO_010>
	</dataSet>
</as_leas_1300_m>
*/
%>

<% /* 작성시간 : Tue Feb 28 17:35:33 KST 2012 */ %>