<%@ page contentType="text/xml; charset=EUC-KR" %>

<%@ page import = "java.io.*,
                   java.sql.*,
                   java.util.*,
                   kr.co.comsquare.rwXmlLib.*,
                   kr.co.comsquare.db.*,
                   kr.co.comsquare.util.Tokenizer,
                   chosun.ciis.hd.crcl.ds.*,
                   chosun.ciis.hd.crcl.rec.*;"
%>

<%
  RwXml rx = new RwXml();
  HD_CRCL_1203_MDataSet ds = (HD_CRCL_1203_MDataSet)request.getAttribute("ds");
  int root = RwXml.rootNodeID;
  int recordSet = 0;
  int dataSet = 0;
  recordSet = rx.add(root, "tempData", "");

  try {
	  rx.add(recordSet, "xx_paty_crc_cd_010", ds.getXx_paty_crc_cd_010());
	  
    /****** CURLIST BEGIN */
    dataSet = rx.add(recordSet, "paty_crc_cd", "");
    for(int i = 0; i < ds.curlist.size(); i++) {
      HD_CRCL_1203_MCURLISTRecord rec = (HD_CRCL_1203_MCURLISTRecord)ds.curlist.get(i);
        int record = rx.add(dataSet, "item", "");
        rx.add(record, "value", rec.cd);
        rx.add(record, "label", rec.cd + " " + rec.cdnm);
    }
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
