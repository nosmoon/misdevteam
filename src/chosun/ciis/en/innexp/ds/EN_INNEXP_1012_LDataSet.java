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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1012_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1012_LDataSet(){}
	public EN_INNEXP_1012_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			EN_INNEXP_1012_LCURLISTRecord rec = new EN_INNEXP_1012_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.extnc_obj_slip_clsf = Util.checkString(rset0.getString("extnc_obj_slip_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.extnc_dlco_no = Util.checkString(rset0.getString("extnc_dlco_no"));
			rec.extnc_dlco_nm = Util.checkString(rset0.getString("extnc_dlco_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_INNEXP_1012_LDataSet ds = (EN_INNEXP_1012_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1012_LCURLISTRecord curlistRec = (EN_INNEXP_1012_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.occr_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.extnc_obj_slip_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.extnc_dlco_no%>
<%= curlistRec.extnc_dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 16 19:44:38 KST 2009 */