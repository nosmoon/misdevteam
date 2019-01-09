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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public ArrayList curlist_c = new ArrayList();
	public String errcode;
	public String errmsg;
	public String frdt;
	public String todt;
	public String sale_rfl_ratio;
	public String clamt_rfl_ratio;
	public String vip_busn_acty_rept;
	public String vip_busn_plan;

	public IS_BUS_1310_LDataSet(){}
	public IS_BUS_1310_LDataSet(String errcode, String errmsg, String frdt, String todt, String sale_rfl_ratio, String clamt_rfl_ratio, String vip_busn_acty_rept, String vip_busn_plan){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frdt = frdt;
		this.todt = todt;
		this.sale_rfl_ratio = sale_rfl_ratio;
		this.clamt_rfl_ratio = clamt_rfl_ratio;
		this.vip_busn_acty_rept = vip_busn_acty_rept;
		this.vip_busn_plan = vip_busn_plan;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSale_rfl_ratio(String sale_rfl_ratio){
		this.sale_rfl_ratio = sale_rfl_ratio;
	}

	public void setClamt_rfl_ratio(String clamt_rfl_ratio){
		this.clamt_rfl_ratio = clamt_rfl_ratio;
	}

	public void setVip_busn_acty_rept(String vip_busn_acty_rept){
		this.vip_busn_acty_rept = vip_busn_acty_rept;
	}

	public void setVip_busn_plan(String vip_busn_plan){
		this.vip_busn_plan = vip_busn_plan;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSale_rfl_ratio(){
		return this.sale_rfl_ratio;
	}

	public String getClamt_rfl_ratio(){
		return this.clamt_rfl_ratio;
	}

	public String getVip_busn_acty_rept(){
		return this.vip_busn_acty_rept;
	}

	public String getVip_busn_plan(){
		return this.vip_busn_plan;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.frdt = Util.checkString(cstmt.getString(8));
		this.todt = Util.checkString(cstmt.getString(9));
		this.sale_rfl_ratio = Util.checkString(cstmt.getString(10));
		this.clamt_rfl_ratio = Util.checkString(cstmt.getString(11));
		this.vip_busn_acty_rept = Util.checkString(cstmt.getString(12));
		this.vip_busn_plan = Util.checkString(cstmt.getString(13));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			IS_BUS_1310_LCURLIST_ARecord rec = new IS_BUS_1310_LCURLIST_ARecord();
			rec.kind = Util.checkString(rset0.getString("kind"));
			rec.kind_nm = Util.checkString(rset0.getString("kind_nm"));
			rec.d_tgt_amt = Util.checkString(rset0.getString("d_tgt_amt"));
			rec.d_rst_amt = Util.checkString(rset0.getString("d_rst_amt"));
			rec.d_rate = Util.checkString(rset0.getString("d_rate"));
			rec.j_rst_amt = Util.checkString(rset0.getString("j_rst_amt"));
			rec.j_rate = Util.checkString(rset0.getString("j_rate"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(16);
		while(rset1.next()){
			IS_BUS_1310_LCURLIST_BRecord rec = new IS_BUS_1310_LCURLIST_BRecord();
			rec.sub_dept_cd = Util.checkString(rset1.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset1.getString("chrg_pers"));
			rec.sub_dept_cd_nm = Util.checkString(rset1.getString("sub_dept_cd_nm"));
			rec.chrg_pers_nm = Util.checkString(rset1.getString("chrg_pers_nm"));
			rec.dm_tgt_amt = Util.checkString(rset1.getString("dm_tgt_amt"));
			rec.dw_rst_amt = Util.checkString(rset1.getString("dw_rst_amt"));
			rec.dm_rst_amt = Util.checkString(rset1.getString("dm_rst_amt"));
			rec.dm_tgt_amt2 = Util.checkString(rset1.getString("dm_tgt_amt2"));
			rec.dw_rst_amt2 = Util.checkString(rset1.getString("dw_rst_amt2"));
			this.curlist_b.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(17);
		while(rset2.next()){
			IS_BUS_1310_LCURLIST_CRecord rec = new IS_BUS_1310_LCURLIST_CRecord();
			rec.mi_amt_1 = Util.checkString(rset2.getString("mi_amt_1"));
			rec.mi_amt_2 = Util.checkString(rset2.getString("mi_amt_2"));
			rec.mi_amt_3 = Util.checkString(rset2.getString("mi_amt_3"));
			rec.mi_amt_t = Util.checkString(rset2.getString("mi_amt_t"));
			this.curlist_c.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1310_LDataSet ds = (IS_BUS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1310_LCURLIST_ARecord curlist_aRec = (IS_BUS_1310_LCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		IS_BUS_1310_LCURLIST_BRecord curlist_bRec = (IS_BUS_1310_LCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_c.size(); i++){
		IS_BUS_1310_LCURLIST_CRecord curlist_cRec = (IS_BUS_1310_LCURLIST_CRecord)ds.curlist_c.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getSale_rfl_ratio()%>
<%= ds.getClamt_rfl_ratio()%>
<%= ds.getVip_busn_acty_rept()%>
<%= ds.getVip_busn_plan()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
<%= ds.getCurlist_c()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.kind%>
<%= curlist_aRec.kind_nm%>
<%= curlist_aRec.d_tgt_amt%>
<%= curlist_aRec.d_rst_amt%>
<%= curlist_aRec.d_rate%>
<%= curlist_aRec.j_rst_amt%>
<%= curlist_aRec.j_rate%>
<%= curlist_bRec.sub_dept_cd%>
<%= curlist_bRec.chrg_pers%>
<%= curlist_bRec.sub_dept_cd_nm%>
<%= curlist_bRec.chrg_pers_nm%>
<%= curlist_bRec.dm_tgt_amt%>
<%= curlist_bRec.dw_rst_amt%>
<%= curlist_bRec.dm_rst_amt%>
<%= curlist_bRec.dm_tgt_amt2%>
<%= curlist_bRec.dw_rst_amt2%>
<%= curlist_cRec.mi_amt_1%>
<%= curlist_cRec.mi_amt_2%>
<%= curlist_cRec.mi_amt_3%>
<%= curlist_cRec.mi_amt_t%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 19 21:07:14 KST 2012 */