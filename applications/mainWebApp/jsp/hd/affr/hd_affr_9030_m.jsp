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
	HD_AFFR_9030_MDataSet ds = (HD_AFFR_9030_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int record  = 0 ;
	int record2  = 0 ;
	int recordSet = 0;
	int recordSet2 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");
		record = rx.add(recordSet, "item", "");
		rx.add(record, "cd", "%");
		rx.add(record, "cd_nm", "전체");		
		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			HD_AFFR_9030_MXX_COMBO_010Record rec = (HD_AFFR_9030_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
		    record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		
		recordSet2 = rx.add(dataSet, "XX_COMBO_020", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			HD_AFFR_9030_MXX_COMBO_010Record rec = (HD_AFFR_9030_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
		    record2 = rx.add(recordSet2, "item", "");
			rx.add(record2, "cd_nm", rec.cd_nm);
			rx.add(record2, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
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
<hd_affr_9030_m>
	<dataSet>
		<XX_COMBO_010>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_COMBO_010>
	</dataSet>
</hd_affr_9030_m>
*/
%>

<% /* 작성시간 : Fri Aug 12 10:56:20 KST 2016 */ %>