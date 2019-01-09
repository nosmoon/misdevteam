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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1611_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String alvc_cnt;
	public String aplc_vaca;

	public HD_VACA_1611_LDataSet(){}
	public HD_VACA_1611_LDataSet(String errcode, String errmsg, String alvc_cnt, String aplc_vaca){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.alvc_cnt = alvc_cnt;
		this.aplc_vaca = aplc_vaca;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAlvc_cnt(String alvc_cnt){
		this.alvc_cnt = alvc_cnt;
	}

	public void setAplc_vaca(String aplc_vaca){
		this.aplc_vaca = aplc_vaca;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAlvc_cnt(){
		return this.alvc_cnt;
	}

	public String getAplc_vaca(){
		return this.aplc_vaca;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_VACA_1611_LCURLISTRecord rec = new HD_VACA_1611_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.rptv_posi_cd = Util.checkString(rset0.getString("rptv_posi_cd"));
			rec.rptv_posi_nm = Util.checkString(rset0.getString("rptv_posi_nm"));
			rec.year_add_vaca = Util.checkString(rset0.getString("year_add_vaca"));
			rec.use_vaca_dds = Util.checkString(rset0.getString("use_vaca_dds"));
			rec.rmn_vaca_dds = Util.checkString(rset0.getString("rmn_vaca_dds"));
			rec.alvc_vaca_cnt = Util.checkString(rset0.getString("alvc_vaca_cnt"));
			rec.duty_vaca_dds = Util.checkString(rset0.getString("duty_vaca_dds"));
			rec.rotate_duty_yn = Util.checkString(rset0.getString("rotate_duty_yn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_VACA_1611_LCURLIST1Record rec = new HD_VACA_1611_LCURLIST1Record();
			rec.duty_dt = Util.checkString(rset1.getString("duty_dt"));
			rec.hody_clsf = Util.checkString(rset1.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset1.getString("hody_clsf_nm"));
			rec.alvc_use_dt = Util.checkString(rset1.getString("alvc_use_dt"));
			rec.alvc_use_yn_nm = Util.checkString(rset1.getString("alvc_use_yn_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			HD_VACA_1611_LCURLIST2Record rec = new HD_VACA_1611_LCURLIST2Record();
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.proc_stat = Util.checkString(rset2.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset2.getString("proc_stat_nm"));
			rec.delchk = Util.checkString(rset2.getString("delchk"));
			rec.vaca_clsf = Util.checkString(rset2.getString("vaca_clsf"));
			rec.vaca_clsf_nm = Util.checkString(rset2.getString("vaca_clsf_nm"));
			rec.vaca_dtls_clsf = Util.checkString(rset2.getString("vaca_dtls_clsf"));
			rec.vaca_dtls_clsf_nm = Util.checkString(rset2.getString("vaca_dtls_clsf_nm"));
			rec.alvc_use_dt = Util.checkString(rset2.getString("alvc_use_dt"));
			rec.vaca_frdt = Util.checkString(rset2.getString("vaca_frdt"));
			rec.vaca_todt = Util.checkString(rset2.getString("vaca_todt"));
			rec.vaca_dds = Util.checkString(rset2.getString("vaca_dds"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			HD_VACA_1611_LCURLIST3Record rec = new HD_VACA_1611_LCURLIST3Record();
			rec.cd_type = Util.checkString(rset3.getString("cd_type"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			rec.mang_cd_3 = Util.checkString(rset3.getString("mang_cd_3"));
			rec.mang_cd_4 = Util.checkString(rset3.getString("mang_cd_4"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			HD_VACA_1611_LCURLIST4Record rec = new HD_VACA_1611_LCURLIST4Record();
			rec.faml_flnm = Util.checkString(rset4.getString("faml_flnm"));
			rec.faml_birth = Util.checkString(rset4.getString("faml_birth"));
			this.curlist4.add(rec);
		}
		this.alvc_cnt = Util.checkString(cstmt.getString(13));
		this.aplc_vaca = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1611_LDataSet ds = (HD_VACA_1611_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1611_LCURLISTRecord curlistRec = (HD_VACA_1611_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_VACA_1611_LCURLIST1Record curlist1Rec = (HD_VACA_1611_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_1611_LCURLIST2Record curlist2Rec = (HD_VACA_1611_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_VACA_1611_LCURLIST3Record curlist3Rec = (HD_VACA_1611_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_VACA_1611_LCURLIST4Record curlist4Rec = (HD_VACA_1611_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getAlvc_cnt()%>
<%= ds.getAplc_vaca()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.rptv_posi_cd%>
<%= curlistRec.rptv_posi_nm%>
<%= curlistRec.year_add_vaca%>
<%= curlistRec.use_vaca_dds%>
<%= curlistRec.rmn_vaca_dds%>
<%= curlistRec.alvc_vaca_cnt%>
<%= curlistRec.duty_vaca_dds%>
<%= curlistRec.rotate_duty_yn%>
<%= curlist1Rec.duty_dt%>
<%= curlist1Rec.hody_clsf%>
<%= curlist1Rec.hody_clsf_nm%>
<%= curlist1Rec.alvc_use_dt%>
<%= curlist1Rec.alvc_use_yn_nm%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.proc_stat%>
<%= curlist2Rec.proc_stat_nm%>
<%= curlist2Rec.delchk%>
<%= curlist2Rec.vaca_clsf%>
<%= curlist2Rec.vaca_clsf_nm%>
<%= curlist2Rec.vaca_dtls_clsf%>
<%= curlist2Rec.vaca_dtls_clsf_nm%>
<%= curlist2Rec.alvc_use_dt%>
<%= curlist2Rec.vaca_frdt%>
<%= curlist2Rec.vaca_todt%>
<%= curlist2Rec.vaca_dds%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist3Rec.cd_type%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.remk%>
<%= curlist3Rec.mang_cd_3%>
<%= curlist3Rec.mang_cd_4%>
<%= curlist4Rec.faml_flnm%>
<%= curlist4Rec.faml_birth%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 24 10:55:13 KST 2018 */