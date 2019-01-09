<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_BNS_1020_LDataSet ds = (SE_BNS_1020_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int dataSet				= 0;
	int recordSet			= 0;	
	dataSet 				= rx.add(root	, "gridDetail"	, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1020_LCURLISTRecord rec = (SE_BNS_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet		, "record"			, "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bns_item_cd", rec.bns_item_cd);
			rx.add(record, "bns_item_nm", rec.bns_item_nm);
			rx.add(record, "divn_dt", rec.divn_dt);
			rx.add(record, "compen_divn_amt", rec.compen_divn_amt);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<se_bns_1020_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<dept_cd/>
				<dept_nm/>
				<part_cd/>
				<part_nm/>
				<area_cd/>
				<area_nm/>
				<bo_nm/>
				<bo_cd/>
				<bo_seq/>
				<bo_head_nm/>
				<bns_item_cd/>
				<bns_item_nm/>
				<divn_dt/>
				<compen_divn_amt/>
				<qunt/>
				<rcpm_amt/>
				<bal/>
			</record>
		</CURLIST>
	</dataSet>
</se_bns_1020_l>
*/
%>

<% /* 작성시간 : Mon Oct 30 14:25:43 KST 2017 */ %>
