<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*		
	,	chosun.ciis.hd.crcl.rec.*
	,	chosun.ciis.hd.crcl.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CRCL_1400_LDataSet ds = (HD_CRCL_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CRCL_1400_LCURLISTRecord rec = (HD_CRCL_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "paty_crc_nm", rec.paty_crc_nm);
			//if(rec.fix_fix_rate_clsf.equals("1")){	//����
				rx.add(record, "paty_crc_dus", DigitUtil.nf_format(rec.paty_crc_dus));		
			//}else if(rec.fix_fix_rate_clsf.equals("2")){	//����			
			//	rx.add(record, "paty_crc_dus", DigitUtil.cutUnderPoint(rec.paty_crc_dus,1)+"%");				
			//}
			rx.add(record, "entr_dt", rec.entr_dt);
			rx.add(record, "lve_dt", rec.lve_dt);
			rx.add(record, "entr_yn", rec.entr_yn);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<flnm/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
			<paty_crc_nm/>
			<paty_crc_dus/>
			<entr_dt/>
			<lve_dt/>
			<entr_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Feb 18 14:32:07 KST 2009 */ %>