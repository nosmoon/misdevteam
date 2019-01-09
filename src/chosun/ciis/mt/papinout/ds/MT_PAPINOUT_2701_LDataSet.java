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


public class MT_PAPINOUT_2701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2701_LDataSet(){}
	public MT_PAPINOUT_2701_LDataSet(String errcode, String errmsg){
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

		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			MT_PAPINOUT_2701_LCURLISTRecord rec = new MT_PAPINOUT_2701_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset4.getString("cmpy_cd"));
			rec.save_yymm = Util.checkString(rset4.getString("save_yymm"));
			rec.save_fac_clsf = Util.checkString(rset4.getString("save_fac_clsf"));
			rec.matr_cd = Util.checkString(rset4.getString("matr_cd"));
			rec.ewh_plan_roll = Util.checkString(rset4.getString("ewh_plan_roll"));
			rec.ewh_plan_wgt = Util.checkString(rset4.getString("ewh_plan_wgt"));
			rec.owh_plan_roll = Util.checkString(rset4.getString("owh_plan_roll"));
			rec.owh_plan_wgt = Util.checkString(rset4.getString("owh_plan_wgt"));
			rec.save_work_frdt = Util.checkString(rset4.getString("save_work_frdt"));
			rec.save_work_todt = Util.checkString(rset4.getString("save_work_todt"));
			rec.roll_wgt = Util.checkString(rset4.getString("roll_wgt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2701_LDataSet ds = (MT_PAPINOUT_2701_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2701_LCURLISTRecord curlistRec = (MT_PAPINOUT_2701_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.save_yymm%>
<%= curlistRec.save_fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.ewh_plan_roll%>
<%= curlistRec.ewh_plan_wgt%>
<%= curlistRec.owh_plan_roll%>
<%= curlistRec.owh_plan_wgt%>
<%= curlistRec.save_work_frdt%>
<%= curlistRec.save_work_todt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 15:53:01 KST 2009 */