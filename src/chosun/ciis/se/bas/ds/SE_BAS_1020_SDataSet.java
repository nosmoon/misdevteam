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


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur4 = new ArrayList();
	public ArrayList commcdcur3 = new ArrayList();
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dept_nm;
	public String chrg_pers;
	public String chrg_flnm;
	public String supr_dept_cd;
	public String supr_dept_nm;
	public String hdpt_cd;
	public String step;
	public String use_yn;
	public String feat_clsf;
	public String incmg_dt;
	public String chg_dt;

	public SE_BAS_1020_SDataSet(){}
	public SE_BAS_1020_SDataSet(String errcode, String errmsg, String dept_nm, String chrg_pers, String chrg_flnm, String supr_dept_cd, String supr_dept_nm, String hdpt_cd, String step, String use_yn, String feat_clsf, String incmg_dt, String chg_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_nm = dept_nm;
		this.chrg_pers = chrg_pers;
		this.chrg_flnm = chrg_flnm;
		this.supr_dept_cd = supr_dept_cd;
		this.supr_dept_nm = supr_dept_nm;
		this.hdpt_cd = hdpt_cd;
		this.step = step;
		this.use_yn = use_yn;
		this.feat_clsf = feat_clsf;
		this.incmg_dt = incmg_dt;
		this.chg_dt = chg_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setHdpt_cd(String hdpt_cd){
		this.hdpt_cd = hdpt_cd;
	}

	public void setStep(String step){
		this.step = step;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setFeat_clsf(String feat_clsf){
		this.feat_clsf = feat_clsf;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getHdpt_cd(){
		return this.hdpt_cd;
	}

	public String getStep(){
		return this.step;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getFeat_clsf(){
		return this.feat_clsf;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_nm = Util.checkString(cstmt.getString(5));
		this.chrg_pers = Util.checkString(cstmt.getString(6));
		this.chrg_flnm = Util.checkString(cstmt.getString(7));
		this.supr_dept_cd = Util.checkString(cstmt.getString(8));
		this.supr_dept_nm = Util.checkString(cstmt.getString(9));
		this.hdpt_cd = Util.checkString(cstmt.getString(10));
		this.step = Util.checkString(cstmt.getString(11));
		this.use_yn = Util.checkString(cstmt.getString(12));
		this.feat_clsf = Util.checkString(cstmt.getString(13));
		this.incmg_dt = Util.checkString(cstmt.getString(14));
		this.chg_dt = Util.checkString(cstmt.getString(15));
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SE_BAS_1020_SCURLISTRecord rec = new SE_BAS_1020_SCURLISTRecord();
			rec.supr_dept_cd = Util.checkString(rset0.getString("supr_dept_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.sido_cd = Util.checkString(rset0.getString("sido_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.acct_sido_cd = Util.checkString(rset0.getString("acct_sido_cd"));
			rec.sell_sido_cd = Util.checkString(rset0.getString("sell_sido_cd"));
			rec.sell_srt_col = Util.checkString(rset0.getString("sell_srt_col"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while(rset1.next()){
			SE_BAS_1020_SCOMMCDCUR1Record rec = new SE_BAS_1020_SCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(18);
		while(rset2.next()){
			SE_BAS_1020_SCOMMCDCUR2Record rec = new SE_BAS_1020_SCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(19);
		while(rset3.next()){
			SE_BAS_1020_SCOMMCDCUR3Record rec = new SE_BAS_1020_SCOMMCDCUR3Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.commcdcur3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(20);
		while(rset4.next()){
			SE_BAS_1020_SCOMMCDCUR4Record rec = new SE_BAS_1020_SCOMMCDCUR4Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.commcdcur4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1020_SDataSet ds = (SE_BAS_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BAS_1020_SCURLISTRecord curlistRec = (SE_BAS_1020_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_BAS_1020_SCOMMCDCUR1Record commcdcur1Rec = (SE_BAS_1020_SCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_BAS_1020_SCOMMCDCUR2Record commcdcur2Rec = (SE_BAS_1020_SCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur3.size(); i++){
		SE_BAS_1020_SCOMMCDCUR3Record commcdcur3Rec = (SE_BAS_1020_SCOMMCDCUR3Record)ds.commcdcur3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur4.size(); i++){
		SE_BAS_1020_SCOMMCDCUR4Record commcdcur4Rec = (SE_BAS_1020_SCOMMCDCUR4Record)ds.commcdcur4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_nm()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_flnm()%>
<%= ds.getSupr_dept_cd()%>
<%= ds.getSupr_dept_nm()%>
<%= ds.getHdpt_cd()%>
<%= ds.getStep()%>
<%= ds.getUse_yn()%>
<%= ds.getFeat_clsf()%>
<%= ds.getIncmg_dt()%>
<%= ds.getChg_dt()%>
<%= ds.getCurlist()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
<%= ds.getCommcdcur3()%>
<%= ds.getCommcdcur4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.supr_dept_cd%>
<%= curlistRec.dept_cd%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.sido_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.flnm%>
<%= curlistRec.acct_sido_cd%>
<%= curlistRec.sell_sido_cd%>
<%= curlistRec.sell_srt_col%>
<%= curlistRec.use_yn%>
<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur2Rec.cd%>
<%= commcdcur2Rec.cdnm%>
<%= commcdcur2Rec.cd_abrv_nm%>
<%= commcdcur3Rec.cd%>
<%= commcdcur3Rec.cdnm%>
<%= commcdcur3Rec.cd_abrv_nm%>
<%= commcdcur4Rec.cd%>
<%= commcdcur4Rec.cdnm%>
<%= commcdcur4Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 10:57:06 KST 2009 */