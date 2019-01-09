<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_9301_LDataSet ds = (MT_ETCCAR_9301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_9301_LCURLISTRecord rec = (MT_ETCCAR_9301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "drvr_nm", rec.drvr_nm);
			rx.add(record, "tm07000730", rec.tm07000730);
			rx.add(record, "tm07300800", rec.tm07300800);
			rx.add(record, "tm08000830", rec.tm08000830);
			rx.add(record, "tm08300900", rec.tm08300900);
			rx.add(record, "tm09000930", rec.tm09000930);
			rx.add(record, "tm09301000", rec.tm09301000);
			rx.add(record, "tm10001030", rec.tm10001030);
			rx.add(record, "tm10301100", rec.tm10301100);
			rx.add(record, "tm11001130", rec.tm11001130);
			rx.add(record, "tm11301200", rec.tm11301200);
			rx.add(record, "tm12001230", rec.tm12001230);
			rx.add(record, "tm12301300", rec.tm12301300);
			rx.add(record, "tm13001330", rec.tm13001330);
			rx.add(record, "tm13301400", rec.tm13301400);
			rx.add(record, "tm14001430", rec.tm14001430);
			rx.add(record, "tm14301500", rec.tm14301500);
			rx.add(record, "tm15001530", rec.tm15001530);
			rx.add(record, "tm15301600", rec.tm15301600);
			rx.add(record, "tm16001630", rec.tm16001630);
			rx.add(record, "tm16301700", rec.tm16301700);
			rx.add(record, "tm17001730", rec.tm17001730);
			rx.add(record, "tm17301800", rec.tm17301800);
			rx.add(record, "tm18001830", rec.tm18001830);
			rx.add(record, "tm18301900", rec.tm18301900);
			rx.add(record, "tm19001930", rec.tm19001930);
			rx.add(record, "tm19302000", rec.tm19302000);
			rx.add(record, "tm20002030", rec.tm20002030);
			rx.add(record, "tm20302100", rec.tm20302100);
			rx.add(record, "tm21002130", rec.tm21002130);
			rx.add(record, "tm21302200", rec.tm21302200);
			rx.add(record, "tm22002230", rec.tm22002230);
			rx.add(record, "tm22302300", rec.tm22302300);
			rx.add(record, "tm23002330", rec.tm23002330);
			rx.add(record, "tm23302400", rec.tm23302400);
			rx.add(record, "tm00000030", rec.tm00000030);
			rx.add(record, "tm00300100", rec.tm00300100);
			rx.add(record, "tm01000130", rec.tm01000130);
			rx.add(record, "tm01300200", rec.tm01300200);
			rx.add(record, "tm02000230", rec.tm02000230);
			rx.add(record, "tm02300300", rec.tm02300300);
			rx.add(record, "tm03000330", rec.tm03000330);
			rx.add(record, "tm03300400", rec.tm03300400);
			rx.add(record, "tm04000430", rec.tm04000430);
			rx.add(record, "tm04300500", rec.tm04300500);
			rx.add(record, "tm05000530", rec.tm05000530);
			rx.add(record, "tm05300600", rec.tm05300600);
			rx.add(record, "tm06000630", rec.tm06000630);
			rx.add(record, "tm06300700", rec.tm06300700);
			//rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			//rx.add(record, "tm07000730", StringUtil.replaceToXml(rec.tm07000730));
			//rx.add(record, "tm07300800", StringUtil.replaceToXml(rec.tm07300800));
			//rx.add(record, "tm08000830", StringUtil.replaceToXml(rec.tm08000830));
			//rx.add(record, "tm08300900", StringUtil.replaceToXml(rec.tm08300900));
			//rx.add(record, "tm09000930", StringUtil.replaceToXml(rec.tm09000930));
			//rx.add(record, "tm09301000", StringUtil.replaceToXml(rec.tm09301000));
			//rx.add(record, "tm10001030", StringUtil.replaceToXml(rec.tm10001030));
			//rx.add(record, "tm10301100", StringUtil.replaceToXml(rec.tm10301100));
			//rx.add(record, "tm11001130", StringUtil.replaceToXml(rec.tm11001130));
			//rx.add(record, "tm11301200", StringUtil.replaceToXml(rec.tm11301200));
			//rx.add(record, "tm12001230", StringUtil.replaceToXml(rec.tm12001230));
			//rx.add(record, "tm12301300", StringUtil.replaceToXml(rec.tm12301300));
			//rx.add(record, "tm13001330", StringUtil.replaceToXml(rec.tm13001330));
			//rx.add(record, "tm13301400", StringUtil.replaceToXml(rec.tm13301400));
			//rx.add(record, "tm14001430", StringUtil.replaceToXml(rec.tm14001430));
			//rx.add(record, "tm14301500", StringUtil.replaceToXml(rec.tm14301500));
			//rx.add(record, "tm15001530", StringUtil.replaceToXml(rec.tm15001530));
			//rx.add(record, "tm15301600", StringUtil.replaceToXml(rec.tm15301600));
			//rx.add(record, "tm16001630", StringUtil.replaceToXml(rec.tm16001630));
			//rx.add(record, "tm16301700", StringUtil.replaceToXml(rec.tm16301700));
			//rx.add(record, "tm17001730", StringUtil.replaceToXml(rec.tm17001730));
			//rx.add(record, "tm17301800", StringUtil.replaceToXml(rec.tm17301800));
			//rx.add(record, "tm18001830", StringUtil.replaceToXml(rec.tm18001830));
			//rx.add(record, "tm18301900", StringUtil.replaceToXml(rec.tm18301900));
			//rx.add(record, "tm19001930", StringUtil.replaceToXml(rec.tm19001930));
			//rx.add(record, "tm19302000", StringUtil.replaceToXml(rec.tm19302000));
			//rx.add(record, "tm20002030", StringUtil.replaceToXml(rec.tm20002030));
			//rx.add(record, "tm20302100", StringUtil.replaceToXml(rec.tm20302100));
			//rx.add(record, "tm21002130", StringUtil.replaceToXml(rec.tm21002130));
			//rx.add(record, "tm21302200", StringUtil.replaceToXml(rec.tm21302200));
			//rx.add(record, "tm22002230", StringUtil.replaceToXml(rec.tm22002230));
			//rx.add(record, "tm22302300", StringUtil.replaceToXml(rec.tm22302300));
			//rx.add(record, "tm23002330", StringUtil.replaceToXml(rec.tm23002330));
			//rx.add(record, "tm23302400", StringUtil.replaceToXml(rec.tm23302400));
			//rx.add(record, "tm00000030", StringUtil.replaceToXml(rec.tm00000030));
			//rx.add(record, "tm00300100", StringUtil.replaceToXml(rec.tm00300100));
			//rx.add(record, "tm01000130", StringUtil.replaceToXml(rec.tm01000130));
			//rx.add(record, "tm01300200", StringUtil.replaceToXml(rec.tm01300200));
			//rx.add(record, "tm02000230", StringUtil.replaceToXml(rec.tm02000230));
			//rx.add(record, "tm02300300", StringUtil.replaceToXml(rec.tm02300300));
			//rx.add(record, "tm03000330", StringUtil.replaceToXml(rec.tm03000330));
			//rx.add(record, "tm03300400", StringUtil.replaceToXml(rec.tm03300400));
			//rx.add(record, "tm04000430", StringUtil.replaceToXml(rec.tm04000430));
			//rx.add(record, "tm04300500", StringUtil.replaceToXml(rec.tm04300500));
			//rx.add(record, "tm05000530", StringUtil.replaceToXml(rec.tm05000530));
			//rx.add(record, "tm05300600", StringUtil.replaceToXml(rec.tm05300600));
			//rx.add(record, "tm06000630", StringUtil.replaceToXml(rec.tm06000630));
			//rx.add(record, "tm06300700", StringUtil.replaceToXml(rec.tm06300700));
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
<mt_etccar_9301_l>
	<dataSet>
		<CURLIST>
			<record>
				<drvr_nm/>
				<tm07000730/>
				<tm07300800/>
				<tm08000830/>
				<tm08300900/>
				<tm09000930/>
				<tm09301000/>
				<tm10001030/>
				<tm10301100/>
				<tm11001130/>
				<tm11301200/>
				<tm12001230/>
				<tm12301300/>
				<tm13001330/>
				<tm13301400/>
				<tm14001430/>
				<tm14301500/>
				<tm15001530/>
				<tm15301600/>
				<tm16001630/>
				<tm16301700/>
				<tm17001730/>
				<tm17301800/>
				<tm18001830/>
				<tm18301900/>
				<tm19001930/>
				<tm19302000/>
				<tm20002030/>
				<tm20302100/>
				<tm21002130/>
				<tm21302200/>
				<tm22002230/>
				<tm22302300/>
				<tm23002330/>
				<tm23302400/>
				<tm00000030/>
				<tm00300100/>
				<tm01000130/>
				<tm01300200/>
				<tm02000230/>
				<tm02300300/>
				<tm03000330/>
				<tm03300400/>
				<tm04000430/>
				<tm04300500/>
				<tm05000530/>
				<tm05300600/>
				<tm06000630/>
				<tm06300700/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9301_l>
*/
%>

<% /* 작성시간 : Mon Sep 10 18:49:20 KST 2012 */ %>