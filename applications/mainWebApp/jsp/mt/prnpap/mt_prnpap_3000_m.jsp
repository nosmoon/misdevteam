<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3000_MDataSet ds = (MT_PRNPAP_3000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN 중량계산*/
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PRNPAP_3000_MCURLIST4Record rec = (MT_PRNPAP_3000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "roll_wgt", rec.roll_wgt);
			//rx.add(record, "roll_wgt", StringUtil.replaceToXml(rec.roll_wgt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		
		/****** CURLIST3 BEGIN 용지구분*/
		
		 recordSet = rx.add(dataSet, "pa_gb", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PRNPAP_3000_MCURLIST3Record rec = (MT_PRNPAP_3000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "pa_gb", "");
			//rx.add(record, "value", rec.matr_cd);
			rx.add(record, "pa_gb2", rec.paper_clsf_cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN  자재코드(제지사) */
		recordSet = rx.add(dataSet, "matr_cd2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3000_MCURLIST2Record rec = (MT_PRNPAP_3000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_cd+" "+rec.matr_nm);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN 자재코드 */
		recordSet = rx.add(dataSet, "matr_cd", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3000_MCURLIST1Record rec = (MT_PRNPAP_3000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.matr_cd+" "+rec.matr_nm);
			rx.add(record, "value", rec.matr_cd);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
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
<mt_prnpap_3000_m>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_prnpap_3000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_prnpap_3000_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_prnpap_3000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_prnpap_3000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<matr_cd/>
				<matr_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_prnpap_3000_m>
*/
%>

<% /* 작성시간 : Mon Apr 27 15:54:58 KST 2009 */ %>