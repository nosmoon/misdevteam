<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3710_l.jsp
* 기능 : 조중동광고데이터베이스 목록조회
* 작성일자 : 2011.03.28
* 작성자 : KBS
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3720_LDataSet ds = (AD_BAS_3720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");	
//	int resForm = rx.add(resData, "resForm", "");
	try
	{
		int gridData = rx.add(resData, "gridData", "");
		for(int i=0; i<ds.curlist.size(); i++)
		{
			AD_BAS_3720_LCURLISTRecord rec = (AD_BAS_3720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "sun", rec.sun);
			rx.add(record, "sun_cnt", rec.sun_cnt);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "mon_cnt", rec.mon_cnt);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "tue_cnt", rec.tue_cnt);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "wed_cnt", rec.wed_cnt);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "thr_cnt", rec.thr_cnt); 
			rx.add(record, "fri", rec.fri);
			rx.add(record, "fri_cnt", rec.fri_cnt);
			rx.add(record, "sat", rec.sat);
			rx.add(record, "sat_cnt", rec.sat_cnt);
			
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
