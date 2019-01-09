/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist5_tot = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist4_tot = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist3_tot = new ArrayList();
	public ArrayList curlist2_tot = new ArrayList();
	public ArrayList curlist1_tot = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3710_LDataSet(){}
	public AD_BAS_3710_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_BAS_3710_LCURLIST1Record rec = new AD_BAS_3710_LCURLIST1Record();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset0.getString("pubc_seq"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.pubc_asse_cd = Util.checkString(rset0.getString("pubc_asse_cd"));
			rec.indt_clsf = Util.checkString(rset0.getString("indt_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			AD_BAS_3710_LCURLIST2Record rec = new AD_BAS_3710_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset1.getString("pubc_seq"));
			rec.sect = Util.checkString(rset1.getString("sect"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.advt_cont = Util.checkString(rset1.getString("advt_cont"));
			rec.dn = Util.checkString(rset1.getString("dn"));
			rec.cm = Util.checkString(rset1.getString("cm"));
			rec.pubc_asse_cd = Util.checkString(rset1.getString("pubc_asse_cd"));
			rec.indt_clsf = Util.checkString(rset1.getString("indt_clsf"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.slcrg_nm = Util.checkString(rset1.getString("slcrg_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			AD_BAS_3710_LCURLIST3Record rec = new AD_BAS_3710_LCURLIST3Record();
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset2.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset2.getString("pubc_seq"));
			rec.sect = Util.checkString(rset2.getString("sect"));
			rec.sect_nm_cd = Util.checkString(rset2.getString("sect_nm_cd"));
			rec.advt_cont = Util.checkString(rset2.getString("advt_cont"));
			rec.dn = Util.checkString(rset2.getString("dn"));
			rec.cm = Util.checkString(rset2.getString("cm"));
			rec.pubc_asse_cd = Util.checkString(rset2.getString("pubc_asse_cd"));
			rec.indt_clsf = Util.checkString(rset2.getString("indt_clsf"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			rec.slcrg_nm = Util.checkString(rset2.getString("slcrg_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(16);
		while(rset3.next()){
			AD_BAS_3710_LCURLIST4Record rec = new AD_BAS_3710_LCURLIST4Record();
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset3.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset3.getString("pubc_seq"));
			rec.sect = Util.checkString(rset3.getString("sect"));
			rec.sect_nm_cd = Util.checkString(rset3.getString("sect_nm_cd"));
			rec.advt_cont = Util.checkString(rset3.getString("advt_cont"));
			rec.dn = Util.checkString(rset3.getString("dn"));
			rec.cm = Util.checkString(rset3.getString("cm"));
			rec.pubc_asse_cd = Util.checkString(rset3.getString("pubc_asse_cd"));
			rec.indt_clsf = Util.checkString(rset3.getString("indt_clsf"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			rec.slcrg_nm = Util.checkString(rset3.getString("slcrg_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(17);
		while(rset4.next()){
			AD_BAS_3710_LCURLIST5Record rec = new AD_BAS_3710_LCURLIST5Record();
			rec.medi_cd = Util.checkString(rset4.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset4.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset4.getString("pubc_seq"));
			rec.sect = Util.checkString(rset4.getString("sect"));
			rec.sect_nm_cd = Util.checkString(rset4.getString("sect_nm_cd"));
			rec.advt_cont = Util.checkString(rset4.getString("advt_cont"));
			rec.dn = Util.checkString(rset4.getString("dn"));
			rec.cm = Util.checkString(rset4.getString("cm"));
			rec.pubc_asse_cd = Util.checkString(rset4.getString("pubc_asse_cd"));
			rec.indt_clsf = Util.checkString(rset4.getString("indt_clsf"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			rec.slcrg_nm = Util.checkString(rset4.getString("slcrg_nm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(18);
		while(rset5.next()){
			AD_BAS_3710_LCURLIST1_TOTRecord rec = new AD_BAS_3710_LCURLIST1_TOTRecord();
			rec.lbl = Util.checkString(rset5.getString("lbl"));
			rec.tot_date = Util.checkString(rset5.getString("tot_date"));
			rec.tot_side = Util.checkString(rset5.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset5.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset5.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset5.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset5.getString("avg_side_fee"));
			rec.avg_uprc = Util.checkString(rset5.getString("avg_uprc"));
			rec.avg_advt_share = Util.checkString(rset5.getString("avg_advt_share"));
			this.curlist1_tot.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(19);
		while(rset6.next()){
			AD_BAS_3710_LCURLIST2_TOTRecord rec = new AD_BAS_3710_LCURLIST2_TOTRecord();
			rec.lbl = Util.checkString(rset6.getString("lbl"));
			rec.tot_date = Util.checkString(rset6.getString("tot_date"));
			rec.tot_side = Util.checkString(rset6.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset6.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset6.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset6.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset6.getString("avg_side_fee"));
			rec.avg_uprc = Util.checkString(rset6.getString("avg_uprc"));
			rec.avg_advt_share = Util.checkString(rset6.getString("avg_advt_share"));
			this.curlist2_tot.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(20);
		while(rset7.next()){
			AD_BAS_3710_LCURLIST3_TOTRecord rec = new AD_BAS_3710_LCURLIST3_TOTRecord();
			rec.lbl = Util.checkString(rset7.getString("lbl"));
			rec.tot_date = Util.checkString(rset7.getString("tot_date"));
			rec.tot_side = Util.checkString(rset7.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset7.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset7.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset7.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset7.getString("avg_side_fee"));
			rec.avg_uprc = Util.checkString(rset7.getString("avg_uprc"));
			rec.avg_advt_share = Util.checkString(rset7.getString("avg_advt_share"));
			this.curlist3_tot.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(21);
		while(rset8.next()){
			AD_BAS_3710_LCURLIST4_TOTRecord rec = new AD_BAS_3710_LCURLIST4_TOTRecord();
			rec.lbl = Util.checkString(rset8.getString("lbl"));
			rec.tot_date = Util.checkString(rset8.getString("tot_date"));
			rec.tot_side = Util.checkString(rset8.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset8.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset8.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset8.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset8.getString("avg_side_fee"));
			rec.avg_uprc = Util.checkString(rset8.getString("avg_uprc"));
			rec.avg_advt_share = Util.checkString(rset8.getString("avg_advt_share"));
			this.curlist4_tot.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(22);
		while(rset9.next()){
			AD_BAS_3710_LCURLIST5_TOTRecord rec = new AD_BAS_3710_LCURLIST5_TOTRecord();
			rec.lbl = Util.checkString(rset9.getString("lbl"));
			rec.tot_date = Util.checkString(rset9.getString("tot_date"));
			rec.tot_side = Util.checkString(rset9.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset9.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset9.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset9.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset9.getString("avg_side_fee"));
			rec.avg_uprc = Util.checkString(rset9.getString("avg_uprc"));
			rec.avg_advt_share = Util.checkString(rset9.getString("avg_advt_share"));
			this.curlist5_tot.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3710_LDataSet ds = (AD_BAS_3710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_3710_LCURLIST1Record curlist1Rec = (AD_BAS_3710_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3710_LCURLIST2Record curlist2Rec = (AD_BAS_3710_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_3710_LCURLIST3Record curlist3Rec = (AD_BAS_3710_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_3710_LCURLIST4Record curlist4Rec = (AD_BAS_3710_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_3710_LCURLIST5Record curlist5Rec = (AD_BAS_3710_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1_tot.size(); i++){
		AD_BAS_3710_LCURLIST1_TOTRecord curlist1_totRec = (AD_BAS_3710_LCURLIST1_TOTRecord)ds.curlist1_tot.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2_tot.size(); i++){
		AD_BAS_3710_LCURLIST2_TOTRecord curlist2_totRec = (AD_BAS_3710_LCURLIST2_TOTRecord)ds.curlist2_tot.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3_tot.size(); i++){
		AD_BAS_3710_LCURLIST3_TOTRecord curlist3_totRec = (AD_BAS_3710_LCURLIST3_TOTRecord)ds.curlist3_tot.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4_tot.size(); i++){
		AD_BAS_3710_LCURLIST4_TOTRecord curlist4_totRec = (AD_BAS_3710_LCURLIST4_TOTRecord)ds.curlist4_tot.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5_tot.size(); i++){
		AD_BAS_3710_LCURLIST5_TOTRecord curlist5_totRec = (AD_BAS_3710_LCURLIST5_TOTRecord)ds.curlist5_tot.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist1_tot()%>
<%= ds.getCurlist2_tot()%>
<%= ds.getCurlist3_tot()%>
<%= ds.getCurlist4_tot()%>
<%= ds.getCurlist5_tot()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.pubc_dt%>
<%= curlist1Rec.pubc_seq%>
<%= curlist1Rec.sect%>
<%= curlist1Rec.sect_nm_cd%>
<%= curlist1Rec.advt_cont%>
<%= curlist1Rec.dn%>
<%= curlist1Rec.cm%>
<%= curlist1Rec.pubc_asse_cd%>
<%= curlist1Rec.indt_clsf%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.slcrg_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.pubc_seq%>
<%= curlist2Rec.sect%>
<%= curlist2Rec.sect_nm_cd%>
<%= curlist2Rec.advt_cont%>
<%= curlist2Rec.dn%>
<%= curlist2Rec.cm%>
<%= curlist2Rec.pubc_asse_cd%>
<%= curlist2Rec.indt_clsf%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.slcrg_nm%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.pubc_dt%>
<%= curlist3Rec.pubc_seq%>
<%= curlist3Rec.sect%>
<%= curlist3Rec.sect_nm_cd%>
<%= curlist3Rec.advt_cont%>
<%= curlist3Rec.dn%>
<%= curlist3Rec.cm%>
<%= curlist3Rec.pubc_asse_cd%>
<%= curlist3Rec.indt_clsf%>
<%= curlist3Rec.remk%>
<%= curlist3Rec.slcrg_nm%>
<%= curlist4Rec.medi_cd%>
<%= curlist4Rec.pubc_dt%>
<%= curlist4Rec.pubc_seq%>
<%= curlist4Rec.sect%>
<%= curlist4Rec.sect_nm_cd%>
<%= curlist4Rec.advt_cont%>
<%= curlist4Rec.dn%>
<%= curlist4Rec.cm%>
<%= curlist4Rec.pubc_asse_cd%>
<%= curlist4Rec.indt_clsf%>
<%= curlist4Rec.remk%>
<%= curlist4Rec.slcrg_nm%>
<%= curlist5Rec.medi_cd%>
<%= curlist5Rec.pubc_dt%>
<%= curlist5Rec.pubc_seq%>
<%= curlist5Rec.sect%>
<%= curlist5Rec.sect_nm_cd%>
<%= curlist5Rec.advt_cont%>
<%= curlist5Rec.dn%>
<%= curlist5Rec.cm%>
<%= curlist5Rec.pubc_asse_cd%>
<%= curlist5Rec.indt_clsf%>
<%= curlist5Rec.remk%>
<%= curlist5Rec.slcrg_nm%>
<%= curlist1_totRec.lbl%>
<%= curlist1_totRec.tot_date%>
<%= curlist1_totRec.tot_side%>
<%= curlist1_totRec.tot_dn%>
<%= curlist1_totRec.tot_advt_fee%>
<%= curlist1_totRec.avg_daily_fee%>
<%= curlist1_totRec.avg_side_fee%>
<%= curlist1_totRec.avg_uprc%>
<%= curlist1_totRec.avg_advt_share%>
<%= curlist2_totRec.lbl%>
<%= curlist2_totRec.tot_date%>
<%= curlist2_totRec.tot_side%>
<%= curlist2_totRec.tot_dn%>
<%= curlist2_totRec.tot_advt_fee%>
<%= curlist2_totRec.avg_daily_fee%>
<%= curlist2_totRec.avg_side_fee%>
<%= curlist2_totRec.avg_uprc%>
<%= curlist2_totRec.avg_advt_share%>
<%= curlist3_totRec.lbl%>
<%= curlist3_totRec.tot_date%>
<%= curlist3_totRec.tot_side%>
<%= curlist3_totRec.tot_dn%>
<%= curlist3_totRec.tot_advt_fee%>
<%= curlist3_totRec.avg_daily_fee%>
<%= curlist3_totRec.avg_side_fee%>
<%= curlist3_totRec.avg_uprc%>
<%= curlist3_totRec.avg_advt_share%>
<%= curlist4_totRec.lbl%>
<%= curlist4_totRec.tot_date%>
<%= curlist4_totRec.tot_side%>
<%= curlist4_totRec.tot_dn%>
<%= curlist4_totRec.tot_advt_fee%>
<%= curlist4_totRec.avg_daily_fee%>
<%= curlist4_totRec.avg_side_fee%>
<%= curlist4_totRec.avg_uprc%>
<%= curlist4_totRec.avg_advt_share%>
<%= curlist5_totRec.lbl%>
<%= curlist5_totRec.tot_date%>
<%= curlist5_totRec.tot_side%>
<%= curlist5_totRec.tot_dn%>
<%= curlist5_totRec.tot_advt_fee%>
<%= curlist5_totRec.avg_daily_fee%>
<%= curlist5_totRec.avg_side_fee%>
<%= curlist5_totRec.avg_uprc%>
<%= curlist5_totRec.avg_advt_share%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 19 15:19:27 KST 2017 */