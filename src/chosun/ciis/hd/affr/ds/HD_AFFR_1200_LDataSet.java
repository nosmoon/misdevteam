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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1200_LDataSet(){}
	public HD_AFFR_1200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_AFFR_1200_LCURLISTRecord rec = new HD_AFFR_1200_LCURLISTRecord();
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.preng_condo_nm_1 = Util.checkString(rset0.getString("preng_condo_nm_1"));
			rec.preng_condo_nm_2 = Util.checkString(rset0.getString("preng_condo_nm_2"));
			rec.real_preng_condo_nm = Util.checkString(rset0.getString("real_preng_condo_nm"));
			rec.preng_no = Util.checkString(rset0.getString("preng_no"));
			rec.use_frdt = Util.checkString(rset0.getString("use_frdt"));
			rec.use_todt = Util.checkString(rset0.getString("use_todt"));
			rec.use_dds = Util.checkString(rset0.getString("use_dds"));
			rec.guest_room_cnt = Util.checkString(rset0.getString("guest_room_cnt"));
			rec.cmpy_sply_use_yn = Util.checkString(rset0.getString("cmpy_sply_use_yn"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.email_addr = Util.checkString(rset0.getString("email_addr"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.use_pay_amt = Util.checkString(rset0.getString("use_pay_amt"));
			rec.slf_burd_amt = Util.checkString(rset0.getString("slf_burd_amt"));
			rec.cmpy_sply_amt = Util.checkString(rset0.getString("cmpy_sply_amt"));
			rec.slf_drbk_amt = Util.checkString(rset0.getString("slf_drbk_amt"));
			rec.guest_room_fee_tot_amt = Util.checkString(rset0.getString("guest_room_fee_tot_amt"));
			rec.noti_yn = Util.checkString(rset0.getString("noti_yn"));
			rec.drbk_obj_yn = Util.checkString(rset0.getString("drbk_obj_yn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.preng_condo_area_cd_1 = Util.checkString(rset0.getString("preng_condo_area_cd_1"));
			rec.preng_condo_cd_1 = Util.checkString(rset0.getString("preng_condo_cd_1"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_1200_LDataSet ds = (HD_AFFR_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1200_LCURLISTRecord curlistRec = (HD_AFFR_1200_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.aplc_dt%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.preng_condo_nm_1%>
<%= curlistRec.preng_condo_nm_2%>
<%= curlistRec.real_preng_condo_nm%>
<%= curlistRec.preng_no%>
<%= curlistRec.use_frdt%>
<%= curlistRec.use_todt%>
<%= curlistRec.use_dds%>
<%= curlistRec.guest_room_cnt%>
<%= curlistRec.cmpy_sply_use_yn%>
<%= curlistRec.ptph_no%>
<%= curlistRec.tel_no%>
<%= curlistRec.email_addr%>
<%= curlistRec.remk%>
<%= curlistRec.use_pay_amt%>
<%= curlistRec.slf_burd_amt%>
<%= curlistRec.cmpy_sply_amt%>
<%= curlistRec.slf_drbk_amt%>
<%= curlistRec.guest_room_fee_tot_amt%>
<%= curlistRec.noti_yn%>
<%= curlistRec.drbk_obj_yn%>
<%= curlistRec.seq%>
<%= curlistRec.preng_condo_area_cd_1%>
<%= curlistRec.preng_condo_cd_1%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 09 13:53:29 KST 2009 */