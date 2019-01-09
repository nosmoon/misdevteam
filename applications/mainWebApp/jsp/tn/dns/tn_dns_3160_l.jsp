<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.rec.*
	,	chosun.ciis.tn.dns.ds.*;
	"
%>

<%
	TN_DNS_3160_LDataSet ds = (TN_DNS_3160_LDataSet)request.getAttribute("ds");

	int dataSet = 0;
	int recordSet = 0;	
	int rowcnt = 0;	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	StringBuffer size 		= new StringBuffer();
	
	RwText rt = new RwText(); 									//RwText ��ü ����
	rowcnt = ds.curlist.size();
	rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
	rt.setRowCnt(rowcnt);							//�� ���� ����
	rt.setColCnt(7);
	rt.setCaption("�߱޼���^�߱޴��^����ںз�^�߱ޱݾ�^ȸ���з�^ȸ����^��������ȣ");
	
	int Csize = 0;
	
	// 109, 88, 120, 111, 104, 96, 116
	rt.addColumn("output", "");			// 			<col ref="issuname"/>                           
	size.append("109,");
	rt.addColumn("output", "");                     // 			<col ref="donatorcategory"/>                    
	size.append("88,");	
	rt.addColumn("output", "");                     // 			<col ref="receiptcategory"/>                      
	size.append("120,");	
	rt.addColumn("output", "");                     // 			<col ref="price"/>                   
	size.append("111,");	
	rt.addColumn("output", "");                     // 			<col ref="membercategorycode"/>    
	size.append("104,");	
	rt.addColumn("output", "");                     // 			<col ref="name"/>
	size.append("96,");	
	rt.addColumn("output", "");                     // 			<col ref="receiptcode"/>                      
	size.append("116,");	
	
	for ( int i = 0 ; i < (5 - rowcnt); i++ ){
		size.append("                                                                                                    ");
	}

	rt.setColWidth(size.toString()); 
	rt.setColumn();
	
	try { 
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_DNS_3160_LCURLISTRecord rec = (TN_DNS_3160_LCURLISTRecord)ds.curlist.get(i);

			rt.addColValue(rec.issuname,"");         
			rt.addColValue(rec.donatorcategory,"");       
			rt.addColValue(rec.receiptcategory,"");
			rt.addColValue(rec.price,"");
			rt.addColValue(rec.membercategorycode,"");
			rt.addColValue(rec.name,"");
			rt.addColValue(rec.receiptcode,"");
			
			rt.addRowValue(i, "");

		}
		//System.out.print("length::"+rt.length());
		//Csize = rt.textPrint().length();
				
		int stringByteLength = rt.textPrint().getBytes().length;
		
		System.out.print("stringByteLength::"+stringByteLength);
		
		//Csize = stringByteLength + 17;
		Csize = stringByteLength + 517;
		
		response.setHeader("Accept-Ranges", "bytes");
		response.setContentLength(Csize);
				
		System.out.print("rt_length::"+Csize);
		
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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<tn_dns_3160_l>
	<dataSet>
		<CURLIST>
			<record>
				<receiptbulkissueidx/>
				<issuname/>
				<donatorcategory/>
				<receiptcategory/>
				<price/>
				<memberidx/>
				<membercategorycode/>
				<receiptidx/>
				<name/>
				<paymenttype/>
				<receiptcode/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_3160_l>
*/
%>

<% /* �ۼ��ð� : Tue Dec 13 19:46:12 KST 2016 */ %>