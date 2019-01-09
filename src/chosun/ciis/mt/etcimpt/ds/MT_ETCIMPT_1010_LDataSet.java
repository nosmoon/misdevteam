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


package chosun.ciis.mt.etcimpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCIMPT_1010_LDataSet(){}
	public MT_ETCIMPT_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_ETCIMPT_1010_LCURLISTRecord rec = new MT_ETCIMPT_1010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.leas_clsf = Util.checkString(rset0.getString("leas_clsf"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.impt_resn = Util.checkString(rset0.getString("impt_resn"));
			rec.matr_ptcr = Util.checkString(rset0.getString("matr_ptcr"));
			rec.use_dept = Util.checkString(rset0.getString("use_dept"));
			rec.offer_pric = Util.checkString(rset0.getString("offer_pric"));
			rec.offer_pric_curc_clsf = Util.checkString(rset0.getString("offer_pric_curc_clsf"));
			rec.ship_pers = Util.checkString(rset0.getString("ship_pers"));
			rec.base_cost = Util.checkString(rset0.getString("base_cost"));
			rec.impt_vexc_coms = Util.checkString(rset0.getString("impt_vexc_coms"));
			rec.impt_vexc_coms_vat = Util.checkString(rset0.getString("impt_vexc_coms_vat"));
			rec.lcopen_coms = Util.checkString(rset0.getString("lcopen_coms"));
			rec.telx_fee = Util.checkString(rset0.getString("telx_fee"));
			rec.offer_offr_plac = Util.checkString(rset0.getString("offer_offr_plac"));
			rec.impt_clsf = Util.checkString(rset0.getString("impt_clsf"));
			rec.lcopen_dt = Util.checkString(rset0.getString("lcopen_dt"));
			rec.lcopen_bank = Util.checkString(rset0.getString("lcopen_bank"));
			rec.lcno = Util.checkString(rset0.getString("lcno"));
			rec.lcvdty_prd = Util.checkString(rset0.getString("lcvdty_prd"));
			rec.crgo_insr_entr_dt = Util.checkString(rset0.getString("crgo_insr_entr_dt"));
			rec.crgo_insr_cntr_cmpy = Util.checkString(rset0.getString("crgo_insr_cntr_cmpy"));
			rec.crgo_insr_fee = Util.checkString(rset0.getString("crgo_insr_fee"));
			rec.ship_widr = Util.checkString(rset0.getString("ship_widr"));
			rec.ship_dt = Util.checkString(rset0.getString("ship_dt"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.last_entr_dt = Util.checkString(rset0.getString("last_entr_dt"));
			rec.impt_vexc_cmpy = Util.checkString(rset0.getString("impt_vexc_cmpy"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCIMPT_1010_LDataSet ds = (MT_ETCIMPT_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCIMPT_1010_LCURLISTRecord curlistRec = (MT_ETCIMPT_1010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.yy%>
<%= curlistRec.seq%>
<%= curlistRec.leas_clsf%>
<%= curlistRec.case_nm%>
<%= curlistRec.impt_resn%>
<%= curlistRec.matr_ptcr%>
<%= curlistRec.use_dept%>
<%= curlistRec.offer_pric%>
<%= curlistRec.offer_pric_curc_clsf%>
<%= curlistRec.ship_pers%>
<%= curlistRec.base_cost%>
<%= curlistRec.impt_vexc_coms%>
<%= curlistRec.impt_vexc_coms_vat%>
<%= curlistRec.lcopen_coms%>
<%= curlistRec.telx_fee%>
<%= curlistRec.offer_offr_plac%>
<%= curlistRec.impt_clsf%>
<%= curlistRec.lcopen_dt%>
<%= curlistRec.lcopen_bank%>
<%= curlistRec.lcno%>
<%= curlistRec.lcvdty_prd%>
<%= curlistRec.crgo_insr_entr_dt%>
<%= curlistRec.crgo_insr_cntr_cmpy%>
<%= curlistRec.crgo_insr_fee%>
<%= curlistRec.ship_widr%>
<%= curlistRec.ship_dt%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.last_entr_dt%>
<%= curlistRec.impt_vexc_cmpy%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 10:40:51 KST 2009 */