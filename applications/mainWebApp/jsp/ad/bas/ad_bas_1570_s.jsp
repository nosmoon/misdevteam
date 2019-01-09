<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1570_SDataSet ds = (AD_BAS_1570_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	String errcode = "";
	String errmsg = "";

	resData = rx.add(root, "resData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		resform = rx.add(resData, "resform", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1570_SCURLISTRecord rec = (AD_BAS_1570_SCURLISTRecord)ds.curlist.get(i);

			rx.add(resform, "cmpy_cd", rec.cmpy_cd);
			rx.add(resform, "seq", rec.seq);
			rx.add(resform, "night_shift_dt", rec.night_shift_dt);
			rx.add(resform, "duty_main_empno", rec.duty_main_empno);
			rx.add(resform, "duty_main_empnm", rec.duty_main_empnm); 
			rx.add(resform, "duty_sub_empno", rec.duty_sub_empno);
			rx.add(resform, "duty_sub_empnm", rec.duty_sub_empnm);
			rx.add(resform, "make_centr_main_empno", rec.make_centr_main_empno);
			rx.add(resform, "make_centr_main_empnm", rec.make_centr_main_empnm);
			rx.add(resform, "make_centr_sub_empno", rec.make_centr_sub_empno);
			rx.add(resform, "make_centr_sub_empnm", rec.make_centr_sub_empnm);
			rx.add(resform, "dd_nwsp_cont", rec.dd_nwsp_cont);
			rx.add(resform, "incmg_pers", rec.incmg_pers);
			rx.add(resform, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(resform, "chg_pers", rec.chg_pers);
			rx.add(resform, "chg_dt_tm", rec.chg_dt_tm);	
			rx.add(resform, "flag", "");			
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
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
			<cmpy_cd/>
			<seq/>
			<night_shift_dt/>
			<duty_main_empno/>
			<duty_sub_empno/>
			<make_centr_main_empno/>
			<make_centr_sub_empno/>
			<dd_nwsp_cont/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 16 15:21:24 KST 2009 */ %>