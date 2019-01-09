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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_3300_LDataSet(){}
	public MT_PRNPAP_3300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PRNPAP_3300_LCURLISTRecord rec = new MT_PRNPAP_3300_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.rot_mach_no = Util.checkString(rset0.getString("rot_mach_no"));
			rec.sett_no = Util.checkString(rset0.getString("sett_no"));
			rec.sett_seq = Util.checkString(rset0.getString("sett_seq"));
			rec.a_cmcnt_val_cnt = Util.checkString(rset0.getString("a_cmcnt_val_cnt"));
			rec.a_wgt = Util.checkString(rset0.getString("a_wgt"));
			rec.a_un_use_yn = Util.checkString(rset0.getString("a_un_use_yn"));
			rec.b_cmcnt_val_cnt = Util.checkString(rset0.getString("b_cmcnt_val_cnt"));
			rec.b_wgt = Util.checkString(rset0.getString("b_wgt"));
			rec.b_un_use_yn = Util.checkString(rset0.getString("b_un_use_yn"));
			rec.c_cmcnt_val_cnt = Util.checkString(rset0.getString("c_cmcnt_val_cnt"));
			rec.c_wgt = Util.checkString(rset0.getString("c_wgt"));
			rec.c_un_use_yn = Util.checkString(rset0.getString("c_un_use_yn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3300_LDataSet ds = (MT_PRNPAP_3300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3300_LCURLISTRecord curlistRec = (MT_PRNPAP_3300_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.fac_clsf%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.rot_mach_no%>
<%= curlistRec.sett_no%>
<%= curlistRec.sett_seq%>
<%= curlistRec.a_cmcnt_val_cnt%>
<%= curlistRec.a_wgt%>
<%= curlistRec.a_un_use_yn%>
<%= curlistRec.b_cmcnt_val_cnt%>
<%= curlistRec.b_wgt%>
<%= curlistRec.b_un_use_yn%>
<%= curlistRec.c_cmcnt_val_cnt%>
<%= curlistRec.c_wgt%>
<%= curlistRec.c_un_use_yn%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 16:54:16 KST 2009 */