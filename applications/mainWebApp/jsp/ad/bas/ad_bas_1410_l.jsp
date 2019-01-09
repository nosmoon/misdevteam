<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_1410_l.jsp
* 기능 : 
* 작성일자 : 2009-03-05
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1410_LDataSet ds = (AD_BAS_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	int record =  0;
	int j = 0;
	int k = 0;
	int seq = 1;
	String mchrg_old = "";
	String mchrg_new = "";
	String hndl_clsf_old = "";
	String space = " ";
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1410_LCURLISTRecord rec = (AD_BAS_1410_LCURLISTRecord)ds.curlist.get(i);
			mchrg_new = rec.mchrg_pers;
			//같은 사번이 경우

			if(mchrg_new.equals(mchrg_old) || mchrg_old.equals("")){//맨 처음과 사번이 같을 때 
				//if(j%4 == 0){
				if(mchrg_old.equals("")){//맨처음 사용
					record 		= rx.add(gridData, "record", "");
					rx.add(record, "mchrg_pers", rec.mchrg_pers);
					mchrg_old 	= rec.mchrg_pers;
					hndl_clsf_old = rec.hndl_clsf;
					rx.add(record, "seq", seq);
					rx.add(record, "mchrg_nm", rec.mchrg_nm);
					if(!"".equals(rec.chrg_area)){//사번별 담당지역 표시  
						rx.add(record, "chrg_area", rec.chrg_area);	
					}else{
						rx.add(record, "chrg_area", space);
					} 
				}
				if(j<4){//거래처에서  두번째 칸부터 4번째 칸까지(맨 첫 줄에서는 첫번째 칸에서도 사용) 
					if(hndl_clsf_old.equals(rec.hndl_clsf)){//취급처가 같으면
						rx.add(record, "dlco_no" + j, rec.dlco_no);
						rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");						
						//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")-"+j);
//						hndl_clsf_old = rec.hndl_clsf;
					}else{
						for(k=j;k<4;k++){//취급처가 다르면 공백처리  	
							rx.add(record, "dlco_no" + k, " ");
							rx.add(record, "dlco_nm" + k, " ");	
							j++;
						}
					}					
				}
				if(j>3){//거래처에서  줄 바뀌고 첫번째 칸에서 사용 
					j=0;//l=0;
					//순번/담당자와 거래처를 맞추기 위해서 
					record 		= rx.add(gridData, "record", "");
					rx.add(record, "mchrg_pers", rec.mchrg_pers);
					mchrg_old 	= rec.mchrg_pers;
	///				hndl_clsf_old = rec.hndl_clsf;
					rx.add(record, "seq", seq);
					rx.add(record, "mchrg_nm", rec.mchrg_nm);
					if(!"".equals(rec.chrg_area)){//사번별 담당지역 표시  
						rx.add(record, "chrg_area", rec.chrg_area);	
					}else{
						rx.add(record, "chrg_area", space);
					} 	
					//				
					rx.add(record, "dlco_no" + j, rec.dlco_no);
					rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");
					//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")+"+j);
		
				}
				hndl_clsf_old = rec.hndl_clsf;
			    j++;			 		
			}//if
			//다른 사번인 경우 
			if(!mchrg_new.equals(mchrg_old)){
			
			   	for(k=j;k<4;k++){//이전사번과 다를 경우 남는 공간 공백 처리 	
					rx.add(record, "dlco_no" + k, " ");
					rx.add(record, "dlco_nm" + k, " ");	
				}	
				record = rx.add(gridData, "record", "");
				rx.add(record, "mchrg_pers", rec.mchrg_pers);
				mchrg_old = rec.mchrg_pers;
				seq = seq + 1;
				rx.add(record, "seq", seq);
				rx.add(record, "mchrg_nm", rec.mchrg_nm);
				if(!rec.chrg_area.equals("") ){//사번별 담당지역 표시  
					rx.add(record, "chrg_area", rec.chrg_area);	
				}else{
					rx.add(record, "chrg_area", space); 
				} 
				j=0;
				if(j<4){//사번이 다를 때 첫줄 첫번째 칸에서 사용 
					rx.add(record, "dlco_no" + j, rec.dlco_no);
					rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");
					//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")$$"+j);
					j++;
				}				
				hndl_clsf_old = rec.hndl_clsf;
			}

			
		}//for

	rx.add(resData, "cnt_advt", ds.cnt_advt);
	rx.add(resData, "cnt_agn", ds.cnt_agn);
			
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
