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


public class FC_FUNC_1050_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deps_clsf_cd2 = new ArrayList();
	public ArrayList deps_clsf_cd1 = new ArrayList();
	public ArrayList frex_cd = new ArrayList();
	public ArrayList curdlco_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_now_note_stat_cd;
	public String xx_note_clsf_cd;
	public String xx_stat_cd;
	public String xx_mang_cd_4;

	public FC_FUNC_1050_MDataSet(){}
	public FC_FUNC_1050_MDataSet(String errcode, String errmsg, String xx_now_note_stat_cd, String xx_note_clsf_cd, String xx_stat_cd, String xx_mang_cd_4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_now_note_stat_cd = xx_now_note_stat_cd;
		this.xx_note_clsf_cd = xx_note_clsf_cd;
		this.xx_stat_cd = xx_stat_cd;
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_now_note_stat_cd(String xx_now_note_stat_cd){
		this.xx_now_note_stat_cd = xx_now_note_stat_cd;
	}

	public void setXx_note_clsf_cd(String xx_note_clsf_cd){
		this.xx_note_clsf_cd = xx_note_clsf_cd;
	}

	public void setXx_stat_cd(String xx_stat_cd){
		this.xx_stat_cd = xx_stat_cd;
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

	public String getXx_now_note_stat_cd(){
		return this.xx_now_note_stat_cd;
	}

	public String getXx_note_clsf_cd(){
		return this.xx_note_clsf_cd;
	}

	public String getXx_stat_cd(){
		return this.xx_stat_cd;
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
			FC_FUNC_1050_MCURDLCO_CLSF_CDRecord rec = new FC_FUNC_1050_MCURDLCO_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdlco_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1050_MDEPS_CLSF_CD1Record rec = new FC_FUNC_1050_MDEPS_CLSF_CD1Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.deps_clsf_cd1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1050_MDEPS_CLSF_CD2Record rec = new FC_FUNC_1050_MDEPS_CLSF_CD2Record();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.deps_clsf_cd2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_1050_MFREX_CDRecord rec = new FC_FUNC_1050_MFREX_CDRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.frex_cd.add(rec);
		}
		this.xx_now_note_stat_cd = Util.checkString(cstmt.getString(9));
		this.xx_note_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_stat_cd = Util.checkString(cstmt.getString(11));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1050_MDataSet ds = (FC_FUNC_1050_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdlco_clsf_cd.size(); i++){
		FC_FUNC_1050_MCURDLCO_CLSF_CDRecord curdlco_clsf_cdRec = (FC_FUNC_1050_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deps_clsf_cd1.size(); i++){
		FC_FUNC_1050_MDEPS_CLSF_CD1Record deps_clsf_cd1Rec = (FC_FUNC_1050_MDEPS_CLSF_CD1Record)ds.deps_clsf_cd1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deps_clsf_cd2.size(); i++){
		FC_FUNC_1050_MDEPS_CLSF_CD2Record deps_clsf_cd2Rec = (FC_FUNC_1050_MDEPS_CLSF_CD2Record)ds.deps_clsf_cd2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.frex_cd.size(); i++){
		FC_FUNC_1050_MFREX_CDRecord frex_cdRec = (FC_FUNC_1050_MFREX_CDRecord)ds.frex_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdlco_clsf_cd()%>
<%= ds.getDeps_clsf_cd1()%>
<%= ds.getDeps_clsf_cd2()%>
<%= ds.getFrex_cd()%>
<%= ds.getXx_now_note_stat_cd()%>
<%= ds.getXx_note_clsf_cd()%>
<%= ds.getXx_stat_cd()%>
<%= ds.getXx_mang_cd_4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdlco_clsf_cdRec.cd_nm%>
<%= curdlco_clsf_cdRec.cd%>
<%= deps_clsf_cd1Rec.cd_nm%>
<%= deps_clsf_cd1Rec.cd%>
<%= deps_clsf_cd2Rec.cd_nm%>
<%= deps_clsf_cd2Rec.cd%>
<%= frex_cdRec.cd_nm%>
<%= frex_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 15:50:21 KST 2012 */