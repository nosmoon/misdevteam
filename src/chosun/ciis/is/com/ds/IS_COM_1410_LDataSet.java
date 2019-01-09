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


package chosun.ciis.is.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_COM_1410_LDataSet(){}
	public IS_COM_1410_LDataSet(String errcode, String errmsg){
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
			IS_COM_1410_LCURLISTRecord rec = new IS_COM_1410_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_chrg_pers_seq = Util.checkString(rset0.getString("dlco_chrg_pers_seq"));
			rec.chrg_job_clsf = Util.checkString(rset0.getString("chrg_job_clsf"));
			rec.chrg_job_clsf_nm = Util.checkString(rset0.getString("chrg_job_clsf_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.tel_no_1 = Util.checkString(rset0.getString("tel_no_1"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.kind_erplace_no = Util.checkString(rset0.getString("kind_erplace_no"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_COM_1410_LDataSet ds = (IS_COM_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_COM_1410_LCURLISTRecord curlistRec = (IS_COM_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
<%= curlistRec.dlco_chrg_pers_seq%>
<%= curlistRec.chrg_job_clsf%>
<%= curlistRec.chrg_job_clsf_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.ptph_no%>
<%= curlistRec.tel_no_1%>
<%= curlistRec.fax_no%>
<%= curlistRec.email%>
<%= curlistRec.kind_erplace_no%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 09 11:26:56 KST 2012 */