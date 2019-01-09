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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1103_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_bal_frex_cd = new ArrayList();
	public ArrayList curdrcr_dlco_clsf_cd = new ArrayList();
	public ArrayList xx_budg_cd_030 = new ArrayList();
	public ArrayList xx_cd = new ArrayList();
	public ArrayList curdrcr_bal_deps_clsf_cd = new ArrayList();
	public ArrayList curdrcr_bal_dhon_resn_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_now_note_stat_cd_010;
	public String xx_now_note_stat_cd_020;
	public String xx_now_note_stat_cd_030;
	public String xx_now_note_stat_cd_040;
	public String xx_now_note_stat_cd_050;
	public String xx_budg_cd_010;
	public String xx_budg_cd_020;

	public FC_FUNC_1103_MDataSet(){}
	public FC_FUNC_1103_MDataSet(String errcode, String errmsg, String xx_now_note_stat_cd_010, String xx_now_note_stat_cd_020, String xx_now_note_stat_cd_030, String xx_now_note_stat_cd_040, String xx_now_note_stat_cd_050, String xx_budg_cd_010, String xx_budg_cd_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_now_note_stat_cd_010 = xx_now_note_stat_cd_010;
		this.xx_now_note_stat_cd_020 = xx_now_note_stat_cd_020;
		this.xx_now_note_stat_cd_030 = xx_now_note_stat_cd_030;
		this.xx_now_note_stat_cd_040 = xx_now_note_stat_cd_040;
		this.xx_now_note_stat_cd_050 = xx_now_note_stat_cd_050;
		this.xx_budg_cd_010 = xx_budg_cd_010;
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_now_note_stat_cd_010(String xx_now_note_stat_cd_010){
		this.xx_now_note_stat_cd_010 = xx_now_note_stat_cd_010;
	}

	public void setXx_now_note_stat_cd_020(String xx_now_note_stat_cd_020){
		this.xx_now_note_stat_cd_020 = xx_now_note_stat_cd_020;
	}

	public void setXx_now_note_stat_cd_030(String xx_now_note_stat_cd_030){
		this.xx_now_note_stat_cd_030 = xx_now_note_stat_cd_030;
	}

	public void setXx_now_note_stat_cd_040(String xx_now_note_stat_cd_040){
		this.xx_now_note_stat_cd_040 = xx_now_note_stat_cd_040;
	}

	public void setXx_now_note_stat_cd_050(String xx_now_note_stat_cd_050){
		this.xx_now_note_stat_cd_050 = xx_now_note_stat_cd_050;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setXx_budg_cd_020(String xx_budg_cd_020){
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_now_note_stat_cd_010(){
		return this.xx_now_note_stat_cd_010;
	}

	public String getXx_now_note_stat_cd_020(){
		return this.xx_now_note_stat_cd_020;
	}

	public String getXx_now_note_stat_cd_030(){
		return this.xx_now_note_stat_cd_030;
	}

	public String getXx_now_note_stat_cd_040(){
		return this.xx_now_note_stat_cd_040;
	}

	public String getXx_now_note_stat_cd_050(){
		return this.xx_now_note_stat_cd_050;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public String getXx_budg_cd_020(){
		return this.xx_budg_cd_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1103_MCURDRCR_DLCO_CLSF_CDRecord rec = new FC_FUNC_1103_MCURDRCR_DLCO_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdrcr_dlco_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1103_MCURDRCR_BAL_DEPS_CLSF_CDRecord rec = new FC_FUNC_1103_MCURDRCR_BAL_DEPS_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curdrcr_bal_deps_clsf_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1103_MCURDRCR_BAL_DHON_RESN_CDRecord rec = new FC_FUNC_1103_MCURDRCR_BAL_DHON_RESN_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.curdrcr_bal_dhon_resn_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_1103_MCURDRCR_BAL_FREX_CDRecord rec = new FC_FUNC_1103_MCURDRCR_BAL_FREX_CDRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.curdrcr_bal_frex_cd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_FUNC_1103_MXX_BUDG_CD_030Record rec = new FC_FUNC_1103_MXX_BUDG_CD_030Record();
			rec.budg_cd = Util.checkString(rset4.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset4.getString("budg_abrv_nm"));
			this.xx_budg_cd_030.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_FUNC_1103_MXX_CDRecord rec = new FC_FUNC_1103_MXX_CDRecord();
			rec.cd_nm = Util.checkString(rset5.getString("cd_nm"));
			rec.cd = Util.checkString(rset5.getString("cd"));
			this.xx_cd.add(rec);
		}
		this.xx_now_note_stat_cd_010 = Util.checkString(cstmt.getString(11));
		this.xx_now_note_stat_cd_020 = Util.checkString(cstmt.getString(12));
		this.xx_now_note_stat_cd_030 = Util.checkString(cstmt.getString(13));
		this.xx_now_note_stat_cd_040 = Util.checkString(cstmt.getString(14));
		this.xx_now_note_stat_cd_050 = Util.checkString(cstmt.getString(15));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(16));
		this.xx_budg_cd_020 = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1103_MDataSet ds = (FC_FUNC_1103_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_dlco_clsf_cd.size(); i++){
		FC_FUNC_1103_MCURDRCR_DLCO_CLSF_CDRecord curdrcr_dlco_clsf_cdRec = (FC_FUNC_1103_MCURDRCR_DLCO_CLSF_CDRecord)ds.curdrcr_dlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bal_deps_clsf_cd.size(); i++){
		FC_FUNC_1103_MCURDRCR_BAL_DEPS_CLSF_CDRecord curdrcr_bal_deps_clsf_cdRec = (FC_FUNC_1103_MCURDRCR_BAL_DEPS_CLSF_CDRecord)ds.curdrcr_bal_deps_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bal_dhon_resn_cd.size(); i++){
		FC_FUNC_1103_MCURDRCR_BAL_DHON_RESN_CDRecord curdrcr_bal_dhon_resn_cdRec = (FC_FUNC_1103_MCURDRCR_BAL_DHON_RESN_CDRecord)ds.curdrcr_bal_dhon_resn_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bal_frex_cd.size(); i++){
		FC_FUNC_1103_MCURDRCR_BAL_FREX_CDRecord curdrcr_bal_frex_cdRec = (FC_FUNC_1103_MCURDRCR_BAL_FREX_CDRecord)ds.curdrcr_bal_frex_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_030.size(); i++){
		FC_FUNC_1103_MXX_BUDG_CD_030Record xx_budg_cd_030Rec = (FC_FUNC_1103_MXX_BUDG_CD_030Record)ds.xx_budg_cd_030.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_cd.size(); i++){
		FC_FUNC_1103_MXX_CDRecord xx_cdRec = (FC_FUNC_1103_MXX_CDRecord)ds.xx_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_dlco_clsf_cd()%>
<%= ds.getCurdrcr_bal_deps_clsf_cd()%>
<%= ds.getCurdrcr_bal_dhon_resn_cd()%>
<%= ds.getCurdrcr_bal_frex_cd()%>
<%= ds.getXx_budg_cd_030()%>
<%= ds.getXx_cd()%>
<%= ds.getXx_now_note_stat_cd_010()%>
<%= ds.getXx_now_note_stat_cd_020()%>
<%= ds.getXx_now_note_stat_cd_030()%>
<%= ds.getXx_now_note_stat_cd_040()%>
<%= ds.getXx_now_note_stat_cd_050()%>
<%= ds.getXx_budg_cd_010()%>
<%= ds.getXx_budg_cd_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_dlco_clsf_cdRec.cd_nm%>
<%= curdrcr_dlco_clsf_cdRec.cd%>
<%= curdrcr_bal_deps_clsf_cdRec.cd_nm%>
<%= curdrcr_bal_deps_clsf_cdRec.cd%>
<%= curdrcr_bal_dhon_resn_cdRec.cd_nm%>
<%= curdrcr_bal_dhon_resn_cdRec.cd%>
<%= curdrcr_bal_frex_cdRec.cd_nm%>
<%= curdrcr_bal_frex_cdRec.cd%>
<%= xx_budg_cd_030Rec.budg_cd%>
<%= xx_budg_cd_030Rec.budg_abrv_nm%>
<%= xx_cdRec.cd_nm%>
<%= xx_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 16:58:58 KST 2012 */