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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String totclos_yn;
	public String areaclos_yn;
	public String fix_msg;
	public String fix_dt;
	public String issu_dt_cnt;
	public long avg_uprc;

	public SE_RCP_5210_LDataSet(){}
	public SE_RCP_5210_LDataSet(String errcode, String errmsg, String totclos_yn, String areaclos_yn, String fix_msg, String fix_dt, String issu_dt_cnt, long avg_uprc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totclos_yn = totclos_yn;
		this.areaclos_yn = areaclos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
		this.issu_dt_cnt = issu_dt_cnt;
		this.avg_uprc = avg_uprc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotclos_yn(String totclos_yn){
		this.totclos_yn = totclos_yn;
	}

	public void setAreaclos_yn(String areaclos_yn){
		this.areaclos_yn = areaclos_yn;
	}

	public void setFix_msg(String fix_msg){
		this.fix_msg = fix_msg;
	}

	public void setFix_dt(String fix_dt){
		this.fix_dt = fix_dt;
	}

	public void setIssu_dt_cnt(String issu_dt_cnt){
		this.issu_dt_cnt = issu_dt_cnt;
	}

	public void setAvg_uprc(long avg_uprc){
		this.avg_uprc = avg_uprc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTotclos_yn(){
		return this.totclos_yn;
	}

	public String getAreaclos_yn(){
		return this.areaclos_yn;
	}

	public String getFix_msg(){
		return this.fix_msg;
	}

	public String getFix_dt(){
		return this.fix_dt;
	}

	public String getIssu_dt_cnt(){
		return this.issu_dt_cnt;
	}

	public long getAvg_uprc(){
		return this.avg_uprc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totclos_yn = Util.checkString(cstmt.getString(10));
		this.areaclos_yn = Util.checkString(cstmt.getString(11));
		this.fix_msg = Util.checkString(cstmt.getString(12));
		this.fix_dt = Util.checkString(cstmt.getString(13));
		this.issu_dt_cnt = Util.checkString(cstmt.getString(14));
		this.avg_uprc = cstmt.getLong(15);
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SE_RCP_5210_LCURLISTRecord rec = new SE_RCP_5210_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_telno = Util.checkString(rset0.getString("bo_telno"));
			rec.pdlv_rdr_qty = Util.checkString(rset0.getString("pdlv_rdr_qty"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.pdlv_fee = Util.checkString(rset0.getString("pdlv_fee"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.pdlv_altn_amt = Util.checkString(rset0.getString("pdlv_altn_amt"));
			rec.qty_uprc = Util.checkString(rset0.getString("qty_uprc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_5210_LDataSet ds = (SE_RCP_5210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_5210_LCURLISTRecord curlistRec = (SE_RCP_5210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotclos_yn()%>
<%= ds.getAreaclos_yn()%>
<%= ds.getFix_msg()%>
<%= ds.getFix_dt()%>
<%= ds.getIssu_dt_cnt()%>
<%= ds.getAvg_uprc()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_telno%>
<%= curlistRec.pdlv_rdr_qty%>
<%= curlistRec.qty%>
<%= curlistRec.pdlv_fee%>
<%= curlistRec.uprc%>
<%= curlistRec.pdlv_altn_amt%>
<%= curlistRec.qty_uprc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 05 14:28:25 KST 2013 */