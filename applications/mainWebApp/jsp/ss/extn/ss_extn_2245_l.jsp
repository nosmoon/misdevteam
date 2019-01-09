<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
	SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "gridData");
	int dataSet = 0;

	dataSet = rxw.add(acctTemp, "extnGrid", "");

	for(int i = 0; i < ds.curextncloslist.size(); i++) {
	
			SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord rec = (SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);
			int record = rxw.add(dataSet, "record", "");
			rxw.add(record, "deptcd",                rec.deptcd);
			rxw.add(record, "deptnm",                rec.deptnm);
			rxw.add(record, "areacd",                rec.areacd);
			rxw.add(record, "areanm",                rec.areanm);
			rxw.add(record, "bocd",                  rec.bocd);
			rxw.add(record, "bonm",                  rec.bonm);
			rxw.add(record, "oprenvclsf",            rec.oprenvclsf);
			rxw.add(record, "rdrnm",                 rec.rdrnm);
			rxw.add(record, "rdr_no",                rec.rdr_no);
			rxw.add(record, "qty",                   rec.qty);         
			rxw.add(record, "addrcdnm",      	 	 rec.addrcdnm);
			rxw.add(record, "addrs",         	 	 rec.addrs);
			rxw.add(record, "rdrtel_no1",    	 	 rec.rdrtel_no1);
			rxw.add(record, "rdrtel_no2",    	 	 rec.rdrtel_no2);
			rxw.add(record, "rdrtel_no3",    	 	 rec.rdrtel_no3);
			rxw.add(record, "rdrptph_no1",   	 	 rec.rdrptph_no1);
			rxw.add(record, "rdrptph_no2",   	 	 rec.rdrptph_no2);
			rxw.add(record, "rdrptph_no3",   	 	 rec.rdrptph_no3);
			rxw.add(record, "rdr_extndt",    	 	 rec.rdr_extndt );
			rxw.add(record, "incmgdt",       	 	 rec.incmgdt);
			rxw.add(record, "valmm",         	 	 rec.valmm);
			rxw.add(record, "dscnamt",       	 	 rec.dscnamt);
			rxw.add(record, "clamtmthd",     	 	 rec.clamtmthd);
			rxw.add(record, "rdr_extntype1", 	 	 rec.rdr_extntype1);
			rxw.add(record, "rdr_extntype2", 	 	 rec.rdr_extntype2);
			rxw.add(record, "camptype",      	 	 rec.camptype);
			rxw.add(record, "extnnm",        	 	 rec.extnnm);
			rxw.add(record, "stafno",        	 	 rec.stafno);
			rxw.add(record, "aplcpath",      	 	 rec.aplcpath);
			rxw.add(record, "resitype",      	 	 rec.resitype);
			rxw.add(record, "mvindt",        	 	 rec.mvindt);
			rxw.add(record, "mvintodt",      	 	 rec.mvintodt);
			rxw.add(record, "reconfyn",      	 	 rec.reconfyn);
			rxw.add(record, "mormembid",     	 	 rec.mormembid);
			rxw.add(record, "rdr_extnprvlastsuspdt", rec.rdr_extnprvlastsuspdt);
			rxw.add(record, "remk",                  rec.remk);
			rxw.add(record, "suspdt",                rec.suspdt);
			rxw.add(record, "suspresn",              rec.suspresn);
			rxw.add(record, "bns_itemclsf",          rec.bns_itemclsf);
			rxw.add(record, "bns_itemnm",            rec.bns_itemnm);
			rxw.add(record, "svcmm",                 rec.svcmm);
			rxw.add(record, "scqty",                 rec.scqty);
			rxw.add(record, "scsubsuprc",            rec.scsubsuprc);
			rxw.add(record, "hkqty",                 rec.hkqty);
			rxw.add(record, "hksubsuprc",            rec.hksubsuprc);
	}

	rxw.flush(out);
	
%>


