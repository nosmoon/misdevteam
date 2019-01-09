<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1404_MDataSet ds = (HD_DUTY_1404_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		
		/****** XX_EMP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_EMP_CLSF_LIST", "");

		for(int i = 0; i < ds.xx_emp_clsf_list.size(); i++) {
			HD_DUTY_1404_MXX_EMP_CLSF_LISTRecord rec = (HD_DUTY_1404_MXX_EMP_CLSF_LISTRecord)ds.xx_emp_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_emp_clsf_list.size());
		/****** XX_EMP_CLSF_LIST END */

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
<hd_duty_1404_m>
	<dataSet>
		<XX_EMP_CLSF_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_EMP_CLSF_LIST>
	</dataSet>
</hd_duty_1404_m>
*/
%>

<% /* 작성시간 : Tue Jan 31 11:33:18 KST 2012 */ %>