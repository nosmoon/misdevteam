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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4050_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4050_MDataSet(){}
	public MC_BUDG_4050_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MC_BUDG_4050_MCURLIST1Record rec = new MC_BUDG_4050_MCURLIST1Record();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_team_clsf = Util.checkString(rset0.getString("dept_team_clsf"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_dn_nm = Util.checkString(rset0.getString("part_dn_nm"));
			rec.use_bgn_dt = Util.checkString(rset0.getString("use_bgn_dt"));
			rec.use_end_dt = Util.checkString(rset0.getString("use_end_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			MC_BUDG_4050_MCURLIST2Record rec = new MC_BUDG_4050_MCURLIST2Record();
			rec.dd = Util.checkString(rset1.getString("dd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			MC_BUDG_4050_MCURLIST3Record rec = new MC_BUDG_4050_MCURLIST3Record();
			rec.max_ymcym = Util.checkString(rset2.getString("max_ymcym"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(13);
		while(rset3.next()){
			MC_BUDG_4050_MCURLIST4Record rec = new MC_BUDG_4050_MCURLIST4Record();
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset3.getString("budg_abrv_nm"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4050_MDataSet ds = (MC_BUDG_4050_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_4050_MCURLIST1Record curlist1Rec = (MC_BUDG_4050_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_4050_MCURLIST2Record curlist2Rec = (MC_BUDG_4050_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_4050_MCURLIST3Record curlist3Rec = (MC_BUDG_4050_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MC_BUDG_4050_MCURLIST4Record curlist4Rec = (MC_BUDG_4050_MCURLIST4Record)ds.curlist4.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_team_clsf%>
<%= curlist1Rec.abrv_nm%>
<%= curlist1Rec.offi_nm%>
<%= curlist1Rec.part_nm%>
<%= curlist1Rec.part_dn_nm%>
<%= curlist1Rec.use_bgn_dt%>
<%= curlist1Rec.use_end_dt%>
<%= curlist2Rec.dd%>
<%= curlist3Rec.max_ymcym%>
<%= curlist4Rec.budg_cd%>
<%= curlist4Rec.budg_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 09:43:29 KST 2009 */