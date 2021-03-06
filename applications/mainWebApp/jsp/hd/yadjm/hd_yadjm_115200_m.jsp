<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_115200_MDataSet ds = (HD_YADJM_115200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_stok_savg_type_010", ds.getXx_stok_savg_type_010());
		rx.add(dataSet, "xx_stok_savg_type_020", ds.getXx_stok_savg_type_020());
		rx.add(dataSet, "xx_stok_savg_type_030", ds.getXx_stok_savg_type_030());
		rx.add(dataSet, "xx_stok_savg_type_040", ds.getXx_stok_savg_type_040());
		rx.add(dataSet, "xx_stok_savg_type_050", ds.getXx_stok_savg_type_050());
		rx.add(dataSet, "xx_stok_savg_type_060", ds.getXx_stok_savg_type_060());
		rx.add(dataSet, "xx_stok_savg_type_070", ds.getXx_stok_savg_type_070());
		rx.add(dataSet, "xx_stok_savg_type_080", ds.getXx_stok_savg_type_080());
		rx.add(dataSet, "xx_stok_savg_type_090", ds.getXx_stok_savg_type_090());
		rx.add(dataSet, "xx_edu_fee_clsf_cd", ds.getXx_edu_fee_clsf_cd());
		rx.add(dataSet, "xx_faml_rshp_cd", ds.getXx_faml_rshp_cd());
		
		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			HD_YADJM_115200_MXX_COMBO_010Record rec = (HD_YADJM_115200_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
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
<hd_yadjm_115200_m>
	<dataSet>
		<XX_COMBO_010>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_COMBO_010>
	</dataSet>
</hd_yadjm_115200_m>
*/
%>

<% /* 작성시간 : Wed Feb 15 13:28:31 KST 2012 */ %>