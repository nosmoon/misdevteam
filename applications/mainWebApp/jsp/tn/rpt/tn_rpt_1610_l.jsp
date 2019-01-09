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
	TN_RPT_1600_LDataSet ds = (TN_RPT_1600_LDataSet)request.getAttribute("ds");
	
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
	rt.setColCnt(15);
	rt.setCaption("회원코드^이름^약정코드^약정일자^약정금액^납입방식^분납방식^납입시작일^납입종료일^월납입일^분납액^분납횟수^온라인 약정여부^약정등록일^기금2차");
	
	int Csize = 0;

	// 80,55,80,91,86,183,55,91,91,58,55,55,93,85,100
	rt.addColumn("output","");			//<col ref="membercode"/>
	size.append("80,");
	rt.addColumn("output", "");			//<col ref="name"/>                           
	size.append("55,");
	rt.addColumn("output", "");         // <col ref="promisecode"/>                     
	size.append("80,");	
	rt.addColumn("output", "format:yyyy-mm-dd;");  //<col ref="promisedate"/>                       
	size.append("91,");	
	rt.addColumn("output", "format:(-)#,###;text-align:right;");   //<col ref="promiseprice"/>                      
	size.append("86,");	
	rt.addColumn("output", "");        // <col ref="paymethodnm"/>                    
	size.append("183,");	
	rt.addColumn("output", "");   // <col ref="partitiontype"/> 
	size.append("55,");	
	rt.addColumn("output", "format:yyyy-mm-dd;");     // <col ref="paystartdate"/>                       
	size.append("91,");	
	rt.addColumn("output", "format:yyyy-mm-dd;");    // <col ref="payenddate"/>                  
	size.append("91,");	
	rt.addColumn("output", "format:yyyy-mm-dd;");   //<col ref="payenddate" />    
	size.append("58,");	
	rt.addColumn("output", "format:(-)#,###;text-align:right;");  // <col ref="monthlypayprice" format="#,###"/>        
	size.append("55,");	
	rt.addColumn("output", "");      // <col ref="partitioncount"/>                        
	size.append("55,");	
	rt.addColumn("output", "");      // <col ref="onlineproyn"/>  
	size.append("93,");	
	rt.addColumn("output", "format:yyyy-mm-dd;");    //<col ref="writedate" format="yyyy-mm-dd""/>
	size.append("85,");	
	rt.addColumn("output", "");	     // <col ref="fund2"/>   
	size.append("100,");		

	// rt객체의 사이즈가 1000 byte 미만일 경우 submit오류를 발생시켜 4건미만일 경우 공백을 추가하여
	// rt객체의 사이즈를 증가시켜준다 
	// by 노상현
	
	for ( int i = 0 ; i < (5 - rowcnt); i++ ){
		size.append("                                                                                                    ");
	}
	
	rt.setColWidth(size.toString()); 
	rt.setColumn();

	try { 
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_RPT_1600_LCURLISTRecord rec = (TN_RPT_1600_LCURLISTRecord)ds.curlist.get(i);

			rt.addColValue(rec.membercode,"");         
			rt.addColValue(rec.name,"");       
			rt.addColValue(rec.promisecode,"");
			rt.addColValue(rec.promisedate,"");
			rt.addColValue(rec.promiseprice,"");
			rt.addColValue(rec.paymethodnm,"");
			rt.addColValue(rec.partitiontype,"");
			rt.addColValue(rec.paystartdate,"");
			rt.addColValue(rec.payenddate,"");     
			rt.addColValue(rec.monthlypayday,"");     
			rt.addColValue(rec.monthlypayprice,"");  
			rt.addColValue(rec.partitioncount,""); 
			rt.addColValue(rec.onlineproyn,"");
			rt.addColValue(rec.writedate,"");			
			rt.addColValue(rec.fund2,"");        
			
			rt.addRowValue(i, "");
		}		

		//System.out.print("length::"+rt.length());
		//Csize = rt.textPrint().length();
				
		int stringByteLength = rt.textPrint().getBytes().length;
		
		System.out.print("stringByteLength::"+stringByteLength);
		
		//Csize = stringByteLength + 17;
		Csize = stringByteLength + 517;
		
		//response.setHeader("Accept-Ranges", "bytes");
		//response.setContentLength(Csize);
				
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
