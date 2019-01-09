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


public class PL_SAL_3110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_3110_LDataSet(){}
	public PL_SAL_3110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			PL_SAL_3110_LDEAL_PTCRCURRecord rec = new PL_SAL_3110_LDEAL_PTCRCURRecord();
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.area = Util.checkString(rset0.getString("area"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.medi_clsf_nm = Util.checkString(rset0.getString("medi_clsf_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.sendclsf_nm = Util.checkString(rset0.getString("sendclsf_nm"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_3110_LDataSet ds = (PL_SAL_3110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_SAL_3110_LDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_SAL_3110_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
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

<%= deal_ptcrcurRec.dlco_clsf%>
<%= deal_ptcrcurRec.dlco_clsf_nm%>
<%= deal_ptcrcurRec.area%>
<%= deal_ptcrcurRec.area_nm%>
<%= deal_ptcrcurRec.dlco_cd%>
<%= deal_ptcrcurRec.dlco_seq%>
<%= deal_ptcrcurRec.dlco_nm%>
<%= deal_ptcrcurRec.medi_clsf%>
<%= deal_ptcrcurRec.medi_clsf_nm%>
<%= deal_ptcrcurRec.medi_cd%>
<%= deal_ptcrcurRec.medi_ser_no%>
<%= deal_ptcrcurRec.medi_nm%>
<%= deal_ptcrcurRec.sendclsf%>
<%= deal_ptcrcurRec.sendclsf_nm%>
<%= deal_ptcrcurRec.deal_qty%>
<%= deal_ptcrcurRec.deal_uprc%>
<%= deal_ptcrcurRec.dcrate%>
<%= deal_ptcrcurRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 18:05:51 KST 2009 */