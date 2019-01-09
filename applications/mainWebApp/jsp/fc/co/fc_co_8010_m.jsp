<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
    ,   chosun.ciis.co.base.util.*;	
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_8010_MDataSet ds = (FC_CO_8010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_CO_8010_MCURLIST2Record rec = (FC_CO_8010_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");					
            rx.add(record, "cmpy_cd"        , StringUtil.replaceToXml(rec.cmpy_cd       )   );
            rx.add(record, "job_clsf"       , StringUtil.replaceToXml(rec.job_clsf      )   );
            rx.add(record, "cd_clsf"        , StringUtil.replaceToXml(rec.cd_clsf       )   );
            rx.add(record, "cd"             , StringUtil.replaceToXml(rec.cd            )   );
            rx.add(record, "cdnm"           , StringUtil.replaceToXml(rec.cdnm          )   );
            rx.add(record, "cd_abrv_nm"     , StringUtil.replaceToXml(rec.cd_abrv_nm    )   );
            rx.add(record, "cdnm_cd"        , StringUtil.replaceToXml(rec.cdnm_cd       )   );
            rx.add(record, "cdabrvnm_cd"    , StringUtil.replaceToXml(rec.cdabrvnm_cd   ) 	);		
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_CO_8010_MCURLIST1Record rec = (FC_CO_8010_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cd_clsf", rec.cd_clsf);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<job_clsf/>
			<cd_clsf/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<job_clsf/>
			<cd_clsf/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Mar 16 17:56:47 KST 2009 */ %>