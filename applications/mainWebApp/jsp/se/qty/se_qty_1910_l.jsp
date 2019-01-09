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
* 파일명 : se_qty_1910_l.jsp
* 기능 : 발송부수증감-일반탭 리스트
* 작성일자 : 2009-02-26
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_QTY_1910_LDataSet ds = (SE_QTY_1910_LDataSet)request.getAttribute("ds");

	try {
		//라이트 그리드는 생성하고자 하는 그리드의 노드셋과 리절트셋의 노드셋이 같아야 한다. 
		//그리드 노드셋으로 생성하는 그리드를 매핑하는 듯함. 라이트 그리드 하나에 하나의 jsp가 필요하다.
		//RwXml을 같이 프린트하게 되면 가끔 다음의 조회 결과가 안된다.

		StringBuffer title 		= new StringBuffer("팀명^파트명^지역명^발송처명^센터코드^발송처순번^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"^합송처코드^합송처명|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//판매망구분 갯수	
		int len 				= 6 + r_num*5;                 	//캡션 배열 길이
		
		title.append("팀명^파트명^지역명^발송처명^센터코드^발송처순번");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title.append("^매체코드^등록^증감^계산^발송부수");
		}
		title.append("^합송처코드^합송처명");
	
		RwText rt = new RwText(); 									//RwText 객체 생성
  		rt.setBuffering(true); 				 						//버퍼링 사용 설정 -> T부분
  		rt.setRowCnt(ds.curlist.size());							//행 개수 설정
	  	rt.setColCnt(len+2); 										//열 개수 설정(중요) 열개수와 입력 값이 틀리면 그리드 생성 안됨.
		rt.setCaption(title.toString());                            //캡션을 입력 
		String titleVal = "";
	
		String[] editable_yn_ar = ds.editable_yn.split("\\^");	
		String[] regchk_yn_ar = ds.regchk_yn.split("\\^");	
		
		//라이트 그리드의 각 컬럼의 형태와 컬럼의 길이를 입력한다.
		String comma = "";
		String sEditable = "";
		String sDisable = "";
		String sReg_yn = "";
		int medi_col = 0;

		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//팀명
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==1){		//파트명
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==2){		//지역명
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==3){		//발송처명
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==4){		//지국코드
//				rt.addColumn("output", "visibility:hidden;");
				rt.addColumn("output", "");
				size.append("50, ");
			}else if(i==5){		//발송처순번
				rt.addColumn("inputdate", "visibility:hidden;");
				size.append("10, ");
			}else{
				
				medi_col = (int)(i-1)/5;
				if("Y".equals(editable_yn_ar[medi_col-1])){ 
					sEditable = "editable:true;";
					sDisable = "disabled:false;";
				}else{
					sEditable = "editable:false;";
					sDisable = "disabled:true;";
				}
				
				if("Y".equals(regchk_yn_ar[medi_col-1])) sReg_yn = "";
				else sReg_yn = "visibility:hidden;";
					
				if(i%5==1){			//매체코드
					rt.addColumn("output", "visibility:hidden;");
					size.append("10,");
				}else if(i%5==2){	//등록
					rt.addColumn("checkbox", "checkvalue:Y,N;"+sReg_yn+sDisable);
					size.append("40,");
				}else if(i%5==3){	//증감
					rt.addColumn("input", "format:(-)#,###;text-align:right;"+sEditable);
					size.append("50,");
				}else if(i%5==4){	//계산
					rt.addColumn("output", "visibility:hidden;");
					size.append("10,");
					//rt.addColumn("output", "");
					//size.append("60");
				}else if(i%5==0){	//발송부수	
						rt.addColumn("output", "format:#,###;text-align:right;");
						size.append("85,");	
				}
			}
		}

		//힙성처순번
		rt.addColumn("inputbutton", "format:99999-999;");

		size.append("80, ");
		//합송처명
		rt.addColumn("output", "");
		size.append("100 ");

		rt.setColWidth(size.toString()); 							//열 넓이를 입력한다.
		rt.setColumn();
		
		String[] medi_cd_ar = ds.medi_cd.split("\\^");		
		String[] same_yn_ar;	
		String[] icdc_qty_ar;	
		String[] calc_qty_ar;	
		String[] issu_qty_ar;		
		int medi_cd_len = 0;	
		int same_yn_len = 0;
		int icdc_qty_len = 0;
		int calc_qty_len = 0;
		int issu_qty_len = 0;
		
		String send_plac_nm = "";
				
		//컬럼에 입력할 값을 입력한다.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_QTY_1910_LCURLISTRecord rec = (SE_QTY_1910_LCURLISTRecord)ds.curlist.get(i);
			//생성 컬럼 수와 add하는 컬럼 수가 같아야한다. 마지막 컬럼은 반드시 addRowValue로 입력해야한다.

			same_yn_ar = rec.same_yn.split("\\^");
			icdc_qty_ar = rec.icdc_qty.split("\\^");		
			calc_qty_ar = rec.calc_qty.split("\\^");
			issu_qty_ar = rec.issu_qty.split("\\^");	
			same_yn_len = same_yn_ar.length;
			icdc_qty_len = icdc_qty_ar.length;
			calc_qty_len = calc_qty_ar.length;
			issu_qty_len = issu_qty_ar.length;
			
			rt.addColValue(rec.dept_nm, "");			//팀명
			rt.addColValue(rec.part_nm, "");			//파트명
			rt.addColValue(rec.area_nm, "");			//지역명
			send_plac_nm = rec.send_plac_nm;
			if(!"000".equals(rec.send_plac_seq)) send_plac_nm = send_plac_nm + " ☆";
			rt.addColValue(send_plac_nm, "");			//발송처명
			rt.addColValue(rec.bo_cd, "");				//지국코드
			rt.addColValue(rec.send_plac_seq, "");		//발송처순번
			
			for (int j=0;j<r_num;j++){
		
				rt.addColValue(medi_cd_ar[j], "");	//매체코드
				rt.addColValue(same_yn_ar[j], "");	//본지동일여부	
				rt.addColValue(icdc_qty_ar[j], "");	//증감	
				rt.addColValue(calc_qty_ar[j], "");	//계산										
				rt.addColValue(issu_qty_ar[j], "");		//발송부수
				
			}
			rt.addColValue(rec.add_snd_bo_cd+rec.add_snd_send_plac_seq, "");				//합송처코드순번
			rt.addRowValue(rec.add_snd_send_plac_nm, "");		//합송처명
		}
/*
		FileWriter fw = null;
		try{
			fw=new FileWriter("c:/test.txt");
			fw.write(rt.textPrint());
			fw.close();
			System.out.println("파일 생성 완료!");
		}catch(Exception e){
			System.out.println("파일 생성 실패!");
		}
*/		
		out.println(rt.textFlush()); //버퍼 출력	

	}
	catch (Exception e) {
	}

%>
