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


package chosun.ciis.fc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_CO_1041_LDataSet(){}
	public FC_CO_1041_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_CO_1041_LCURLISTRecord rec = new FC_CO_1041_LCURLISTRecord();
			rec.seci_clsf_cd = Util.checkString(rset0.getString("seci_clsf_cd"));
			rec.seci_no = Util.checkString(rset0.getString("seci_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.face_val_amt = Util.checkString(rset0.getString("face_val_amt"));
			rec.seci_clsf_cd1 = Util.checkString(rset0.getString("seci_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_CO_1041_LDataSet ds = (FC_CO_1041_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_CO_1041_LCURLISTRecord curlistRec = (FC_CO_1041_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seci_clsf_cd%>
<%= curlistRec.seci_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.face_val_amt%>
<%= curlistRec.seci_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Apr 11 18:11:36 KST 2009 */