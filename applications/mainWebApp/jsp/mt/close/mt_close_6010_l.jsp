<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_close_6010_l.jsp
* 기능 : 
* 작성일자 : 2010-05-18
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_6010_LDataSet ds = (MT_CLOSE_6010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = 0;
	//int resform = 0;
	//int gridData = 0;
	int formData			= 0;
	int recordSet			= 0;
	
	//resData = rx.add(root, "resData", "");
	//resform = rx.add(resData, "resform", "");
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData, "pre_year", ds.pre_year);
	rx.add(formData, "pre_month", ds.pre_month);
	rx.add(formData, "cur_month", ds.cur_month);
	formData				= rx.add(formData	, "gridData"		, "");
	
	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_6010_LCURLISTRecord rec = (MT_CLOSE_6010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "title", rec.title);
			rx.add(record, "pre_year", rec.pre_year);
			rx.add(record, "pre_month", rec.pre_month);
			rx.add(record, "cur_month", rec.cur_month);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "base_yymm", rec.base_yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "seq", rec.seq);
		}
		
		recordSet			= rx.add(formData	, "curlist2"		, "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_CLOSE_6010_LCURLIST2Record rec = (MT_CLOSE_6010_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "title", rec.title);
			rx.add(record, "pre_year", rec.pre_year);
			rx.add(record, "pre_month", rec.pre_month);
			rx.add(record, "cur_month", rec.cur_month);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "base_yymm", rec.base_yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "seq", rec.seq);
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
	<CURLIST2>
		<record>
			<gubun/>
			<title/>
			<pre_year/>
			<pre_month/>
			<cur_month/>
			<remk/>
			<base_yymm/>
			<fac_clsf/>
			<seq/>
		</record>
	</CURLIST2>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<gubun/>
			<title/>
			<pre_year/>
			<pre_month/>
			<cur_month/>
			<remk/>
			<base_yymm/>
			<fac_clsf/>
			<seq/>
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
		<curlist2/>
		<pre_year/>
		<pre_month/>
		<cur_month/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue May 18 09:49:05 KST 2010 */ %>