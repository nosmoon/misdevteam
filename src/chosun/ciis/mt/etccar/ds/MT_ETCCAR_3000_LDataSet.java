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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_3000_LDataSet(){}
	public MT_ETCCAR_3000_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_3000_LCURLIST1Record rec = new MT_ETCCAR_3000_LCURLIST1Record();
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.repa_dt = Util.checkString(rset0.getString("repa_dt"));
			rec.repa_gag = Util.checkString(rset0.getString("repa_gag"));
			rec.repa_clsf = Util.checkString(rset0.getString("repa_clsf"));
			rec.repa_cont = Util.checkString(rset0.getString("repa_cont"));
			rec.oil_qunt = Util.checkString(rset0.getString("oil_qunt"));
			rec.repa_dtls_ptcr = Util.checkString(rset0.getString("repa_dtls_ptcr"));
			rec.incmg_pers_ipaddr = Util.checkString(rset0.getString("incmg_pers_ipaddr"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.car_modl = Util.checkString(rset0.getString("car_modl"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_3000_LDataSet ds = (MT_ETCCAR_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCCAR_3000_LCURLIST1Record curlist1Rec = (MT_ETCCAR_3000_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.car_no%>
<%= curlist1Rec.repa_dt%>
<%= curlist1Rec.repa_gag%>
<%= curlist1Rec.repa_clsf%>
<%= curlist1Rec.repa_cont%>
<%= curlist1Rec.oil_qunt%>
<%= curlist1Rec.repa_dtls_ptcr%>
<%= curlist1Rec.incmg_pers_ipaddr%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.chg_pers%>
<%= curlist1Rec.chg_dt_tm%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.drvr_nm%>
<%= curlist1Rec.cmpy_mang_nm%>
<%= curlist1Rec.car_modl%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 21:33:28 KST 2009 */