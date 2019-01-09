<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.rpt.rec.*
	,	chosun.ciis.is.rpt.ds.*;
	"
%>

<%
	IS_RPT_1720_LDataSet ds = (IS_RPT_1720_LDataSet)request.getAttribute("ds");
	String errcode 	= ""		;
	String errmsg 	= ""		;

	errcode 		= ds.errcode;
	errmsg 			= ds.errmsg	;

	try {
		//라이트 그리드는 생성하고자 하는 그리드의 노드셋과 리젤트셋의 노드셋이 같아야 한다. 
		//그리드 노드셋으로 생성하는 그리드를 매핑하는 듯함. 라이트 그리드 하나에 하나의 jsp가 필요하다.
		//RwXml을 같이 프린트하게 되면 가끔 다음의 조회 결과가 안된다.
		StringBuffer title 		= new StringBuffer();
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		
		String[] titleArr 		= title.toString().split("\\^");   //캡션 배열
		int len 				= titleArr.length;                 //캡션 배열 길이
		
		RwText rt 				= new RwText(); 					//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());							//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal			 = "";

		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma 	= ""	;
		String sizeSt 	= ""	;
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			if ( 	"월".equals(titleVal) ){
				rt.addColumn("output", "ta:center;");
				sizeSt	= "60";
			} else if ( "증감률".equals(titleVal) ){
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= "80";
			} else {
				rt.addColumn("output", "ta:right;format:#,###;");
				//sizeSt	= String.valueOf( (titleVal.length() <=2 ? titleVal.length() * 20 + 20 : titleVal.length() * 20));
				sizeSt	= "80";
			}
			
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			size.append(sizeSt + comma);
		}
		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
	
		//컬럼에 입력할 값을 입력한다.
		for ( int k = 0 ; k < ds.curlist.size() ; k++ ){
			IS_RPT_1720_LCURLISTRecord rec = (IS_RPT_1720_LCURLISTRecord)ds.curlist.get(k);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.
			qtyArr = rec.amt.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
 	
				if ( j == 0 ){
					val = rec.mm_nm			;					//지역명
				//} else if ( j == 12 ){
				//	val = ""		;					//발송처명
				} else {
					val = qtyArr[j-1];							//이외의 가변 필드 값
				}
 			
				if ( j < len - 1){
					rt.addColValue(val, ""); 						//컬럼의 마지막이 아닐때 컬럼 입력컬럼
				} else {
					rt.addRowValue(val, "");						//컬럼의 마지막일때는 반드시 addRowValue로 입력
				}
			}
			
		}
		out.println(rt.textFlush()); //버퍼 출력	
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
%>

<% /* 작성시간 : Tue Feb 10 14:57:13 KST 2009 */ %>