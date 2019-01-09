<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>
  
<%  
	RwXml rx = new RwXml();
	AD_RES_1010_SDataSet ds = (AD_RES_1010_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {	
		int gridData2 = rx.add(root, "gridData2", "");
		rx.add(gridData2, "preng_cnt", ds.preng_cnt);

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1010_SCURLISTRecord rec = (AD_RES_1010_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");

			rx.add(record, "sect_clas_cd", rec.sect_clas_cd);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd); 
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "edt_clsf", rec.edt_clsf);
			rx.add(record, "bgn_side", rec.bgn_side);
			rx.add(record, "end_side", rec.end_side);
			rx.add(record, "issu_size", rec.issu_size); 
			rx.add(record, "issu_cnt", rec.issu_cnt);
			rx.add(record, "tabl_clsf", rec.tabl_clsf);
			rx.add(record, "pre_sect_clas_cd", rec.sect_clas_cd);
			rx.add(record, "pre_sect_nm_cd", rec.sect_nm_cd); 
	
		}

	}
	catch (Exception e) {
	}
	finally {
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
			<wkdy/>
			<sect_clas_cd/>
			<sect_nm_cd/>
			<sect_cd/>
			<bgn_side/>
			<end_side/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jan 22 11:03:29 KST 2009 */ %>