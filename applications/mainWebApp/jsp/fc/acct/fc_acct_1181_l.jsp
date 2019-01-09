<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*
	,	chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1181_LDataSet ds = (FC_ACCT_1181_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_1181_LCURLIST1Record rec = (FC_ACCT_1181_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clsf_cd"		, StringUtil.replaceToXml(rec.clsf_cd		)	);
			rx.add(record, "cd"				, StringUtil.replaceToXml(rec.cd			)	);
/*
			rx.addCData(record, "cdnm"		, rec.cdnm			);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm	);
			rx.addCData(record, "cdnm_cd"	, rec.cdnm_cd		);
			rx.addCData(record, "cdabrvnm_cd"	, rec.cdabrvnm_cd	);
*/
			rx.add(record, "cdnm"			, StringUtil.replaceToXml(rec.cdnm			));
			rx.add(record, "cd_abrv_nm"		, StringUtil.replaceToXml(rec.cd_abrv_nm	));
			rx.add(record, "cdnm_cd"		, StringUtil.replaceToXml(rec.cdnm_cd		));
			rx.add(record, "cdabrvnm_cd"	, StringUtil.replaceToXml(rec.cdabrvnm_cd	));			
			rx.add(record, "intg_cd"		, StringUtil.replaceToXml(rec.intg_cd		)	);
/*
			rx.addCData(record, "intg_nm"		, rec.intg_nm		);
*/
			rx.add(record, "intg_nm"		, StringUtil.replaceToXml(rec.intg_nm		));			
			rx.add(record, "presi_nm"		, StringUtil.replaceToXml(rec.presi_nm		) 	);
			rx.add(record, "bizcond"		, StringUtil.replaceToXml(rec.bizcond		)	);
			rx.add(record, "item"			, StringUtil.replaceToXml(rec.item			)	);
			rx.add(record, "zip1"			, StringUtil.replaceToXml(rec.zip1			)	);
			rx.add(record, "zip2"			, StringUtil.replaceToXml(rec.zip2			)	);
			rx.addCData(record, "addr1"			, StringUtil.replaceToXml(rec.addr1			)	);
			rx.addCData(record, "addr2"			, StringUtil.replaceToXml(rec.addr2			)	);
			rx.addCData(record, "addr3"			, StringUtil.replaceToXml(rec.addr3			)	);
			rx.addCData(record, "addr4"			, StringUtil.replaceToXml(rec.addr4			)	);
			rx.add(record, "email"			, StringUtil.replaceToXml(rec.email			)	);
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
<dataSet>
	<CURLIST1>
		<record>
			<clsf_cd/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
			<intg_cd/>
			<intg_nm/>
			<presi_nm/>
			<bizcond/>
			<item/>
			<zip1/>
			<zip2/>
			<addr1/>
			<addr2/>
			<addr3/>
			<addr4/>
			<email/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 12:50:21 KST 2009 */ %>