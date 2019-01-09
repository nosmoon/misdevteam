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
* 파일명 : se_trg_2010_l.jsp
* 기능 : 담당평가결과조회
* 작성일자 : 2009-04-10
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
	SE_TRG_2010_LDataSet ds = (SE_TRG_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");
	resform = rx.add(resData, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "gridtitle", ds.gridtitle);
		}
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_2010_LCURLISTRecord rec = (SE_TRG_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			//rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "part_cd", rec.part_cd);
			//rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			//rx.add(record, "evlu_grp", rec.evlu_grp);
			rx.add(record, "base_val", rec.base_val);
			rx.add(record, "trgt1", rec.trgt1);
			rx.add(record, "rslt1", rec.rslt1);
			rx.add(record, "attain_rate1", rec.attain_rate1);
			rx.add(record, "meda_rank1", rec.meda_rank1);
			rx.add(record, "trgt2", rec.trgt2);
			rx.add(record, "rslt2", rec.rslt2);
			rx.add(record, "attain_rate2", rec.attain_rate2);
			rx.add(record, "meda_rank2", rec.meda_rank2);
			rx.add(record, "trgt3", rec.trgt3);
			rx.add(record, "rslt3", rec.rslt3);
			rx.add(record, "attain_rate3", rec.attain_rate3);
			rx.add(record, "meda_rank3", rec.meda_rank3);
			rx.add(record, "trgt4", rec.trgt4);
			rx.add(record, "rslt4", rec.rslt4);
			rx.add(record, "attain_rate4", rec.attain_rate4);
			rx.add(record, "meda_rank4", rec.meda_rank4);
			rx.add(record, "trgt5", rec.trgt5);
			rx.add(record, "rslt5", rec.rslt5);
			rx.add(record, "attain_rate5", rec.attain_rate5);
			rx.add(record, "meda_rank5", rec.meda_rank5);
			rx.add(record, "trgt6", rec.trgt6);
			rx.add(record, "rslt6", rec.rslt6);
			rx.add(record, "attain_rate6", rec.attain_rate6);
			rx.add(record, "meda_rank6", rec.meda_rank6);
			rx.add(record, "rank_scor", rec.rank_scor);
			rx.add(record, "rslt_scor", rec.rslt_scor);
			rx.add(record, "rvis_scor", rec.rvis_scor);
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
			<area_cd/>
			<chrg_pers_nm/>
			<evlu_grp/>
			<base_val/>
			<trgt1/>
			<rslt1/>
			<attain_rate1/>
			<meda_rank1/>
			<trgt2/>
			<rslt2/>
			<attain_rate2/>
			<meda_rank2/>
			<trgt3/>
			<rslt3/>
			<attain_rate3/>
			<meda_rank3/>
			<trgt4/>
			<rslt4/>
			<attain_rate4/>
			<meda_rank4/>
			<trgt5/>
			<rslt5/>
			<attain_rate5/>
			<meda_rank5/>
			<trgt6/>
			<rslt6/>
			<attain_rate6/>
			<meda_rank6/>
			<rank_scor/>
			<rslt_scor/>
			<rvis_scor/>
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
		<gridtitle/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Apr 10 11:09:53 KST 2009 */ %>