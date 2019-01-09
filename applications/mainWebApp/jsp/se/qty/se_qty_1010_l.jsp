<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_1010_l.jsp
* 기능 : 일계표이월처리-일계표기준 내역 조회
* 작성일자 : 2009-02-16
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_QTY_1010_LDataSet ds = (SE_QTY_1010_LDataSet)request.getAttribute("ds");

	try {
		//라이트 그리드는 생성하고자 하는 그리드의 노드셋과 리젤트셋의 노드셋이 같아야 한다. 
		//그리드 노드셋으로 생성하는 그리드를 매핑하는 듯함. 라이트 그리드 하나에 하나의 jsp가 필요하다.
		//RwXml을 같이 프린트하게 되면 가끔 다음의 조회 결과가 안된다.
		StringBuffer title 		= new StringBuffer("년월^매체^회차^이월일자^발송기준일자^조정여부^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.rownum);	//판매망구분 갯수	
		int len 				= 6 + r_num*3;                 	//캡션 배열 길이

		String[] qty_sell_net_clsf_ar;	
		qty_sell_net_clsf_ar = ds.qty_sell_net_clsf.split("\\^");		//구분코드
		
		title.append("년월^매체^회차^이월일자^발송기준일자^조정여부");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title_tmp = "^"+qty_sell_net_clsf_ar[i]+"^적용기준^유가율";
			title.append(title_tmp);
		}
		
		RwText rt = new RwText(); 					//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());											//행 개수 설정
	  	rt.setColCnt(len); 											//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal = "";

		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//년월
				rt.addColumn("input", "format:yyyy-mm;");
				size.append("85, ");
			}else if(i==1){		//매체
				rt.addColumn("combo", "");
				size.append("100, ");
			}else if(i==2){		//회차
				rt.addColumn("input", "format:9;");
				size.append("50, ");
			}else if(i==3){		//이월일자
				rt.addColumn("inputdate", "format:yyyy-mm-dd;");
				size.append("90, ");
			}else if(i==4){		//발송기준일자
				rt.addColumn("inputdate", "format:yyyy-mm-dd;");
				size.append("90, ");
			}else if(i==5){		//조정여부
				rt.addColumn("checkbox", "checkvalue:Y,N;");
				size.append("60, ");
			}else{
				
				if(i%3==0){			//구분코드
					rt.addColumn("output", "visibility:hidden;");
					size.append("60");
				}else if(i%3==1){	//적용기준
					rt.addColumn("combo", "itemset.nodeset:/root/initData/comboSet/valaplybasiclsf/item;itemset.label.ref:label; itemset.value.ref:value; text-align:left;");
					size.append("90");
				}else if(i%3==2){	//유가율
					rt.addColumn("input", "format:(-)#,##0.##;");
					size.append("60");
				}
				
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		String[] val_aply_basi_clsf_ar;	
		String[] val_rate_ar;		
		String val = "";
		int val_aply_basi_clsf_len = 0;
		int val_rate_len = 0;
		
		System.out.println("================="+ds.curlist.size());		
		//컬럼에 입력할 값을 입력한다.
		
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_QTY_1010_LCURLISTRecord rec = (SE_QTY_1010_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			val_aply_basi_clsf_ar = rec.val_aply_basi_clsf.split("\\^");	//적용기준
			val_aply_basi_clsf_len = val_aply_basi_clsf_ar.length;
			val_rate_ar = rec.val_rate.split("\\^");		//유가율
			val_rate_len = val_rate_ar.length;
			
			rt.addColValue(rec.yymm, "");				//년월
			rt.addColValue(rec.medi_cd, "");			//매체
			rt.addColValue(rec.tms, "");				//회차
			rt.addColValue(rec.cyov_dt, "");			//이월일자
			rt.addColValue(rec.send_basi_dt, "");		//발송기준일자
			rt.addColValue(rec.val_meda_yn, "");		//조정여부
			
			for (int j=0;j<r_num;j++){
		
				rt.addColValue(qty_sell_net_clsf_ar[j], "");		//구분코드
				
				if(val_aply_basi_clsf_len > j) rt.addColValue(val_aply_basi_clsf_ar[j], "");		//적용기준
				else rt.addColValue("", "");
									
				if ( j < r_num - 1){
					//컬럼의 마지막이 아닐때 컬럼 입력컬럼
					if(val_rate_len  > j) rt.addColValue(val_rate_ar[j], "");
					else rt.addColValue("", "");		
				} else {
					//컬럼의 마지막일때는 반드시 addRowValue로 입력
					if(val_rate_len  > j) rt.addRowValue(val_rate_ar[j], "");
					else rt.addRowValue("", "");
								
				}
			
			}
				
		}
		

		out.println(rt.textFlush()); //버퍼 출력	
	}
	catch (Exception e) {
	}

%>

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>