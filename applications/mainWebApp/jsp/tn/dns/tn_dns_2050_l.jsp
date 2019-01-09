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
	TN_DNS_2010_LDataSet ds = (TN_DNS_2010_LDataSet)request.getAttribute("ds");

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
	rt.setColCnt(19);
	rt.setCaption("^회원명^회원코드^생년월일^휴대폰번호^약정코드^회원정보^기금^납입방식^총약정액^총납입액^납입률^영수증^최근접촉^최근ums^회원인덱스^예금주^메모^해지여부");
	
	int Csize = 0;
	
	// 24, 70, 80, 81, 100, 87, 100, 111, 184, 94, 91, 81, 80, 90, 90, 100
	//rt.addColumn("checkbox", "checkvalue:Y,N;");
	//size.append("24,");
	//rt.addColumn("output", "");			// 			<col ref="name"/>                           
	//size.append("70,");
	//rt.addColumn("output", "");                     // 			<col ref="membercode"/>                     
	//size.append("80,");	
	//rt.addColumn("output", "");                     // 			<col ref="birthday"/>                       
	//size.append("81,");	
	//rt.addColumn("output", "");                     // 			<col ref="cellphone"/>                      
	//size.append("100,");	
	//rt.addColumn("output", "");                     // 			<col ref="promisecode"/>                    
	//size.append("87,");	
	//rt.addColumn("output", "visibility:hidden;");                     // 			<col ref="membertype" visibility="hidden"/> 
	//size.append("100,");	
	//rt.addColumn("output", "");                     // 			<col ref="fundtype"/>                       
	//size.append("111,");	
	//rt.addColumn("output", "");                     // 			<col ref="paymethodcode"/>                  
	//size.append("184,");	
	//rt.addColumn("output", "format:(-)#,###;text-align:right;");                     // 			<col ref="promiseprice" format="#,###"/>    
	//size.append("94,");	
	//rt.addColumn("output", "format:(-)#,###;text-align:right;");                     // 			<col ref="payprice" format="#,###"/>        
	//size.append("91,");	
	//rt.addColumn("output", "");                     // 			<col ref="payrate"/>                        
	//size.append("81,");	
	//rt.addColumn("output", "visibility:hidden;");                     // 			<col ref="issuedate" visibility="hidden"/>  
	//size.append("80,");	
	//rt.addColumn("output", "visibility:hidden;");                     // 			<col ref="contactdate" visibility="hidden"/>
	//size.append("90,");	
	//rt.addColumn("output", "visibility:hidden;");	                // 			<col ref="senddate" visibility="hidden"/>   
	//size.append("90,");	
	//rt.addColumn("output", "visibility:hidden;");	                // 			<col ref="memberidx" visibility="hidden"/>  
	//size.append("100,");	

	// rt객체의 사이즈가 1000 byte 미만일 경우 submit오류를 발생시켜 4건미만일 경우 공백을 추가하여
	// rt객체의 사이즈를 증가시켜준다 
	// by 노상현
	
	//for ( int i = 0 ; i < (5 - rowcnt); i++ ){
	//	size.append("                                                                                                    ");
	//}
	
	rt.setColWidth(size.toString()); 
	rt.setColumn();
	
	try { 
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_DNS_2010_LCURLISTRecord rec = (TN_DNS_2010_LCURLISTRecord)ds.curlist.get(i);

			rt.addColValue("N","");

			rt.addColValue(rec.name,"");         
			rt.addColValue(rec.membercode,"");       
			rt.addColValue(rec.birthday,"");
			rt.addColValue(rec.cellphone,"");
			rt.addColValue(rec.promisecode,"");
			rt.addColValue(rec.membertype,"");
			rt.addColValue(rec.fundtype,"");
			rt.addColValue(rec.paymethodcode,"");
			rt.addColValue(rec.promiseprice,"");     
			rt.addColValue(rec.payprice,"");     
			rt.addColValue(rec.payrate,"");  
			rt.addColValue(rec.issuedate,""); 
			rt.addColValue(rec.contactdate,"");
			rt.addColValue(rec.senddate,"");			
			rt.addColValue(rec.memberidx,"");       
			rt.addColValue(rec.bankaccountowner,""); 
			rt.addColValue(rec.memo,""); 
			rt.addColValue(rec.promise_status,"");  
			
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
<tn_dns_2010_l>
	<dataSet>
		<CURLIST>
			<record>
				<membercode/>
				<name/>
				<membertype/>
				<promiseprice/>
				<payprice/>
				<payrate/>
				<issuedate/>
				<contactdate/>
				<senddate/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_2010_l>
*/
%>

<% /* 작성시간 : Tue Jun 14 11:05:31 KST 2016 */ %>