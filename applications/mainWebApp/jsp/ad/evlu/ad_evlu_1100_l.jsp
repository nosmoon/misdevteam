<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.evlu.rec.*
	,	chosun.ciis.ad.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EVLU_1100_LDataSet ds = (AD_EVLU_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** �μǼ����κ�********** */
		recordSet = rx.add(dataSet, "CURLIST2", "");
		String caption = "";
		String caption2 = "";
		int record2 = rx.add(recordSet, "record", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_EVLU_1100_LCURLIST2Record rec = (AD_EVLU_1100_LCURLIST2Record)ds.curlist2.get(i);
			String tmp1 = "";
			String tmp2 = "";
			int f =1;
			for( f=1;f<=6;f++){//�Ѹ�� �÷� 6��
				tmp1 = "^"+rec.nm_korn+"("+rec.scortl+"��)";
				tmp2 = tmp2+tmp1;
			}
			caption = caption+tmp2;
			caption2 = caption2+"^emp_no^����⿩^�ܵ�.������^�ܰ��λ�^Ư��.��Ÿ^������";//�÷��̸�
		}
		rx.add(record2, "caption", StringUtil.replaceToXml("����^����"+caption));
		rx.add(record2, "caption2", StringUtil.replaceToXml("|����^����"+caption2));
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		//***************������ ���ۺκ�************
		recordSet = rx.add(dataSet, "CURLIST", "");
		HashMap map = null;
		Set keys = null;
		Iterator iter = null;
		String key = null;
		for(int i = 0; i < ds.curlist.size(); i++) {
			map = (HashMap)ds.curlist.get(i);
			keys = map.keySet();
			iter = keys.iterator();
			int c = 0;
			int record = rx.add(recordSet, "record", "");
			while(iter.hasNext()){
				key = (String)iter.next(); c++;
				rx.add(record, key, (String)map.get(key));
			}
		}
		/****������**********/
		recordSet = rx.add(dataSet, "COLDATA", "");
		map = (HashMap)ds.curlist.get(0);
		int sizeMap = map.size();
		rx.add(recordSet, "MapSize", sizeMap);
		keys = map.keySet();
		iter = keys.iterator();
		int c = 0;
		int record = rx.add(recordSet, "record", "");
		while(iter.hasNext()){
			key = (String)iter.next(); c++;
			rx.add(record, "A"+Integer.toString(c) , key);
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