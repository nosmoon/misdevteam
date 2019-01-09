<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_2300_LDataSet ds = (HD_INFO_2300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_2300_LCURLIST1Record rec = (HD_INFO_2300_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rownum", rec.rownum);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "rptv_posi_cd", "");
			if("10".equalsIgnoreCase(rec.rptv_posi_cd)){		// 대표직책코드=직책
				rx.add(record, "rptv_posi_nm", rec.dty_nm);
				rx.add(record, "chk01", "1");
				rx.add(record, "chk02", "0");
			}else if("20".equalsIgnoreCase(rec.rptv_posi_cd)){	// 대표직책코드=직급
				rx.add(record, "rptv_posi_nm", rec.posi_nm);
				rx.add(record, "chk01", "0");
				rx.add(record, "chk02", "1");
			}else{
				rx.add(record, "rptv_posi_nm","");
				rx.add(record, "chk01", "0");
				rx.add(record, "chk02", "0");
			}
			
			rx.add(record, "emp_srt_seq", rec.emp_srt_seq);
			rx.add(record, "emp_album_clsf", StringUtil.replaceToXml(rec.emp_album_clsf));
			//rx.add(record, "rownum", StringUtil.replaceToXml(rec.rownum));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_info_2300_l>
	<dataSet>
		<CURLIST1>
			<record>
				<rownum/>
				<emp_no/>
				<nm_korn/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_2300_l>
*/
%>

<% /* 작성시간 : Wed Jun 03 10:24:05 KST 2009 */ %>