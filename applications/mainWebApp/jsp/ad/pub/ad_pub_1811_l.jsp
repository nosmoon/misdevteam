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

    RwXml rx = new RwXml();
	AD_PUB_1811_LDataSet ds = (AD_PUB_1811_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData 	= rx.add(root, "resData2", "");
	int gridData 	= rx.add(resData, "gridData2", "");

	try {
		long   tot_advt_fee     = 0;
		long   tot_vat          = 0;
		long   tot_misu_amt     = 0;
		long   tot_fee          = 0;
		double tot_pubc         = 0.00d;
		System.out.println("ds.curlist.size="+ds.curlist.size());	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1811_LCURLISTRecord rec = (AD_PUB_1811_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			System.out.println("i="+i);
			rx.add(record,"sale_stmt_issu_yn",rec.sale_stmt_issu_yn.substring(0,1));	//발행
			rx.add(record,"purc_stmt_issu_yn",rec.purc_stmt_issu_yn);	//매입발행
			rx.add(record,"pubc_dt",rec.pubc_dt);				//게재일
			rx.add(record,"pubc_slip_no",rec.pubc_slip_no.substring(3,15));		//전표번호
			rx.add(record,"medi_nm",rec.medi_nm);				//매체
			rx.addCData(record,"dlco_nm",rec.dlco_nm);				//광고주명
			
			if( rec.sect_cd == "" && rec.sect_seq == "" )
			{
				rx.add(record, "sect", rec.pubc_side);
			}
			else
			{
				if(StringUtil.toNumber(rec.sect_seq) < 10){
					rx.add(record,"sect",rec.sect_cd + "  " + rec.sect_seq );	//면
				}else if(StringUtil.toNumber(rec.sect_seq) >= 10 && StringUtil.toNumber(rec.sect_seq) < 100){
					rx.add(record,"sect",rec.sect_cd + " " + rec.sect_seq );	//면
				}else{
					rx.add(record,"sect",rec.sect_cd + "" + rec.sect_seq );	//면
				}
			}
			//rx.add(record,"sect",rec.sect_cd + (StringUtil.toNumber(rec.sect_seq) < 10 ? " " + rec.sect_seq : rec.sect_seq ));	//면
			
			
			rx.add(record,"dn",StringUtil.toDouble(rec.dn));		//단
			rx.add(record,"cm",StringUtil.toDouble(rec.cm));		//CM
			rx.add(record,"row",rec.arow);						//행
			
			rx.add(record,"chro_clsf",rec.chro_clsf);					//색도
			rx.add(record,"uprc",rec.uprc);						//단가
			rx.add(record,"advt_fee",rec.advt_fee);					//광고료
			rx.add(record,"vat",rec.vat);							//부가세
			rx.add(record,"misu_tot_amt",rec.misu_tot_amt);				//미수총액
			
			rx.addCData(record,"agn",rec.agn);							//대행사명
			rx.add(record,"fee",rec.fee);							//대행료
			rx.addCData(record,"hndl_plac_nm",rec.hndl_plac_nm);				//지사명
			rx.addCData(record,"coms_rate",rec.coms_rate);						//수수료율
			rx.add(record,"coms",rec.coms);						//수수료
			rx.add(record,"slcrg_nm",rec.slcrg_nm);					//영업담당
			
			rx.add(record,"mchrg_nm",rec.mchrg_nm);					//관리담당
			rx.addCData(record,"sect_nm_cd",rec.sect_nm);						//섹션명
			rx.add(record,"pubc_clsf_nm",rec.pubc_clsf_nm);				//게재구분
			rx.add(record,"edt_clsf",rec.edt_clsf);				//판구분
			rx.add(record,"indt_clsf_nm",rec.indt_clsf+" "+rec.indt_clsf_nm);//업종
			rx.add(record,"grp_cmpy_nm",rec.grp_cmpy_nm);					//그룹사
			
			rx.add(record,"elec_tax_stmt_yn",rec.elec_tax_stmt_yn);			//전자계산서
			rx.add(record,"pubc_cnt",rec.pubc_cnt);					//게재량
			rx.addCData(record,"advt_cont",rec.advt_cont);					//광고내용
			rx.add(record,"hidden_pubc_slip_no",rec.pubc_slip_no);		//전표번호_hidden
			rx.add(record,"side_cd",rec.side_cd);						//side_cd
			
			rx.add(record,"ern", rec.ern);
			
			rx.add(record,"pre_issu_yn",rec.sale_stmt_issu_yn.substring(1));	//선발행

			tot_advt_fee += StringUtil.toLong(rec.advt_fee);  
			tot_vat      += StringUtil.toLong(rec.vat);
			tot_misu_amt += StringUtil.toLong(rec.misu_tot_amt);
			tot_fee      += StringUtil.toLong(rec.fee);
			tot_pubc     += StringUtil.toLong(rec.pubc_cnt);			
		}
		
		int resForm = rx.add(resData, "resForm2", "");
		
		rx.add(resForm, "tot_pubc_amt", tot_advt_fee ); 
		rx.add(resForm, "tot_vat_amt", tot_vat ); 
		rx.add(resForm, "tot_misu_amt", tot_misu_amt ); 
		rx.add(resForm, "tot_fee_amt", tot_fee ); 
	    rx.add(resForm, "tot_pubc", tot_pubc); 

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
	
	
	
%>
