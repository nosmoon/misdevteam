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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1201_LDataSet(){}
	public AS_LEAS_1201_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1201_LCURLIST1Record rec = new AS_LEAS_1201_LCURLIST1Record();
			rec.clam_yymm = Util.checkString(rset0.getString("clam_yymm"));
			rec.clam_dt = Util.checkString(rset0.getString("clam_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_apprv_yn = Util.checkString(rset0.getString("slip_apprv_yn"));
			rec.clam_cnt = Util.checkString(rset0.getString("clam_cnt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.clam_tot_cnt = Util.checkString(rset0.getString("clam_tot_cnt"));
			rec.upd_slip_yn = Util.checkString(rset0.getString("upd_slip_yn"));
			rec.canc_dy = Util.checkString(rset0.getString("canc_dy"));
			rec.clam_fix_yn = Util.checkString(rset0.getString("clam_fix_yn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.clam_seq = Util.checkString(rset0.getString("clam_seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1201_LDataSet ds = (AS_LEAS_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAS_1201_LCURLIST1Record curlist1Rec = (AS_LEAS_1201_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.clam_yymm%>
<%= curlist1Rec.clam_dt%>
<%= curlist1Rec.slip_no%>
<%= curlist1Rec.slip_apprv_yn%>
<%= curlist1Rec.clam_cnt%>
<%= curlist1Rec.clam_tot_amt%>
<%= curlist1Rec.clam_tot_cnt%>
<%= curlist1Rec.upd_slip_yn%>
<%= curlist1Rec.canc_dy%>
<%= curlist1Rec.clam_fix_yn%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.clam_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 17:52:02 KST 2009 */