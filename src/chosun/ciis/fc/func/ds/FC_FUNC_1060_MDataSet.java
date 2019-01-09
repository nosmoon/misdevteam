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


public class FC_FUNC_1060_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdlco_clsf_cd = new ArrayList();
	public ArrayList incm_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_incm_clsf_cd_010;
	public String xx_incm_clsf_cd_020;
	public String xx_incm_clsf_cd_030;
	public String xx_incm_clsf_cd_040;
	public String xx_incm_clsf_cd_050;
	public String xx_occr_acct_cd_010;
	public String xx_occr_acct_cd_020;

	public FC_FUNC_1060_MDataSet(){}
	public FC_FUNC_1060_MDataSet(String errcode, String errmsg, String xx_incm_clsf_cd_010, String xx_incm_clsf_cd_020, String xx_incm_clsf_cd_030, String xx_incm_clsf_cd_040, String xx_incm_clsf_cd_050, String xx_occr_acct_cd_010, String xx_occr_acct_cd_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_incm_clsf_cd_010 = xx_incm_clsf_cd_010;
		this.xx_incm_clsf_cd_020 = xx_incm_clsf_cd_020;
		this.xx_incm_clsf_cd_030 = xx_incm_clsf_cd_030;
		this.xx_incm_clsf_cd_040 = xx_incm_clsf_cd_040;
		this.xx_incm_clsf_cd_050 = xx_incm_clsf_cd_050;
		this.xx_occr_acct_cd_010 = xx_occr_acct_cd_010;
		this.xx_occr_acct_cd_020 = xx_occr_acct_cd_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_incm_clsf_cd_010(String xx_incm_clsf_cd_010){
		this.xx_incm_clsf_cd_010 = xx_incm_clsf_cd_010;
	}

	public void setXx_incm_clsf_cd_020(String xx_incm_clsf_cd_020){
		this.xx_incm_clsf_cd_020 = xx_incm_clsf_cd_020;
	}

	public void setXx_incm_clsf_cd_030(String xx_incm_clsf_cd_030){
		this.xx_incm_clsf_cd_030 = xx_incm_clsf_cd_030;
	}

	public void setXx_incm_clsf_cd_040(String xx_incm_clsf_cd_040){
		this.xx_incm_clsf_cd_040 = xx_incm_clsf_cd_040;
	}

	public void setXx_incm_clsf_cd_050(String xx_incm_clsf_cd_050){
		this.xx_incm_clsf_cd_050 = xx_incm_clsf_cd_050;
	}

	public void setXx_occr_acct_cd_010(String xx_occr_acct_cd_010){
		this.xx_occr_acct_cd_010 = xx_occr_acct_cd_010;
	}

	public void setXx_occr_acct_cd_020(String xx_occr_acct_cd_020){
		this.xx_occr_acct_cd_020 = xx_occr_acct_cd_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_incm_clsf_cd_010(){
		return this.xx_incm_clsf_cd_010;
	}

	public String getXx_incm_clsf_cd_020(){
		return this.xx_incm_clsf_cd_020;
	}

	public String getXx_incm_clsf_cd_030(){
		return this.xx_incm_clsf_cd_030;
	}

	public String getXx_incm_clsf_cd_040(){
		return this.xx_incm_clsf_cd_040;
	}

	public String getXx_incm_clsf_cd_050(){
		return this.xx_incm_clsf_cd_050;
	}

	public String getXx_occr_acct_cd_010(){
		return this.xx_occr_acct_cd_010;
	}

	public String getXx_occr_acct_cd_020(){
		return this.xx_occr_acct_cd_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1060_MCURDLCO_CLSF_CDRecord rec = new FC_FUNC_1060_MCURDLCO_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdlco_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1060_MINCM_CLSF_CDRecord rec = new FC_FUNC_1060_MINCM_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.incm_clsf_cd.add(rec);
		}
		this.xx_incm_clsf_cd_010 = Util.checkString(cstmt.getString(7));
		this.xx_incm_clsf_cd_020 = Util.checkString(cstmt.getString(8));
		this.xx_incm_clsf_cd_030 = Util.checkString(cstmt.getString(9));
		this.xx_incm_clsf_cd_040 = Util.checkString(cstmt.getString(10));
		this.xx_incm_clsf_cd_050 = Util.checkString(cstmt.getString(11));
		this.xx_occr_acct_cd_010 = Util.checkString(cstmt.getString(12));
		this.xx_occr_acct_cd_020 = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1060_MDataSet ds = (FC_FUNC_1060_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdlco_clsf_cd.size(); i++){
		FC_FUNC_1060_MCURDLCO_CLSF_CDRecord curdlco_clsf_cdRec = (FC_FUNC_1060_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.incm_clsf_cd.size(); i++){
		FC_FUNC_1060_MINCM_CLSF_CDRecord incm_clsf_cdRec = (FC_FUNC_1060_MINCM_CLSF_CDRecord)ds.incm_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdlco_clsf_cd()%>
<%= ds.getIncm_clsf_cd()%>
<%= ds.getXx_incm_clsf_cd_010()%>
<%= ds.getXx_incm_clsf_cd_020()%>
<%= ds.getXx_incm_clsf_cd_030()%>
<%= ds.getXx_incm_clsf_cd_040()%>
<%= ds.getXx_incm_clsf_cd_050()%>
<%= ds.getXx_occr_acct_cd_010()%>
<%= ds.getXx_occr_acct_cd_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdlco_clsf_cdRec.cd_nm%>
<%= curdlco_clsf_cdRec.cd%>
<%= incm_clsf_cdRec.cd_nm%>
<%= incm_clsf_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 16:34:16 KST 2012 */