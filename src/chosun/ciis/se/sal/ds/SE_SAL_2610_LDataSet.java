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


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos_yn;
	public String fix_msg;
	public String fix_dt;
	public String issu_dt_cnt;

	public SE_SAL_2610_LDataSet(){}
	public SE_SAL_2610_LDataSet(String errcode, String errmsg, String clos_yn, String fix_msg, String fix_dt, String issu_dt_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_yn = clos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
		this.issu_dt_cnt = issu_dt_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_yn(){
		return this.clos_yn;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_SAL_2610_LCURLISTRecord rec = new SE_SAL_2610_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.sum = Util.checkString(rset0.getString("sum"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			this.curlist.add(rec);
		}
		this.clos_yn = Util.checkString(cstmt.getString(10));
		this.fix_msg = Util.checkString(cstmt.getString(11));
		this.fix_dt = Util.checkString(cstmt.getString(12));
		this.issu_dt_cnt = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2610_LDataSet ds = (SE_SAL_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2610_LCURLISTRecord curlistRec = (SE_SAL_2610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getClos_yn()%>
<%= ds.getFix_msg()%>
<%= ds.getFix_dt()%>
<%= ds.getIssu_dt_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.sum%>
<%= curlistRec.bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 01 15:19:08 KST 2012 */