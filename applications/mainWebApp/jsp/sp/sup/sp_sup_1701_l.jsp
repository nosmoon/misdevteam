<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
 	RwXml rx = new RwXml();
	SP_SUP_1701_LDataSet ds = (SP_SUP_1701_LDataSet)request.getAttribute("ds");
	String strEncodeImage = "";
	strEncodeImage = ds.getEncodeimage(); 
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	
	try {
		//BufferedOutputStream outBW = null;
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "curlist1", "");
		//System.out.println("ds.curlist1.size()=>"+ds.curlist1.size()); 
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SUP_1701_LCURLIST1Record rec = (SP_SUP_1701_LCURLIST1Record)ds.curlist1.get(i);
			
			

			//System.out.println("#############");
			//System.out.println(rec.bPhot);
			//System.out.println("#############");
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "phot", ds.getPhot());
			rx.add(record, "rownum", i+1);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "file_nm", rec.dlco_no+".jpg");
			rx.add(record, "filename", rec.dlco_no);
			rx.add(record, "download", "다운로드");
			
			rx.add(record, "ern", rec.ern);
			rx.add(record, "resPhoto", strEncodeImage);
			
			
			//rx.add(record, "img", strEncodeImage, "type=\"xsd:base64Binary\"");
			//rx.add(record, "phot", StringUtil.replaceToXml(rec.phot));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			
			//outBW = new BufferedOutputStream(response.getOutputStream());
			
			
			
			
			
			
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
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
<hd_info_2401_l>
	<dataSet>
		<CURLIST1>
			<record>
				<phot/>
				<emp_no/>
				<dept_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_2401_l>
*/
%>

<% /* 작성시간 : Fri Jun 05 10:17:55 KST 2009 */ %>