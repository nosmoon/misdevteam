<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%  
	
	AD_PUB_1810_LDataSet ds = (AD_PUB_1810_LDataSet)request.getAttribute("ds");
	
	if(ds.curlist.size() > 0){
	    //RwText 객체 생성
		RwText rt = new RwText();
		try	{		
			
			//버퍼링 사용 설정
			rt.setBuffering(true);
		
			//행과 열 개수 설정
			rt.setRowCnt(-1);
			rt.setColCnt(29);
			
			//캡션 설정
			//--------------이부분을 적절히 수정해 주면 됩니다----------------//
			rt.setCaption("발행^게재일^hidden_pubc_slip_no^전표번호^매체^광고주명^면^단^CM^행^색도^단가^광고료^부가세^미수총액^대행사명^대행료^지사명^수수료^담당^담당^섹션명^구분^업종^그룹사^전자계산서^광고내용^게재량^side_cd|발행^게재일^hidden_pubc_slip_no^전표번호^매체^광고주명^면^단^CM^행^색도^단가^광고료^부가세^미수총액^대행사명^대행료^지사명^수수료^영업^관리^섹션명^구분^업종^그룹사^전자계산서^광고내용^게재량^side_cd");
			
			//"계산서발행^게재일^전표번호^매체^게재면^섹션분류^섹션명^영업담당^관리담당^광고주^대행사^광고료^부가세^입금총액^미수총액^대행료^전자세금서여부^T/B^SIDE_CD"  ==>19 OLD
			
			//"계산서발행^게재일^전표번호^매체^영업담당^관리담당^광고주명^광고료^부가세^미수총액^대행사^대행료^게재량^단^CM^행^면^섹션명^T/B^색도^매체코드^전자세금계산서^side_cd"  ==> 23 NEW
			
			//"발행^게재일^전표번호^매체^광고주명^면^단^CM^행^색도^단가^광고료^부가세^미수총액^대행사명^대행료^지사명^수수료^담당^담당^섹션명^구분^업종^그룹사^전자계산서^광고내용^게재량^side_cd""  ==>28 NEW_NEW
			
			//열 넓이 설정
			rt.setColWidth("33, 70, 110, 100, 45, 140, 50, 50, 50, 50, 60, 75, 100, 100, 100, 100, 100, 100, 100, 60, 60, 70, 70, 100, 100, 39, 100, 55, 33");
			
			//Column type 및 style 설정
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;");//전표번호_hidden(000-00000000-0000)
			rt.addColumn("output","");//전표번호_visiable(00000000-0000)
			rt.addColumn("output","");
			
			rt.addColumn("output","");			
			rt.addColumn("output","padding-right:16; background-position:center right;"); //게재면
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","visibility:hidden;");//전자계산서 
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;"); //SIDE_CD
		    
			rt.setColumn();
			out.print(rt.textFlush());
	
			long   tot_advt_fee     = 0;
			long   tot_vat          = 0;
			long   tot_misu_amt     = 0;
			long   tot_fee          = 0;
			double tot_pubc         = 0.00d;
					
			for(int i = 0; i < ds.curlist.size(); i++) {
				AD_PUB_1810_LCURLISTRecord rec = (AD_PUB_1810_LCURLISTRecord)ds.curlist.get(i);
											
				rt.addColValue(rec.sale_stmt_issu_yn, "");	//발행
				rt.addColValue(rec.pubc_dt,"");				//게재일
				rt.addColValue(rec.pubc_slip_no,"");		//전표번호_hidden
				rt.addColValue(rec.pubc_slip_no.substring(3,15),"");		//전표번호
				rt.addColValue(rec.medi_nm,"");				//매체
				
				rt.addColValue(rec.dlco_nm,"");				//광고주명
				rt.addColValue(rec.sect_cd + (StringUtil.toNumber(rec.sect_seq) < 10 ? " " + rec.sect_seq : rec.sect_seq ),"");	//면
				rt.addColValue(StringUtil.toDouble(rec.dn),"");		//단
				rt.addColValue(StringUtil.toDouble(rec.cm),"");		//CM
				rt.addColValue(rec.arow,"");						//행
				
				rt.addColValue(rec.chro_clsf,"");					//색도
				rt.addColValue(rec.uprc,"");						//단가
				rt.addColValue(rec.advt_fee,"");					//광고료
				rt.addColValue(rec.vat,"");							//부가세
				rt.addColValue(rec.misu_tot_amt,"");				//미수총액
				
				rt.addColValue(rec.agn,"");							//대행사명
				rt.addColValue(rec.fee,"");							//대행료
				rt.addColValue(rec.hndl_plac_nm,"");				//지사명
				rt.addColValue(rec.coms,"");						//수수료
				rt.addColValue(rec.slcrg_nm,"");					//영업담당
				
				rt.addColValue(rec.mchrg_nm,"");					//관리담당
				rt.addColValue(rec.sect_nm,"");						//섹션명
				rt.addColValue(rec.pubc_clsf_nm,"");				//구분
				rt.addColValue(rec.indt_clsf+" "+rec.indt_clsf_nm,"");//업종
				rt.addColValue(rec.grp_cmpy_nm,"");					//그룹사
				
				rt.addColValue(rec.elec_tax_stmt_yn, "");			//전자계산서
				rt.addColValue(rec.advt_cont,"");					//광고내용
				rt.addColValue(rec.pubc_cnt,"");					//게재량
				rt.addRowValue(rec.side_cd,"");						//side_cd

	
				tot_advt_fee += StringUtil.toNumber(rec.advt_fee);  
				tot_vat      += StringUtil.toNumber(rec.vat);
				tot_misu_amt += StringUtil.toNumber(rec.misu_tot_amt);
				tot_fee      += StringUtil.toNumber(rec.fee);
				tot_pubc     += StringUtil.toNumber(rec.pubc_cnt);
				
			}		
			
			rt.addColValue("","");		//발행
			rt.addColValue("","");		//게재일
			rt.addColValue("","");		//전표번호_hidden
			rt.addColValue("","");		//전표번호
			rt.addColValue("","");		//매체
			
			rt.addColValue("","");		//광고주명
			rt.addColValue("","");		//면
			rt.addColValue("","");		//단
			rt.addColValue("","");		//CM
			rt.addColValue("","");		//행
			
			rt.addColValue("","");		//색도
			rt.addColValue("","");		//단가
			rt.addColValue(tot_advt_fee,"");		//광고료
			rt.addColValue(tot_vat,"");				//부가세
			rt.addColValue(tot_misu_amt,"");		//미수총액
			
			rt.addColValue("","");		//대행사명
			rt.addColValue(tot_fee,"");		//대행료
			rt.addColValue("","");		//지사명
			rt.addColValue("","");		//수수료
			rt.addColValue("","");		//영업담당
			
			rt.addColValue("","");		//관리담당
			rt.addColValue("","");		//섹션명
			rt.addColValue("","");		//구분
			rt.addColValue("","");		//업종
			rt.addColValue("","");		//그룹사
			
			rt.addColValue("","");		//전자계산서
			rt.addColValue(tot_pubc,"");		//광고내용
			rt.addColValue("","");				//게재량
			rt.addRowValue("","");				//side_cd
			
			out.println(rt.textFlush()); //버퍼 출력
		}catch(Exception e){
			System.out.println("e.......... : " + e.getMessage());
		}
	}
	
%>
