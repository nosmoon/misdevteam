<%@	page contentType="text/xml; charset=EUC-KR"%>

<%@	page
	import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.rec.*
	,	chosun.ciis.tn.dns.ds.*;
	"%>

<%
	TN_DNS_3170_LDataSet ds = (TN_DNS_3170_LDataSet)request.getAttribute("ds");

	int dataSet = 0;
	int recordSet = 0;	
	int rowcnt = 0;	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	StringBuffer size 		= new StringBuffer();
	
	RwText rt = new RwText(); 									//RwText 객체 생성
	rowcnt = ds.curlist.size();
	rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
	rt.setRowCnt(rowcnt);							//행 개수 설정
	rt.setColCnt(7);
	rt.setCaption("발급성명^발급대상^기부자분류^발급금액^회원분류^회원명^발급불가사유");
	
	int Csize = 0;
	
	// 109, 88, 120, 93, 96, 87, 152
	rt.addColumn("output", "");			// 			<col ref="issuname"/>                           
	size.append("109,");
	rt.addColumn("output", "");                     // 			<col ref="donatorcategory"/>                    
	size.append("88,");	
	rt.addColumn("output", "");                     // 			<col ref="receiptcategory"/>                      
	size.append("120,");	
	rt.addColumn("output", "");                     // 			<col ref="price"/>                   
	size.append("93,");	
	rt.addColumn("output", "");                     // 			<col ref="membercategorycode"/>    
	size.append("96,");	
	rt.addColumn("output", "");                     // 			<col ref="name"/>
	size.append("87,");	
	rt.addColumn("output", "");                     // 			<col ref="receiptcode"/>                      
	size.append("152,");	
	
	

	rt.setColWidth(size.toString()); 
	rt.setColumn();
	
	try { 
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_DNS_3170_LCURLISTRecord rec = (TN_DNS_3170_LCURLISTRecord)ds.curlist.get(i);

			rt.addColValue(rec.issuname,"");         
			rt.addColValue(rec.donatorcategory,"");       
			rt.addColValue(rec.receiptcategory,"");
			rt.addColValue(rec.price,"");
			rt.addColValue(rec.membercategorycode,"");
			rt.addColValue(rec.name,"");
			rt.addColValue(rec.status,"");
			
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
		
		//out.println(rt.textFlush()); //버퍼 출력

		//System.out.print(rt.textFlush()); //버퍼 출력				
		/****** CURLIST END */
		

	}
	catch (Exception e) {
		out.println(rt.textFlush()); //버퍼 출력	
	}
	finally {
		out.println(rt.textFlush()); //버퍼 출력	
	}
%>

<%
	 /*
	 TrustForm의 Instance 선언부에 복사해서 사용
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

<%
/* 작성시간 : Tue Dec 13 19:46:12 KST 2016 */
%>
