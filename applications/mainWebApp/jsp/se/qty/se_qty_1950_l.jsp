<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_1510_l.jsp
* ��� : �����μ�����ڷ� - ����Ʈ ��ȸ
* �ۼ����� : 2009-02-20
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_1950_LDataSet ds = (SE_QTY_1950_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1950_LCURLISTRecord rec = (SE_QTY_1950_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.dept_nm);
			rx.add(record, "team_cd", rec.dept_cd);		
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "thmmqty", rec.thmmqty);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
