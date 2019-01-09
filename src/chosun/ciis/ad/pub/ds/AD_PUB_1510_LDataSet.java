/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1510_LDataSet(){}
	public AD_PUB_1510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_PUB_1510_LCURLISTRecord rec = new AD_PUB_1510_LCURLISTRecord();
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.upd_prv_amt = Util.checkString(rset0.getString("upd_prv_amt"));
			rec.upd_aft_amt = Util.checkString(rset0.getString("upd_aft_amt"));
			rec.icdc_amt = Util.checkString(rset0.getString("icdc_amt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.hndl_clsf_nm = Util.checkString(rset0.getString("hndl_clsf_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1510_LDataSet ds = (AD_PUB_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1510_LCURLISTRecord curlistRec = (AD_PUB_1510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chrg_aprv%>
<%= curlistRec.medi_cd%>
<%= curlistRec.seq%>
<%= curlistRec.medi_nm%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.upd_prv_amt%>
<%= curlistRec.upd_aft_amt%>
<%= curlistRec.icdc_amt%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.hndl_clsf_nm%>
<%= curlistRec.make_dt%>
<%= curlistRec.agn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 15:50:55 KST 2009 */