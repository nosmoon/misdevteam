<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1310_l.jsp
* 기능 : 월별확장및성장실적
* 작성일자 : 2009-04-09
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_TRG_1310_LDataSet ds = (SE_TRG_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1310_LCURLISTRecord rec = (SE_TRG_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "feat_clsf", rec.feat_clsf);
			//rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			//rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "col1", rec.col1);
			rx.add(record, "col2", rec.col2);
			rx.add(record, "col3", rec.col3);
			rx.add(record, "col4", rec.col4);
			rx.add(record, "col5", rec.col5);
			rx.add(record, "col6", rec.col6);
			rx.add(record, "col7", rec.col7);
			rx.add(record, "col8", rec.col8);
			rx.add(record, "col9", rec.col9);
			rx.add(record, "col10", rec.col10);
			rx.add(record, "col11", rec.col11);
			rx.add(record, "col12", rec.col12);
			rx.add(record, "col13", rec.col13);
			rx.add(record, "col14", rec.col14);
			rx.add(record, "col15", rec.col15);
			rx.add(record, "col16", rec.col16);
			rx.add(record, "col17", rec.col17);
			rx.add(record, "col18", rec.col18);
			rx.add(record, "col19", rec.col19);
			rx.add(record, "col20", rec.col20);
			rx.add(record, "col21", rec.col21);
			rx.add(record, "col22", rec.col22);
			rx.add(record, "col23", rec.col23);
			rx.add(record, "col24", rec.col24);
			rx.add(record, "col25", rec.col25);
			rx.add(record, "col26", rec.col26);
			rx.add(record, "col27", rec.col27);
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
<resData>
	<CURLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers_nm/>
			<feat_clsf/>
			<col1/>
			<col2/>
			<col3/>
			<col4/>
			<col5/>
			<col6/>
			<col7/>
			<col8/>
			<col9/>
			<col10/>
			<col11/>
			<col12/>
			<col13/>
			<col14/>
			<col15/>
			<col16/>
			<col17/>
			<col18/>
			<col19/>
			<col20/>
			<col21/>
			<col22/>
			<col23/>
			<col24/>
			<col25/>
			<col26/>
			<col27/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:58:30 KST 2009 */ %>