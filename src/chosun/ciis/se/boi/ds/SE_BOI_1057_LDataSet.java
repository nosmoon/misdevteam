/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1057_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist2 = new ArrayList();
	public ArrayList curcommlist1 = new ArrayList();
	public ArrayList curcommlist3 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basi_yymm;
	public String jd_yymm;
	public String bonm;
	public String oprenvclsfnm;

	public SE_BOI_1057_LDataSet(){}
	public SE_BOI_1057_LDataSet(String errcode, String errmsg, String basi_yymm, String jd_yymm, String bonm, String oprenvclsfnm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basi_yymm = basi_yymm;
		this.jd_yymm = jd_yymm;
		this.bonm = bonm;
		this.oprenvclsfnm = oprenvclsfnm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setJd_yymm(String jd_yymm){
		this.jd_yymm = jd_yymm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setOprenvclsfnm(String oprenvclsfnm){
		this.oprenvclsfnm = oprenvclsfnm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getJd_yymm(){
		return this.jd_yymm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getOprenvclsfnm(){
		return this.oprenvclsfnm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basi_yymm = Util.checkString(cstmt.getString(7));
		this.jd_yymm = Util.checkString(cstmt.getString(8));
		this.bonm = Util.checkString(cstmt.getString(9));
		this.oprenvclsfnm = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_BOI_1057_LCURCOMMLIST1Record rec = new SE_BOI_1057_LCURCOMMLIST1Record();
			rec.dutycd10 = rset0.getInt("dutycd10");
			rec.dutycd20 = rset0.getInt("dutycd20");
			rec.dutycd40 = rset0.getInt("dutycd40");
			rec.dutycd50 = rset0.getInt("dutycd50");
			rec.dutycd60 = rset0.getInt("dutycd60");
			rec.dutycd70 = rset0.getInt("dutycd70");
			rec.dutycd80 = rset0.getInt("dutycd80");
			rec.total1 = rset0.getInt("total1");
			rec.dutycd100 = rset0.getInt("dutycd100");
			rec.dutycd110 = rset0.getInt("dutycd110");
			rec.dutycd120 = rset0.getInt("dutycd120");
			rec.total2 = rset0.getInt("total2");
			this.curcommlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			SE_BOI_1057_LCURCOMMLIST2Record rec = new SE_BOI_1057_LCURCOMMLIST2Record();
			rec.d_rdr_extnaplc = rset1.getInt("d_rdr_extnaplc");
			rec.d_rdr_extnemp = rset1.getInt("d_rdr_extnemp");
			rec.d_rdr_extnstaf = rset1.getInt("d_rdr_extnstaf");
			rec.d_rdr_extnrdr_movm = rset1.getInt("d_rdr_extnrdr_movm");
			rec.d_rdr_extnhdqt = rset1.getInt("d_rdr_extnhdqt");
			rec.d_rdr_extn_tot = rset1.getInt("d_rdr_extn_tot");
			rec.d_rdr_extnrate = rset1.getInt("d_rdr_extnrate");
			rec.d_suspmovm = rset1.getInt("d_suspmovm");
			rec.d_susprefu = rset1.getInt("d_susprefu");
			rec.d_suspothnwsp = rset1.getInt("d_suspothnwsp");
			rec.d_suspetc = rset1.getInt("d_suspetc");
			rec.d_susp_tot = rset1.getInt("d_susp_tot");
			rec.d_susprate = rset1.getInt("d_susprate");
			rec.d_hmmsendqty = rset1.getInt("d_hmmsendqty");
			rec.d_hmmvalqty = rset1.getInt("d_hmmvalqty");
			rec.d_ftcnt1 = rset1.getInt("d_ftcnt1");
			rec.d_ftcnt2 = rset1.getInt("d_ftcnt2");
			rec.d_ftcnt3 = rset1.getInt("d_ftcnt3");
			rec.d_ftcnt4 = rset1.getInt("d_ftcnt4");
			rec.d_excsaftcnt6 = rset1.getInt("d_excsaftcnt6");
			rec.d_aftcnt_tot = rset1.getInt("d_aftcnt_tot");
			rec.d_pub_infonwsp = rset1.getInt("d_pub_infonwsp");
			rec.d_dntnwsp = rset1.getInt("d_dntnwsp");
			rec.d_resvnwsp = rset1.getInt("d_resvnwsp");
			rec.d_hmmsendqty1 = rset1.getInt("d_hmmsendqty1");
			rec.d_hmmsendqty2 = rset1.getInt("d_hmmsendqty2");
			rec.d_hmmsendqty3 = rset1.getInt("d_hmmsendqty3");
			rec.d_hmmsendqty4 = rset1.getInt("d_hmmsendqty4");
			rec.d_hmmsendqty5 = rset1.getInt("d_hmmsendqty5");
			rec.d_hmmsendqty_etc_tot = rset1.getInt("d_hmmsendqty_etc_tot");
			rec.pm_hmmvalqtyb = rset1.getInt("pm_hmmvalqtyb");
			rec.pm_aftcnt_totb = rset1.getInt("pm_aftcnt_totb");
			rec.pm_val_totb = rset1.getInt("pm_val_totb");
			rec.d_hmmvalqtyb = rset1.getInt("d_hmmvalqtyb");
			rec.d_aftcnt_totb = rset1.getInt("d_aftcnt_totb");
			rec.d_val_totb = rset1.getInt("d_val_totb");
			rec.dpm_hmmvalqtyb = rset1.getInt("dpm_hmmvalqtyb");
			rec.dpm_aftcnt_totb = rset1.getInt("dpm_aftcnt_totb");
			rec.dpm_val_totb = rset1.getInt("dpm_val_totb");
			rec.dpy_hmmvalqtyb = rset1.getInt("dpy_hmmvalqtyb");
			rec.dpy_aftcnt_totb = rset1.getInt("dpy_aftcnt_totb");
			rec.dpy_val_totb = rset1.getInt("dpy_val_totb");
			rec.d_meda_amt = rset1.getInt("d_meda_amt");
			rec.d_giroclamt = rset1.getInt("d_giroclamt");
			rec.d_vistclamt = rset1.getInt("d_vistclamt");
			rec.d_giroauto_shiftclamt = rset1.getInt("d_giroauto_shiftclamt");
			rec.d_docard_shiftclamt = rset1.getInt("d_docard_shiftclamt");
			rec.d_gnrcard_shiftclamt = rset1.getInt("d_gnrcard_shiftclamt");
			rec.d_onlsetlclamt = rset1.getInt("d_onlsetlclamt");
			rec.d_etcclamt = rset1.getInt("d_etcclamt");
			rec.d_clamt_tot = rset1.getInt("d_clamt_tot");
			rec.pm_clamt_tot = rset1.getInt("pm_clamt_tot");
			rec.dpm_clamt_tot = rset1.getInt("dpm_clamt_tot");
			rec.d_arealeafclamt = rset1.getInt("d_arealeafclamt");
			rec.d_teampreisleafclamt = rset1.getInt("d_teampreisleafclamt");
			rec.d_leafclamt = rset1.getInt("d_leafclamt");
			this.curcommlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(13);
		while(rset2.next()){
			SE_BOI_1057_LCURCOMMLIST3Record rec = new SE_BOI_1057_LCURCOMMLIST3Record();
			rec.cho_amt = rset2.getInt("cho_amt");
			rec.boy_amt = rset2.getInt("boy_amt");
			rec.wee_amt = rset2.getInt("wee_amt");
			rec.sch_amt = rset2.getInt("sch_amt");
			rec.tot_amt = rset2.getInt("tot_amt");
			this.curcommlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1057_LDataSet ds = (SE_BOI_1057_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist1.size(); i++){
		SE_BOI_1057_LCURCOMMLIST1Record curcommlist1Rec = (SE_BOI_1057_LCURCOMMLIST1Record)ds.curcommlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist2.size(); i++){
		SE_BOI_1057_LCURCOMMLIST2Record curcommlist2Rec = (SE_BOI_1057_LCURCOMMLIST2Record)ds.curcommlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist3.size(); i++){
		SE_BOI_1057_LCURCOMMLIST3Record curcommlist3Rec = (SE_BOI_1057_LCURCOMMLIST3Record)ds.curcommlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasi_yymm()%>
<%= ds.getJd_yymm()%>
<%= ds.getBonm()%>
<%= ds.getOprenvclsfnm()%>
<%= ds.getCurcommlist1()%>
<%= ds.getCurcommlist2()%>
<%= ds.getCurcommlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlist1Rec.dutycd10%>
<%= curcommlist1Rec.dutycd20%>
<%= curcommlist1Rec.dutycd40%>
<%= curcommlist1Rec.dutycd50%>
<%= curcommlist1Rec.dutycd60%>
<%= curcommlist1Rec.dutycd70%>
<%= curcommlist1Rec.dutycd80%>
<%= curcommlist1Rec.total1%>
<%= curcommlist1Rec.dutycd100%>
<%= curcommlist1Rec.dutycd110%>
<%= curcommlist1Rec.dutycd120%>
<%= curcommlist1Rec.total2%>
<%= curcommlist2Rec.d_rdr_extnaplc%>
<%= curcommlist2Rec.d_rdr_extnemp%>
<%= curcommlist2Rec.d_rdr_extnstaf%>
<%= curcommlist2Rec.d_rdr_extnrdr_movm%>
<%= curcommlist2Rec.d_rdr_extnhdqt%>
<%= curcommlist2Rec.d_rdr_extn_tot%>
<%= curcommlist2Rec.d_rdr_extnrate%>
<%= curcommlist2Rec.d_suspmovm%>
<%= curcommlist2Rec.d_susprefu%>
<%= curcommlist2Rec.d_suspothnwsp%>
<%= curcommlist2Rec.d_suspetc%>
<%= curcommlist2Rec.d_susp_tot%>
<%= curcommlist2Rec.d_susprate%>
<%= curcommlist2Rec.d_hmmsendqty%>
<%= curcommlist2Rec.d_hmmvalqty%>
<%= curcommlist2Rec.d_ftcnt1%>
<%= curcommlist2Rec.d_ftcnt2%>
<%= curcommlist2Rec.d_ftcnt3%>
<%= curcommlist2Rec.d_ftcnt4%>
<%= curcommlist2Rec.d_excsaftcnt6%>
<%= curcommlist2Rec.d_aftcnt_tot%>
<%= curcommlist2Rec.d_pub_infonwsp%>
<%= curcommlist2Rec.d_dntnwsp%>
<%= curcommlist2Rec.d_resvnwsp%>
<%= curcommlist2Rec.d_hmmsendqty1%>
<%= curcommlist2Rec.d_hmmsendqty2%>
<%= curcommlist2Rec.d_hmmsendqty3%>
<%= curcommlist2Rec.d_hmmsendqty4%>
<%= curcommlist2Rec.d_hmmsendqty5%>
<%= curcommlist2Rec.d_hmmsendqty_etc_tot%>
<%= curcommlist2Rec.pm_hmmvalqtyb%>
<%= curcommlist2Rec.pm_aftcnt_totb%>
<%= curcommlist2Rec.pm_val_totb%>
<%= curcommlist2Rec.d_hmmvalqtyb%>
<%= curcommlist2Rec.d_aftcnt_totb%>
<%= curcommlist2Rec.d_val_totb%>
<%= curcommlist2Rec.dpm_hmmvalqtyb%>
<%= curcommlist2Rec.dpm_aftcnt_totb%>
<%= curcommlist2Rec.dpm_val_totb%>
<%= curcommlist2Rec.dpy_hmmvalqtyb%>
<%= curcommlist2Rec.dpy_aftcnt_totb%>
<%= curcommlist2Rec.dpy_val_totb%>
<%= curcommlist2Rec.d_meda_amt%>
<%= curcommlist2Rec.d_giroclamt%>
<%= curcommlist2Rec.d_vistclamt%>
<%= curcommlist2Rec.d_giroauto_shiftclamt%>
<%= curcommlist2Rec.d_docard_shiftclamt%>
<%= curcommlist2Rec.d_gnrcard_shiftclamt%>
<%= curcommlist2Rec.d_onlsetlclamt%>
<%= curcommlist2Rec.d_etcclamt%>
<%= curcommlist2Rec.d_clamt_tot%>
<%= curcommlist2Rec.pm_clamt_tot%>
<%= curcommlist2Rec.dpm_clamt_tot%>
<%= curcommlist2Rec.d_arealeafclamt%>
<%= curcommlist2Rec.d_teampreisleafclamt%>
<%= curcommlist2Rec.d_leafclamt%>
<%= curcommlist3Rec.cho_amt%>
<%= curcommlist3Rec.boy_amt%>
<%= curcommlist3Rec.wee_amt%>
<%= curcommlist3Rec.sch_amt%>
<%= curcommlist3Rec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 16:06:46 KST 2009 */