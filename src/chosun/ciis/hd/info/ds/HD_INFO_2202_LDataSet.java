/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2202_LDataSet(){}
	public HD_INFO_2202_LDataSet(String errcode, String errmsg){
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
			HD_INFO_2202_LCURLIST1Record rec = new HD_INFO_2202_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.flnm_engl = Util.checkString(rset0.getString("flnm_engl"));
			rec.flnm_chin = Util.checkString(rset0.getString("flnm_chin"));
			rec.bi_yymm = Util.checkString(rset0.getString("bi_yymm"));
			rec.issu_resn = Util.checkString(rset0.getString("issu_resn"));
			rec.issu_resn_nm = Util.checkString(rset0.getString("issu_resn_nm"));
			rec.real_fee_paymt_yn = Util.checkString(rset0.getString("real_fee_paymt_yn"));
			rec.real_fee_paymt_yn_nm = Util.checkString(rset0.getString("real_fee_paymt_yn_nm"));
			rec.real_fee_paymt_amt = Util.checkString(rset0.getString("real_fee_paymt_amt"));
			rec.id_card_typ = Util.checkString(rset0.getString("id_card_typ"));
			rec.id_card_typ_nm = Util.checkString(rset0.getString("id_card_typ_nm"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_yn = Util.checkString(rset0.getString("issu_yn"));
			rec.issu_yn_nm = Util.checkString(rset0.getString("issu_yn_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_2202_LDataSet ds = (HD_INFO_2202_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_2202_LCURLIST1Record curlist1Rec = (HD_INFO_2202_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.emp_no%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dty_cd%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.flnm_engl%>
<%= curlist1Rec.flnm_chin%>
<%= curlist1Rec.bi_yymm%>
<%= curlist1Rec.issu_resn%>
<%= curlist1Rec.issu_resn_nm%>
<%= curlist1Rec.real_fee_paymt_yn%>
<%= curlist1Rec.real_fee_paymt_yn_nm%>
<%= curlist1Rec.real_fee_paymt_amt%>
<%= curlist1Rec.id_card_typ%>
<%= curlist1Rec.id_card_typ_nm%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.issu_yn%>
<%= curlist1Rec.issu_yn_nm%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 24 17:08:13 KST 2009 */