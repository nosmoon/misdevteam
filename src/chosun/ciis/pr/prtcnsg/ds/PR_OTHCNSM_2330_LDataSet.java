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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_OTHCNSM_2330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_2330_LDataSet(){}
	public PR_OTHCNSM_2330_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_OTHCNSM_2330_LCURLIST1Record rec = new PR_OTHCNSM_2330_LCURLIST1Record();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.psplat_clsf = Util.checkString(rset0.getString("psplat_clsf"));
			rec.psplat_fee = Util.checkString(rset0.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_OTHCNSM_2330_LCURLIST2Record rec = new PR_OTHCNSM_2330_LCURLIST2Record();
			rec.aply_dt = Util.checkString(rset1.getString("aply_dt"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.psplat_clsf = Util.checkString(rset1.getString("psplat_clsf"));
			rec.psplat_fee = Util.checkString(rset1.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset1.getString("gnaw_fee"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_OTHCNSM_2330_LCURLIST3Record rec = new PR_OTHCNSM_2330_LCURLIST3Record();
			rec.psplat_clsf = Util.checkString(rset2.getString("psplat_clsf"));
			rec.psplat_fee = Util.checkString(rset2.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset2.getString("gnaw_fee"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset2.getString("fac_clsf_nm"));
			rec.aply_dt = Util.checkString(rset2.getString("aply_dt"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset2.getString("sect_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_OTHCNSM_2330_LDataSet ds = (PR_OTHCNSM_2330_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_OTHCNSM_2330_LCURLIST1Record curlist1Rec = (PR_OTHCNSM_2330_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_OTHCNSM_2330_LCURLIST2Record curlist2Rec = (PR_OTHCNSM_2330_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_OTHCNSM_2330_LCURLIST3Record curlist3Rec = (PR_OTHCNSM_2330_LCURLIST3Record)ds.curlist3.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.psplat_clsf%>
<%= curlist1Rec.psplat_fee%>
<%= curlist1Rec.gnaw_fee%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.aply_dt%>
<%= curlist2Rec.aply_dt%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.psplat_clsf%>
<%= curlist2Rec.psplat_fee%>
<%= curlist2Rec.gnaw_fee%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist3Rec.psplat_clsf%>
<%= curlist3Rec.psplat_fee%>
<%= curlist3Rec.gnaw_fee%>
<%= curlist3Rec.fac_clsf%>
<%= curlist3Rec.fac_clsf_nm%>
<%= curlist3Rec.aply_dt%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.sect_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 10:24:56 KST 2009 */