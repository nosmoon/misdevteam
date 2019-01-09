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


public class FC_FUNC_1110_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_bal_frex_cd = new ArrayList();
	public ArrayList xx_budg_cd_100 = new ArrayList();
	public ArrayList curdrcr_bal_deps_clsf_cd = new ArrayList();
	public ArrayList xx_budg_cd_110 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_budg_cd_010;
	public String xx_budg_cd_020;
	public String xx_budg_cd_030;
	public String xx_budg_cd_040;
	public String xx_budg_cd_050;
	public String xx_budg_cd_060;
	public String xx_budg_cd_070;
	public String xx_budg_cd_080;
	public String xx_budg_cd_090;
	public String xx_occr_slip_clsf;
	public String xx_trufnd_slip_no;
	public String xx_mang_cd_4;

	public FC_FUNC_1110_MDataSet(){}
	public FC_FUNC_1110_MDataSet(String errcode, String errmsg, String xx_budg_cd_010, String xx_budg_cd_020, String xx_budg_cd_030, String xx_budg_cd_040, String xx_budg_cd_050, String xx_budg_cd_060, String xx_budg_cd_070, String xx_budg_cd_080, String xx_budg_cd_090, String xx_occr_slip_clsf, String xx_trufnd_slip_no, String xx_mang_cd_4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_cd_010 = xx_budg_cd_010;
		this.xx_budg_cd_020 = xx_budg_cd_020;
		this.xx_budg_cd_030 = xx_budg_cd_030;
		this.xx_budg_cd_040 = xx_budg_cd_040;
		this.xx_budg_cd_050 = xx_budg_cd_050;
		this.xx_budg_cd_060 = xx_budg_cd_060;
		this.xx_budg_cd_070 = xx_budg_cd_070;
		this.xx_budg_cd_080 = xx_budg_cd_080;
		this.xx_budg_cd_090 = xx_budg_cd_090;
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
		this.xx_trufnd_slip_no = xx_trufnd_slip_no;
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setXx_budg_cd_020(String xx_budg_cd_020){
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public void setXx_budg_cd_030(String xx_budg_cd_030){
		this.xx_budg_cd_030 = xx_budg_cd_030;
	}

	public void setXx_budg_cd_040(String xx_budg_cd_040){
		this.xx_budg_cd_040 = xx_budg_cd_040;
	}

	public void setXx_budg_cd_050(String xx_budg_cd_050){
		this.xx_budg_cd_050 = xx_budg_cd_050;
	}

	public void setXx_budg_cd_060(String xx_budg_cd_060){
		this.xx_budg_cd_060 = xx_budg_cd_060;
	}

	public void setXx_budg_cd_070(String xx_budg_cd_070){
		this.xx_budg_cd_070 = xx_budg_cd_070;
	}

	public void setXx_budg_cd_080(String xx_budg_cd_080){
		this.xx_budg_cd_080 = xx_budg_cd_080;
	}

	public void setXx_budg_cd_090(String xx_budg_cd_090){
		this.xx_budg_cd_090 = xx_budg_cd_090;
	}

	public void setXx_occr_slip_clsf(String xx_occr_slip_clsf){
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public void setXx_trufnd_slip_no(String xx_trufnd_slip_no){
		this.xx_trufnd_slip_no = xx_trufnd_slip_no;
	}

	public void setXx_mang_cd_4(String xx_mang_cd_4){
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public String getXx_budg_cd_020(){
		return this.xx_budg_cd_020;
	}

	public String getXx_budg_cd_030(){
		return this.xx_budg_cd_030;
	}

	public String getXx_budg_cd_040(){
		return this.xx_budg_cd_040;
	}

	public String getXx_budg_cd_050(){
		return this.xx_budg_cd_050;
	}

	public String getXx_budg_cd_060(){
		return this.xx_budg_cd_060;
	}

	public String getXx_budg_cd_070(){
		return this.xx_budg_cd_070;
	}

	public String getXx_budg_cd_080(){
		return this.xx_budg_cd_080;
	}

	public String getXx_budg_cd_090(){
		return this.xx_budg_cd_090;
	}

	public String getXx_occr_slip_clsf(){
		return this.xx_occr_slip_clsf;
	}

	public String getXx_trufnd_slip_no(){
		return this.xx_trufnd_slip_no;
	}

	public String getXx_mang_cd_4(){
		return this.xx_mang_cd_4;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord rec = new FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdrcr_bal_deps_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord rec = new FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curdrcr_bal_frex_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1110_MXX_BUDG_CD_100Record rec = new FC_FUNC_1110_MXX_BUDG_CD_100Record();
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			this.xx_budg_cd_100.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_1110_MXX_BUDG_CD_110Record rec = new FC_FUNC_1110_MXX_BUDG_CD_110Record();
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset3.getString("budg_abrv_nm"));
			this.xx_budg_cd_110.add(rec);
		}
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(9));
		this.xx_budg_cd_020 = Util.checkString(cstmt.getString(10));
		this.xx_budg_cd_030 = Util.checkString(cstmt.getString(11));
		this.xx_budg_cd_040 = Util.checkString(cstmt.getString(12));
		this.xx_budg_cd_050 = Util.checkString(cstmt.getString(13));
		this.xx_budg_cd_060 = Util.checkString(cstmt.getString(14));
		this.xx_budg_cd_070 = Util.checkString(cstmt.getString(15));
		this.xx_budg_cd_080 = Util.checkString(cstmt.getString(16));
		this.xx_budg_cd_090 = Util.checkString(cstmt.getString(17));
		this.xx_occr_slip_clsf = Util.checkString(cstmt.getString(18));
		this.xx_trufnd_slip_no = Util.checkString(cstmt.getString(19));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1110_MDataSet ds = (FC_FUNC_1110_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_bal_deps_clsf_cd.size(); i++){
		FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord curdrcr_bal_deps_clsf_cdRec = (FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord)ds.curdrcr_bal_deps_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bal_frex_cd.size(); i++){
		FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord curdrcr_bal_frex_cdRec = (FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord)ds.curdrcr_bal_frex_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_100.size(); i++){
		FC_FUNC_1110_MXX_BUDG_CD_100Record xx_budg_cd_100Rec = (FC_FUNC_1110_MXX_BUDG_CD_100Record)ds.xx_budg_cd_100.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_110.size(); i++){
		FC_FUNC_1110_MXX_BUDG_CD_110Record xx_budg_cd_110Rec = (FC_FUNC_1110_MXX_BUDG_CD_110Record)ds.xx_budg_cd_110.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_bal_deps_clsf_cd()%>
<%= ds.getCurdrcr_bal_frex_cd()%>
<%= ds.getXx_budg_cd_100()%>
<%= ds.getXx_budg_cd_110()%>
<%= ds.getXx_budg_cd_010()%>
<%= ds.getXx_budg_cd_020()%>
<%= ds.getXx_budg_cd_030()%>
<%= ds.getXx_budg_cd_040()%>
<%= ds.getXx_budg_cd_050()%>
<%= ds.getXx_budg_cd_060()%>
<%= ds.getXx_budg_cd_070()%>
<%= ds.getXx_budg_cd_080()%>
<%= ds.getXx_budg_cd_090()%>
<%= ds.getXx_occr_slip_clsf()%>
<%= ds.getXx_trufnd_slip_no()%>
<%= ds.getXx_mang_cd_4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_bal_deps_clsf_cdRec.cd_nm%>
<%= curdrcr_bal_deps_clsf_cdRec.cd%>
<%= curdrcr_bal_frex_cdRec.cd_nm%>
<%= curdrcr_bal_frex_cdRec.cd%>
<%= xx_budg_cd_100Rec.budg_cd%>
<%= xx_budg_cd_100Rec.budg_abrv_nm%>
<%= xx_budg_cd_110Rec.budg_cd%>
<%= xx_budg_cd_110Rec.budg_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 15:48:06 KST 2012 */