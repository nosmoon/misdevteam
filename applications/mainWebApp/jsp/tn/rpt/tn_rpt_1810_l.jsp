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
	TN_RPT_1800_LDataSet ds = (TN_RPT_1800_LDataSet)request.getAttribute("ds");
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
	rt.setColCnt(20);
	rt.setCaption("�̸�^�ֹι�ȣ^ȸ���޸�^�޴���ȭ^�����ּ�^�����ڵ�^�����ݾ�^���Թ��^�г����^�г���^�г�Ƚ��^�����޸�^���2��^������^���Ծ�^�������Ծ�^���԰���^���Ը޸�^���������^������");
	
	int Csize = 0;
	// 80, 55, 80, 95, 300, 100, 55, 91, 91, 66, 65, 200, 93, 85, 80, 100, 100, 100, 100, 100, 100, 100, 100
	
	// rt��ü�� ����� 1000 byte �̸��� ��� submit������ �߻����� 4�ǹ̸��� ��� ������ �߰��Ͽ�
	// rt��ü�� ����� ���������ش� 
	// by �����
	
	//for ( int i = 0 ; i < (5 - rowcnt); i++ ){
	//	size.append("                                                                                                    ");
	//}
	
	rt.setColWidth(size.toString()); 
	rt.setColumn();
	try { 
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_RPT_1800_LCURLISTRecord rec = (TN_RPT_1800_LCURLISTRecord)ds.curlist.get(i);

			//rt.addColValue(rec.membercode,"");         
			rt.addColValue(rec.name,"");
			rt.addColValue(rec.member_regno,"");
			rt.addColValue(rec.memo,"");
			rt.addColValue(rec.cellphone,"");
			rt.addColValue(rec.address1,"");
			rt.addColValue(rec.promisecode,"");
			rt.addColValue(rec.promiseprice,"");
			rt.addColValue(rec.paymethodnm,"");			
			rt.addColValue(rec.partitiontype,""); 
			rt.addColValue(rec.monthlypayprice,""); 
			rt.addColValue(rec.partitioncount,"");  
			rt.addColValue(rec.onlineproyn,""); 
			rt.addColValue(rec.fund2,"");
			rt.addColValue(rec.paydate,"");
			rt.addColValue(rec.payprice,"");   
			rt.addColValue(rec.totalpayprice,"");  
			rt.addColValue(rec.bankaccount,""); 
			rt.addColValue(rec.paymemo,""); 
			rt.addColValue(rec.promisedate,"");
			rt.addColValue(rec.writedate,"");
			
			rt.addRowValue(i, "");
		}		

		//System.out.print("length::"+rt.length());
		//Csize = rt.textPrint().length();
				
		//int stringByteLength = rt.textPrint().getBytes().length;
		
		//System.out.print("stringByteLength::"+stringByteLength);
		
		//Csize = stringByteLength + 17;
		//Csize = stringByteLength + 517;
		
		//response.setHeader("Accept-Ranges", "bytes");
		//response.setContentLength(Csize);
				
		//System.out.print("rt_length::"+Csize);
				
		//out.println(rt.textFlush()); //���� ���

		//System.out.print(rt.textFlush()); //���� ���				
		/****** CURLIST END */
		
	}
	catch (Exception e) {
		out.println(rt.textFlush()); //���� ���	
	}
	finally {
		out.println(rt.textFlush()); //���� ���	
	}

%>
