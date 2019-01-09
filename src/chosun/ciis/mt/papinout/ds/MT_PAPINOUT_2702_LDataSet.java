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


public class MT_PAPINOUT_2702_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sum_roll;
	public String sum_wgt;

	public MT_PAPINOUT_2702_LDataSet(){}
	public MT_PAPINOUT_2702_LDataSet(String errcode, String errmsg, String sum_roll, String sum_wgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sum_roll = sum_roll;
		this.sum_wgt = sum_wgt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSum_roll(String sum_roll){
		this.sum_roll = sum_roll;
	}

	public void setSum_wgt(String sum_wgt){
		this.sum_wgt = sum_wgt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSum_roll(){
		return this.sum_roll;
	}

	public String getSum_wgt(){
		return this.sum_wgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_PAPINOUT_2702_LCURLISTRecord rec = new MT_PAPINOUT_2702_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.owh_plan_roll = Util.checkString(rset0.getString("owh_plan_roll"));
			rec.owh_plan_dt = Util.checkString(rset0.getString("owh_plan_dt"));
			rec.owh_plan_wgt = Util.checkString(rset0.getString("owh_plan_wgt"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_PAPINOUT_2702_LCURLIST1Record rec = new MT_PAPINOUT_2702_LCURLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist1.add(rec);
		}
		this.sum_roll = Util.checkString(cstmt.getString(10));
		this.sum_wgt = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2702_LDataSet ds = (MT_PAPINOUT_2702_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2702_LCURLISTRecord curlistRec = (MT_PAPINOUT_2702_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_2702_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_2702_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getSum_roll()%>
<%= ds.getSum_wgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fac_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.owh_plan_roll%>
<%= curlistRec.owh_plan_dt%>
<%= curlistRec.owh_plan_wgt%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 04 10:47:43 KST 2009 */