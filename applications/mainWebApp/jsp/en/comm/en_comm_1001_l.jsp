<%@ page contentType="text/xml; charset=EUC-KR" %>

<%@ page import = "java.io.*,
                   java.sql.*,
                   java.util.*,
                   kr.co.comsquare.rwXmlLib.*,
                   kr.co.comsquare.db.*,
                   kr.co.comsquare.util.Tokenizer,
                   chosun.ciis.en.comm.ds.*,
                   chosun.ciis.en.comm.rec.*,
                   chosun.ciis.co.base.util.StringUtil;"
%>
 
<%
  RwXml rx = new RwXml();
  EN_COMM_1001_LDataSet ds = (EN_COMM_1001_LDataSet)request.getAttribute("ds");
  int root = RwXml.rootNodeID;
  int tempData = 0;
  tempData = rx.add(root, "tempData", "");

  try {
    /****** CURLIST BEGIN */
    for(int i = 0; i < ds.curlist.size(); i++) {
    	EN_COMM_1001_LCURLISTRecord rec = (EN_COMM_1001_LCURLISTRecord)ds.curlist.get(i);
      int record = rx.add(tempData, "record", "");
      rx.add(record, "value1", StringUtil.replaceToXml(rec.value1));
      rx.add(record, "value2", StringUtil.replaceToXml(rec.value2));
      rx.add(record, "value3", StringUtil.replaceToXml(rec.value3));
      rx.add(record, "value4", StringUtil.replaceToXml(rec.value4));
    }
    /****** CURLIST END */

  }
  catch (Exception e) {
  }
  finally {
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

<% /* 작성시간 : Wed Jan 28 12:09:47 KST 2009 */ %>