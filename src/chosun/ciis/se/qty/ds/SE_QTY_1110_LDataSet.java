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


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String totclos_yn;
	public String areaclos_yn;
	public String fix_msg;
	public String fix_dt;

	public SE_QTY_1110_LDataSet(){}
	public SE_QTY_1110_LDataSet(String errcode, String errmsg, String totclos_yn, String areaclos_yn, String fix_msg, String fix_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totclos_yn = totclos_yn;
		this.areaclos_yn = areaclos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totclos_yn = Util.checkString(cstmt.getString(11));
		this.areaclos_yn = Util.checkString(cstmt.getString(12));
		this.fix_msg = Util.checkString(cstmt.getString(13));
		this.fix_dt = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SE_QTY_1110_LCURLISTRecord rec = new SE_QTY_1110_LCURLISTRecord();
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.prvmm_cntr_uprc = rset0.getInt("prvmm_cntr_uprc");
			rec.prvmm_val_qty = rset0.getInt("prvmm_val_qty");
			rec.prvmm_no_val_qty = rset0.getInt("prvmm_no_val_qty");
			rec.prvmm_qty_tot = rset0.getInt("prvmm_qty_tot");
			rec.gnr_enty_qty = rset0.getInt("gnr_enty_qty");
			rec.isenty_qty = rset0.getInt("isenty_qty");
			rec.isicdc_qty = rset0.getInt("isicdc_qty");
			rec.rdr_extn_enty_qty = rset0.getInt("rdr_extn_enty_qty");
			rec.val_movm_qty = rset0.getInt("val_movm_qty");
			rec.val_icdc_qty = rset0.getInt("val_icdc_qty");
			rec.val_icdc_tot = rset0.getInt("val_icdc_tot");
			rec.curmm_val_qty = rset0.getInt("curmm_val_qty");
			rec.curmm_no_val_qty = rset0.getInt("curmm_no_val_qty");
			rec.curmm_issu_qty = rset0.getInt("curmm_issu_qty");
			rec.no_val_icdc_qty = rset0.getInt("no_val_icdc_qty");
			rec.curmm_icdc_tot = rset0.getInt("curmm_icdc_tot");
			rec.isenty_qty2 = rset0.getInt("isenty_qty2");
			rec.rdr_extn_enty_qty2 = rset0.getInt("rdr_extn_enty_qty2");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_1110_LDataSet ds = (SE_QTY_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_1110_LCURLISTRecord curlistRec = (SE_QTY_1110_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.team_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.prvmm_cntr_uprc%>
<%= curlistRec.prvmm_val_qty%>
<%= curlistRec.prvmm_no_val_qty%>
<%= curlistRec.prvmm_qty_tot%>
<%= curlistRec.gnr_enty_qty%>
<%= curlistRec.isenty_qty%>
<%= curlistRec.isicdc_qty%>
<%= curlistRec.rdr_extn_enty_qty%>
<%= curlistRec.val_movm_qty%>
<%= curlistRec.val_icdc_qty%>
<%= curlistRec.val_icdc_tot%>
<%= curlistRec.curmm_val_qty%>
<%= curlistRec.curmm_no_val_qty%>
<%= curlistRec.curmm_issu_qty%>
<%= curlistRec.no_val_icdc_qty%>
<%= curlistRec.curmm_icdc_tot%>
<%= curlistRec.isenty_qty2%>
<%= curlistRec.rdr_extn_enty_qty2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 27 17:12:58 KST 2014 */