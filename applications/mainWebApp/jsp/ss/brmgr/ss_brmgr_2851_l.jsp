<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ss.sls.brmgr.rec.*
	,	chosun.ciis.ss.sls.brmgr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SS_SLS_BRMGR_2851_LDataSet ds = (SS_SLS_BRMGR_2851_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int recordSet2 = 0;
	int recordSet3 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	//총수금액, 평균구독단가
	int totData    = rx.add(root, "totData", "");
	rx.add(totData, "avg_clamt",  	ds.avg_clamt);
	rx.add(totData, "avg_subsuprc",	ds.avg_subsuprc);
	rx.add(totData, "avg_totqty",	(ds.avg_subsuprc == 0) ? 0 : (ds.avg_clamt / ds.avg_subsuprc));
	rx.add(totData, "avg_valqty",	(ds.avg_subsuprc == 0) ? 0 : ((ds.avg_clamt / ds.avg_subsuprc)/12));
	
	
	dataSet = rx.add(root, "dataSet", "");

	//평균(Real)
	int valcnt  = 0;
	int aftcnt1 = 0;
	int aftcnt2 = 0;
	int aftcnt3 = 0;
	int aftcnt4 = 0;
	int aftcnt5 = 0;
	int aftcnt6 = 0;
	int subsumval = 0;
	int excsaftcnt7 = 0;
	int free_misu = 0;
	int free_disc = 0;
	int subsumfree = 0;
	int sumtot = 0;
	int thmmsendqty = 0;
	double per = 0.00d;	
	double subabcper = 0.00d;

	//평균(ABC)
	int valqty  = 0;
	int valqty1 = 0;
	int valqty2 = 0;
	int valqty3 = 0;
	int valqty4 = 0;
	int valqty5 = 0;
	int valqty6 = 0;
	int sumvalqty = 0;
	int valqty7 = 0;
	int dueqty  = 0;
	int noqty   = 0;
	int sumnoqty = 0;
	int totqty   = 0;
	double abcmuper = 0.00d;
	double abcrate  = 0.00d;	
	int qtysub     = 0;  //부수증감
	int abcvalqty  = 0;  //보고부수
	int misissuqty = 0;  //발행부수
	double ratesub    = 0.00d; //보고부수대비 인증률
	int m_valqty = 0;  //보고부수-유가계
	int m_totqty = 0;  //보고부수-총계
	int freeqtysum = 0; //기증지
	//평균(수금)
	int bef_amt = 0;
	int aft_amt = 0;
	int inc_amt = 0;
	int len = ( ds.curlist.size() > 0 ? ds.curlist.size() : 1 );
	//총계(단가별부수)
	int	tot_subsuprc = 0;
	int	tot_subsqty  = 0;
	int	tot_sumamt   = 0;
	
	try {
		recordSet = rx.add(dataSet, "ABCCUR", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			SS_SLS_BRMGR_2851_LCURLISTRecord rec = (SS_SLS_BRMGR_2851_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");


			//REAL
			rx.add(record, "basiyymm", rec.basiyymm);
			rx.add(record, "medicd", rec.medicd);
			rx.add(record, "deptcd", rec.deptcd);
			rx.add(record, "deptnm", rec.deptnm);
			rx.add(record, "partcd", rec.partcd);
			rx.add(record, "partnm", rec.partnm);
			rx.add(record, "areacd", rec.areacd);
			rx.add(record, "areanm", rec.areanm);
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "bonm", rec.bonm);
			rx.add(record, "valcnt", rec.valcnt);
			rx.add(record, "aftcnt1", rec.aftcnt1);
			rx.add(record, "aftcnt2", rec.aftcnt2);
			rx.add(record, "aftcnt3", rec.aftcnt3);
			rx.add(record, "aftcnt4", rec.aftcnt4);
			rx.add(record, "aftcnt5", rec.aftcnt5);
			rx.add(record, "aftcnt6", rec.aftcnt6);
			rx.add(record, "subsumval", rec.sumvalcnt);
			rx.add(record, "excsaftcnt7", rec.excsaftcnt7);
			rx.add(record, "free_misu", rec.free_misu);
			rx.add(record, "free_disc", rec.free_disc);
			rx.add(record, "subsumfree", rec.sumnocnt);
			rx.add(record, "resv1", rec.resv1);
			rx.add(record, "resv2", rec.resv2);
			rx.add(record, "resv3", rec.resv3);
			rx.add(record, "sumtot", rec.totcnt);
			rx.add(record, "thmmsendqty", rec.thmmsendqty);
			rx.add(record, "per", rec.per);
			rx.add(record, "subabcper", (Double.parseDouble(rec.sumvalcnt) / Double.parseDouble(rec.totcnt))*100 );
			
			//ABC
			rx.add(record, "subsmappli", rec.subsmappli);
			rx.add(record, "valqty",  rec.valqty);
			rx.add(record, "valqty1", rec.valqty1);
			rx.add(record, "valqty2", rec.valqty2);
			rx.add(record, "valqty3", rec.valqty3);
			rx.add(record, "valqty4", rec.valqty4);
			rx.add(record, "valqty5", rec.valqty5);
			rx.add(record, "valqty6", rec.valqty6);
			rx.add(record, "sumvalqty", rec.sumvalqty);
			rx.add(record, "valqty7", rec.valqty7);
			rx.add(record, "dueqty", rec.dueqty);
			rx.add(record, "noqty", rec.noqty);
			rx.add(record, "sumnoqty", rec.sumnoqty);
			rx.add(record, "totqty", rec.totqty);
			rx.add(record, "abcmuper", (Double.parseDouble(rec.sumvalqty) == 0) ? 0 : (((Double.parseDouble(rec.thmmsendqty) - Double.parseDouble(rec.sumvalqty)) / (Double.parseDouble(rec.sumvalqty) == 0 ? 1 : Double.parseDouble(rec.sumvalqty))) * 100) );
			rx.add(record, "freeqty", rec.resv1);
			rx.add(record, "abcrate", rec.abcrate);
			
			rx.add(record, "qtysub",  (Integer.parseInt(rec.totcnt) - Integer.parseInt(rec.totqty)) );			//부수증감
			rx.add(record, "abcvalqty",  rec.rptqty);		//보고부수
			rx.add(record, "misissuqty", rec.misissuqty);	//발행부수
			rx.add(record, "ratesub",   (Double.parseDouble(rec.rptqty) == 0 ? 0.00 : ((Double.parseDouble(rec.sumvalqty) / Double.parseDouble(rec.rptqty))*100)) );	//보고부수대비 인증률
			rx.add(record, "m_valqty",  Integer.parseInt(rec.rptqty) - Integer.parseInt(rec.sumvalqty));		//보고부수-유가계
			rx.add(record, "m_totqty", 	Integer.parseInt(rec.rptqty) - Integer.parseInt(rec.totqty));			//보고부수-총계
			
			rx.add(record, "bef_amt", rec.bef_amt);
			rx.add(record, "aft_amt", rec.aft_amt);
			rx.add(record, "inc_amt", rec.inc_amt);


			//평균계산
			//REAL
			valcnt  += Integer.parseInt( rec.valcnt  );
			aftcnt1 += Integer.parseInt( rec.aftcnt1 );
			aftcnt2 += Integer.parseInt( rec.aftcnt2 );
			aftcnt3 += Integer.parseInt( rec.aftcnt3 );
			aftcnt4 += Integer.parseInt( rec.aftcnt4 );
			aftcnt5 += Integer.parseInt( rec.aftcnt5 );
			aftcnt6 += Integer.parseInt( rec.aftcnt6 );
			subsumval   += Integer.parseInt( rec.sumvalcnt   );
			excsaftcnt7 += Integer.parseInt( rec.excsaftcnt7 );
			free_misu   += Integer.parseInt( rec.free_misu   );
			free_disc   += Integer.parseInt( rec.free_disc   );
			subsumfree  += Integer.parseInt( rec.sumnocnt  );
			sumtot      += Integer.parseInt( rec.totcnt      );
			thmmsendqty += Integer.parseInt( rec.thmmsendqty );
			per += Double.parseDouble( rec.per );
			subabcper += (Double.parseDouble(rec.sumvalcnt) / Double.parseDouble(rec.totcnt))*100;

			//ABC
			valqty    += Integer.parseInt( rec.valqty    );
			valqty1   += Integer.parseInt( rec.valqty1   );
			valqty2   += Integer.parseInt( rec.valqty2   );
			valqty3   += Integer.parseInt( rec.valqty3   );
			valqty4   += Integer.parseInt( rec.valqty4   );
			valqty5   += Integer.parseInt( rec.valqty5   );
			valqty6   += Integer.parseInt( rec.valqty6   );
			sumvalqty += Integer.parseInt( rec.sumvalqty );
			valqty7   += Integer.parseInt( rec.valqty7   );
			dueqty    += Integer.parseInt( rec.dueqty    );
			noqty     += Integer.parseInt( rec.noqty     );
			sumnoqty  += Integer.parseInt( rec.sumnoqty  );
			totqty    += Integer.parseInt( rec.totqty    );
			abcmuper  += (Double.parseDouble(rec.sumvalqty) == 0) ? 0 : (((Double.parseDouble(rec.thmmsendqty) - Double.parseDouble(rec.sumvalqty)) / (Double.parseDouble(rec.sumvalqty) == 0 ? 1 : Double.parseDouble(rec.sumvalqty))) * 100);
			abcrate	  += Double.parseDouble(rec.abcrate);
			qtysub     += (Integer.parseInt(rec.totcnt) - Integer.parseInt(rec.totqty));  //부수증감
			abcvalqty  += Integer.parseInt(rec.rptqty);  	//보고부수
			misissuqty += Integer.parseInt(rec.misissuqty);	//발행부수
			ratesub  += (Double.parseDouble(rec.rptqty) == 0 ? 0.00 : ((Double.parseDouble(rec.sumvalqty) / Double.parseDouble(rec.rptqty))*100)); //보고부수대비 인증률
			m_valqty += Integer.parseInt(rec.rptqty) - Integer.parseInt(rec.sumvalqty);	//보고부수-유가계
			m_totqty += Integer.parseInt(rec.rptqty) - Integer.parseInt(rec.totqty);  	//보고부수-총계
			freeqtysum += Integer.parseInt(rec.resv1);
			//수금
			bef_amt += Integer.parseInt( rec.bef_amt );
			aft_amt += Integer.parseInt( rec.aft_amt );
			inc_amt += Integer.parseInt( rec.inc_amt );
		}
		

		//합계-----------------------------------------------------------------------------------
		//합계(Real)
		int record = rx.add(recordSet, "record", "");
		rx.add(record, "basiyymm", "합계");
		rx.add(record, "valcnt",  valcnt);
		rx.add(record, "aftcnt1", aftcnt1);
		rx.add(record, "aftcnt2", aftcnt2);
		rx.add(record, "aftcnt3", aftcnt3);
		rx.add(record, "aftcnt4", aftcnt4);
		rx.add(record, "aftcnt5", aftcnt5);
		rx.add(record, "aftcnt6", aftcnt6);
		rx.add(record, "subsumval", subsumval);
		rx.add(record, "excsaftcnt7", excsaftcnt7);
		rx.add(record, "free_misu", free_misu);
		rx.add(record, "free_disc", free_disc);
		rx.add(record, "subsumfree", subsumfree);
		rx.add(record, "sumtot", sumtot);
		rx.add(record, "thmmsendqty", thmmsendqty);
		rx.add(record, "per", (((float)(thmmsendqty-subsumval)/subsumval)*100) );
		rx.add(record, "subabcper", ((float)subsumval/(float)sumtot)*100 );
		//rx.add(record, "per", per);
		//rx.add(record, "subabcper", subabcper);
		
		
		//합계(ABC)
		rx.add(record, "valqty",  valqty);
		rx.add(record, "valqty1", valqty1);
		rx.add(record, "valqty2", valqty2);
		rx.add(record, "valqty3", valqty3);
		rx.add(record, "valqty4", valqty4);
		rx.add(record, "valqty5", valqty5);
		rx.add(record, "valqty6", valqty6);
		rx.add(record, "sumvalqty", sumvalqty);
		rx.add(record, "valqty7", valqty7);
		rx.add(record, "dueqty", dueqty);
		rx.add(record, "noqty", noqty);
		rx.add(record, "sumnoqty", sumnoqty);
		rx.add(record, "totqty",  totqty);
		rx.add(record, "freeqty", freeqtysum);
		
		rx.add(record, "abcmuper", (((float)(misissuqty-sumvalqty)/((sumvalqty==0)?1:sumvalqty))*100) );
		rx.add(record, "abcrate",  ((((float)sumvalqty/((totqty==0)?1:(float)totqty)))*100) );		
		//rx.add(record, "abcmuper", abcmuper);
		//rx.add(record, "abcrate", abcrate);
		//합계(보고부수)
		rx.add(record, "qtysub",  	 qtysub);		//부수증감
		rx.add(record, "abcvalqty",  abcvalqty);	//보고부수
		rx.add(record, "misissuqty", misissuqty);	//발행부수
		rx.add(record, "ratesub",   (((float)sumvalqty/((abcvalqty==0)?1:(float)abcvalqty)))*100 );	//보고부수대비 인증률
		//rx.add(record, "ratesub",   ratesub);		//보고부수대비 인증률		
		rx.add(record, "m_valqty",  m_valqty);		//보고부수-유가계
		rx.add(record, "m_totqty", 	m_totqty);		//보고부수-총계
		//합계(수금)
		rx.add(record, "bef_amt", bef_amt);
		rx.add(record, "aft_amt", aft_amt);
		rx.add(record, "inc_amt", inc_amt);

		
		//평균-----------------------------------------------------------------------------------
		//평균(Real)
		record = rx.add(recordSet, "record", "");
		rx.add(record, "basiyymm", "평균");
		rx.add(record, "valcnt",  valcnt/len);
		rx.add(record, "aftcnt1", aftcnt1/len);
		rx.add(record, "aftcnt2", aftcnt2/len);
		rx.add(record, "aftcnt3", aftcnt3/len);
		rx.add(record, "aftcnt4", aftcnt4/len);
		rx.add(record, "aftcnt5", aftcnt5/len);
		rx.add(record, "aftcnt6", aftcnt6/len);
		rx.add(record, "subsumval", subsumval/len);
		rx.add(record, "excsaftcnt7", excsaftcnt7/len);
		rx.add(record, "free_misu", free_misu/len);
		rx.add(record, "free_disc", free_disc/len);
		rx.add(record, "subsumfree", subsumfree/len);
		rx.add(record, "sumtot", sumtot/len);
		rx.add(record, "thmmsendqty", thmmsendqty/len);
		rx.add(record, "per", per/len);
		rx.add(record, "subabcper", subabcper/len);		
		//평균(ABC)
		rx.add(record, "valqty",  valqty/len);
		rx.add(record, "valqty1", valqty1/len);
		rx.add(record, "valqty2", valqty2/len);
		rx.add(record, "valqty3", valqty3/len);
		rx.add(record, "valqty4", valqty4/len);
		rx.add(record, "valqty5", valqty5/len);
		rx.add(record, "valqty6", valqty6/len);
		rx.add(record, "sumvalqty", sumvalqty/len);
		rx.add(record, "valqty7", valqty7/len);
		rx.add(record, "dueqty", dueqty/len);
		rx.add(record, "noqty", noqty/len);
		rx.add(record, "sumnoqty", sumnoqty/len);
		rx.add(record, "totqty",  totqty/len);
		rx.add(record, "freeqty", freeqtysum/len);
		rx.add(record, "abcmuper", abcmuper/len);
		rx.add(record, "abcrate", abcrate/len);
		//평균(보고부수)
		rx.add(record, "qtysub",  	 qtysub/len);		//부수증감
		rx.add(record, "abcvalqty",  abcvalqty/len);	//보고부수
		rx.add(record, "misissuqty", misissuqty/len);	//발행부수
		rx.add(record, "ratesub",   ratesub/len );		//보고부수대비 인증률
		rx.add(record, "m_valqty",  m_valqty/len);		//보고부수-유가계
		rx.add(record, "m_totqty", 	m_totqty/len);		//보고부수-총계
		//평균(수금)
		rx.add(record, "bef_amt", bef_amt/len);
		rx.add(record, "aft_amt", aft_amt/len);
		rx.add(record, "inc_amt", inc_amt/len);

		rx.add(recordSet, "totalcnt", ds.curlist.size());
		

		//단가별 부수 목록		
		recordSet2 = rx.add(dataSet, "MEDICUR", "");
		for(int i = 0; i < ds.medipricelist.size(); i++) {
			SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord rec = (SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord)ds.medipricelist.get(i);

			int record2 = rx.add(recordSet2, "record", "");

			//medipricelist
			rx.add(record2, "subsuprc", rec.subsuprc);
			rx.add(record2, "subsqty", 	rec.subsqty);
			rx.add(record2, "sumamt", 	(Integer.parseInt(rec.subsuprc) * Integer.parseInt(rec.subsqty)));
			
			tot_subsuprc += Integer.parseInt(rec.subsuprc);
			tot_subsqty  += Integer.parseInt(rec.subsqty);
			tot_sumamt   += (Integer.parseInt(rec.subsuprc) * Integer.parseInt(rec.subsqty));

		}
		int record2 = rx.add(recordSet2, "record", "");
		//medipricelist total
		rx.add(record2, "subsuprc", tot_subsuprc);
		rx.add(record2, "subsqty", 	tot_subsqty);
		rx.add(record2, "sumamt", 	tot_sumamt);
		
		//수금방법별 비율 목록		
		recordSet3 = rx.add(dataSet, "CLAMTRATECUR", "");
		for(int i = 0; i < ds.clamtratelist.size(); i++) {
			SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord rec = (SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord)ds.clamtratelist.get(i);

			int record3 = rx.add(recordSet3, "record", "");

			//medipricelist
			rx.add(record3, "mm", rec.mm);
			rx.add(record3, "gr_clm_2", 	rec.gr_clm_2);
			rx.add(record3, "gr_clm_2_rt", 	rec.gr_clm_2_rt);
			rx.add(record3, "at_clm_2", 	rec.at_clm_2);
			rx.add(record3, "at_clm_2_rt", 	rec.at_clm_2_rt);
			rx.add(record3, "ti_clm_2", 	rec.ti_clm_2);
			rx.add(record3, "ti_clm_2_rt", 	rec.ti_clm_2_rt);
			rx.add(record3, "bm_clm_2", 	rec.bm_clm_2);
			rx.add(record3, "bm_clm_2_rt", 	rec.bm_clm_2_rt);
			
			rx.add(record3, "gr_clm_1", 	rec.gr_clm_1);
			rx.add(record3, "gr_clm_1_rt", 	rec.gr_clm_1_rt);
			rx.add(record3, "at_clm_1", 	rec.at_clm_1);
			rx.add(record3, "at_clm_1_rt", 	rec.at_clm_1_rt);
			rx.add(record3, "ti_clm_1", 	rec.ti_clm_1);
			rx.add(record3, "ti_clm_1_rt", 	rec.ti_clm_1_rt);
			rx.add(record3, "bm_clm_1", 	rec.bm_clm_1);
			rx.add(record3, "bm_clm_1_rt", 	rec.bm_clm_1_rt);
			
			rx.add(record3, "gr_clm", 		rec.gr_clm);
			rx.add(record3, "gr_clm_rt", 	rec.gr_clm_rt);
			rx.add(record3, "at_clm", 		rec.at_clm);
			rx.add(record3, "at_clm_rt", 	rec.at_clm_rt);
			rx.add(record3, "ti_clm", 		rec.ti_clm);
			rx.add(record3, "ti_clm_rt", 	rec.ti_clm_rt);
			rx.add(record3, "bm_clm", 		rec.bm_clm);
			rx.add(record3, "bm_clm_rt", 	rec.bm_clm_rt);
			
		}
		


	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<ss_sls_brmgr_2851_l>
	<dataSet>
		<CURLIST>
			<record>
				<basiyymm/>
				<medicd/>
				<deptcd/>
				<deptnm/>
				<partcd/>
				<partnm/>
				<areacd/>
				<areanm/>
				<bocd/>
				<bonm/>
				<valqty/>
				<aft1qty/>
				<aft2qty/>
				<aft3qty/>
				<aft4qty/>
				<aft5qty/>
				<aft6qty/>
				<totvalqty/>
				<aft7qty/>
				<invalid/>
				<misu/>
				<totinvalid/>
				<totqty/>
				<abcrate/>
				<sendqty/>
				<misissuqty/>
				<per/>
				<c_valqty/>
				<c_valqty1/>
				<c_valqty2/>
				<c_valqty3/>
				<c_valqty4/>
				<c_valqty5/>
				<c_valqty6/>
				<c_sumvalqty/>
				<c_valqty7/>
				<c_dueqty/>
				<c_noqty/>
				<c_smnoqty/>
				<c_totqty/>
				<c_abcrate/>
			</record>
		</CURLIST>
	</dataSet>
</ss_sls_brmgr_2851_l>
*/
%>

<% /* 작성시간 : Wed Feb 08 10:39:04 KST 2017 */ %>
