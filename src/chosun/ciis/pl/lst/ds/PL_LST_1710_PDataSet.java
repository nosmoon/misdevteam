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


package chosun.ciis.pl.lst.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.rec.*;

/**
 * 
 */


public class PL_LST_1710_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_LST_1710_PDataSet(){}
	public PL_LST_1710_PDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			PL_LST_1710_PPTCRLISTRecord rec = new PL_LST_1710_PPTCRLISTRecord();
			rec.chit_no = Util.checkString(rset0.getString("chit_no"));
			rec.vexc_dlco_cd = Util.checkString(rset0.getString("vexc_dlco_cd"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.issu_clsf = Util.checkString(rset0.getString("issu_clsf"));
			rec.sendclsf_nm = Util.checkString(rset0.getString("sendclsf_nm"));
			rec.sell_type_nm = Util.checkString(rset0.getString("sell_type_nm"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.vexc_medi_ser_no = Util.checkString(rset0.getString("vexc_medi_ser_no"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.serial_no = Util.checkString(rset0.getString("serial_no"));
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.grp_no = Util.checkString(rset0.getString("grp_no"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_LST_1710_PDataSet ds = (PL_LST_1710_PDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_LST_1710_PPTCRLISTRecord ptcrlistRec = (PL_LST_1710_PPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= ptcrlistRec.chit_no%>
<%= ptcrlistRec.vexc_dlco_cd%>
<%= ptcrlistRec.sale_clsf%>
<%= ptcrlistRec.issu_clsf%>
<%= ptcrlistRec.sendclsf_nm%>
<%= ptcrlistRec.sell_type_nm%>
<%= ptcrlistRec.wh_cd%>
<%= ptcrlistRec.cont%>
<%= ptcrlistRec.vexc_medi_ser_no%>
<%= ptcrlistRec.deal_uprc%>
<%= ptcrlistRec.deal_qty%>
<%= ptcrlistRec.dcrate%>
<%= ptcrlistRec.deal_amt%>
<%= ptcrlistRec.remk%>
<%= ptcrlistRec.serial_no%>
<%= ptcrlistRec.deal_dt%>
<%= ptcrlistRec.deal_grp_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 26 18:47:04 KST 2013 */