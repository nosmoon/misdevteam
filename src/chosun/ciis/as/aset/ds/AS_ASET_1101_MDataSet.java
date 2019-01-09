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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1101_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_srch_slip_clsf_cd;

	public AS_ASET_1101_MDataSet(){}
	public AS_ASET_1101_MDataSet(String errcode, String errmsg, String xx_cd_010, String xx_cd_020, String xx_srch_slip_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_srch_slip_clsf_cd(String xx_srch_slip_clsf_cd){
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_srch_slip_clsf_cd(){
		return this.xx_srch_slip_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_ASET_1101_MCURLIST1Record rec = new AS_ASET_1101_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AS_ASET_1101_MXX_COMBO_010Record rec = new AS_ASET_1101_MXX_COMBO_010Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_combo_010.add(rec);
		}
		this.xx_cd_010 = Util.checkString(cstmt.getString(7));
		this.xx_cd_020 = Util.checkString(cstmt.getString(8));
		this.xx_srch_slip_clsf_cd = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1101_MDataSet ds = (AS_ASET_1101_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1101_MCURLIST1Record curlist1Rec = (AS_ASET_1101_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		AS_ASET_1101_MXX_COMBO_010Record xx_combo_010Rec = (AS_ASET_1101_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_srch_slip_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_010Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 11:26:39 KST 2015 */