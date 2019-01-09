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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1040_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1040_LDataSet(){}
	public IS_AGR_1040_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			IS_AGR_1040_LCURLISTRecord rec = new IS_AGR_1040_LCURLISTRecord();
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.rvord_type_nm = Util.checkString(rset0.getString("rvord_type_nm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd = Util.checkString(rset0.getString("advcs_cd"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tot_rvord_amt = Util.checkString(rset0.getString("tot_rvord_amt"));
			rec.indt_cd_nm = Util.checkString(rset0.getString("indt_cd_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.spc_sale_clsf_nm = Util.checkString(rset0.getString("spc_sale_clsf_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.vatclsf_nm = Util.checkString(rset0.getString("vatclsf_nm"));
			rec.clamt_mthd_nm = Util.checkString(rset0.getString("clamt_mthd_nm"));
			rec.fix_yn = Util.checkString(rset0.getString("fix_yn"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_AGR_1040_LDataSet ds = (IS_AGR_1040_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1040_LCURLISTRecord curlistRec = (IS_AGR_1040_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.scat_dt%>
<%= curlistRec.rvord_type_nm%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advcs_cd%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.advt_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tot_rvord_amt%>
<%= curlistRec.indt_cd_nm%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.spc_sale_clsf_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.vatclsf_nm%>
<%= curlistRec.clamt_mthd_nm%>
<%= curlistRec.fix_yn%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 18 18:02:24 KST 2012 */