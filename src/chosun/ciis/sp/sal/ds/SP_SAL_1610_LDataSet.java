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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1610_LDataSet(){}
	public SP_SAL_1610_LDataSet(String errcode, String errmsg){
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
			SP_SAL_1610_LCURLISTRecord rec = new SP_SAL_1610_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.car_ownr_nm = Util.checkString(rset0.getString("car_ownr_nm"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.engn_dsplt = Util.checkString(rset0.getString("engn_dsplt"));
			rec.insr_entr_hope_yn = Util.checkString(rset0.getString("insr_entr_hope_yn"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1610_LDataSet ds = (SP_SAL_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_1610_LCURLISTRecord curlistRec = (SP_SAL_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.car_ownr_nm%>
<%= curlistRec.car_no%>
<%= curlistRec.prn%>
<%= curlistRec.ptph_no%>
<%= curlistRec.addr%>
<%= curlistRec.engn_dsplt%>
<%= curlistRec.insr_entr_hope_yn%>
<%= curlistRec.reg_dt%>
<%= curlistRec.proc_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 06 09:11:13 KST 2012 */