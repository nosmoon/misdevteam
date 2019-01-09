<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
    ,   chosun.ciis.co.base.util.*;	
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1047_LDataSet ds = (FC_ACCT_1047_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1047_LCURLISTRecord rec = (FC_ACCT_1047_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");		
			rx.add(record, "chk1"           , StringUtil.replaceToXml(rec.chk1          )   );
			rx.add(record, "chk2"           , StringUtil.replaceToXml(rec.chk2          )   );
			rx.add(record, "mang_item_cd"   , StringUtil.replaceToXml(rec.mang_item_cd  )   );
			rx.add(record, "cdnm"           , StringUtil.replaceToXml(rec.cdnm          )   );
			rx.add(record, "drcr_clsf"      , StringUtil.replaceToXml(rec.drcr_clsf     )   );
			rx.add(record, "mand_reg_yn"    , StringUtil.replaceToXml(rec.mand_reg_yn   )   );
			rx.add(record, "bal_mang_clsf"  , StringUtil.replaceToXml(rec.bal_mang_clsf )   );
			rx.add(record, "prty_rank"      , StringUtil.replaceToXml(rec.prty_rank     )   );
			rx.add(record, "prty_rank2"     , StringUtil.replaceToXml(rec.prty_rank2    )   );
			rx.add(record, "mang_item_nm"   , StringUtil.replaceToXml(rec.mang_item_nm  )   );
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<chk1/>
			<chk2/>
			<mang_item_cd/>
			<cdnm/>
			<drcr_clsf/>
			<mand_reg_yn/>
			<bal_mang_clsf/>
			<prty_rank/>
			<prty_rank2/>
			<mang_item_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 20:09:35 KST 2009 */ %>