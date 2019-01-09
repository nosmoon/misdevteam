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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1306_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1306_LDataSet(){}
	public AS_LEAS_1306_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1306_LCURLISTRecord rec = new AS_LEAS_1306_LCURLISTRecord();
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.gurt_tot_amt = Util.checkString(rset0.getString("gurt_tot_amt"));
			rec.gurt_out_amt = Util.checkString(rset0.getString("gurt_out_amt"));
			rec.precpt_tot_amt = Util.checkString(rset0.getString("precpt_tot_amt"));
			rec.precpt_out_amt = Util.checkString(rset0.getString("precpt_out_amt"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_clsf_cd = Util.checkString(rset0.getString("hire_dlco_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_LEAS_1306_LDataSet ds = (AS_LEAS_1306_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1306_LCURLISTRecord curlistRec = (AS_LEAS_1306_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bldg_nm%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.cntr_no%>
<%= curlistRec.cntr_gurt_amt%>
<%= curlistRec.gurt_tot_amt%>
<%= curlistRec.gurt_out_amt%>
<%= curlistRec.precpt_tot_amt%>
<%= curlistRec.precpt_out_amt%>
<%= curlistRec.bldg_cd%>
<%= curlistRec.cntr_yy%>
<%= curlistRec.cntr_seq%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.hire_dlco_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 14:31:40 KST 2009 */