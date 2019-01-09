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
	RwText rt = new RwText(); 						//RwText 객체 생성
	rowcnt = ds.curlist.size();
	rt.setBuffering(true); 				 			//버퍼링 사용 설정 -> T부분
	rt.setRowCnt(rowcnt);							//행 개수 설정
	rt.setColCnt(20);
	rt.setCaption("이름^주민번호^회원메모^휴대전화^자택주소^약정코드^약정금액^납입방식^분납방식^분납액^분납횟수^약정메모^기금2차^납입일^납입액^누적납입액^납입계좌^납입메모^약정등록일^약정일");
	
	int Csize = 0;
	// 80, 55, 80, 95, 300, 100, 55, 91, 91, 66, 65, 200, 93, 85, 80, 100, 100, 100, 100, 100, 100, 100, 100
	
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
