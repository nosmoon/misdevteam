<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_2620_l.jsp
* 기능 :  판매-발송관리-수송단가조회
* 작성일자 : 2009-02-24
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_SND_2620_LDataSet ds = (SE_SND_2620_LDataSet)request.getAttribute("ds");
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
  		rt.setRowCnt(-1);											//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		rt.setAttribute("autoresize=true");
		String titleVal			= "";

		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma 	= ""	;
		String sizeSt 	= ""	;
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			
			if ( "해당지국".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "265";
			} else if ( 	"분류".equals(titleVal) 
						||  "단가노선명".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "100";
			} else if ( 	"차종(톤)".equals(titleVal) 
						||  "거리(km)".equals(titleVal) 
						|| "일일수송료".equals(titleVal) ){
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= "80";
			} else if (		"노선구분".equals(titleVal) 
						||  "인쇄처".equals(titleVal) 
						||  "적용일자".equals(titleVal) 
						||  "코드".equals(titleVal) ){
				rt.addColumn("output", "ta:center;");
				sizeSt	= String.valueOf( titleVal.length() * 25);
			} else {
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= String.valueOf( (titleVal.length() * 10) + 20);
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
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_SND_2620_LCURLISTRecord rec = (SE_SND_2620_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			qtyArr = rec.qty.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				if ( j == 0 ){
					val = rec.tran_uprc_clas_nm	;					//분류
				} else if ( j == 1 ){
					val = rec.route_clsf_nm		;					//노선구분
				} else if ( j == 2 ){
					val = rec.tran_uprc_cd		;					//단가노선코드
				} else if ( j == 3 ){
					val = rec.tran_uprc_route_nm;					//단가노선명
				} else if ( j == 4 ){
					val = rec.prt_plac_nm		;					//인쇄처
				} else if ( j == 5 ){
					val = rec.load_wgt			;					//차량 중량
				} else if ( j == 6 ){			
					val = rec.route_lgth		;					//노선거리
				} else if ( j > 6 && j <  (6 + qtyArr.length + 1) ){
					if ( j - 7 < qtyArr.length ){
						val = qtyArr[j - 7];						//이외의 가변 필드 값
					} else {
						val = "";
					}
				} else if ( j == (6 + qtyArr.length + 1) ){
					val = rec.send_plac_nm		;					//해당지국
				} else if ( j == (6 + qtyArr.length + 2) ){
					val = rec.tran_cost			;					//수송비
				} else if ( j == (6 + qtyArr.length + 3) ){
					val = rec.aply_dt			;					//적용일자
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