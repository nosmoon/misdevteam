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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1143_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_1143_LDataSet(){}
	public MT_SUBMATRCLA_1143_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(17);
		while(rset2.next()){
			MT_SUBMATRCLA_1143_LCURLISTRecord rec = new MT_SUBMATRCLA_1143_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.item_nm = Util.checkString(rset2.getString("item_nm"));
			rec.std = Util.checkString(rset2.getString("std"));
			rec.uprc = Util.checkString(rset2.getString("uprc"));
			rec.clam_qunt = Util.checkString(rset2.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset2.getString("fix_qunt"));
			rec.unit = Util.checkString(rset2.getString("unit"));
			rec.amt = Util.checkString(rset2.getString("amt"));
			rec.usag = Util.checkString(rset2.getString("usag"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.clam_actu_cd = Util.checkString(rset2.getString("clam_actu_cd"));
			rec.res_yn = Util.checkString(rset2.getString("res_yn"));
			rec.acpn_dt = Util.checkString(rset2.getString("acpn_dt"));
			rec.via_dept_cnfm_yn = Util.checkString(rset2.getString("via_dept_cnfm_yn"));
			rec.job_cntc_no = Util.checkString(rset2.getString("job_cntc_no"));
			rec.buy_proc_stat = Util.checkString(rset2.getString("buy_proc_stat"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATRCLA_1142_LDataSet ds = (MT_SUBMATRCLA_1142_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_1142_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_1142_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.item_nm%>
<%= curlistRec.std%>
<%= curlistRec.uprc%>
<%= curlistRec.clam_qunt%>
<%= curlistRec.fix_qunt%>
<%= curlistRec.unit%>
<%= curlistRec.amt%>
<%= curlistRec.usag%>
<%= curlistRec.dept_cd%>
<%= curlistRec.clam_actu_cd%>
<%= curlistRec.res_yn%>
<%= curlistRec.acpn_dt%>
<%= curlistRec.via_dept_cnfm_yn%>
<%= curlistRec.job_cntc_no%>
<%= curlistRec.buy_proc_stat%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Oct 15 19:00:21 KST 2009 */