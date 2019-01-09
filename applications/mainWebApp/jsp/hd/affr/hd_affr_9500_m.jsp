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
	HD_AFFR_9500_MDataSet ds = (HD_AFFR_9500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** XX_LVCMPY_DTY BEGIN */
		recordSet = rx.add(dataSet, "XX_LVCMPY_DTY", "");

		for(int i = 0; i < ds.xx_lvcmpy_dty.size(); i++) {
			HD_AFFR_9500_MXX_LVCMPY_DTYRecord rec = (HD_AFFR_9500_MXX_LVCMPY_DTYRecord)ds.xx_lvcmpy_dty.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		//rx.add(recordSet, "totalcnt", ds.xx_lvcmpy_dty.size());
		/****** XX_LVCMPY_DTY END */

		/****** XX_BANK_CD BEGIN */
		recordSet = rx.add(dataSet, "XX_BANK_CD", "");

		for(int i = 0; i < ds.xx_bank_cd.size(); i++) {
			HD_AFFR_9500_MXX_BANK_CDRecord rec = (HD_AFFR_9500_MXX_BANK_CDRecord)ds.xx_bank_cd.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		//rx.add(recordSet, "totalcnt", ds.xx_bank_cd.size());
		/****** XX_BANK_CD END */

		/****** XX_MEMB_CLSF BEGIN */
		recordSet = rx.add(dataSet, "XX_MEMB_CLSF", "");

		for(int i = 0; i < ds.xx_memb_clsf.size(); i++) {
			HD_AFFR_9500_MXX_MEMB_CLSFRecord rec = (HD_AFFR_9500_MXX_MEMB_CLSFRecord)ds.xx_memb_clsf.get(i);
			int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		//rx.add(recordSet, "totalcnt", ds.xx_memb_clsf.size());
		/****** XX_MEMB_CLSF END */

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
<hd_affr_9500_m>
	<dataSet>
		<XX_LVCMPY_DTY>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_LVCMPY_DTY>
	</dataSet>
</hd_affr_9500_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9500_m>
	<dataSet>
		<XX_BANK_CD>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_BANK_CD>
	</dataSet>
</hd_affr_9500_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9500_m>
	<dataSet>
		<XX_MEMB_CLSF>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_MEMB_CLSF>
	</dataSet>
</hd_affr_9500_m>
*/
%>

<% /* 작성시간 : Fri Aug 25 14:04:18 KST 2017 */ %>