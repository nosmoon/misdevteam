<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.rec.*
	,	chosun.ciis.se.trg.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1210_l.jsp
* 기능 : 목표결과조회-연간 내역
* 작성일자 : 2009-04-02
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_TRG_1210_LDataSet ds = (SE_TRG_1210_LDataSet)request.getAttribute("ds");

	try {
		//라이트 그리드는 생성하고자 하는 그리드의 노드셋과 리절트셋의 노드셋이 같아야 한다. 
		//그리드 노드셋으로 생성하는 그리드를 매핑하는 듯함.  라이트 그리드 하나에 하나의 jsp가 필요하다.
		//RwXml을 같이 프린트하게 되면 가끔 다음의 조회 결과가 안된다.
		StringBuffer title 		= new StringBuffer("코드^팀명^코드^파트명^코드^지역명^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//목표구분 갯수	
		int len 				= 6 + r_num*2;                 	//캡션 배열 길이
		
		title.append("코드^팀명^코드^파트명^코드^지역명");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title.append("^목표^실적");
		}
		
//System.out.println("title.toString()>>>>>>>>>"+title.toString());
		
		RwText rt = new RwText(); 									//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());							//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal = "";
	
		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma = "";
		String sEditable = "";
		String sDisable = "";
		String sReg_yn = "";
		int medi_col = 0;
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//코드
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==1){		//팀명
				rt.addColumn("output", "");
				size.append("100, ");
			}else if(i==2){		//코드
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==3){		//파트명
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==4){		//코드
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==5){		//지역명
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==6 || i==7){		//순매출
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("85, ");
			}else if(i==8 || i==9){		//실독자수
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("85, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("60");
			
				if(len-1 > i) size.append(", ");
			} 
						
		}

		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		
		String[] trgt_ar;	
		String[] rslt_ar;		
		int trgt_len = 0;	
		int rslt_len = 0;
				
		//컬럼에 입력할 값을 입력한다.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1210_LCURLISTRecord rec = (SE_TRG_1210_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			trgt_ar = rec.trgt.split("\\^");
			rslt_ar = rec.rslt.split("\\^");	
			trgt_len = trgt_ar.length;
			rslt_len = rslt_ar.length;
			
			rt.addColValue(rec.dept_cd, "");			//코드
			rt.addColValue(rec.dept_nm, "");			//팀명
			rt.addColValue(rec.part_cd, "");			//코드
			rt.addColValue(rec.part_nm, "");			//팀명
			rt.addColValue(rec.area_cd, "");			//코드
			rt.addColValue(rec.area_nm, "");			//팀명
						
			for (int j=0;j<r_num;j++){
		
				rt.addColValue(trgt_ar[j], "");		//목표
									
				if ( j < r_num - 1){
					//컬럼의 마지막이 아닐때 컬럼 입력컬럼
					rt.addColValue(rslt_ar[j], "");		//실적
				} else {
					//컬럼의 마지막일때는 반드시 addRowValue로 입력
					rt.addRowValue(rslt_ar[j], "");		//실적
								
				}
			
			}
				
		}

		out.println(rt.textFlush()); //버퍼 출력	
	}
	catch (Exception e) {
	}

%>
