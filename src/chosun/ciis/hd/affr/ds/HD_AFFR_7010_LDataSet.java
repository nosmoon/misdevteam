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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_7010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_7010_LDataSet(){}
	public HD_AFFR_7010_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_AFFR_7010_LCURLISTRecord rec = new HD_AFFR_7010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.certi_clsf = Util.checkString(rset0.getString("certi_clsf"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.prn_cnt = Util.checkString(rset0.getString("prn_cnt"));
			rec.certi_clsf_name = Util.checkString(rset0.getString("certi_clsf_name"));
			rec.issu_clsf_name = Util.checkString(rset0.getString("issu_clsf_name"));
			rec.dty_name = Util.checkString(rset0.getString("dty_name"));
			rec.posi_name = Util.checkString(rset0.getString("posi_name"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.aplc_seq = Util.checkString(rset0.getString("aplc_seq"));
			rec.issu_num_shet = Util.checkString(rset0.getString("issu_num_shet"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.cntc_plac = Util.checkString(rset0.getString("cntc_plac"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.engl_flnm = Util.checkString(rset0.getString("engl_flnm"));
			rec.issu_clsf = Util.checkString(rset0.getString("issu_clsf"));
			rec.dirc_incmg_posi = Util.checkString(rset0.getString("dirc_incmg_posi"));
			rec.chce_posi_clsf = Util.checkString(rset0.getString("chce_posi_clsf"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.busi_trip_area = Util.checkString(rset0.getString("busi_trip_area"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.engl_bidt = Util.checkString(rset0.getString("engl_bidt"));
			rec.engl_dept_posi = Util.checkString(rset0.getString("engl_dept_posi"));
			rec.engl_in_cmpy_dt = Util.checkString(rset0.getString("engl_in_cmpy_dt"));
			rec.engl_now_dt = Util.checkString(rset0.getString("engl_now_dt"));
			rec.engl_busi_trip_purp = Util.checkString(rset0.getString("engl_busi_trip_purp"));
			rec.engl_busi_trip_area = Util.checkString(rset0.getString("engl_busi_trip_area"));
			rec.engl_busi_trip_frdt = Util.checkString(rset0.getString("engl_busi_trip_frdt"));
			rec.engl_busi_trip_todt = Util.checkString(rset0.getString("engl_busi_trip_todt"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_no = Util.checkString(rset0.getString("issu_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_AFFR_7010_LCURLIST2Record rec = new HD_AFFR_7010_LCURLIST2Record();
			rec.cd_type = Util.checkString(rset1.getString("cd_type"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_7010_LDataSet ds = (HD_AFFR_7010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_7010_LCURLISTRecord curlistRec = (HD_AFFR_7010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_AFFR_7010_LCURLIST2Record curlist2Rec = (HD_AFFR_7010_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.certi_clsf%>
<%= curlistRec.prn%>
<%= curlistRec.prn_cnt%>
<%= curlistRec.certi_clsf_name%>
<%= curlistRec.issu_clsf_name%>
<%= curlistRec.dty_name%>
<%= curlistRec.posi_name%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.aplc_seq%>
<%= curlistRec.issu_num_shet%>
<%= curlistRec.usag%>
<%= curlistRec.remk%>
<%= curlistRec.cntc_plac%>
<%= curlistRec.email%>
<%= curlistRec.engl_flnm%>
<%= curlistRec.issu_clsf%>
<%= curlistRec.dirc_incmg_posi%>
<%= curlistRec.chce_posi_clsf%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.busi_trip_area%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.engl_bidt%>
<%= curlistRec.engl_dept_posi%>
<%= curlistRec.engl_in_cmpy_dt%>
<%= curlistRec.engl_now_dt%>
<%= curlistRec.engl_busi_trip_purp%>
<%= curlistRec.engl_busi_trip_area%>
<%= curlistRec.engl_busi_trip_frdt%>
<%= curlistRec.engl_busi_trip_todt%>
<%= curlistRec.issu_dt%>
<%= curlistRec.issu_no%>
<%= curlist2Rec.cd_type%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 18:39:36 KST 2009 */