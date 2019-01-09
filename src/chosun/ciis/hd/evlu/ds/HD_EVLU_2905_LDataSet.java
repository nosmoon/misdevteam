/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2905_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String evlu_cd;
	public String self_evlu_proc_stat;
	public String rfl_ratio_10;
	public String rfl_ratio_20;
	public String slf_achv_desc1;
	public String slf_achv_desc2;

	public HD_EVLU_2905_LDataSet(){}
	public HD_EVLU_2905_LDataSet(String errcode, String errmsg, String dept_nm, String emp_no, String nm_korn, String evlu_cd, String self_evlu_proc_stat, String rfl_ratio_10, String rfl_ratio_20, String slf_achv_desc1, String slf_achv_desc2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_nm = dept_nm;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.evlu_cd = evlu_cd;
		this.self_evlu_proc_stat = self_evlu_proc_stat;
		this.rfl_ratio_10 = rfl_ratio_10;
		this.rfl_ratio_20 = rfl_ratio_20;
		this.slf_achv_desc1 = slf_achv_desc1;
		this.slf_achv_desc2 = slf_achv_desc2;
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

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setEvlu_cd(String evlu_cd){
		this.evlu_cd = evlu_cd;
	}

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setRfl_ratio_10(String rfl_ratio_10){
		this.rfl_ratio_10 = rfl_ratio_10;
	}

	public void setRfl_ratio_20(String rfl_ratio_20){
		this.rfl_ratio_20 = rfl_ratio_20;
	}

	public void setSlf_achv_desc1(String slf_achv_desc1){
		this.slf_achv_desc1 = slf_achv_desc1;
	}

	public void setSlf_achv_desc2(String slf_achv_desc2){
		this.slf_achv_desc2 = slf_achv_desc2;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getEvlu_cd(){
		return this.evlu_cd;
	}

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getRfl_ratio_10(){
		return this.rfl_ratio_10;
	}

	public String getRfl_ratio_20(){
		return this.rfl_ratio_20;
	}

	public String getSlf_achv_desc1(){
		return this.slf_achv_desc1;
	}

	public String getSlf_achv_desc2(){
		return this.slf_achv_desc2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_nm = Util.checkString(cstmt.getString(7));
		this.emp_no = Util.checkString(cstmt.getString(8));
		this.nm_korn = Util.checkString(cstmt.getString(9));
		this.evlu_cd = Util.checkString(cstmt.getString(10));
		this.self_evlu_proc_stat = Util.checkString(cstmt.getString(11));
		this.rfl_ratio_10 = Util.checkString(cstmt.getString(12));
		this.rfl_ratio_20 = Util.checkString(cstmt.getString(13));
		this.slf_achv_desc1 = Util.checkString(cstmt.getString(14));
		this.slf_achv_desc2 = Util.checkString(cstmt.getString(15));
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			HD_EVLU_2905_LCURLIST1Record rec = new HD_EVLU_2905_LCURLIST1Record();
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while(rset1.next()){
			HD_EVLU_2905_LCURLIST2Record rec = new HD_EVLU_2905_LCURLIST2Record();
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset1.getString("act_indx_def"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2905_LDataSet ds = (HD_EVLU_2905_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_2905_LCURLIST1Record curlist1Rec = (HD_EVLU_2905_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_2905_LCURLIST2Record curlist2Rec = (HD_EVLU_2905_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_nm()%>
<%= ds.getEmp_no()%>
<%= ds.getNm_korn()%>
<%= ds.getEvlu_cd()%>
<%= ds.getSelf_evlu_proc_stat()%>
<%= ds.getRfl_ratio_10()%>
<%= ds.getRfl_ratio_20()%>
<%= ds.getSlf_achv_desc1()%>
<%= ds.getSlf_achv_desc2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cdnm%>
<%= curlist1Rec.act_indx_def%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.act_indx_def%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 05 10:51:12 KST 2016 */