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


package chosun.ciis.hd.orga.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_ORGA_1002_LDataSet(){}
	public HD_ORGA_1002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_ORGA_1002_LCURLISTRecord rec = new HD_ORGA_1002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.engl_nm = Util.checkString(rset0.getString("engl_nm"));
			rec.insd_dept_cd = Util.checkString(rset0.getString("insd_dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.use_bgn_dt = Util.checkString(rset0.getString("use_bgn_dt"));
			rec.use_end_dt = Util.checkString(rset0.getString("use_end_dt"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.duty_area = Util.checkString(rset0.getString("duty_area"));
			rec.duty_area_nm = Util.checkString(rset0.getString("duty_area_nm"));
			rec.now_use_yn = Util.checkString(rset0.getString("now_use_yn"));
			rec.cost_dept_clsf = Util.checkString(rset0.getString("cost_dept_clsf"));
			rec.make_dept_clsf = Util.checkString(rset0.getString("make_dept_clsf"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dept_team_nm = Util.checkString(rset0.getString("dept_team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_dn_nm = Util.checkString(rset0.getString("part_dn_nm"));
			rec.inhr_seq_1 = Util.checkString(rset0.getString("inhr_seq_1"));
			rec.inhr_seq_2 = Util.checkString(rset0.getString("inhr_seq_2"));
			rec.inhr_seq_3 = Util.checkString(rset0.getString("inhr_seq_3"));
			rec.supr_dept_cd = Util.checkString(rset0.getString("supr_dept_cd"));
			rec.srt_seq_1 = Util.checkString(rset0.getString("srt_seq_1"));
			rec.srt_seq_2 = Util.checkString(rset0.getString("srt_seq_2"));
			rec.cost_dstb_cd = Util.checkString(rset0.getString("cost_dstb_cd"));
			rec.cost_dstb_cd_1 = Util.checkString(rset0.getString("cost_dstb_cd_1"));
			rec.cost_dstb_cd_2 = Util.checkString(rset0.getString("cost_dstb_cd_2"));
			rec.cost_part_cd = Util.checkString(rset0.getString("cost_part_cd"));
			rec.prt_plac_clsf = Util.checkString(rset0.getString("prt_plac_clsf"));
			rec.dept_team_clsf = Util.checkString(rset0.getString("dept_team_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_ORGA_1002_LDataSet ds = (HD_ORGA_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_ORGA_1002_LCURLISTRecord curlistRec = (HD_ORGA_1002_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.engl_nm%>
<%= curlistRec.insd_dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.use_bgn_dt%>
<%= curlistRec.use_end_dt%>
<%= curlistRec.natn_cd%>
<%= curlistRec.natn_nm%>
<%= curlistRec.duty_area%>
<%= curlistRec.duty_area_nm%>
<%= curlistRec.now_use_yn%>
<%= curlistRec.cost_dept_clsf%>
<%= curlistRec.make_dept_clsf%>
<%= curlistRec.offi_nm%>
<%= curlistRec.dept_team_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.part_dn_nm%>
<%= curlistRec.inhr_seq_1%>
<%= curlistRec.inhr_seq_2%>
<%= curlistRec.inhr_seq_3%>
<%= curlistRec.supr_dept_cd%>
<%= curlistRec.srt_seq_1%>
<%= curlistRec.srt_seq_2%>
<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_cd_1%>
<%= curlistRec.cost_dstb_cd_2%>
<%= curlistRec.cost_part_cd%>
<%= curlistRec.prt_plac_clsf%>
<%= curlistRec.dept_team_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 20 16:56:55 KST 2014 */