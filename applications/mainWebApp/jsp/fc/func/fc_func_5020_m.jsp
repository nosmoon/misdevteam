<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_5020_MDataSet ds = (FC_FUNC_5020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_dlco_clsf", ds.getXx_dlco_clsf());
		rx.add(dataSet, "xx_dlco_clsf_cd", ds.getXx_dlco_clsf_cd());
		
		/****** XX_INSR_CLSF_CDLIST BEGIN */
		recordSet = rx.add(dataSet, "XX_INSR_CLSF_CDLIST", "");

		for(int i = 0; i < ds.xx_insr_clsf_cdlist.size(); i++) {
			FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord rec = (FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord)ds.xx_insr_clsf_cdlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_insr_clsf_cdlist.size());
		/****** XX_INSR_CLSF_CDLIST END */

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
<fc_func_5020_m>
	<dataSet>
		<XX_INSR_CLSF_CDLIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_INSR_CLSF_CDLIST>
	</dataSet>
</fc_func_5020_m>
*/
%>

<% /* �ۼ��ð� : Fri Jan 06 18:47:33 KST 2012 */ %>