<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3171_LDataSet ds = (MC_COST_3171_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_COST_3171_LCURLISTRecord rec = (MC_COST_3171_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "brnm1", rec.brnm1);
			//rx.add(record, "brcd", rec.brcd);
			//rx.add(record, "clas_nm", rec.clas_nm);
			//rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			//rx.add(record, "dstb_dept_nm2", rec.dstb_dept_nm2);
			//rx.add(record, "bgsumamt", rec.bgsumamt);
			//rx.add(record, "amt0100", rec.amt0100);
			//rx.add(record, "amt0200", rec.amt0200);
			//rx.add(record, "amt0300", rec.amt0300);
			//rx.add(record, "amt0301", rec.amt0301);
			//rx.add(record, "amt0302", rec.amt0302);
			//rx.add(record, "amt0303", rec.amt0303);
			//rx.add(record, "amt0304", rec.amt0304);
			//rx.add(record, "amt0305", rec.amt0305);
			//rx.add(record, "amt0306", rec.amt0306);
			//rx.add(record, "amt0307", rec.amt0307);
			//rx.add(record, "amt0308", rec.amt0308);
			//rx.add(record, "amt0400", rec.amt0400);
			//rx.add(record, "amt0401", rec.amt0401);
			//rx.add(record, "amt0402", rec.amt0402);
			//rx.add(record, "amt0403", rec.amt0403);
			//rx.add(record, "amt0500", rec.amt0500);
			//rx.add(record, "amt0501", rec.amt0501);
			//rx.add(record, "amt0502", rec.amt0502);
			//rx.add(record, "amt0503", rec.amt0503);
			//rx.add(record, "amt0504", rec.amt0504);
			//rx.add(record, "amt0505", rec.amt0505);
			//rx.add(record, "amt0506", rec.amt0506);
			//rx.add(record, "amt0600", rec.amt0600);
			//rx.add(record, "amt0601", rec.amt0601);
			//rx.add(record, "amt0602", rec.amt0602);
			//rx.add(record, "amt0603", rec.amt0603);
			//rx.add(record, "amt0604", rec.amt0604);
			//rx.add(record, "amt0605", rec.amt0605);
			//rx.add(record, "amt0606", rec.amt0606);
			//rx.add(record, "amt0611", rec.amt0611);
			//rx.add(record, "amt0612", rec.amt0612);
			//rx.add(record, "amt0613", rec.amt0613);
			//rx.add(record, "amt0614", rec.amt0614);
			//rx.add(record, "amt0615", rec.amt0615);
			//rx.add(record, "amt0616", rec.amt0616);
			//rx.add(record, "amt0617", rec.amt0617);
			//rx.add(record, "amt0621", rec.amt0621);
			//rx.add(record, "amt0631", rec.amt0631);
			//rx.add(record, "amt0632", rec.amt0632);
			//rx.add(record, "amt0700", rec.amt0700);
			//rx.add(record, "amt0701", rec.amt0701);
			//rx.add(record, "amt0702", rec.amt0702);
			//rx.add(record, "amt0703", rec.amt0703);
			//rx.add(record, "amt0704", rec.amt0704);
			//rx.add(record, "amt0705", rec.amt0705);
			//rx.add(record, "amt0706", rec.amt0706);
			//rx.add(record, "amt0707", rec.amt0707);
			//rx.add(record, "amt0708", rec.amt0708);
			//rx.add(record, "amt0709", rec.amt0709);
			//rx.add(record, "amt0710", rec.amt0710);
			//rx.add(record, "amt0711", rec.amt0711);
			//rx.add(record, "amt0712", rec.amt0712);
			//rx.add(record, "amt9999", rec.amt9999);
			rx.add(record, "brnm1", StringUtil.replaceToXml(rec.brnm1));
			rx.add(record, "brcd", StringUtil.replaceToXml(rec.brcd));
			rx.add(record, "clas_nm", StringUtil.replaceToXml(rec.clas_nm));
			rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			rx.add(record, "dstb_dept_nm2", StringUtil.replaceToXml(rec.dstb_dept_nm2));
			rx.add(record, "bgsumamt", StringUtil.replaceToXml(rec.bgsumamt));
			rx.add(record, "amt0100", StringUtil.replaceToXml(rec.amt0100));
			rx.add(record, "amt0200", StringUtil.replaceToXml(rec.amt0200));
			rx.add(record, "amt0300", StringUtil.replaceToXml(rec.amt0300));
			rx.add(record, "amt0301", StringUtil.replaceToXml(rec.amt0301));
			rx.add(record, "amt0302", StringUtil.replaceToXml(rec.amt0302));
			rx.add(record, "amt0303", StringUtil.replaceToXml(rec.amt0303));
			rx.add(record, "amt0304", StringUtil.replaceToXml(rec.amt0304));
			rx.add(record, "amt0305", StringUtil.replaceToXml(rec.amt0305));
			rx.add(record, "amt0306", StringUtil.replaceToXml(rec.amt0306));
			rx.add(record, "amt0307", StringUtil.replaceToXml(rec.amt0307));
			rx.add(record, "amt0308", StringUtil.replaceToXml(rec.amt0308));
			rx.add(record, "amt0400", StringUtil.replaceToXml(rec.amt0400));
			rx.add(record, "amt0401", StringUtil.replaceToXml(rec.amt0401));
			rx.add(record, "amt0402", StringUtil.replaceToXml(rec.amt0402));
			rx.add(record, "amt0403", StringUtil.replaceToXml(rec.amt0403));
			rx.add(record, "amt0500", StringUtil.replaceToXml(rec.amt0500));
			rx.add(record, "amt0501", StringUtil.replaceToXml(rec.amt0501));
			rx.add(record, "amt0502", StringUtil.replaceToXml(rec.amt0502));
			rx.add(record, "amt0503", StringUtil.replaceToXml(rec.amt0503));
			rx.add(record, "amt0504", StringUtil.replaceToXml(rec.amt0504));
			rx.add(record, "amt0505", StringUtil.replaceToXml(rec.amt0505));
			rx.add(record, "amt0506", StringUtil.replaceToXml(rec.amt0506));
			rx.add(record, "amt0600", StringUtil.replaceToXml(rec.amt0600));
			rx.add(record, "amt0601", StringUtil.replaceToXml(rec.amt0601));
			rx.add(record, "amt0602", StringUtil.replaceToXml(rec.amt0602));
			rx.add(record, "amt0603", StringUtil.replaceToXml(rec.amt0603));
			rx.add(record, "amt0604", StringUtil.replaceToXml(rec.amt0604));
			rx.add(record, "amt0605", StringUtil.replaceToXml(rec.amt0605));
			rx.add(record, "amt0606", StringUtil.replaceToXml(rec.amt0606));
			rx.add(record, "amt0611", StringUtil.replaceToXml(rec.amt0611));
			rx.add(record, "amt0612", StringUtil.replaceToXml(rec.amt0612));
			rx.add(record, "amt0613", StringUtil.replaceToXml(rec.amt0613));
			rx.add(record, "amt0614", StringUtil.replaceToXml(rec.amt0614));
			rx.add(record, "amt0615", StringUtil.replaceToXml(rec.amt0615));
			rx.add(record, "amt0616", StringUtil.replaceToXml(rec.amt0616));
			rx.add(record, "amt0617", StringUtil.replaceToXml(rec.amt0617));
			rx.add(record, "amt0621", StringUtil.replaceToXml(rec.amt0621));
			rx.add(record, "amt0631", StringUtil.replaceToXml(rec.amt0631));
			rx.add(record, "amt0632", StringUtil.replaceToXml(rec.amt0632));
			rx.add(record, "amt0700", StringUtil.replaceToXml(rec.amt0700));
			rx.add(record, "amt0701", StringUtil.replaceToXml(rec.amt0701));
			rx.add(record, "amt0702", StringUtil.replaceToXml(rec.amt0702));
			rx.add(record, "amt0703", StringUtil.replaceToXml(rec.amt0703));
			rx.add(record, "amt0704", StringUtil.replaceToXml(rec.amt0704));
			rx.add(record, "amt0705", StringUtil.replaceToXml(rec.amt0705));
			rx.add(record, "amt0706", StringUtil.replaceToXml(rec.amt0706));
			rx.add(record, "amt0707", StringUtil.replaceToXml(rec.amt0707));
			rx.add(record, "amt0708", StringUtil.replaceToXml(rec.amt0708));
			rx.add(record, "amt0709", StringUtil.replaceToXml(rec.amt0709));
			rx.add(record, "amt0710", StringUtil.replaceToXml(rec.amt0710));
			rx.add(record, "amt0711", StringUtil.replaceToXml(rec.amt0711));
			rx.add(record, "amt0712", StringUtil.replaceToXml(rec.amt0712));
			rx.add(record, "amt9999", StringUtil.replaceToXml(rec.amt9999));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<mc_cost_3171_l>
	<dataSet>
		<CURLIST>
			<record>
				<brnm1/>
				<brcd/>
				<clas_nm/>
				<dstb_dept_cd2/>
				<dstb_dept_nm2/>
				<bgsumamt/>
				<amt0100/>
				<amt0200/>
				<amt0300/>
				<amt0301/>
				<amt0302/>
				<amt0303/>
				<amt0304/>
				<amt0305/>
				<amt0306/>
				<amt0307/>
				<amt0308/>
				<amt0400/>
				<amt0401/>
				<amt0402/>
				<amt0403/>
				<amt0500/>
				<amt0501/>
				<amt0502/>
				<amt0503/>
				<amt0504/>
				<amt0505/>
				<amt0506/>
				<amt0600/>
				<amt0601/>
				<amt0602/>
				<amt0603/>
				<amt0604/>
				<amt0605/>
				<amt0606/>
				<amt0611/>
				<amt0612/>
				<amt0613/>
				<amt0614/>
				<amt0615/>
				<amt0616/>
				<amt0617/>
				<amt0621/>
				<amt0631/>
				<amt0632/>
				<amt0700/>
				<amt0701/>
				<amt0702/>
				<amt0703/>
				<amt0704/>
				<amt0705/>
				<amt0706/>
				<amt0707/>
				<amt0708/>
				<amt0709/>
				<amt0710/>
				<amt0711/>
				<amt0712/>
				<amt9999/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3171_l>
*/
%>

<% /* 작성시간 : Wed Sep 23 09:47:11 KST 2009 */ %>