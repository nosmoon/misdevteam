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
	HD_INFO_2200_LDataSet ds = (HD_INFO_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN  신분증타입*/
		recordSet = rx.add(dataSet, "id_card_typ", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INFO_2200_LCURLIST3Record rec = (HD_INFO_2200_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN 실비변상여부 */
		recordSet = rx.add(dataSet, "real_fee_paymt_yn", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INFO_2200_LCURLIST2Record rec = (HD_INFO_2200_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN 발급여부 */
		recordSet = rx.add(dataSet, "issu_yn", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_2200_LCURLIST1Record rec = (HD_INFO_2200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST1 BEGIN 발급여부2 */
		recordSet = rx.add(dataSet, "issu_yn2", "");
		int tm_record2 = rx.add(recordSet, "item", "");
		rx.add(tm_record2, "value", "");
		rx.add(tm_record2, "label", "전체");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_2200_LCURLIST1Record rec = (HD_INFO_2200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
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
<hd_info_2200_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_info_2200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_2200_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_info_2200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_2200_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_2200_l>
*/
%>

<% /* 작성시간 : Mon Jun 01 15:09:18 KST 2009 */ %>