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
	SS_L_ABCDataSet ds = (SS_L_ABCDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	int avg_valcnt = 0;

	int avg_aftcnt1 = 0;
	int avg_aftcnt2 = 0;
	int avg_aftcnt3 = 0;
	int avg_aftcnt4 = 0;
	int avg_aftcnt5 = 0;
	int avg_aftcnt6 = 0;

	double avg_subsumval = 0.00d;
	double avg_subabcper = 0.00d;

	int avg_excsaftcnt7 = 0;
	int avg_free_misu = 0;
	int avg_free_disc = 0;
	double avg_subsumfree = 0.00d;
	double avg_subsumvalfree = 0.00d;

	int avg_thmmsendqty = 0;
	double avg_per = 0.00d;

	int avg_valqty = 0;
	int avg_valqty1 = 0;
	int avg_valqty2 = 0;
	int avg_valqty3 = 0;
	int avg_valqty4 = 0;
	int avg_valqty5 = 0;
	int avg_valqty6 = 0;
	int avg_valqty7 = 0;
	int avg_sumvalqty = 0;
	int avg_dueqty = 0;
	int avg_noqty = 0;
	int avg_sumnoqty = 0;

	double avg_abcrate = 0.00d;
	int avg_misissuqty = 0;
	int avg_totqty = 0;
	int avg_abcvalqty = 0;
	
	double avg_ratesub = 0.00d;
	double avg_qtysub = 0.00d;

	double avg_abcmuper = 0.00d;
	
	double avg_a = 0.0000d;
	double avg_b = 0.0000d;
	
	int avg_m_valqty = 0;
	int avg_m_totqty = 0;
	int avg_bef_amt = 0;
	int avg_aft_amt = 0;
	int avg_inc_amt = 0;
	
	try {
		/****** ABCCUR BEGIN */
		recordSet = rx.add(dataSet, "ABCCUR", "");

		for(int i = 0; i < ds.abccur.size(); i++) {
			SS_L_ABCABCCURRecord rec = (SS_L_ABCABCCURRecord)ds.abccur.get(i);
			int record = rx.add(recordSet, "record", "");
			
			double subsumval = Double.parseDouble(rec.valcnt)+Double.parseDouble(rec.aftcnt1)+Double.parseDouble(rec.aftcnt2)+Double.parseDouble(rec.aftcnt3)+Double.parseDouble(rec.aftcnt4)+Double.parseDouble(rec.aftcnt5)+Double.parseDouble(rec.aftcnt6);
			double subsumfree = Double.parseDouble(rec.excsaftcnt7)+Double.parseDouble(rec.free_misu)+Double.parseDouble(rec.free_disc);
			double subabcper = subsumval/(subsumval+subsumfree)*100;
			//double ratesub   = Double.parseDouble(rec.abcrate) - subabcper;
			double ratesub   = (Double.parseDouble(rec.sumvalqty) / Double.parseDouble(rec.abcvalqty))*100;
			
			double abcmuper = (Double.parseDouble(rec.thmmsendqty) - Double.parseDouble(rec.sumvalqty))/Double.parseDouble(rec.sumvalqty)*100;
			
			int m_valqty = Integer.parseInt(rec.abcvalqty) - Integer.parseInt(rec.sumvalqty);
			int m_totqty = Integer.parseInt(rec.abcvalqty) - Integer.parseInt(rec.sumvalqty) - Integer.parseInt(rec.sumnoqty);
			
			String temp1;
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
			rx.add(record, "subsumval", subsumval);
			rx.add(record, "subabcper", subabcper);
			rx.add(record, "excsaftcnt7", rec.excsaftcnt7);
			rx.add(record, "free_misu", rec.free_misu);
			rx.add(record, "free_disc", rec.free_disc);
			rx.add(record, "subsumfree", subsumfree);
			rx.add(record, "sumtot", subsumval+subsumfree);
			rx.add(record, "resv1", rec.resv1);
			rx.add(record, "resv2", rec.resv2);
			rx.add(record, "resv3", rec.resv3);
			rx.add(record, "thmmsendqty", rec.thmmsendqty);
			rx.add(record, "per", rec.per);
			
			
			rx.add(record, "valqty",  rec.valqty);
			rx.add(record, "valqty1", rec.valqty1);
			rx.add(record, "valqty2", rec.valqty2);
			rx.add(record, "valqty3", rec.valqty3);
			rx.add(record, "valqty4", rec.valqty4);
			rx.add(record, "valqty5", rec.valqty5);
			rx.add(record, "valqty6", rec.valqty6);
			rx.add(record, "valqty7", rec.valqty7);
			rx.add(record, "sumvalqty", rec.sumvalqty);
			rx.add(record, "dueqty", rec.dueqty);
			rx.add(record, "noqty", rec.noqty);
			rx.add(record, "sumnoqty", rec.sumnoqty);
			
			
			rx.add(record, "abcrate", rec.abcrate);
			rx.add(record, "misissuqty", rec.misissuqty);
			rx.add(record, "totqty", Double.parseDouble(rec.sumvalqty) + Double.parseDouble(rec.sumnoqty));
			//rx.add(record, "totqty", rec.abcvalqty);
			rx.add(record, "abcvalqty", rec.abcvalqty);
			
			if( request.getParameter("abcclsf").equals("Y") ) {
				rx.add(record, "ratesub", ratesub);
				rx.add(record, "qtysub", (Double.parseDouble(rec.sumvalqty) + Double.parseDouble(rec.sumnoqty)) - (subsumval+subsumfree));
				//rx.add(record, "qtysub", Double.parseDouble(rec.abcvalqty) - (subsumval+subsumfree));
			} else {
				rx.add(record, "ratesub", 0);
				rx.add(record, "qtysub", 0);
			}

			rx.add(record, "abcmuper", abcmuper);
			
			rx.add(record, "m_valqty", m_valqty);
			rx.add(record, "m_totqty", m_totqty);
			rx.add(record, "bef_amt", rec.bef_amt);
			rx.add(record, "aft_amt", rec.aft_amt);
			rx.add(record, "inc_amt", rec.inc_amt);

			avg_valcnt = avg_valcnt + Integer.parseInt(rec.valcnt);
			avg_aftcnt1 = avg_aftcnt1 + Integer.parseInt(rec.aftcnt1);
			avg_aftcnt2 = avg_aftcnt2 + Integer.parseInt(rec.aftcnt2);
			avg_aftcnt3 = avg_aftcnt3 + Integer.parseInt(rec.aftcnt3);
			avg_aftcnt4 = avg_aftcnt4 + Integer.parseInt(rec.aftcnt4);
			avg_aftcnt5 = avg_aftcnt5 + Integer.parseInt(rec.aftcnt5);
			avg_aftcnt6 = avg_aftcnt6 + Integer.parseInt(rec.aftcnt6);
			avg_subsumval = avg_subsumval + subsumval;
			avg_subabcper = avg_subabcper + subabcper;
			avg_excsaftcnt7 = avg_excsaftcnt7 + Integer.parseInt(rec.excsaftcnt7);
			avg_free_misu = avg_free_misu + Integer.parseInt(rec.free_misu);
			avg_free_disc = avg_free_disc + Integer.parseInt(rec.free_disc);
			avg_subsumfree = avg_subsumfree + subsumfree;
			avg_subsumvalfree = avg_subsumvalfree + subsumval+subsumfree;

			avg_thmmsendqty = avg_thmmsendqty + Integer.parseInt(rec.thmmsendqty);
			avg_per = avg_per + Double.parseDouble(rec.per);
			avg_valqty = avg_valqty + Integer.parseInt(rec.valqty);

			avg_valqty1 = avg_valqty1 + Integer.parseInt(rec.valqty1);
			avg_valqty2 = avg_valqty2 + Integer.parseInt(rec.valqty2);
			avg_valqty3 = avg_valqty3 + Integer.parseInt(rec.valqty3);
			avg_valqty4 = avg_valqty4 + Integer.parseInt(rec.valqty4);
			avg_valqty5 = avg_valqty5 + Integer.parseInt(rec.valqty5);
			avg_valqty6 = avg_valqty6 + Integer.parseInt(rec.valqty6);
			avg_valqty7 = avg_valqty7 + Integer.parseInt(rec.valqty7);
			avg_sumvalqty = avg_sumvalqty + Integer.parseInt(rec.sumvalqty);
			avg_dueqty = avg_dueqty + Integer.parseInt(rec.dueqty);
			avg_noqty = avg_noqty + Integer.parseInt(rec.noqty);
			avg_sumnoqty = avg_sumnoqty + Integer.parseInt(rec.sumnoqty);

			avg_abcrate = avg_abcrate + Double.parseDouble(rec.abcrate);
			avg_misissuqty = avg_misissuqty + Integer.parseInt(rec.misissuqty);
			avg_totqty = avg_totqty + (Integer.parseInt(rec.sumvalqty) + Integer.parseInt(rec.sumnoqty)); //Integer.parseInt(rec.abcvalqty);
			avg_abcvalqty = avg_abcvalqty + Integer.parseInt(rec.abcvalqty);
			avg_ratesub = avg_ratesub + ratesub;
			
			avg_qtysub = avg_qtysub + (Double.parseDouble(rec.sumvalqty) + Double.parseDouble(rec.sumnoqty)) - (subsumval+subsumfree);
			//avg_qtysub = avg_qtysub + Double.parseDouble(rec.abcvalqty) - (subsumval+subsumfree);

			avg_abcmuper = avg_abcmuper + abcmuper;
			
			avg_m_valqty = avg_m_valqty + m_valqty;
			avg_m_totqty = avg_m_totqty + m_totqty;
			avg_bef_amt = avg_bef_amt + Integer.parseInt(rec.bef_amt);
			avg_aft_amt = avg_aft_amt + Integer.parseInt(rec.aft_amt);
			avg_inc_amt = avg_inc_amt + Integer.parseInt(rec.inc_amt);

			//rx.add(record, "basiyymm", StringUtil.replaceToXml(rec.basiyymm));
			//rx.add(record, "medicd", StringUtil.replaceToXml(rec.medicd));
			//rx.add(record, "deptcd", StringUtil.replaceToXml(rec.deptcd));
			//rx.add(record, "deptnm", StringUtil.replaceToXml(rec.deptnm));
			//rx.add(record, "partcd", StringUtil.replaceToXml(rec.partcd));
			//rx.add(record, "partnm", StringUtil.replaceToXml(rec.partnm));
			//rx.add(record, "areacd", StringUtil.replaceToXml(rec.areacd));
			//rx.add(record, "areanm", StringUtil.replaceToXml(rec.areanm));
			//rx.add(record, "bocd", StringUtil.replaceToXml(rec.bocd));
			//rx.add(record, "bonm", StringUtil.replaceToXml(rec.bonm));
			//rx.add(record, "valcnt", StringUtil.replaceToXml(rec.valcnt));
			//rx.add(record, "aftcnt1", StringUtil.replaceToXml(rec.aftcnt1));
			//rx.add(record, "aftcnt2", StringUtil.replaceToXml(rec.aftcnt2));
			//rx.add(record, "aftcnt3", StringUtil.replaceToXml(rec.aftcnt3));
			//rx.add(record, "aftcnt4", StringUtil.replaceToXml(rec.aftcnt4));
			//rx.add(record, "aftcnt5", StringUtil.replaceToXml(rec.aftcnt5));
			//rx.add(record, "aftcnt6", StringUtil.replaceToXml(rec.aftcnt6));
			//rx.add(record, "excsaftcnt7", StringUtil.replaceToXml(rec.excsaftcnt7));
			//rx.add(record, "free_misu", StringUtil.replaceToXml(rec.free_misu));
			//rx.add(record, "free_disc", StringUtil.replaceToXml(rec.free_disc));
			//rx.add(record, "resv1", StringUtil.replaceToXml(rec.resv1));
			//rx.add(record, "resv2", StringUtil.replaceToXml(rec.resv2));
			//rx.add(record, "resv3", StringUtil.replaceToXml(rec.resv3));
			//rx.add(record, "thmmsendqty", StringUtil.replaceToXml(rec.thmmsendqty));
			//rx.add(record, "per", StringUtil.replaceToXml(rec.per));
		}

		int record = rx.add(recordSet, "record", "");
			rx.add(record, "basiyymm", "평균");

			rx.add(record, "valcnt", avg_valcnt/ds.abccur.size());
			rx.add(record, "aftcnt1", avg_aftcnt1/ds.abccur.size());
			rx.add(record, "aftcnt2", avg_aftcnt2/ds.abccur.size());
			rx.add(record, "aftcnt3", avg_aftcnt3/ds.abccur.size());
			rx.add(record, "aftcnt4", avg_aftcnt4/ds.abccur.size());
			rx.add(record, "aftcnt5", avg_aftcnt5/ds.abccur.size());
			rx.add(record, "aftcnt6", avg_aftcnt6/ds.abccur.size());
			rx.add(record, "subsumval", avg_subsumval/ds.abccur.size());
			rx.add(record, "subabcper", avg_subabcper/ds.abccur.size());
			rx.add(record, "excsaftcnt7", avg_excsaftcnt7/ds.abccur.size());
			rx.add(record, "free_misu", avg_free_misu/ds.abccur.size());
			rx.add(record, "free_disc", avg_free_disc/ds.abccur.size());
			rx.add(record, "subsumfree", avg_subsumfree/ds.abccur.size());
			rx.add(record, "sumtot", avg_subsumvalfree/ds.abccur.size());

			rx.add(record, "thmmsendqty", avg_thmmsendqty/ds.abccur.size());
			rx.add(record, "per", avg_per/ds.abccur.size());			
			rx.add(record, "valqty",  avg_valqty/ds.abccur.size());
			rx.add(record, "valqty1", avg_valqty1/ds.abccur.size());
			rx.add(record, "valqty2", avg_valqty2/ds.abccur.size());
			rx.add(record, "valqty3", avg_valqty3/ds.abccur.size());
			rx.add(record, "valqty4", avg_valqty4/ds.abccur.size());
			rx.add(record, "valqty5", avg_valqty5/ds.abccur.size());
			rx.add(record, "valqty6", avg_valqty6/ds.abccur.size());
			rx.add(record, "valqty7", avg_valqty7/ds.abccur.size());
			rx.add(record, "sumvalqty", avg_sumvalqty/ds.abccur.size());
			rx.add(record, "dueqty",avg_dueqty/ds.abccur.size());
			rx.add(record, "noqty", avg_noqty/ds.abccur.size());
			rx.add(record, "sumnoqty", avg_sumnoqty/ds.abccur.size());			
			
			rx.add(record, "abcrate", avg_abcrate/ds.abccur.size());
			rx.add(record, "misissuqty", avg_misissuqty/ds.abccur.size());
			rx.add(record, "totqty", avg_totqty/ds.abccur.size());
			rx.add(record, "abcvalqty", avg_abcvalqty/ds.abccur.size());

			if( request.getParameter("abcclsf").equals("Y") ) {
				rx.add(record, "ratesub", avg_ratesub/ds.abccur.size());

				avg_a = avg_valqty/ds.abccur.size();
				avg_b = avg_sumvalqty/ds.abccur.size();

				//rx.add(record, "ratesub", (avg_a / avg_b)*100 );
				rx.add(record, "qtysub", avg_qtysub/ds.abccur.size());
			} else {
				rx.add(record, "ratesub", 0);
				rx.add(record, "qtysub", 0);
			}

			rx.add(record, "abcmuper", avg_abcmuper/ds.abccur.size());
			
			rx.add(record, "m_valqty", avg_m_valqty/ds.abccur.size());
			rx.add(record, "m_totqty", avg_m_totqty/ds.abccur.size());
			rx.add(record, "bef_amt", avg_bef_amt/ds.abccur.size());
			rx.add(record, "aft_amt", avg_aft_amt/ds.abccur.size());
			rx.add(record, "inc_amt", avg_inc_amt/ds.abccur.size());


		rx.add(recordSet, "totalcnt", ds.abccur.size());
		/****** ABCCUR END */

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
<ss_l_abc>
	<dataSet>
		<ABCCUR>
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
				<valcnt/>
				<aftcnt1/>
				<aftcnt2/>
				<aftcnt3/>
				<aftcnt4/>
				<aftcnt5/>
				<aftcnt6/>
				<excsaftcnt7/>
				<free_misu/>
				<free_disc/>
				<resv1/>
				<resv2/>
				<resv3/>
				<thmmsendqty/>
				<per/>
				<abcrate/>
			</record>
		</ABCCUR>
	</dataSet>
</ss_l_abc>
*/
%>
