<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1110_l.jsp
* 기능 : 지국별목표등록 - 지국별 내역
* 작성일자 : 2009-03-20
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_TRG_1110_LDataSet ds = (SE_TRG_1110_LDataSet)request.getAttribute("ds");

	try {
	
		StringBuffer title 		= new StringBuffer("지역코드^지역명^센터코드^센터명^마감여부^발송부수");
		StringBuffer size 		= new StringBuffer();
		int r_num 				= Integer.parseInt(ds.colcnt);	//판매망구분 갯수	
		int len 				= 6 + r_num*2;                 	//캡션 배열 길이
		
		for(int j=0; j<r_num; j++){
			title.append("^전년도");		
		}
		for(int j=0; j<r_num; j++){
			title.append("^목표합계");		
		}
		title.append("|");
		title.append("지역코드^지역명^센터코드^센터명^마감여부^발송부수^");
		title.append(ds.title+"^");
		title.append(ds.title);
		
		RwText rt = new RwText(); 					//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());							//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal = "";
	
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//지역코드
				rt.addColumn("output", "visibility:hidden;");
				size.append("70, ");
			}else if(i==1){		//지역명
				rt.addColumn("output", "");
				size.append("75, ");
			}else if(i==2){		//지국코드
				rt.addColumn("output", "format:99999-999;");
				size.append("80, ");
			}else if(i==3){		//지국명
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==4){		//마감여부
				rt.addColumn("output", "");
				size.append("60, ");
			}else if(i==5){		//발송부수
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("80, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("82");
			
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		
		String[] trgt_ar;	
		String[] prev_trgt_ar;			
		int trgt_len = 0;			
		int prev_trgt_len = 0;	
		
		String send_plac_nm = "";
				
		//컬럼에 입력할 값을 입력한다.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1110_LCURLISTRecord rec = (SE_TRG_1110_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			trgt_ar = rec.trgt.split("\\^");
			trgt_len = trgt_ar.length;
			prev_trgt_ar = rec.prev_trgt.split("\\^");
			prev_trgt_len = prev_trgt_ar.length;
			
			rt.addColValue(rec.area_cd, "");			//지역코드
			rt.addColValue(rec.area_nm, "");			//지역명
			rt.addColValue(rec.bo_cd+rec.bo_seq, "");	//지국코드
			rt.addColValue(rec.bo_nm, "");				//지국명
			rt.addColValue(rec.clos_yn, "");			//마감여부
			rt.addColValue(rec.thmmsendqty, "");		//발송부수
			
			for (int j=0;j<r_num;j++){
		
					rt.addColValue(prev_trgt_ar[j], "");		//목표
			}
			for (int j=0;j<r_num;j++){
		
				if ( j < r_num - 1){
					//컬럼의 마지막이 아닐때 컬럼 입력컬럼
					rt.addColValue(trgt_ar[j], "");		//목표
				} else {
					//컬럼의 마지막일때는 반드시 addRowValue로 입력
					rt.addRowValue(trgt_ar[j], "");		//목표
				}
			}
		}

		out.println(rt.textFlush()); //버퍼 출력	
	}
	catch (Exception e) {
	}

%>
