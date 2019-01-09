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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_2310_LDataSet(){}
	public AD_RES_2310_LDataSet(String errcode, String errmsg){
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
			AD_RES_2310_LCURLISTRecord rec = new AD_RES_2310_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_2310_LDataSet ds = (AD_RES_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_2310_LCURLISTRecord curlistRec = (AD_RES_2310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.team_chf_aprv%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.advt_cont%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 22 16:21:13 KST 2013 */