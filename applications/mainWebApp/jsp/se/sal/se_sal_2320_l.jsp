<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_2320_l.jsp
* 기능 :  판매 - 지대관리 - 매출관리 - 출장전자료조회
* 작성일자 : 2009-04-07
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_SAL_2320_LDataSet ds = (SE_SAL_2320_LDataSet)request.getAttribute("ds");
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		//라이트 그리드는 생성하고자 하는 그리드의 노드셋과 리젤트셋의 노드셋이 같아야 한다. 
		//그리드 노드셋으로 생성하는 그리드를 매핑하는 듯함. 라이트 그리드 하나에 하나의 jsp가 필요하다.
		//RwXml을 같이 프린트하게 되면 가끔 다음의 조회 결과가 안된다.
		StringBuffer title 		= new StringBuffer();
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		
		String[] titleAr		= title.toString().split("\\|");
		String[] titleArr 		= titleAr[1].split("\\^");   //캡션 배열
		
		int len 				= titleArr.length;                 //캡션 배열 길이
		
		RwText rt 				= new RwText(); 					//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(-1);											//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal			 = "";
		String colSize				 = "";
		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma = "";
		
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			
			if ( i == 0 || i == 1 ){
				rt.addColumn("output", "ta:left;");			
				colSize = "70";
			} else if ( i == 11 ){
			 	rt.addColumn("output", "format:(-)#,###;ta:right;");			
				colSize = "90";
			} else {
				rt.addColumn("output", "format:(-)#,###;ta:right;");			
				colSize = "80";
			}
			
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			size.append(colSize + comma);
		}
		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
		
		//컬럼에 입력할 값을 입력한다.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_SAL_2320_LCURLISTRecord rec = (SE_SAL_2320_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			qtyArr = rec.sub_amt.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				//실제 split은 값이 있는 경우까지만 배열을 생성한다. 4^5^6^^^^^일 경우 배열 3개만 생성함. 
				//그래서 마지막에 널값이 있으면 오류가 발생함.
				if ( j == 0 ) {
					val = rec.bo_nm;								//지국명
				} else if ( j == 1 ){
					val = rec.bo_head_nm;							//지국장명
				} else if ( j == 2 ){
					val = rec.net_sale_amt;							//본사지대
				} else if ( j == 3 ){
					val = rec.app_gurt;								//추가보증금
				} else if ( j == 4 ){
					val = rec.net_sale_amt_610;						//스포츠지대
				} else if ( j == 5 ){
					val = rec.smt_amt1;								//지대 소계
				} else if ( j == 6 ){
					val = rec.compen_divn_amt;						//계산서
				} else if ( j == 7 ){
					val = rec.tax_compen_divn_amt;					//세금계산서
				} else if ( j == 8 ){
					val = rec.vat_compen_divn_amt;					//부가세
				} else if ( j == 9 ){
					val = rec.smt_amt2;								//판촉물 소계
				} else if ( j == 10 ){
					val	= rec.pdlv_altn_amt;						//우송대체금액
				} else if ( j == 11 ){
					val	= rec.smt;									//합계
				} else {
					if ( j - 12 < qtyArr.length ){
						val = qtyArr[j - 12];						//이외의 가변 필드 값
					} else {
						val = "";
					}
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

<% /* 작성시간 : Tue Apr 07 17:53:34 KST 2009 */ %>