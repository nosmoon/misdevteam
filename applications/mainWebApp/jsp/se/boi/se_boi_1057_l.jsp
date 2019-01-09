<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	somo.framework.util.Util
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1057_l.jsp
* 기능 : 지국정보관리 - 지국현황탭 조회
* 작성일자 : 2009-03-24
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1057_LDataSet ds = (SE_BOI_1057_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab6form", "");

	try {
		if(ds != null){
			rx.add(resData, "basi_yymm", Util.convertMonthS(ds.basi_yymm));
			rx.add(resData, "next_yymm", Util.convertMonthS(Util.addMonth(ds.basi_yymm+"01",1).substring(0,6)));
			rx.add(resData, "jd_yymm", Util.convertMonthS(ds.jd_yymm));
		}
		//조직
		int grid1 = rx.add(resData, "grid1", "");
		for(int i = 0; i < ds.curcommlist1.size(); i++) {
			SE_BOI_1057_LCURCOMMLIST1Record rec = (SE_BOI_1057_LCURCOMMLIST1Record)ds.curcommlist1.get(i);
			int record = rx.add(grid1, "record", "");
			rx.add(record, "dutycd10", rec.dutycd10);
			rx.add(record, "dutycd20", rec.dutycd20);
			rx.add(record, "dutycd40", rec.dutycd40);
			rx.add(record, "dutycd50", rec.dutycd50);
			rx.add(record, "dutycd60", rec.dutycd60);
			rx.add(record, "dutycd70", rec.dutycd70);
			rx.add(record, "dutycd80", rec.dutycd80);
			rx.add(record, "total1", rec.total1);
			rx.add(record, "dutycd100", rec.dutycd100);
			rx.add(record, "dutycd110", rec.dutycd110);
			rx.add(record, "dutycd120", rec.dutycd120);
			rx.add(record, "total2", rec.total2);
		}
		for(int i = 0; i < ds.curcommlist2.size(); i++) {
			SE_BOI_1057_LCURCOMMLIST2Record rec = (SE_BOI_1057_LCURCOMMLIST2Record)ds.curcommlist2.get(i);
			//확장/중지
			int grid2 = rx.add(resData, "grid2", "");
			int record2 = rx.add(grid2, "record", "");
			rx.add(record2, "d_rdr_extnaplc", rec.d_rdr_extnaplc);
			rx.add(record2, "d_rdr_extnemp", rec.d_rdr_extnemp);
			rx.add(record2, "d_rdr_extnstaf", rec.d_rdr_extnstaf);
			rx.add(record2, "d_rdr_extnrdr_movm", rec.d_rdr_extnrdr_movm);
			rx.add(record2, "d_rdr_extnhdqt", rec.d_rdr_extnhdqt);
			rx.add(record2, "d_rdr_extn_tot", rec.d_rdr_extn_tot);
			rx.add(record2, "d_rdr_extnrate", rec.d_rdr_extnrate);
			rx.add(record2, "d_suspmovm", rec.d_suspmovm);
			rx.add(record2, "d_susprefu", rec.d_susprefu);
			rx.add(record2, "d_suspothnwsp", rec.d_suspothnwsp);
			rx.add(record2, "d_suspetc", rec.d_suspetc);
			rx.add(record2, "d_susp_tot", rec.d_susp_tot);
			rx.add(record2, "d_susprate", rec.d_susprate);
			//부수
			int grid3 = rx.add(resData, "grid3", "");
			int record3 = rx.add(grid3, "record", "");			
			rx.add(record3, "d_hmmsendqty", rec.d_hmmsendqty);
			rx.add(record3, "d_hmmvalqty", rec.d_hmmvalqty);
			rx.add(record3, "d_ftcnt1", rec.d_ftcnt1);
			rx.add(record3, "d_ftcnt2", rec.d_ftcnt2);
			rx.add(record3, "d_ftcnt3", rec.d_ftcnt3);
			rx.add(record3, "d_ftcnt4", rec.d_ftcnt4);
			rx.add(record3, "d_excsaftcnt6", rec.d_excsaftcnt6);
			rx.add(record3, "d_aftcnt_tot", rec.d_aftcnt_tot);
			rx.add(record3, "d_pub_infonwsp", rec.d_pub_infonwsp);
			rx.add(record3, "d_dntnwsp", rec.d_dntnwsp);
			rx.add(record3, "d_resvnwsp", rec.d_resvnwsp);
			rx.add(record3, "d_hmmsendqty1", rec.d_hmmsendqty1);
			rx.add(record3, "d_hmmsendqty2", rec.d_hmmsendqty2);
			rx.add(record3, "d_hmmsendqty3", rec.d_hmmsendqty3);
			rx.add(record3, "d_hmmsendqty4", rec.d_hmmsendqty4);
			rx.add(record3, "d_hmmsendqty5", rec.d_hmmsendqty5);
			rx.add(record3, "d_hmmsendqty_etc_tot", rec.d_hmmsendqty_etc_tot);
			//성장
			int grid4 = rx.add(resData, "grid4", "");
			int record4 = rx.add(grid4, "record", "");				
			rx.add(record4, "pm_hmmvalqtyb", rec.pm_hmmvalqtyb);
			rx.add(record4, "pm_aftcnt_totb", rec.pm_aftcnt_totb);
			rx.add(record4, "pm_val_totb", rec.pm_val_totb);
			rx.add(record4, "d_hmmvalqtyb", rec.d_hmmvalqtyb);
			rx.add(record4, "d_aftcnt_totb", rec.d_aftcnt_totb);
			rx.add(record4, "d_val_totb", rec.d_val_totb);
			rx.add(record4, "dpm_hmmvalqtyb", rec.dpm_hmmvalqtyb);
			rx.add(record4, "dpm_aftcnt_totb", rec.dpm_aftcnt_totb);
			rx.add(record4, "dpm_val_totb", rec.dpm_val_totb);
			rx.add(record4, "dpy_hmmvalqtyb", rec.dpy_hmmvalqtyb);
			rx.add(record4, "dpy_aftcnt_totb", rec.dpy_aftcnt_totb);
			rx.add(record4, "dpy_val_totb", rec.dpy_val_totb);
			//마감
			int grid5 = rx.add(resData, "grid5", "");
			int record5 = rx.add(grid5, "record", "");					
			rx.add(record5, "d_meda_amt", rec.d_meda_amt);
			rx.add(record5, "d_giroclamt", rec.d_giroclamt);
			rx.add(record5, "d_vistclamt", rec.d_vistclamt);
			rx.add(record5, "d_giroauto_shiftclamt", rec.d_giroauto_shiftclamt);
			rx.add(record5, "d_etcclamt", rec.d_docard_shiftclamt+rec.d_gnrcard_shiftclamt+rec.d_onlsetlclamt+rec.d_etcclamt);
			rx.add(record5, "d_clamt_tot", rec.d_clamt_tot);
			rx.add(record5, "pm_clamt_tot", rec.pm_clamt_tot);
			rx.add(record5, "dpm_clamt_tot", rec.dpm_clamt_tot);
			rx.add(record5, "d_arealeafclamt", rec.d_arealeafclamt);
			rx.add(record5, "d_teampreisleafclamt", rec.d_teampreisleafclamt);
			rx.add(record5, "d_leafclamt", rec.d_leafclamt);
		}
		//지대
		int grid6 = rx.add(resData, "grid6", "");
		for(int i = 0; i < ds.curcommlist3.size(); i++) {
			SE_BOI_1057_LCURCOMMLIST3Record rec = (SE_BOI_1057_LCURCOMMLIST3Record)ds.curcommlist3.get(i);
			int record = rx.add(grid6, "record", "");
			rx.add(record, "cho_amt", rec.cho_amt);
			rx.add(record, "boy_amt", rec.boy_amt);
			rx.add(record, "wee_amt", rec.wee_amt);
			rx.add(record, "sch_amt", rec.sch_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURCOMMLIST2>
		<record>
			<d_rdr_extnaplc/>
			<d_rdr_extnemp/>
			<d_rdr_extnstaf/>
			<d_rdr_extnrdr_movm/>
			<d_rdr_extnhdqt/>
			<d_rdr_extn_tot/>
			<d_rdr_extnrate/>
			<d_suspmovm/>
			<d_susprefu/>
			<d_suspothnwsp/>
			<d_suspetc/>
			<d_susp_tot/>
			<d_susprate/>
			<d_hmmsendqty/>
			<d_hmmvalqty/>
			<d_ftcnt1/>
			<d_ftcnt2/>
			<d_ftcnt3/>
			<d_ftcnt4/>
			<d_excsaftcnt6/>
			<d_aftcnt_tot/>
			<d_pub_infonwsp/>
			<d_dntnwsp/>
			<d_resvnwsp/>
			<d_hmmsendqty1/>
			<d_hmmsendqty2/>
			<d_hmmsendqty3/>
			<d_hmmsendqty4/>
			<d_hmmsendqty5/>
			<d_hmmsendqty_etc_tot/>
			<pm_hmmvalqtyb/>
			<pm_aftcnt_totb/>
			<pm_val_totb/>
			<d_hmmvalqtyb/>
			<d_aftcnt_totb/>
			<d_val_totb/>
			<dpm_hmmvalqtyb/>
			<dpm_aftcnt_totb/>
			<dpm_val_totb/>
			<dpy_hmmvalqtyb/>
			<dpy_aftcnt_totb/>
			<dpy_val_totb/>
			<d_meda_amt/>
			<d_giroclamt/>
			<d_vistclamt/>
			<d_giroauto_shiftclamt/>
			<d_docard_shiftclamt/>
			<d_gnrcard_shiftclamt/>
			<d_onlsetlclamt/>
			<d_etcclamt/>
			<d_clamt_tot/>
			<pm_clamt_tot/>
			<dpm_clamt_tot/>
			<d_arealeafclamt/>
			<d_teampreisleafclamt/>
			<d_leafclamt/>
		</record>
	</CURCOMMLIST2>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURCOMMLIST1>
		<record>
			<dutycd10/>
			<dutycd20/>
			<dutycd40/>
			<dutycd50/>
			<dutycd60/>
			<dutycd70/>
			<dutycd80/>
			<total1/>
			<dutycd100/>
			<dutycd110/>
			<dutycd120/>
			<total2/>
		</record>
	</CURCOMMLIST1>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURCOMMLIST3>
		<record>
			<cho_amt/>
			<boy_amt/>
			<wee_amt/>
			<sch_amt/>
			<tot_amt/>
		</record>
	</CURCOMMLIST3>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<basi_yymm/>
		<jd_yymm/>
		<bonm/>
		<oprenvclsfnm/>
		<curcommlist1/>
		<curcommlist2/>
		<curcommlist3/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Mar 24 16:06:46 KST 2009 */ %>