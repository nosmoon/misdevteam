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


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_1220_LDataSet(){}
	public PL_SAL_1220_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(7);
		while(rset8.next()){
			PL_SAL_1220_LDEAL_PTCRCURRecord rec = new PL_SAL_1220_LDEAL_PTCRCURRecord();
			rec.deal_dt = Util.checkString(rset8.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset8.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset8.getString("deal_seq"));
			rec.medi_clsf = Util.checkString(rset8.getString("medi_clsf"));
			rec.medi_cd = Util.checkString(rset8.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset8.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset8.getString("medi_nm"));
			rec.stok_qty = Util.checkString(rset8.getString("stok_qty"));
			rec.deal_qty = Util.checkString(rset8.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset8.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset8.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset8.getString("deal_amt"));
			rec.sale_clsf = Util.checkString(rset8.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset8.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset8.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset8.getString("sell_type"));
			rec.remk = Util.checkString(rset8.getString("remk"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1220_LDataSet ds = (PL_SAL_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_SAL_1220_LDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_SAL_1220_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeal_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deal_ptcrcurRec.deal_dt%>
<%= deal_ptcrcurRec.deal_grp_seq%>
<%= deal_ptcrcurRec.deal_seq%>
<%= deal_ptcrcurRec.medi_clsf%>
<%= deal_ptcrcurRec.medi_cd%>
<%= deal_ptcrcurRec.medi_ser_no%>
<%= deal_ptcrcurRec.medi_nm%>
<%= deal_ptcrcurRec.stok_qty%>
<%= deal_ptcrcurRec.deal_qty%>
<%= deal_ptcrcurRec.deal_uprc%>
<%= deal_ptcrcurRec.dcrate%>
<%= deal_ptcrcurRec.deal_amt%>
<%= deal_ptcrcurRec.sale_clsf%>
<%= deal_ptcrcurRec.sendclsf%>
<%= deal_ptcrcurRec.wh_cd%>
<%= deal_ptcrcurRec.sell_type%>
<%= deal_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 18:16:37 KST 2009 */