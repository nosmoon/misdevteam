<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2126_SDataSet ds = (FC_ACCT_2126_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_MANG_ITEM_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_ITEM_CD_LIST", "");

		for(int i = 0; i < ds.cur_mang_item_cd_list.size(); i++) {
			FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord rec = (FC_ACCT_2126_SCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "mang_item_cd", rec.mang_item_cd);
			//rx.add(record, "drcr_clsf", rec.drcr_clsf);
			//rx.add(record, "mang_item_val", rec.mang_item_val);
			rx.add(record, "mang_item_cd", StringUtil.replaceToXml(rec.mang_item_cd));
			rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
			rx.add(record, "mang_item_val", StringUtil.replaceToXml(rec.mang_item_val));
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_item_cd_list.size());
		/****** CUR_MANG_ITEM_CD_LIST END */

		/****** CUR_MANG_ITEM_CD_LIST1 BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_ITEM_CD_LIST1", "");

		for(int i = 0; i < ds.cur_mang_item_cd_list1.size(); i++) {
			FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record rec = (FC_ACCT_2126_SCUR_MANG_ITEM_CD_LIST1Record)ds.cur_mang_item_cd_list1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_item_cd_list1.size());
		/****** CUR_MANG_ITEM_CD_LIST1 END */

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
<fc_acct_2126_s>
	<dataSet>
		<CUR_MANG_ITEM_CD_LIST>
			<record>
				<mang_item_cd/>
				<drcr_clsf/>
				<mang_item_val/>
			</record>
		</CUR_MANG_ITEM_CD_LIST>
	</dataSet>
</fc_acct_2126_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2126_s>
	<dataSet>
		<CUR_MANG_ITEM_CD_LIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CUR_MANG_ITEM_CD_LIST1>
	</dataSet>
</fc_acct_2126_s>
*/
%>

<% /* 작성시간 : Sat Aug 29 16:53:47 KST 2009 */ %>