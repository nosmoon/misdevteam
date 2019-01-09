<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
	SL_L_EXTNCLOS_JMDataSet ds = (SL_L_EXTNCLOS_JMDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "gridData");
	int dataSet = 0;

	dataSet = rxw.add(acctTemp, "listGrid", "");

	for(int i = 0; i < ds.curextncloslist.size(); i++) {
	
			SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord rec = (SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);
			int record = rxw.add(dataSet, "record", "");

			rxw.add(record, "gubun", rec.gubun);
			rxw.add(record, "deptnm", rec.deptnm);
			//rxw.add(record, "partcd", rec.partcd);
			//rxw.add(record, "partnm", rec.partnm);
			rxw.add(record, "areanm", rec.areanm);
			rxw.add(record, "bonm", rec.bonm);
			rxw.addCData(record, "rdrnm", rec.rdrnm);
			rxw.add(record, "rdr_no", rec.rdr_no);
			rxw.add(record, "rdr_seq", rec.seq);
			rxw.add(record, "qty", rec.qty);
			rxw.addCData(record, "addrs", rec.addrs);
			rxw.add(record, "rdr_extndt", rec.rdr_extndt);
			rxw.addCData(record, "extnnm", rec.extnnm);
			if(rec.ddcfmyn.equals("1")) {
				rxw.add(record, "ddcfrm", "Y");
			} else {
				rxw.add(record, "ddcfrm", "");
			}
			rxw.add(record, "issupdt", rec.issupdt);
			rxw.add(record, "deptcd", rec.deptcd);
			rxw.add(record, "areacd", rec.areacd);
			rxw.add(record, "bocd", rec.bocd);
			rxw.add(record, "closmm", rec.closmm);
			rxw.add(record, "seq", rec.seq);
	}
;
	
	rxw.add(acctTemp, "totalcnt", ds.curextncloslist.size());
	rxw.add(acctTemp, "totalqty", ds.getTotalqty());

	rxw.flush(out);
	
%>


