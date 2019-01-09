<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_3310_MDataSet ds = (HD_VACA_3310_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

 
   System.out.println(" eeee" ) ;
	try {
		/****** XX_EMP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_EMP_CLSF_LIST", "");
 
 System.out.print(" ddd11" + recordSet) ;
		for(int i = 0; i < ds.xx_emp_clsf_list.size(); i++) {
			HD_VACA_3310_MXX_EMP_CLSF_LISTRecord rec = (HD_VACA_3310_MXX_EMP_CLSF_LISTRecord)ds.xx_emp_clsf_list.get(i);
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
<hd_vaca_3310_m>
	<dataSet>
		<XX_EMP_CLSF_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_EMP_CLSF_LIST>
	</dataSet>
</hd_vaca_3310_m>
*/
%>

<% /* 작성시간 : Thu Jul 30 10:21:42 KST 2015 */ %>