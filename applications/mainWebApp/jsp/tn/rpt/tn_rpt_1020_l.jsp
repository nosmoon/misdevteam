<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	TN_RPT_1020_LDataSet ds = (TN_RPT_1020_LDataSet)request.getAttribute("ds");
	
	int dataSet = 0;
	int recordSet = 0;	
	int rowcnt = 0;	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	StringBuffer size 		= new StringBuffer();

	RwText rt = new RwText(); 						//RwText ��ü ����
	rowcnt = ds.curlist.size();
	rt.setBuffering(true); 				 			//���۸� ��� ���� -> T�κ�
	rt.setRowCnt(rowcnt);							//�� ���� ����
	rt.setColCnt(10);
	rt.setCaption("��������ȣ^�߱���^����ںз�^����^�ֹ�(�����)��ȣ^�ּ�^���ԱⰣ������^���ԱⰣ������^���԰Ǽ�^�߱ޱݾ�^cmpycd^memberidx");
	
	int Csize = 0;

	rt.setColWidth(size.toString()); 
	rt.setColumn();

	try { 
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_RPT_1020_LCURLISTRecord rec = (TN_RPT_1020_LCURLISTRecord)ds.curlist.get(i);

			rt.addColValue(rec.receiptcode,"");         
			rt.addColValue(rec.issuedate,"");       
			rt.addColValue(rec.receiptcategory,"");
			rt.addColValue(rec.name,"");
			rt.addColValue(rec.regno,"");
			rt.addColValue(rec.address,"");
			rt.addColValue(rec.mindate,"");
			rt.addColValue(rec.maxdate,"");
			rt.addColValue(rec.paymentcount,"");     
			rt.addColValue(rec.price,"");     
			
			rt.addRowValue(i, "");
		}		
	}
	catch (Exception e) {
		out.println(rt.textFlush()); //���� ���	
	}
	finally {
		out.println(rt.textFlush()); //���� ���	
	}

%>
