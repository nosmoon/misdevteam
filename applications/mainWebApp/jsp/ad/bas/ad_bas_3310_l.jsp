<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3310_l.jsp
* 기능 : 
* 작성일자 : 2009-02-17
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
System.out.println("JSP 고고");

	RwXml rx = new RwXml();
	AD_BAS_3310_LDataSet ds = (AD_BAS_3310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	//int resData = rx.add(root, "resData", "");
	int gridData = rx.add(root, "gridData", "");
	//int gridData = rx.add(resData, "gridData", "");

	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3310_LCURLISTRecord rec = (AD_BAS_3310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "addr", rec.addr);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "email", rec.email);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "mortg_clsf", rec.mortg_clsf);
			rx.add(record, "mortg_amt", rec.mortg_amt);
			rx.add(record, "cntr_prd_frdt", rec.cntr_prd_frdt);
			rx.add(record, "cntr_prd_todt", rec.cntr_prd_todt);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "mchrg_nm", rec.mchrg_nm);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
//System.out.println(rx.getXml());

	}
		
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<prfl_no/>
			<flnm/>
			<dlco_nm/>
			<cur_job/>
			<offi_tel_no/>
			<home_tel_no/>
			<ceph_no1/>
			<email/>
			<cust_mang_item/>
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

<% /* 작성시간 : Tue Feb 17 12:53:59 KST 2009 */ %>