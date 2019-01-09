<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : SE_TRG_1025_l.jsp
* 기능 : 지역별목표등록 - 지역별 내역
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
	SE_TRG_1025_LDataSet ds = (SE_TRG_1025_LDataSet)request.getAttribute("ds");

	try {
	
		StringBuffer title 		= new StringBuffer("팀명^파트명^지역명^담당사번^담당자명^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//판매망구분 갯수	
		int len 				= 5 + r_num*12;                 	//캡션 배열 길이
		
		title.append("팀명^파트명^지역명^담당사번^담당자명");
		String sTmpTitle = "";
		for(int i=0; i<r_num; i++){
			sTmpTitle = sTmpTitle + "^1월^2월^3월^4월^5월^6월^7월^8월^9월^10월^11월^12월";
		}
		title.append(sTmpTitle);
		
		RwText rt = new RwText(); 					//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());							//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal = "";
	
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//팀명
				rt.addColumn("output", "");
				size.append("130, ");
			}else if(i==1){		//파트명
				rt.addColumn("output", "");
				size.append("140, ");
			}else if(i==2){		//지역명
				rt.addColumn("output", "");
				size.append("140, ");
			}else if(i==3){		//담당사번
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==4){		//담당자명
				rt.addColumn("output", "");
				size.append("100, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("115");
			
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		
		String[] trgt_ar;			
		int trgt_len = 0;	
		
		String send_plac_nm = "";
		//컬럼에 입력할 값을 입력한다.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1025_LCURLISTRecord rec = (SE_TRG_1025_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			trgt_ar = rec.trgt.split("\\^");
			trgt_len = trgt_ar.length;
			
			rt.addColValue(rec.dept_nm, "");			//팀명
			rt.addColValue(rec.part_nm, "");			//파트명
			rt.addColValue(rec.area_nm, "");			//지역명
			rt.addColValue(rec.chrg_pers, "");			//담당사번
			rt.addColValue(rec.chrg_flnm, "");			//담당자명
			
			for (int j=0;j<trgt_len;j++){
		
				if ( j < trgt_len - 1){
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
