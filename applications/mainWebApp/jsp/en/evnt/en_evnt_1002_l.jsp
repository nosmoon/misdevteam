<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import = "java.io.*,
                   java.sql.*,
                   java.util.*,
                   kr.co.comsquare.rwXmlLib.*,
                   kr.co.comsquare.db.*,
                   kr.co.comsquare.util.Tokenizer,
                   chosun.ciis.en.evnt.ds.*,
                   chosun.ciis.en.evnt.rec.*,
                   chosun.ciis.co.base.util.StringUtil;"
%>

<%
	RwXml rx = new RwXml();
	EN_EVNT_1002_LDataSet ds = (EN_EVNT_1002_LDataSet)request.getAttribute("ds");
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
		  EN_EVNT_1002_LCURLISTRecord rec = (EN_EVNT_1002_LCURLISTRecord)ds.curlist.get(i);
	    int record = rx.add(recordSet, "record", "");
	    rx.add(record, "tmp_evnt_cd", rec.evnt_yy + "-" + rec.evnt_cd + "-" + rec.evnt_seq);
	    rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
	    rx.add(record, "evnt_yy", rec.evnt_yy);
	    rx.add(record, "evnt_cd", rec.evnt_cd);
	    rx.add(record, "evnt_seq", rec.evnt_seq);
	  }
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
<dataSet>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jan 30 21:56:24 KST 2009 */ %>