<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_5050_LDataSet ds = (PR_PRTEXEC_5050_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
        //본사용지 사용외간
		recordSet = rx.add(dataSet, "oth_medi_1", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST5Record rec = (PR_PRTEXEC_5050_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		//본사외용지 사용외간
		recordSet = rx.add(dataSet, "oth_medi_2", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST6Record rec = (PR_PRTEXEC_5050_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		//섹션
		recordSet = rx.add(dataSet, "sect_cd", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST4Record rec = (PR_PRTEXEC_5050_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "label", rec.cd+" "+rec.cd_abrv_nm);
            rx.add(record, "","");
		}
//		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		/****** CURLIST3 BEGIN */
        //용지 규격 
		recordSet = rx.add(dataSet, "pap_std", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST3Record rec = (PR_PRTEXEC_5050_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "label", rec.cd+ " " + rec.cd_abrv_nm);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST2Record rec = (PR_PRTEXEC_5050_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "label", rec.cdnm);
			rx.add(record, "label", rec.cd+" "+rec.cd_abrv_nm);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST1Record rec = (PR_PRTEXEC_5050_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
//		rx.add(recordSet, "totalcnt", ds.curlist.size());

		recordSet = rx.add(dataSet, "dual_out_clsf", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST7Record rec = (PR_PRTEXEC_5050_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "prt_clsf", "");
		for(int i = 0; i < ds.curlist8.size(); i++) {
			PR_PRTEXEC_5050_LCURLIST8Record rec = (PR_PRTEXEC_5050_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "uprc_yn", ds.uprc_yn);
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 12 17:45:47 KST 2009 */ %>