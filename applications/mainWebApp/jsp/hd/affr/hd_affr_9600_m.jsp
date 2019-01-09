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
	HD_AFFR_9600_MDataSet ds = (HD_AFFR_9600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** XX_STLM_DESTY BEGIN */
		recordSet = rx.add(dataSet, "XX_STLM_DESTY", "");

		for(int i = 0; i < ds.xx_stlm_desty.size(); i++) {
			HD_AFFR_9600_MXX_STLM_DESTYRecord rec = (HD_AFFR_9600_MXX_STLM_DESTYRecord)ds.xx_stlm_desty.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_stlm_desty.size());
		/****** XX_STLM_DESTY END */

		/****** XX_BANK_CD BEGIN */
		recordSet = rx.add(dataSet, "XX_BANK_CD", "");

		for(int i = 0; i < ds.xx_bank_cd.size(); i++) {
			HD_AFFR_9600_MXX_BANK_CDRecord rec = (HD_AFFR_9600_MXX_BANK_CDRecord)ds.xx_bank_cd.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_bank_cd.size());
		/****** XX_BANK_CD END */

		/****** XX_EXPN_CLSF BEGIN */
		recordSet = rx.add(dataSet, "XX_EXPN_CLSF", "");

		for(int i = 0; i < ds.xx_expn_clsf.size(); i++) {
			HD_AFFR_9600_MXX_EXPN_CLSFRecord rec = (HD_AFFR_9600_MXX_EXPN_CLSFRecord)ds.xx_expn_clsf.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			rx.add(record, "pcode", rec.mang_cd_2 );
			rx.add(record, "pcode2", rec.mang_cd_3 );
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_expn_clsf.size());
		/****** XX_EXPN_CLSF END */

		/****** XX_MEMB_CLSF BEGIN */
		recordSet = rx.add(dataSet, "XX_MEMB_CLSF", "");

		for(int i = 0; i < ds.xx_memb_clsf.size(); i++) {
			HD_AFFR_9600_MXX_MEMB_CLSFRecord rec = (HD_AFFR_9600_MXX_MEMB_CLSFRecord)ds.xx_memb_clsf.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_memb_clsf.size());
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
<hd_affr_9600_m>
	<dataSet>
		<XX_STLM_DESTY>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_STLM_DESTY>
	</dataSet>
</hd_affr_9600_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9600_m>
	<dataSet>
		<XX_BANK_CD>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_BANK_CD>
	</dataSet>
</hd_affr_9600_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9600_m>
	<dataSet>
		<XX_EXPN_CLSF>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_EXPN_CLSF>
	</dataSet>
</hd_affr_9600_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9600_m>
	<dataSet>
		<XX_MEMB_CLSF>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</XX_MEMB_CLSF>
	</dataSet>
</hd_affr_9600_m>
*/
%>

<% /* 작성시간 : Mon Aug 28 14:19:40 KST 2017 */ %>