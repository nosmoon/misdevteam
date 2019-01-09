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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2501_LDataSet(){}
	public MT_PAPINOUT_2501_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_PAPINOUT_2501_LCURLISTRecord rec = new MT_PAPINOUT_2501_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.plan_jji_rol = Util.checkString(rset0.getString("plan_jji_rol"));
			rec.plan_jji_wt = Util.checkString(rset0.getString("plan_jji_wt"));
			rec.base_jji_rol = Util.checkString(rset0.getString("base_jji_rol"));
			rec.base_jji_wt = Util.checkString(rset0.getString("base_jji_wt"));
			rec.base_ji_igrol = Util.checkString(rset0.getString("base_ji_igrol"));
			rec.base_ji_igwt = Util.checkString(rset0.getString("base_ji_igwt"));
			rec.base_ji_cgrol = Util.checkString(rset0.getString("base_ji_cgrol"));
			rec.base_ji_cgwt = Util.checkString(rset0.getString("base_ji_cgwt"));
			rec.ewh_plan_roll = Util.checkString(rset0.getString("ewh_plan_roll"));
			rec.owh_plan_roll = Util.checkString(rset0.getString("owh_plan_roll"));
			rec.ewh_plan_wgt = Util.checkString(rset0.getString("ewh_plan_wgt"));
			rec.owh_plan_wgt = Util.checkString(rset0.getString("owh_plan_wgt"));
			rec.save_work_frdt = Util.checkString(rset0.getString("save_work_frdt"));
			rec.save_work_todt = Util.checkString(rset0.getString("save_work_todt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2501_LDataSet ds = (MT_PAPINOUT_2501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2501_LCURLISTRecord curlistRec = (MT_PAPINOUT_2501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.plan_jji_rol%>
<%= curlistRec.plan_jji_wt%>
<%= curlistRec.base_jji_rol%>
<%= curlistRec.base_jji_wt%>
<%= curlistRec.base_ji_igrol%>
<%= curlistRec.base_ji_igwt%>
<%= curlistRec.base_ji_cgrol%>
<%= curlistRec.base_ji_cgwt%>
<%= curlistRec.ewh_plan_roll%>
<%= curlistRec.owh_plan_roll%>
<%= curlistRec.ewh_plan_wgt%>
<%= curlistRec.owh_plan_wgt%>
<%= curlistRec.save_work_frdt%>
<%= curlistRec.save_work_todt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 25 09:20:30 KST 2009 */