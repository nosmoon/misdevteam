<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_3000_MDataSet ds = (TN_BAS_3000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** XX_COMBO_020 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_020", "");

		for(int i = 0; i < ds.xx_combo_020.size(); i++) {
			TN_BAS_3000_MXX_COMBO_020Record rec = (TN_BAS_3000_MXX_COMBO_020Record)ds.xx_combo_020.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_020.size());
		/****** XX_COMBO_020 END */

		/****** XX_COMBO_030 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_030", "");

		for(int i = 0; i < ds.xx_combo_030.size(); i++) {
			TN_BAS_3000_MXX_COMBO_030Record rec = (TN_BAS_3000_MXX_COMBO_030Record)ds.xx_combo_030.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_030.size());
		/****** XX_COMBO_030 END */

		/****** XX_COMBO_040 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_040", "");

		for(int i = 0; i < ds.xx_combo_040.size(); i++) {
			TN_BAS_3000_MXX_COMBO_040Record rec = (TN_BAS_3000_MXX_COMBO_040Record)ds.xx_combo_040.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_040.size());
		/****** XX_COMBO_040 END */

		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			TN_BAS_3000_MXX_COMBO_010Record rec = (TN_BAS_3000_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
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
<tn_bas_3000_m>
	<dataSet>
		<XX_COMBO_020>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_COMBO_020>
	</dataSet>
</tn_bas_3000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_3000_m>
	<dataSet>
		<XX_COMBO_030>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_COMBO_030>
	</dataSet>
</tn_bas_3000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_3000_m>
	<dataSet>
		<XX_COMBO_040>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_COMBO_040>
	</dataSet>
</tn_bas_3000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_3000_m>
	<dataSet>
		<XX_COMBO_010>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_COMBO_010>
	</dataSet>
</tn_bas_3000_m>
*/
%>

<% /* 작성시간 : Mon Jul 18 15:10:55 KST 2016 */ %>