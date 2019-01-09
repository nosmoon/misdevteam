<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1710_MDataSet ds = (HD_AFFR_1710_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_proc_stat_030", ds.getXx_proc_stat_030());
		rx.add(dataSet, "xx_proc_stat_040", ds.getXx_proc_stat_040());
		rx.add(dataSet, "xx_proc_stat_050", ds.getXx_proc_stat_050());
		rx.add(dataSet, "xx_proc_stat_060", ds.getXx_proc_stat_060());
		rx.add(dataSet, "xx_scl_exps_clsf", ds.getXx_scl_exps_clsf());
		
		/****** XX_COMBO_020 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_020", "");

		for(int i = 0; i < ds.xx_combo_020.size(); i++) {
			HD_AFFR_1710_MXX_COMBO_020Record rec = (HD_AFFR_1710_MXX_COMBO_020Record)ds.xx_combo_020.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_020.size());
		/****** XX_COMBO_020 END */

		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			HD_AFFR_1710_MXX_COMBO_010Record rec = (HD_AFFR_1710_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_010.size());
		/****** XX_COMBO_010 END */
        System.out.println(ds.xx_combo_010.size());
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
<hd_affr_1710_m>
	<dataSet>
		<XX_COMBO_020>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_COMBO_020>
	</dataSet>
</hd_affr_1710_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_1710_m>
	<dataSet>
		<XX_COMBO_010>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_COMBO_010>
	</dataSet>
</hd_affr_1710_m>
*/
%>

<% /* 작성시간 : Thu Feb 16 16:00:50 KST 2012 */ %>