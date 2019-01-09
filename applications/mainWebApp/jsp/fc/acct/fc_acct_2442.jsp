<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.fc.rec.*, chosun.ciis.fc.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ����


	CO_L_GT_COMMCODEDataSet ds = (CO_L_GT_COMMCODEDataSet)request.getAttribute("ds");

	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	int slip_clsf  = rx.add( resData , "slip_clsf" , "");

	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_GT_COMMCODECURCOMMLISTRecord rec = (CO_L_GT_COMMCODECURCOMMLISTRecord)ds.curcommlist.get(i);

		int item  = rx.add( slip_clsf , "item" , "");

		rx.add ( item, "value", rec.cccodeval );
		rx.add ( item, "label", rec.cccodeval + " " + rec.cccdynm );

	}

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>


